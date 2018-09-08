package com.metys.merlin.generation.examples.compiledtemplates.model;

import java.util.*;
import com.metys.merlin.generation.examples.compiledtemplates.util.UML2GenerationHelper;
import org.eclipse.emf.codegen.util.*;

public class Class
{
  protected static String nl;
  public static synchronized Class create(String lineSeparator)
  {
    nl = lineSeparator;
    Class result = new Class();
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
  protected final String TEXT_7 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_8 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " *" + NL + " * @generated" + NL + " */" + NL + "public";
  protected final String TEXT_9 = " abstract";
  protected final String TEXT_10 = " class ";
  protected final String TEXT_11 = NL + "{" + NL;
  protected final String TEXT_12 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_13 = " ";
  protected final String TEXT_14 = " = ";
  protected final String TEXT_15 = ";";
  protected final String TEXT_16 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_17 = "()" + NL + "\t{" + NL + "\t}";
  protected final String TEXT_18 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_19 = " ";
  protected final String TEXT_20 = "()" + NL + "\t{";
  protected final String TEXT_21 = NL + "\t\tif (";
  protected final String TEXT_22 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_23 = " = new ";
  protected final String TEXT_24 = "();        " + NL + "\t\t}";
  protected final String TEXT_25 = NL + "\t\treturn ";
  protected final String TEXT_26 = ";" + NL + "\t}";
  protected final String TEXT_27 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void set";
  protected final String TEXT_28 = "(";
  protected final String TEXT_29 = " new";
  protected final String TEXT_30 = ")" + NL + "\t{" + NL + "\t\tif (new";
  protected final String TEXT_31 = " != ";
  protected final String TEXT_32 = ")" + NL + "\t\t{" + NL + "\t\t\tthis.";
  protected final String TEXT_33 = " = new";
  protected final String TEXT_34 = ";" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_35 = NL;
  protected final String TEXT_36 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_37 = "void";
  protected final String TEXT_38 = " ";
  protected final String TEXT_39 = "(";
  protected final String TEXT_40 = ")" + NL + "\t{" + NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();\t\t" + NL + "\t}";
  protected final String TEXT_41 = NL + "} //";

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    

    org.eclipse.uml2.Class uml2Class = (org.eclipse.uml2.Class) argument;org.eclipse.uml2.Package uml2Package = uml2Class.getPackage();
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
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Class));
    stringBuffer.append(TEXT_8);
    if (uml2Class.isAbstract()) {
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Class));
    stringBuffer.append(UML2GenerationHelper.getExtendsAndImplementsLitteral(uml2Class));
    stringBuffer.append(TEXT_11);
    for (Iterator i=uml2Class.getAttributes().iterator(); i.hasNext();) { org.eclipse.uml2.Property property = (org.eclipse.uml2.Property)i.next();
    if (property.getType() !=null) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(UML2GenerationHelper.getImportedFeatureType(property));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(UML2GenerationHelper.uncapSafeName(property));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(UML2GenerationHelper.getDefaultValue(property));
    stringBuffer.append(TEXT_15);
    }
    }
    stringBuffer.append(TEXT_16);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Class));
    stringBuffer.append(TEXT_17);
    for (Iterator i=uml2Class.getAttributes().iterator(); i.hasNext();) { org.eclipse.uml2.Property property = (org.eclipse.uml2.Property)i.next();
    if (property.getType() !=null) {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(UML2GenerationHelper.getImportedFeatureType(property));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(UML2GenerationHelper.getGetAccessor(property));
    stringBuffer.append(TEXT_20);
    if (property.isMultivalued())  {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(UML2GenerationHelper.uncapSafeName(property));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(UML2GenerationHelper.uncapSafeName(property));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(importManager.getImportedName("java.util.ArrayList"));
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    stringBuffer.append(UML2GenerationHelper.uncapSafeName(property));
    stringBuffer.append(TEXT_26);
    if (!property.isMultivalued() && !property.isReadOnly()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(UML2GenerationHelper.getAccessorName(property));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(UML2GenerationHelper.getImportedFeatureType(property));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(UML2GenerationHelper.getCapName(property));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(UML2GenerationHelper.getCapName(property));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(UML2GenerationHelper.uncapSafeName(property));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(UML2GenerationHelper.uncapSafeName(property));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(UML2GenerationHelper.getCapName(property));
    stringBuffer.append(TEXT_34);
    }//if (!property.isReadOnly())
    }//if (property.getType() !=null
    }//for
    stringBuffer.append(TEXT_35);
    for (Iterator i=uml2Class.getOwnedOperations().iterator(); i.hasNext();) { org.eclipse.uml2.Operation operation = (org.eclipse.uml2.Operation)i.next();
    stringBuffer.append(TEXT_36);
    if (operation.getType() == null) {
    stringBuffer.append(TEXT_37);
    } else {
    stringBuffer.append(UML2GenerationHelper.getImportedType(operation.getType()));
    }
    stringBuffer.append(TEXT_38);
    stringBuffer.append(operation.getName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(UML2GenerationHelper.getParameters(operation));
    stringBuffer.append(TEXT_40);
    }//for
    stringBuffer.append(TEXT_41);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Class));
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
