package com.metys.merlin.generation.examples.compiledtemplates.util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.uml2.Enumeration;
import org.eclipse.uml2.EnumerationLiteral;
import org.eclipse.uml2.Generalization;
import org.eclipse.uml2.NamedElement;
import org.eclipse.uml2.Operation;
import org.eclipse.uml2.Parameter;
import org.eclipse.uml2.PrimitiveType;
import org.eclipse.uml2.Property;
import org.eclipse.uml2.StructuralFeature;
import org.eclipse.uml2.Type;

//
public class UML2GenerationHelper {
  private static HashSet javaReservedWords;
  private static ImportManager importManager = new ImportManager("");
  private static HashSet javaLangTypes;
  
  public static ImportManager getImportManager() {
    return importManager;
  }
  public static ImportManager makeImportManager(String packageName) {
	importManager = new ImportManager(packageName);
	return importManager;
  }
  public static Class getInstanceClass(Type type) {
    try {
      if ("String".equals(type.getName()))
        return String.class;
      if ("Boolean".equals(type.getName()))
        return Boolean.TYPE;
      if ("Byte".equals(type.getName()))
        return Byte.TYPE;
      if ("Integer".equals(type.getName()))
        return Integer.TYPE;
      if ("Long".equals(type.getName()))
        return Long.TYPE;
      if ("Double".equals(type.getName()))
        return Double.TYPE;
      if ("Short".equals(type.getName()))
        return Short.TYPE;
      if ("Float".equals(type.getName()))
        return Float.TYPE;
      if ("Character".equals(type.getName()))
        return Character.TYPE;
      Class instanceClass = Class.forName(getQualifiedName(type), true, Thread.currentThread().getContextClassLoader());
      return instanceClass;
    } catch (Exception e) {
      return null;
    }
  }
  public static boolean isPrimitiveType(Type type) {
    try {
      if (type instanceof PrimitiveType)
        return true;
      Object result = getInstanceClass(type);
      if (result == null)
        return false;
      Class instanceClass = (Class) result;
      return instanceClass.isPrimitive();
    } catch (Exception e) {
      return false;
    }
  }
  public static String getPrimitiveObjectType(Type type) {
    Class instanceClass = getInstanceClass(type);
    if (instanceClass == java.lang.Boolean.TYPE)
      return "java.lang.Boolean";
    if (instanceClass == java.lang.Byte.TYPE)
      return "java.lang.Byte";
    if (instanceClass == java.lang.Character.TYPE)
      return "java.lang.Character";
    if (instanceClass == java.lang.Double.TYPE)
      return "java.lang.Double";
    if (instanceClass == java.lang.Float.TYPE)
      return "java.lang.Float";
    if (instanceClass == java.lang.Integer.TYPE)
      return "java.lang.Integer";
    if (instanceClass == java.lang.Long.TYPE)
      return "java.lang.Long";
    if (instanceClass == java.lang.Short.TYPE)
      return "java.lang.Short";
    return null;
  }
  public static String getPrimitiveDefault(Type type) {
    if (isPrimitiveType(type)) {
      Class instanceClass = getInstanceClass(type);
      if (instanceClass == java.lang.Boolean.TYPE)
        return "false";
      if (instanceClass == java.lang.Byte.TYPE || instanceClass == java.lang.Integer.TYPE
          || instanceClass == java.lang.Long.TYPE || instanceClass == java.lang.Short.TYPE)
        return "0";
      if (instanceClass == java.lang.Character.TYPE)
        return "'\\u0000'";
      if (instanceClass == java.lang.Double.TYPE)
        return "0.0";
      if (instanceClass == java.lang.Float.TYPE)
        return "0.0F";
    }
    return null;
  }
  /**
   * Returns the primitive or class name for the given Type. Class names will be added as imports to
   * the GenModel's ImportManager, and the imported form will be returned.
   */
  public static String getImportedType(Type type) {
    if (isPrimitiveType(type) && getInstanceClass(type) != null)
      return importManager.getImportedName(getInstanceClass(type).getName());
    return importManager.getImportedName(getQualifiedName(type));
  }
  /**
   * Returns a hash of all Java's keywords and textual literals, as of Java 1.4.
   */
  public static HashSet getJavaReservedWords() {
    if (javaReservedWords == null) {
      javaReservedWords = new HashSet(100);
      javaReservedWords.add("abstract");
      javaReservedWords.add("assert");
      javaReservedWords.add("boolean");
      javaReservedWords.add("break");
      javaReservedWords.add("byte");
      javaReservedWords.add("case");
      javaReservedWords.add("catch");
      javaReservedWords.add("char");
      javaReservedWords.add("class");
      javaReservedWords.add("const");
      javaReservedWords.add("continue");
      javaReservedWords.add("default");
      javaReservedWords.add("do");
      javaReservedWords.add("double");
      javaReservedWords.add("else");
      javaReservedWords.add("extends");
      javaReservedWords.add("false");
      javaReservedWords.add("final");
      javaReservedWords.add("finally");
      javaReservedWords.add("float");
      javaReservedWords.add("for");
      javaReservedWords.add("goto");
      javaReservedWords.add("if");
      javaReservedWords.add("implements");
      javaReservedWords.add("import");
      javaReservedWords.add("instanceof");
      javaReservedWords.add("int");
      javaReservedWords.add("interface");
      javaReservedWords.add("long");
      javaReservedWords.add("native");
      javaReservedWords.add("new");
      javaReservedWords.add("null");
      javaReservedWords.add("package");
      javaReservedWords.add("private");
      javaReservedWords.add("protected");
      javaReservedWords.add("public");
      javaReservedWords.add("return");
      javaReservedWords.add("short");
      javaReservedWords.add("static");
      javaReservedWords.add("strictfp");
      javaReservedWords.add("super");
      javaReservedWords.add("switch");
      javaReservedWords.add("synchronized");
      javaReservedWords.add("this");
      javaReservedWords.add("throw");
      javaReservedWords.add("throws");
      javaReservedWords.add("transient");
      javaReservedWords.add("true");
      javaReservedWords.add("try");
      javaReservedWords.add("void");
      javaReservedWords.add("volatile");
      javaReservedWords.add("while");
    }
    return javaReservedWords;
  }
  public static HashSet getJavaLangTypes() {
    if (javaLangTypes == null) {
      javaLangTypes = new HashSet(100);
      javaLangTypes.add("AbstractMethodError");
      javaLangTypes.add("ArithmeticException");
      javaLangTypes.add("ArrayIndexOutOfBoundsException");
      javaLangTypes.add("ArrayStoreException");
      javaLangTypes.add("Boolean");
      javaLangTypes.add("Byte");
      javaLangTypes.add("Character");
      javaLangTypes.add("Class");
      javaLangTypes.add("ClassCastException");
      javaLangTypes.add("ClassCircularityError");
      javaLangTypes.add("ClassFormatError");
      javaLangTypes.add("ClassLoader");
      javaLangTypes.add("ClassNotFoundException");
      javaLangTypes.add("CloneNotSupportedException");
      javaLangTypes.add("Cloneable");
      javaLangTypes.add("Comparable");
      javaLangTypes.add("Compiler");
      javaLangTypes.add("Double");
      javaLangTypes.add("Error");
      javaLangTypes.add("Exception");
      javaLangTypes.add("ExceptionInInitializerError");
      javaLangTypes.add("Float");
      javaLangTypes.add("FloatingDecimal");
      javaLangTypes.add("IllegalAccessError");
      javaLangTypes.add("IllegalAccessException");
      javaLangTypes.add("IllegalArgumentException");
      javaLangTypes.add("IllegalMonitorStateException");
      javaLangTypes.add("IllegalStateException");
      javaLangTypes.add("IllegalThreadStateException");
      javaLangTypes.add("IncompatibleClassChangeError");
      javaLangTypes.add("IndexOutOfBoundsException");
      javaLangTypes.add("InheritableThreadLocal");
      javaLangTypes.add("InstantiationError");
      javaLangTypes.add("InstantiationException");
      javaLangTypes.add("Integer");
      javaLangTypes.add("InternalError");
      javaLangTypes.add("InterruptedException");
      javaLangTypes.add("LinkageError");
      javaLangTypes.add("Long");
      javaLangTypes.add("Math");
      javaLangTypes.add("NegativeArraySizeException");
      javaLangTypes.add("NoClassDefFoundError");
      javaLangTypes.add("NoSuchFieldError");
      javaLangTypes.add("NoSuchFieldException");
      javaLangTypes.add("NoSuchMethodError");
      javaLangTypes.add("NoSuchMethodException");
      javaLangTypes.add("NullPointerException");
      javaLangTypes.add("Number");
      javaLangTypes.add("NumberFormatException");
      javaLangTypes.add("Object");
      javaLangTypes.add("OutOfMemoryError");
      javaLangTypes.add("Package");
      javaLangTypes.add("Process");
      javaLangTypes.add("Runnable");
      javaLangTypes.add("Runtime");
      javaLangTypes.add("RuntimeException");
      javaLangTypes.add("RuntimePermission");
      javaLangTypes.add("SecurityException");
      javaLangTypes.add("SecurityManager");
      javaLangTypes.add("Short");
      javaLangTypes.add("StackOverflowError");
      javaLangTypes.add("String");
      javaLangTypes.add("StringBuffer");
      javaLangTypes.add("StringIndexOutOfBoundsException");
      javaLangTypes.add("System");
      javaLangTypes.add("Thread");
      javaLangTypes.add("ThreadDeath");
      javaLangTypes.add("ThreadGroup");
      javaLangTypes.add("ThreadLocal");
      javaLangTypes.add("Throwable");
      javaLangTypes.add("UnknownError");
      javaLangTypes.add("UnsatisfiedLinkError");
      javaLangTypes.add("UnsupportedClassVersionError");
      javaLangTypes.add("UnsupportedOperationException");
      javaLangTypes.add("VerifyError");
      javaLangTypes.add("VirtualMachineError");
      javaLangTypes.add("Void");
      javaLangTypes.add("boolean");
      javaLangTypes.add("byte");
      javaLangTypes.add("char");
      javaLangTypes.add("double");
      javaLangTypes.add("float");
      javaLangTypes.add("int");
      javaLangTypes.add("long");
      javaLangTypes.add("short");
    }
    return javaLangTypes;
  }
  public static String capName(String name) {
    if (name.length() == 0)
      return name;
    else
      return name.substring(0, 1).toUpperCase() + name.substring(1);
  }
  public static String uncapName(String name) {
    if (name.length() == 0)
      return name;
    else
      return name.substring(0, 1).toLowerCase() + name.substring(1);
  }
  public static String uncapPrefixedName(String name) {
    // lower all except the last upper case character if there are
    // more than one upper case characters in the beginning.
    // e.g. XSDElementContent -> xsdElementContent
    // However if the whole string is uppercase, the whole string
    // is turned into lower case.
    // e.g. CPU -> cpu
    if (name.length() == 0) {
      return name;
    } else {
      String lowerName = name.toLowerCase();
      int i;
      for (i = 0; i < name.length(); i++) {
        if (name.charAt(i) == lowerName.charAt(i)) {
          break;
        }
      }
      if (i > 1 && i < name.length()) {
        --i;
      }
      return name.substring(0, i).toLowerCase() + name.substring(i);
    }
  }
  public static String safeName(String name) {
    if (getJavaReservedWords().contains(name))
      return name + "_";
    return name;
  }
  public static String getCapName(NamedElement namedElement) {
    return capName(namedElement.getName());
  }
  public static String getDefaultValue(Property feature) {
    if (feature.getDefaultValue() == null) {
      if (isPrimitiveType(feature.getType()) && !feature.isMultivalued())
        return getPrimitiveDefault(feature.getType());
      return null;
    }
    return feature.getDefaultValue().stringValue();
  }
  public static String getImportedFeatureType(StructuralFeature feature) {
    String generatedFeatureType = UML2GenerationHelper.getImportedType(feature.getType());
    if (feature.isMultivalued()) {
      if (feature.isOrdered())
        generatedFeatureType = importManager.getImportedName("java.util.List");
      else
        generatedFeatureType = importManager.getImportedName("java.util.Collection");
    }
    return generatedFeatureType;
  }
  public static String getGetAccessor(StructuralFeature feature) {
    String capName = getCapName(feature);
    String result = isBooleanType(feature.getType()) ? "is" + capName : "get"
        + ("Class".equals(capName) ? "Class_" : capName);
    return result;
  }
  public static String uncapSafeName(NamedElement namedElement) {
    return safeName(uncapPrefixedName(namedElement.getName()));
  }
  public static String getFormattedName(NamedElement namedElement) {
    return format(getCapName(namedElement), ' ', null, false);
  }
  public static String getUpperName(NamedElement namedElement) {
    return format(namedElement.getName(), '_', null, false).toUpperCase();
  }
  /**
   * This method breaks sourceName into words delimited by sourceSeparator and/or mixed-case naming.
   */
  public static List parseName(String sourceName, char sourceSeparator) {
    List result = new ArrayList();
    StringBuffer currentWord = new StringBuffer();
    int length = sourceName.length();
    boolean lastIsLower = false;
    for (int index = 0; index < length; index++) {
      char curChar = sourceName.charAt(index);
      if (Character.isUpperCase(curChar) || (!lastIsLower && Character.isDigit(curChar))
          || curChar == sourceSeparator) {
        if (lastIsLower || curChar == sourceSeparator) {
          result.add(currentWord.toString());
          currentWord = new StringBuffer();
        }
        lastIsLower = false;
      } else {
        if (!lastIsLower) {
          int currentWordLength = currentWord.length();
          if (currentWordLength > 1) {
            char lastChar = currentWord.charAt(--currentWordLength);
            currentWord.setLength(currentWordLength);
            result.add(currentWord.toString());
            currentWord = new StringBuffer();
            currentWord.append(lastChar);
          }
        }
        lastIsLower = true;
      }
      if (curChar != sourceSeparator) {
        currentWord.append(curChar);
      }
    }
    result.add(currentWord.toString());
    return result;
  }
  public static String format(String name, char separator, String prefix, boolean includePrefix) {
    List parsedName = new ArrayList();
    if (prefix != null && name.startsWith(prefix)) {
      name = name.substring(prefix.length());
      if (includePrefix) {
        parsedName = parseName(prefix, '_');
      }
    }
    if (name.length() != 0)
      parsedName.addAll(parseName(name, '_'));
    StringBuffer result = new StringBuffer();
    for (Iterator nameIter = parsedName.iterator(); nameIter.hasNext();) {
      String nameComponent = (String) nameIter.next();
      result.append(nameComponent);
      if (nameIter.hasNext() && nameComponent.length() > 1) {
        result.append(separator);
      }
    }
    return result.length() == 0 && prefix != null ? prefix : result.toString();
  }
  public static String getUncapName(NamedElement namedElement) {
    return uncapPrefixedName(namedElement.getName());
  }
  public static String getQualifiedName(Type type) {
    String qualifiedName = type.getName();
    org.eclipse.uml2.Package parentPackage = type.getPackage();
    while (parentPackage != null && !(parentPackage instanceof org.eclipse.uml2.Model)) {
      if (qualifiedName != null)
        qualifiedName = parentPackage.getName() + "." + qualifiedName;
      else
        qualifiedName = parentPackage.getName();
      parentPackage = parentPackage.getNestingPackage();
    }
    return qualifiedName;
  }
  public static String getQualifiedName(org.eclipse.uml2.Package pack) {
    String qualifiedName = pack.getName();
    org.eclipse.uml2.Package parentPackage = pack.getNestingPackage();
    while (parentPackage != null && !(parentPackage instanceof org.eclipse.uml2.Model)) {
      if (qualifiedName != null)
        qualifiedName = parentPackage.getName() + "." + qualifiedName;
      else
        qualifiedName = parentPackage.getName();
      parentPackage = parentPackage.getNestingPackage();
    }
    return qualifiedName;
  }
  public static String getExtendsAndImplementsLitteral(org.eclipse.uml2.Class uml2Class) {
    String extendsLitteral = "";
    String implementsLitteral = "";
    List superClasses = uml2Class.getSuperClasses();
    if (superClasses.iterator().hasNext()) {
      org.eclipse.uml2.Class superClass = (org.eclipse.uml2.Class) superClasses.iterator().next();
      String superClassQualifiedName = UML2GenerationHelper.getQualifiedName(superClass);
      if (extendsLitteral.equals(""))
        extendsLitteral = " extends " + importManager.getImportedName(superClassQualifiedName);
      else
        extendsLitteral = implementsLitteral + ","
            + importManager.getImportedName(superClassQualifiedName);
    }
    Set interfaces = uml2Class.getImplementedInterfaces();
    for (Iterator it = interfaces.iterator(); it.hasNext();) {
      org.eclipse.uml2.Interface itf = (org.eclipse.uml2.Interface) it.next();
      String itfQualifiedName = UML2GenerationHelper.getQualifiedName(itf);
      if (implementsLitteral.equals(""))
        if (extendsLitteral.equals(""))
          implementsLitteral = " implements " + importManager.getImportedName(itfQualifiedName);
        else
          implementsLitteral = ", implements " + importManager.getImportedName(itfQualifiedName);
      else
        implementsLitteral = implementsLitteral + "," + importManager.getImportedName(itfQualifiedName);
    }
    return extendsLitteral + implementsLitteral;
  }
  public static String getExtendsLitteral(org.eclipse.uml2.Interface uml2Interface) {
    String extendsLitteral = "";
    List generalizations = uml2Interface.getGeneralizations();
    for (Iterator iter = generalizations.iterator(); iter.hasNext();) {
      Generalization generalization = (Generalization) iter.next();
      org.eclipse.uml2.Classifier general = generalization.getGeneral();
      if (general instanceof org.eclipse.uml2.Interface) {
        org.eclipse.uml2.Interface itf = (org.eclipse.uml2.Interface) general;
        String itfQualifiedName = UML2GenerationHelper.getQualifiedName(itf);
        if (extendsLitteral.equals(""))
          extendsLitteral = " implements " + importManager.getImportedName(itfQualifiedName);
        else
          extendsLitteral = extendsLitteral + "," + importManager.getImportedName(itfQualifiedName);
      }
      
    }
    return extendsLitteral;
  }
  public static boolean isBooleanType(Type type) {
    return isPrimitiveType(type) && getInstanceClass(type) == java.lang.Boolean.TYPE;
  }
  public static boolean isStringType(Type type) {
    return getInstanceClass(type) == java.lang.String.class;
  }
  public static String getParameters(Operation operation) {
    return getParameters(operation, true);
  }
  public static String getParameters(Operation operation, boolean formal) {
    StringBuffer result = new StringBuffer();
    for (Iterator iter = operation.getParameters().iterator(); iter.hasNext();) {
      Parameter parameter = (Parameter) iter.next();
      if (formal) {
        result.append(getImportedType(parameter.getType()));
        result.append(' ');
      }
      String paramName = parameter.getName();
      if (paramName !=null && paramName.trim().length() == 0)
        paramName = null;
      result.append(paramName == null ? "arg" + operation.getParameters().indexOf(parameter) : paramName);
      if (iter.hasNext())
        result.append(", ");
    }
    return result.toString();
  }
  public static String getAccessorName(StructuralFeature feature) {
    return getCapName(feature);
  }
  public static String getEnumLiteralID(EnumerationLiteral literal) {
    return format(literal.getName(), '_', null, false).toUpperCase();
  }
  public static List getUniqueValuedGenEnumLiterals(Enumeration enumeration) {
    List result = new ArrayList();
    Set resultSet = new HashSet();
    for (Iterator iter = enumeration.getOwnedLiterals().iterator(); iter.hasNext();) {
      EnumerationLiteral enumLiteral = (EnumerationLiteral) iter.next();
      if (resultSet.add(new Integer(enumeration.getOwnedLiterals().indexOf(enumLiteral)))) {
        result.add(enumLiteral);
      }
    }
    return result;
  }
}
