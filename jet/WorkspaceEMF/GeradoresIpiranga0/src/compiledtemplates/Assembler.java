package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class Assembler
{
  protected static String nl;
  public static synchronized Assembler create(String lineSeparator)
  {
    nl = lineSeparator;
    Assembler result = new Assembler();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.util.List;" + NL + "import ipiranga.pdsi.framework.modelo.negocio.service.ServiceException;" + NL + "import ";
  protected final String TEXT_3 = ".*;" + NL + "import ";
  protected final String TEXT_4 = ".*;" + NL + "import ";
  protected final String TEXT_5 = ".";
  protected final String TEXT_6 = ";" + NL + NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL + "public abstract class ";
  protected final String TEXT_11 = " {" + NL + "" + NL + "\tprivate ServiceLocator localizador = null;" + NL + "\tpublic ";
  protected final String TEXT_12 = "() {" + NL + "\t\tlocalizador = new ServiceLocator();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_13 = NL + "\tpublic void ";
  protected final String TEXT_14 = "(";
  protected final String TEXT_15 = " ";
  protected final String TEXT_16 = ") {" + NL + "\t\t";
  protected final String TEXT_17 = " service = localizador.get";
  protected final String TEXT_18 = "();" + NL + "\t\t";
  protected final String TEXT_19 = " ";
  protected final String TEXT_20 = " = ";
  protected final String TEXT_21 = "(";
  protected final String TEXT_22 = ",service);" + NL + "\t\t//((";
  protected final String TEXT_23 = ")";
  protected final String TEXT_24 = ").";
  protected final String TEXT_25 = "(";
  protected final String TEXT_26 = ");" + NL + "\t\t";
  protected final String TEXT_27 = ".";
  protected final String TEXT_28 = "(";
  protected final String TEXT_29 = ");" + NL + "\t\t" + NL + "\t}" + NL + "\t//protected abstract ";
  protected final String TEXT_30 = " ";
  protected final String TEXT_31 = "(";
  protected final String TEXT_32 = " ";
  protected final String TEXT_33 = ", ";
  protected final String TEXT_34 = " service);" + NL + "\tprivate final ";
  protected final String TEXT_35 = " ";
  protected final String TEXT_36 = "(";
  protected final String TEXT_37 = " ";
  protected final String TEXT_38 = ", ";
  protected final String TEXT_39 = " service) {" + NL + "\t\ttry {" + NL + "\t\t\treturn service.";
  protected final String TEXT_40 = "(";
  protected final String TEXT_41 = ");" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL;
  protected final String TEXT_42 = NL + "\tpublic void ";
  protected final String TEXT_43 = "(";
  protected final String TEXT_44 = " ";
  protected final String TEXT_45 = ") {" + NL + "\t\t";
  protected final String TEXT_46 = " service = localizador.get";
  protected final String TEXT_47 = "();" + NL + "\t\tList ";
  protected final String TEXT_48 = " = ";
  protected final String TEXT_49 = "(";
  protected final String TEXT_50 = ",service);" + NL + "\t\t((";
  protected final String TEXT_51 = ")";
  protected final String TEXT_52 = ").";
  protected final String TEXT_53 = "(";
  protected final String TEXT_54 = ");" + NL + "\t}" + NL + "\t//protected abstract List ";
  protected final String TEXT_55 = "(";
  protected final String TEXT_56 = " ";
  protected final String TEXT_57 = ", ";
  protected final String TEXT_58 = " service);" + NL + "\tprivate final List ";
  protected final String TEXT_59 = "(";
  protected final String TEXT_60 = " ";
  protected final String TEXT_61 = ", ";
  protected final String TEXT_62 = " service) {" + NL + "\t\ttry {" + NL + "\t\t\treturn service.";
  protected final String TEXT_63 = "(";
  protected final String TEXT_64 = ");" + NL + "\t\t} catch (ServiceException e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_65 = NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;  
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteAssembler() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getPacoteServiceI() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getPacoteAssembledI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeAssembledI() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    stringBuffer.append( "/*" );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( "* Classe gerada automaticamente, nao realizar alteracoes " );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( "*/" );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeAssembler() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeAssembler() );
    stringBuffer.append(TEXT_12);
    
Iterator iterador = classe.getReferenceWrappersUnico().iterator();
while (iterador.hasNext()) {
	referencia = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_13);
    stringBuffer.append( referencia.getClasseOposta().getMetodoAssemblerCarrega() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( referencia.getClasseOposta().getNomeServiceI() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( referencia.getClasseOposta().getNomeServiceI() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( referencia.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( referencia.getClasseOposta().getMetodoAssemblerCarrega() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeAssembledI() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( referencia.getClasseOposta().getSetter() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( referencia.getClasseOposta().getSetter() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( referencia.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( referencia.getClasseOposta().getMetodoAssemblerCarrega() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( referencia.getClasseOposta().getNomeServiceI() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( referencia.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( referencia.getClasseOposta().getMetodoAssemblerCarrega() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( referencia.getClasseOposta().getNomeServiceI() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( referencia.getReferenciaOposta().metodoObtemServico() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_41);
    }
    
iterador = classe.getReferenceWrappersMultiplo().iterator();
while (iterador.hasNext()) {
	referencia = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_42);
    stringBuffer.append( referencia.getClasseOposta().getMetodoAssemblerCarrega() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( referencia.getClasseOposta().getNomeServiceI() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( referencia.getClasseOposta().getNomeServiceI() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( referencia.getClasseOposta().getMetodoAssemblerCarrega() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( classe.getNomeAssembledI() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( referencia.getClasseOposta().getSetterMultiplo() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( referencia.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( referencia.getClasseOposta().getMetodoAssemblerCarrega() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( referencia.getClasseOposta().getNomeServiceI() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( referencia.getClasseOposta().getMetodoAssemblerCarrega() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( referencia.getClasseOposta().getNomeServiceI() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( referencia.getReferenciaOposta().metodoObtemServico() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_64);
    }
    stringBuffer.append(TEXT_65);
    return stringBuffer.toString();
  }
}
