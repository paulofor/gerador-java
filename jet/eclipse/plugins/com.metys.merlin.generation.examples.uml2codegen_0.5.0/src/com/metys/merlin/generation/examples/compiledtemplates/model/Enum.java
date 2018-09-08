package com.metys.merlin.generation.examples.compiledtemplates.model;

import java.util.*;
import com.metys.merlin.generation.examples.compiledtemplates.util.UML2GenerationHelper;
import org.eclipse.emf.codegen.util.*;

public class Enum
{
  protected static String nl;
  public static synchronized Enum create(String lineSeparator)
  {
    nl = lineSeparator;
    Enum result = new Enum();
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
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_9 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " *" + NL + " * @generated" + NL + " */" + NL + "public final class ";
  protected final String TEXT_10 = NL + "{";
  protected final String TEXT_11 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final int ";
  protected final String TEXT_12 = " = ";
  protected final String TEXT_13 = ";" + NL;
  protected final String TEXT_14 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_15 = " ";
  protected final String TEXT_16 = "_LITERAL = new ";
  protected final String TEXT_17 = "(";
  protected final String TEXT_18 = ", \"";
  protected final String TEXT_19 = "\"); //$NON-NLS-1$" + NL;
  protected final String TEXT_20 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_21 = "[] VALUES_ARRAY =" + NL + "\t\tnew ";
  protected final String TEXT_22 = "[]" + NL + "\t\t{";
  protected final String TEXT_23 = NL + "\t\t\t";
  protected final String TEXT_24 = "_LITERAL,";
  protected final String TEXT_25 = NL + "\t\t};" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_26 = " get(";
  protected final String TEXT_27 = " name)" + NL + "\t{" + NL + "\t\tfor (int i = 0; i < VALUES_ARRAY.length; ++i)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_28 = " result = VALUES_ARRAY[i];" + NL + "\t\t\tif (result.toString().equals(name))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn result;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ";
  protected final String TEXT_29 = " get(int value)" + NL + "\t{" + NL + "\t\tswitch (value)" + NL + "\t\t{";
  protected final String TEXT_30 = NL + "\t\t\tcase ";
  protected final String TEXT_31 = ": return ";
  protected final String TEXT_32 = "_LITERAL;";
  protected final String TEXT_33 = NL + "\t\t}" + NL + "\t\treturn null;\t" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * The name of the enumerator." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final String name;" + NL + "" + NL + "\t/**" + NL + "\t * The <code>int</code> value of the enumerator." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final int value;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_34 = "(int value, ";
  protected final String TEXT_35 = " name)" + NL + "\t{" + NL + "\t\tthis.name = name;" + NL + "\t\tthis.value = value;" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * Returns the name of the enumerator." + NL + "\t * @return the name." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic final String getName()" + NL + "\t{" + NL + "\t\treturn name;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns the <code>int</code> value of the enumerator." + NL + "\t * @return the value." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic final int getValue()" + NL + "\t{" + NL + "\t\treturn value;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns the name of the enumerator." + NL + "\t * @return the name." + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic final String toString()" + NL + "\t{" + NL + "\t\treturn name;" + NL + "\t}" + NL + "" + NL + "} //";
  protected final String TEXT_36 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    

    org.eclipse.uml2.Enumeration uml2Enumeration = (org.eclipse.uml2.Enumeration) argument;org.eclipse.uml2.Package uml2Package = uml2Enumeration.getPackage();
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
    stringBuffer.append(TEXT_7);
    importManager.addImport("java.util.Arrays");
    importManager.addImport("java.util.List");
    importManager.addImport("java.util.Collections");
    
StringBuffer importStringBuffer = stringBuffer;
int importInsertionPoint = stringBuffer.length();
importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_8);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Enumeration));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Enumeration));
    stringBuffer.append(TEXT_10);
    for (Iterator l=uml2Enumeration.getOwnedLiterals().iterator(); l.hasNext();) { org.eclipse.uml2.EnumerationLiteral enumLiteral = (org.eclipse.uml2.EnumerationLiteral)l.next();
    stringBuffer.append(TEXT_11);
    stringBuffer.append(UML2GenerationHelper.getEnumLiteralID(enumLiteral));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(uml2Enumeration.getOwnedLiterals().indexOf(enumLiteral));
    stringBuffer.append(TEXT_13);
    }
    for (Iterator l=uml2Enumeration.getOwnedLiterals().iterator(); l.hasNext();) { org.eclipse.uml2.EnumerationLiteral enumLiteral = (org.eclipse.uml2.EnumerationLiteral)l.next();
    stringBuffer.append(TEXT_14);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Enumeration));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(UML2GenerationHelper.getEnumLiteralID(enumLiteral));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Enumeration));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(UML2GenerationHelper.getEnumLiteralID(enumLiteral));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(enumLiteral.getName());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_20);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Enumeration));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Enumeration));
    stringBuffer.append(TEXT_22);
    for (Iterator l=uml2Enumeration.getOwnedLiterals().iterator(); l.hasNext();) { org.eclipse.uml2.EnumerationLiteral enumLiteral = (org.eclipse.uml2.EnumerationLiteral)l.next();
    stringBuffer.append(TEXT_23);
    stringBuffer.append(UML2GenerationHelper.getEnumLiteralID(enumLiteral));
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Enumeration));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(importManager.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Enumeration));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Enumeration));
    stringBuffer.append(TEXT_29);
    for (Iterator l=UML2GenerationHelper.getUniqueValuedGenEnumLiterals(uml2Enumeration).iterator(); l.hasNext();) { org.eclipse.uml2.EnumerationLiteral enumLiteral = (org.eclipse.uml2.EnumerationLiteral)l.next();
    stringBuffer.append(TEXT_30);
    stringBuffer.append(UML2GenerationHelper.getEnumLiteralID(enumLiteral));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(UML2GenerationHelper.getEnumLiteralID(enumLiteral));
    stringBuffer.append(TEXT_32);
    }
    stringBuffer.append(TEXT_33);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Enumeration));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(importManager.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(UML2GenerationHelper.getCapName(uml2Enumeration));
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    stringBuffer.append(TEXT_36);
    return stringBuffer.toString();
  }
}
