package com.metys.merlin.generation.examples.uml2codegen.wizards;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.mapping.MappingRoot;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.osgi.framework.Bundle;

import com.metys.merlin.generation.examples.uml2codegen.UML2CodeGenSamplePlugin;
import com.metys.merlin.generation.mappingmodel.mapping.Transformer;
import com.metys.merlin.generation.mappingmodel.mapping.MappingFactory;
import com.metys.merlin.generation.mappingmodel.mapping.MappingPackage;
import com.metys.merlin.generation.mappingmodel.mapping.TypeMappingRoot;
import com.metys.merlin.generation.mappingmodel.util.MappingModelUtil;
import com.metys.merlin.generation.templates.jetmapping.JETMappingFactory;
/**
 * This is a sample new wizard. Its role is to create a new file resource in the provided container.
 * If the container resource (a folder or a project) is selected in the workspace when the wizard is
 * opened, it will accept it as the target container. The wizard creates one file with the extension
 * "jetmapping". If a sample multi-page editor (also available as a template) is registered for the
 * same extension, it will be able to open it.
 */
public class UML2CodegenSampleWizard extends Wizard implements INewWizard {
  private UML2CodegenSampleWizardPage page;
  private ISelection selection;
  /**
   * Constructor for UML2CodegenSampleWizard.
   */
  public UML2CodegenSampleWizard() {
    super();
    setNeedsProgressMonitor(true);
  }
  /**
   * Adding the page to the wizard.
   */
  public void addPages() {
    page = new UML2CodegenSampleWizardPage(selection);
    addPage(page);
  }
  /**
   * This method is called when 'Finish' button is pressed in the wizard. We will create an
   * operation and run it using wizard as execution context.
   */
  public boolean performFinish() {
    final String inputFileFullPath = page.getInputFileFullPath();
    final String containerName = page.getContainerName();
    final String fileName = page.getFileName();
    IRunnableWithProgress op = new IRunnableWithProgress() {
      public void run(IProgressMonitor monitor) throws InvocationTargetException {
        try {
          doFinish(inputFileFullPath, containerName, fileName, monitor);
        } catch (CoreException e) {
          throw new InvocationTargetException(e);
        } finally {
          monitor.done();
        }
      }
    };
    try {
      getContainer().run(true, false, op);
    } catch (InterruptedException e) {
      return false;
    } catch (InvocationTargetException e) {
      Throwable realException = e.getTargetException();
      MessageDialog.openError(getShell(), "Error", realException.getMessage());
      return false;
    }
    return true;
  }
  /**
   * The worker method. It will find the container, create the file if missing or just replace its
   * contents, and open the editor on the newly created file.
   */
  private void doFinish(String inputFileFullPath, String containerName, String fileName,
      IProgressMonitor monitor) throws CoreException {
    ResourceSet resourceSet = new ResourceSetImpl();
    URI uml2URI = URI.createPlatformResourceURI(inputFileFullPath);
    Resource emfInputFileResource = resourceSet.getResource(uml2URI, true);
    
    MappingPackage.eINSTANCE.getNsURI(); // ensure mapping model is loaded
    Bundle bundle = UML2CodeGenSamplePlugin.getDefault().getBundle();
    
    URL mappingResourceURL = bundle.getEntry("/resources/uml22jettemplate.mapping");
    URI mappingResourceURI = URI.createURI(mappingResourceURL.toString());
    Resource emfMappingFileResource = resourceSet.getResource(mappingResourceURI, true);

    Transformer transformer = MappingFactory.eINSTANCE.createTransformer();
    TypeMappingRoot metaModelMappingRoot = (TypeMappingRoot) emfMappingFileResource.getContents().get(0);    
    
    MappingRoot instanceMappingRoot = JETMappingFactory.eINSTANCE.createJETTemplateMappingRoot();
    instanceMappingRoot.setTypeMapping(metaModelMappingRoot);
    
    transformer.setMappingRoot(instanceMappingRoot);
    Collection source = emfInputFileResource.getContents();
    for (Iterator it = source.iterator(); it.hasNext();) {
      EObject obj = (EObject) it.next();
      instanceMappingRoot.getInputs().add(obj);
    }
    Collection initialModel = transformer.transform(instanceMappingRoot, null);
    for (Iterator it = initialModel.iterator(); it.hasNext();) {
      EObject obj = (EObject) it.next();
      instanceMappingRoot.getOutputs().add(obj);      
    }
    
    IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
    IResource resource = root.findMember(new Path(containerName));
    if (!resource.exists() || !(resource instanceof IContainer)) {
      throwCoreException("Container \"" + containerName + "\" does not exist.");
    }
    IContainer container = (IContainer) resource;
    
    //  create the jettemplates resource    
    String jettemplateFileName = fileName.replaceAll(".jetmapping",".jettemplate");
    monitor.beginTask("Creating " + jettemplateFileName, 2);
    IFile jetTemplateModelFile = container.getFile(new Path(jettemplateFileName));
    URI jetTemplateModelURI = URI.createPlatformResourceURI(jetTemplateModelFile.getFullPath().toString());
    Resource jetTemplateModelResource = resourceSet.createResource(jetTemplateModelURI);
    for (Iterator it = initialModel.iterator(); it.hasNext();) {
      Object rootObject = it.next();
      if (rootObject instanceof EObject && ((EObject)rootObject).eContainer() == null)
        jetTemplateModelResource.getContents().add(rootObject);
    }
    
    // create the jetmapping resource
    monitor.beginTask("Creating " + fileName, 2);    
    final IFile file = container.getFile(new Path(fileName));    
    URI jetMappingURI = URI.createPlatformResourceURI(file.getFullPath().toString());
    Resource jetMappingResource = resourceSet.createResource(jetMappingURI);
    instanceMappingRoot.setTypeMapping(null);
    jetMappingResource.getContents().add(instanceMappingRoot);    

    // Save the contents of the resources to the file system.
    //
    Map options = new HashMap();
    options.put(XMLResource.OPTION_ENCODING, "UTF-8");
    try {
      jetTemplateModelResource.save(options);
      jetMappingResource.save(options);
    } catch (IOException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    
    monitor.worked(1);
    monitor.setTaskName("Opening file for editing...");
    getShell().getDisplay().asyncExec(new Runnable() {
      public void run() {
        IWorkbenchPage page =
          PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        try {
          IDE.openEditor(page, file, true);
        } catch (PartInitException e) {
        }
      }
    });
    monitor.worked(1);
  }
  private void throwCoreException(String message) throws CoreException {
    IStatus status = new Status(IStatus.ERROR,
        "com.metys.merlin.generation.examples.uml2codegen", IStatus.OK, message, null);
    throw new CoreException(status);
  }
  /**
   * We will accept the selection in the workbench to see if we can initialize from it.
   * 
   * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
   */
  public void init(IWorkbench workbench, IStructuredSelection selection) {
    this.selection = selection;
  }
}