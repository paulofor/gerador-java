package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class ModeloVo
{
  protected static String nl;
  public static synchronized ModeloVo create(String lineSeparator)
  {
    nl = lineSeparator;
    ModeloVo result = new ModeloVo();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.util.List;" + NL + "import ";
  protected final String TEXT_3 = ".ObjetoI;" + NL + "import ";
  protected final String TEXT_4 = ".*;" + NL + "import ";
  protected final String TEXT_5 = ".MetodoNaoImplementadoException;";
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL + "import ";
  protected final String TEXT_8 = ".";
  protected final String TEXT_9 = ";" + NL + "import ";
  protected final String TEXT_10 = ".";
  protected final String TEXT_11 = ";" + NL + "import ";
  protected final String TEXT_12 = ".";
  protected final String TEXT_13 = ";" + NL + "import ";
  protected final String TEXT_14 = ".";
  protected final String TEXT_15 = ";";
  protected final String TEXT_16 = NL + NL + "public class ";
  protected final String TEXT_17 = " ";
  protected final String TEXT_18 = " extends ";
  protected final String TEXT_19 = " ";
  protected final String TEXT_20 = " implements ";
  protected final String TEXT_21 = " {" + NL;
  protected final String TEXT_22 = NL + NL + "\tprivate ";
  protected final String TEXT_23 = " itemDerivada = null;" + NL + "\tprivate ";
  protected final String TEXT_24 = " getItemDerivada() {" + NL + "\t\tif (itemDerivada==null) itemDerivada = new ";
  protected final String TEXT_25 = "(this);" + NL + "\t\treturn itemDerivada;" + NL + "\t}" + NL + "" + NL + "\tpublic boolean comparaItem(ObjetoI comparador) {" + NL + "\t\t";
  protected final String TEXT_26 = " ";
  protected final String TEXT_27 = " = (";
  protected final String TEXT_28 = ") comparador;" + NL + "\t\tthrow new MetodoNaoImplementadoException(\"";
  protected final String TEXT_29 = "\",\"comparaItem(";
  protected final String TEXT_30 = " ";
  protected final String TEXT_31 = ")\");" + NL + "\t}" + NL + NL;
  protected final String TEXT_32 = NL + "    private ";
  protected final String TEXT_33 = " ";
  protected final String TEXT_34 = ";";
  protected final String TEXT_35 = NL + "\tprivate ";
  protected final String TEXT_36 = " objetoAssembled = null;" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_37 = "() {" + NL + "\t\tobjetoAssembled = new ";
  protected final String TEXT_38 = "(this);" + NL + "\t}" + NL + "\t";
  protected final String TEXT_39 = NL + "    public ";
  protected final String TEXT_40 = " ";
  protected final String TEXT_41 = "() {" + NL + "    \treturn this.";
  protected final String TEXT_42 = ";" + NL + "    }" + NL + "    public void ";
  protected final String TEXT_43 = "(";
  protected final String TEXT_44 = " ";
  protected final String TEXT_45 = ") {" + NL + "    \tthis.";
  protected final String TEXT_46 = " = ";
  protected final String TEXT_47 = ";" + NL + "    }";
  protected final String TEXT_48 = NL;
  protected final String TEXT_49 = NL + "    public ";
  protected final String TEXT_50 = " ";
  protected final String TEXT_51 = "() {" + NL + "    \treturn objetoAssembled.";
  protected final String TEXT_52 = "();" + NL + "    }" + NL + "    public void ";
  protected final String TEXT_53 = "(";
  protected final String TEXT_54 = " item){" + NL + "    \tobjetoAssembled.";
  protected final String TEXT_55 = "(item);" + NL + "    }";
  protected final String TEXT_56 = NL;
  protected final String TEXT_57 = NL + "    public List ";
  protected final String TEXT_58 = "() {" + NL + "    \treturn objetoAssembled.";
  protected final String TEXT_59 = "();" + NL + "    }" + NL + "    public void ";
  protected final String TEXT_60 = "(List item){" + NL + "    \tobjetoAssembled.";
  protected final String TEXT_61 = "(item);" + NL + "    }";
  protected final String TEXT_62 = NL;
  protected final String TEXT_63 = NL + "} ";
  protected final String TEXT_64 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteModeloVo() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteReferencias() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getPacoteUtil() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    stringBuffer.append( (classe.existeTipoData()?"import java.util.Date;":"") );
     if (classe.possuiAtributos()) { 
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getPacoteDerivadaI() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeDerivadaI() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getPacoteDerivada() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeDerivada() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getPacoteAssembledI() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeAssembledI() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getPacoteAssembledVo() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeAssembledVo() );
    stringBuffer.append(TEXT_15);
     } 
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeModeloVo() );
    stringBuffer.append(TEXT_17);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getSuperTipo().getNomeModeloVo() );
    stringBuffer.append(TEXT_19);
     } 
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_21);
     if (classe.possuiAtributos()) { 
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeDerivadaI() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeDerivadaI() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeDerivada() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeModeloVo() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_31);
    for (EAttribute item : eClass.getEAttributes()) {
     	atributo.setAtributo(item);
    stringBuffer.append(TEXT_32);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_34);
    }
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeAssembledI() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeModeloVo() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeAssembledVo() );
    stringBuffer.append(TEXT_38);
    for (EAttribute item : eClass.getEAttributes()) {
     	atributo.setAtributo(item);
    stringBuffer.append(TEXT_39);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( atributo.getSetter() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_47);
    }
    stringBuffer.append(TEXT_48);
    
Iterator iterador = classe.getReferenceWrappersUnico().iterator();
while (iterador.hasNext()) {
	referencia = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_49);
    stringBuffer.append( referencia.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( referencia.getGetter() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( referencia.getGetter() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( referencia.getSetter() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( referencia.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( referencia.getSetter() );
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_56);
    
iterador = classe.getReferenceWrappersMultiplo().iterator();
while (iterador.hasNext()) {
	referencia = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_57);
    stringBuffer.append( referencia.getGetterMultiplo() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( referencia.getGetterMultiplo() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( referencia.getSetterMultiplo() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( referencia.getSetterMultiplo() );
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_62);
    } // Final de possuiAtributos 
    stringBuffer.append(TEXT_63);
    stringBuffer.append(TEXT_64);
    return stringBuffer.toString();
  }
}
