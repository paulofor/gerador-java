package jet.android.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class VoInterface
{
  protected static String nl;
  public static synchronized VoInterface create(String lineSeparator)
  {
    nl = lineSeparator;
    VoInterface result = new VoInterface();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo;" + NL + "" + NL + "import java.sql.Timestamp;" + NL + "import java.text.SimpleDateFormat;" + NL + "import org.json.JSONObject;" + NL + "import org.json.JSONException;" + NL + "import br.com.digicom.util.ConversorJson;" + NL + "import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "import br.com.digicom.activity.DigicomContexto;" + NL + "import br.com.digicom.modelo.DisplayI;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.derivada.";
  protected final String TEXT_4 = "DerivadaI;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.agregado.";
  protected final String TEXT_6 = "AgregadoI;" + NL + "" + NL + "" + NL + "public interface ";
  protected final String TEXT_7 = " extends DCIObjetoDominio" + NL + "\t\t, ";
  protected final String TEXT_8 = "DerivadaI, ";
  protected final String TEXT_9 = "AgregadoI, DisplayI<";
  protected final String TEXT_10 = ">{ " + NL + "  " + NL + "  \t/**" + NL + " \t* @deprecated  Substituir por JSonSimples()" + NL + " \t*/" + NL + "\t//@Deprecated" + NL + "  \t//public JSONObject JSon() throws JSONException;" + NL + "  \tpublic JSONObject JSonSimples() throws JSONException;" + NL + "  \tpublic String debug();" + NL + "  \tpublic DigicomContexto getContexto();" + NL + "  \tpublic void setContexto(DigicomContexto ctx);";
  protected final String TEXT_11 = NL + "  \tpublic String toString();";
  protected final String TEXT_12 = NL + "\tpublic ";
  protected final String TEXT_13 = " get";
  protected final String TEXT_14 = "();" + NL + "\tpublic void set";
  protected final String TEXT_15 = "(";
  protected final String TEXT_16 = " valor);";
  protected final String TEXT_17 = NL + "\tpublic String get";
  protected final String TEXT_18 = "DDMMAAAA();";
  protected final String TEXT_19 = "\t" + NL + "\tpublic void set";
  protected final String TEXT_20 = "DDMMAAAAComBarra(String valor);";
  protected final String TEXT_21 = NL;
  protected final String TEXT_22 = "\t" + NL + "\tpublic String get";
  protected final String TEXT_23 = "Tela();";
  protected final String TEXT_24 = NL;
  protected final String TEXT_25 = NL + "\tpublic String get";
  protected final String TEXT_26 = "HHMM();" + NL + "\tpublic String get";
  protected final String TEXT_27 = "HHMMSS();";
  protected final String TEXT_28 = NL + "\tpublic String getTituloTela();" + NL + "\t" + NL + "\t" + NL + "\t// ComChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_29 = NL + "\tpublic long get";
  protected final String TEXT_30 = "LazyLoader(); " + NL + "\t\t";
  protected final String TEXT_31 = NL + "\t" + NL + "\tpublic boolean getSomenteMemoria();" + NL + "\tpublic void setSomenteMemoria(boolean dado);" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    
	AtributoWrapper atributoW = new AtributoWrapperAndroid();
	AtributoEntidade ident = classe.getIdentificador();
	if (ident!=null) {
		atributoW.setBase(ident);

    stringBuffer.append(TEXT_11);
    
	}
	Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
	while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
		

    stringBuffer.append(TEXT_12);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_16);
    
	if (atributo.ehData()) {

    stringBuffer.append(TEXT_17);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_18);
    
		if (!atributo.ehHora()) {

    stringBuffer.append(TEXT_19);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_20);
    
		}

    
	}

    stringBuffer.append(TEXT_21);
    
	if (atributo.ehDecimal()) {

    stringBuffer.append(TEXT_22);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_23);
    
	}

    stringBuffer.append(TEXT_24);
    
	if (atributo.ehHora()) {

    stringBuffer.append(TEXT_25);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_27);
    
	}
	}

    stringBuffer.append(TEXT_28);
    
		Iterator<RelacionamentoWrapper> itera = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (itera.hasNext()) {
		RelacionamentoWrapper relac = itera.next();
		
    stringBuffer.append(TEXT_29);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_30);
    
		}
	
    stringBuffer.append(TEXT_31);
    return stringBuffer.toString();
  }
}
