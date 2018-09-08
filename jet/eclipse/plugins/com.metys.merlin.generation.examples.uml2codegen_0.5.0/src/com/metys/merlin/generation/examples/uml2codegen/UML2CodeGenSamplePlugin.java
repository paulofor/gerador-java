/**
 * 
 */
package com.metys.merlin.generation.examples.uml2codegen;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @author jcheuoua
 *
 */
public class UML2CodeGenSamplePlugin extends AbstractUIPlugin {
  public static final String ID = "com.metys.merlin.generation.examples.uml2codegen";
  //The shared instance.
  private static UML2CodeGenSamplePlugin plugin;
  //Resource bundle.
  private ResourceBundle resourceBundle;
  
  /**
   * The constructor.
   */
  public UML2CodeGenSamplePlugin() {
    super();
    plugin = this;
  }

  /**
   * This method is called upon plug-in activation
   */
  public void start(BundleContext context) throws Exception {
    super.start(context);
  }

  /**
   * This method is called when the plug-in is stopped
   */
  public void stop(BundleContext context) throws Exception {
    super.stop(context);
    plugin = null;
    resourceBundle = null;
  }

  /**
   * Returns the shared instance.
   */
  public static UML2CodeGenSamplePlugin getDefault() {
    return plugin;
  }

  /**
   * Returns the string from the plugin's resource bundle,
   * or 'key' if not found.
   */
  public static String getResourceString(String key) {
    ResourceBundle bundle = UML2CodeGenSamplePlugin.getDefault().getResourceBundle();
    try {
      return (bundle != null) ? bundle.getString(key) : key;
    } catch (MissingResourceException e) {
      return key;
    }
  }

  /**
   * Returns the plugin's resource bundle,
   */
  public ResourceBundle getResourceBundle() {
    try {
      if (resourceBundle == null)
        resourceBundle = ResourceBundle.getBundle("com.metys.merlin.generation.mapping.examples.uml22ecore.Uml22ecorePluginResources");
    } catch (MissingResourceException x) {
      resourceBundle = null;
    }
    return resourceBundle;
  }

  /**
   * Returns an image descriptor for the image file at the given
   * plug-in relative path.
   *
   * @param path the path
   * @return the image descriptor
   */
  public static ImageDescriptor getImageDescriptor(String path) {
    return AbstractUIPlugin.imageDescriptorFromPlugin("com.metys.merlin.generation.mapping.examples.uml22ecore", path);
  }
}
