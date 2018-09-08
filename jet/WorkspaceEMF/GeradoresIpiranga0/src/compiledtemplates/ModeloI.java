package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class ModeloI
{
  protected static String nl;
  public static synchronized ModeloI create(String lineSeparator)
  {
    nl = lineSeparator;
    ModeloI result = new ModeloI();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".ObjetoI;";
  protected final String TEXT_4 = "import ";
  protected final String TEXT_5 = ".";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + NL + "import ";
  protected final String TEXT_8 = ".";
  protected final String TEXT_9 = ";";
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL + NL + "public interface ";
  protected final String TEXT_12 = " extends ";
  protected final String TEXT_13 = " ";
  protected final String TEXT_14 = " ";
  protected final String TEXT_15 = " ObjetoI ";
  protected final String TEXT_16 = " , ";
  protected final String TEXT_17 = " ";
  protected final String TEXT_18 = " , ";
  protected final String TEXT_19 = " ";
  protected final String TEXT_20 = "  " + NL + "{" + NL;
  protected final String TEXT_21 = NL + "    public ";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = "();" + NL + "    public void ";
  protected final String TEXT_24 = "(";
  protected final String TEXT_25 = " ";
  protected final String TEXT_26 = ");";
  protected final String TEXT_27 = NL + "} ";
  protected final String TEXT_28 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteReferencias() );
    stringBuffer.append(TEXT_3);
     if (classe.possuiAtributos()) { 
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getPacoteDerivadaI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeDerivadaI() );
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getPacoteAssembledI() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(classe.getNomeAssembledI() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    stringBuffer.append( (classe.existeTipoData()?"import java.util.Date;":"") );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_12);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getSuperTipo().getNomeModeloI() );
    stringBuffer.append(TEXT_14);
     } else { 
    stringBuffer.append(TEXT_15);
     } 
    stringBuffer.append(TEXT_16);
    stringBuffer.append(classe.getNomeAssembledI() );
    stringBuffer.append(TEXT_17);
     if (classe.possuiAtributos()) { 
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeDerivadaI() );
    stringBuffer.append(TEXT_19);
     } 
    stringBuffer.append(TEXT_20);
    for (EAttribute item : eClass.getEAttributes()) {
     atributo.setAtributo(item); 
    stringBuffer.append(TEXT_21);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( atributo.getGetter() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( atributo.getSetter() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( item.getName() );
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_27);
    stringBuffer.append(TEXT_28);
    return stringBuffer.toString();
  }
}
