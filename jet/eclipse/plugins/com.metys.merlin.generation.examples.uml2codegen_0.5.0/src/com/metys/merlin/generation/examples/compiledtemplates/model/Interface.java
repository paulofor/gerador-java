package com.metys.merlin.generation.examples.compiledtemplates.model;

import java.util.*;
import com.metys.merlin.generation.examples.compiledtemplates.util.UML2GenerationHelper;
import org.eclipse.emf.codegen.util.*;

public class Interface
{
  protected static String nl;
  public static synchronized Interface create(String lineSeparator)
  {
    nl = lineSeparator;
    Interface result = new Interface();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_3 = "Id";
  protected final String TEXT_4 = NL + " */" + NL;
  protected final String TEXT_5 = NL + "package ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An interface of the model object '<em><b>";
  protected final String TEXT_8 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " *" + NL + " * @generated" + NL + " */" + NL + "public interface ";
  protected final String TEXT_9 = NL + "{" + NL;
  protected final String TEXT_10 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_11 = " ";
  protected final String TEXT_12 = "();";
  protected final String TEXT_13 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tvoid set";
  protected final String TEXT_14 = "(";
  protected final String TEXT_15 = " new";
  protected final String TEXT_16 = ");";
  protected final String TEXT_17 = NL;
  protected final String TEXT_18 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_19 = "void";
  protected final String TEXT_20 = " ";
  protected final String TEXT_21 = "(";
  protected final String TEXT_22 = ");";
  protected final String TEXT_23 = NL + "} //";

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    

    org.eclipse.uml2.Interface uml2Interface = (org.eclipse.uml2.Interface) argument;org.eclipse.uml2.Package uml2Package = uml2Interface.getPackage();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    ImportManager importManager=null;
    if (UML2GenerationHelper.getQualifiedName(uml2Package) != null) {
    importManager = UML2GenerationHelper.makeImportManager(UML2GenerationHelper.getQualifiedName(uml2Package));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(UML2GenerationHelper.getQualifiedName(uml2Package));
    stringBuffer.append(TEXT_6);
    } else {
    importManager = UML2GenerationHelper.makeImportManager("");
    }
    
StringBuffer importStringBuffer = stringBuffer;
int importInsertionPoint = stringBuffer.length();
importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_7);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Interface));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Interface));
    stringBuffer.append(UML2GenerationHelper.getExtendsLitteral(uml2Interface));
    stringBuffer.append(TEXT_9);
    for (Iterator i=uml2Interface.getAttributes().iterator(); i.hasNext();) { org.eclipse.uml2.Property property = (org.eclipse.uml2.Property)i.next();
    if (property.getType() !=null) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(UML2GenerationHelper.getImportedFeatureType(property));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(UML2GenerationHelper.getGetAccessor(property));
    stringBuffer.append(TEXT_12);
    if (!property.isMultivalued() && !property.isReadOnly()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(UML2GenerationHelper.getAccessorName(property));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(UML2GenerationHelper.getImportedFeatureType(property));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(UML2GenerationHelper.getCapName(property));
    stringBuffer.append(TEXT_16);
    }//if (!property.isReadOnly())
    }//if (property.getType() !=null
    }//for
    stringBuffer.append(TEXT_17);
    for (Iterator i=uml2Interface.getOwnedOperations().iterator(); i.hasNext();) { org.eclipse.uml2.Operation operation = (org.eclipse.uml2.Operation)i.next();
    stringBuffer.append(TEXT_18);
    if (operation.getType() == null) {
    stringBuffer.append(TEXT_19);
    } else {
    stringBuffer.append(UML2GenerationHelper.getImportedType(operation.getType()));
    }
    stringBuffer.append(TEXT_20);
    stringBuffer.append(operation.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(UML2GenerationHelper.getParameters(operation));
    stringBuffer.append(TEXT_22);
    }//for
    stringBuffer.append(TEXT_23);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Interface));
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
