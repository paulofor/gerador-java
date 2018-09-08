package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class AssembledVo
{
  protected static String nl;
  public static synchronized AssembledVo create(String lineSeparator)
  {
    nl = lineSeparator;
    AssembledVo result = new AssembledVo();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.util.List;" + NL + "import ";
  protected final String TEXT_3 = ".";
  protected final String TEXT_4 = ";" + NL + "import ";
  protected final String TEXT_5 = ".*;" + NL + "import ";
  protected final String TEXT_6 = ".";
  protected final String TEXT_7 = ";" + NL + "import ";
  protected final String TEXT_8 = ".";
  protected final String TEXT_9 = ";" + NL + "import ";
  protected final String TEXT_10 = ".";
  protected final String TEXT_11 = ";" + NL;
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL;
  protected final String TEXT_15 = NL + "public class ";
  protected final String TEXT_16 = " ";
  protected final String TEXT_17 = " extends ";
  protected final String TEXT_18 = " ";
  protected final String TEXT_19 = " implements ";
  protected final String TEXT_20 = " {" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_21 = " assembler = null;" + NL + "\tprivate ";
  protected final String TEXT_22 = " principal = null;";
  protected final String TEXT_23 = NL + "\tprivate ";
  protected final String TEXT_24 = " ";
  protected final String TEXT_25 = " = null;";
  protected final String TEXT_26 = NL + "\tprivate List ";
  protected final String TEXT_27 = "Lista = null;" + NL + "\t";
  protected final String TEXT_28 = NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_29 = "(";
  protected final String TEXT_30 = " objeto) {";
  protected final String TEXT_31 = "super(objeto); ";
  protected final String TEXT_32 = NL + "\t\tassembler = new ";
  protected final String TEXT_33 = "();" + NL + "\t\tprincipal = objeto;" + NL + "\t}";
  protected final String TEXT_34 = NL + "\tpublic ";
  protected final String TEXT_35 = " ";
  protected final String TEXT_36 = "() {" + NL + "\t\tif (";
  protected final String TEXT_37 = "==null) {" + NL + "\t\t\tassembler.";
  protected final String TEXT_38 = "(principal);" + NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_39 = ";" + NL + "\t}" + NL + "\tpublic void ";
  protected final String TEXT_40 = "(";
  protected final String TEXT_41 = " ";
  protected final String TEXT_42 = ") {" + NL + "\t\tthis.";
  protected final String TEXT_43 = " = ";
  protected final String TEXT_44 = ";" + NL + "\t}";
  protected final String TEXT_45 = NL;
  protected final String TEXT_46 = NL + "\tpublic List ";
  protected final String TEXT_47 = "() {" + NL + "\t\tif (";
  protected final String TEXT_48 = "Lista==null) {" + NL + "\t\t\tassembler.";
  protected final String TEXT_49 = "(principal);" + NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_50 = "Lista;" + NL + "\t}" + NL + "\tpublic void ";
  protected final String TEXT_51 = "(List ";
  protected final String TEXT_52 = "Lista) {" + NL + "\t\tthis.";
  protected final String TEXT_53 = "Lista = ";
  protected final String TEXT_54 = "Lista;" + NL + "\t}";
  protected final String TEXT_55 = NL + "} ";
  protected final String TEXT_56 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteAssembledVo() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteModeloVo() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeModeloVo() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getPacoteAssembledI() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeAssembledI() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getPacoteAssembler() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeAssembler() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getPacoteAssemblerImpl() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeAssemblerImpl() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    stringBuffer.append( "/*" );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( "* Classe gerada automaticamente, nao realizar alteracoes " );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( "*/" );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeAssembledVo() );
    stringBuffer.append(TEXT_16);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getSuperTipo().getNomeAssembledVo() );
    stringBuffer.append(TEXT_18);
     } 
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeAssembledI() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeAssembler() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_22);
    
Iterator iterador = classe.getReferenceWrappersUnico().iterator();
while (iterador.hasNext()) {
	referencia = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_23);
    stringBuffer.append( referencia.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_25);
    }
    
iterador = classe.getReferenceWrappersMultiplo().iterator();
while (iterador.hasNext()) {
	referencia = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_26);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_27);
    }
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeAssembledVo() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_30);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_31);
     } 
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeAssemblerImpl() );
    stringBuffer.append(TEXT_33);
    
iterador = classe.getReferenceWrappersUnico().iterator();
while (iterador.hasNext()) {
	referencia = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_34);
    stringBuffer.append( referencia.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( referencia.getClasseOposta().getGetter() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( referencia.getClasseOposta().getMetodoAssemblerCarrega() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( referencia.getClasseOposta().getSetter() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( referencia.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_45);
    
iterador = classe.getReferenceWrappersMultiplo().iterator();
while (iterador.hasNext()) {
	referencia = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_46);
    stringBuffer.append( referencia.getClasseOposta().getGetterMultiplo() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( referencia.getClasseOposta().getMetodoAssemblerCarrega() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( referencia.getClasseOposta().getSetterMultiplo() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_55);
    stringBuffer.append(TEXT_56);
    return stringBuffer.toString();
  }
}
