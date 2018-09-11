package jet.android2.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class VoI
{
  protected static String nl;
  public static synchronized VoI create(String lineSeparator)
  {
    nl = lineSeparator;
    VoI result = new VoI();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo;" + NL + "" + NL + "import java.sql.Timestamp;" + NL + "import java.text.SimpleDateFormat;" + NL + "import org.json.JSONObject;" + NL + "import org.json.JSONException;" + NL + "import ";
  protected final String TEXT_3 = ".framework.modelo.DCIObjetoDominio;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.agregado.";
  protected final String TEXT_5 = "AgregadoI;" + NL + "" + NL + "public interface ";
  protected final String TEXT_6 = "  extends DCIObjetoDominio" + NL + "\t, ";
  protected final String TEXT_7 = "AgregadoI {" + NL + "" + NL + "  \t//public JSONObject JSonSimples() throws JSONException;" + NL + "  \t//public String debug();" + NL + "  \t" + NL + "  \t" + NL + "  \t";
  protected final String TEXT_8 = NL + "  \tpublic ";
  protected final String TEXT_9 = " get";
  protected final String TEXT_10 = "();" + NL + "\tpublic void set";
  protected final String TEXT_11 = "(";
  protected final String TEXT_12 = " valor); " + NL + "  \t";
  protected final String TEXT_13 = NL + "  \t" + NL;
  protected final String TEXT_14 = NL + "  \tpublic String toString();";
  protected final String TEXT_15 = NL + "\tpublic ";
  protected final String TEXT_16 = " get";
  protected final String TEXT_17 = "();" + NL + "\tpublic void set";
  protected final String TEXT_18 = "(";
  protected final String TEXT_19 = " valor);";
  protected final String TEXT_20 = NL + "\tpublic String get";
  protected final String TEXT_21 = "DDMMAAAA();";
  protected final String TEXT_22 = "\t" + NL + "\tpublic void set";
  protected final String TEXT_23 = "DDMMAAAAComBarra(String valor);" + NL + "\tpublic void set";
  protected final String TEXT_24 = "DDMMAAAAComTraco(String valor);";
  protected final String TEXT_25 = NL;
  protected final String TEXT_26 = "\t" + NL + "\tpublic String get";
  protected final String TEXT_27 = "Tela();";
  protected final String TEXT_28 = NL;
  protected final String TEXT_29 = NL + "\tpublic String get";
  protected final String TEXT_30 = "HHMM();" + NL + "\tpublic String get";
  protected final String TEXT_31 = "HHMMSS();";
  protected final String TEXT_32 = NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t// ComChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_33 = NL + "\tpublic long get";
  protected final String TEXT_34 = "LazyLoader(); " + NL + "\t\t";
  protected final String TEXT_35 = NL + "\t" + NL + "\tpublic boolean getSomenteMemoria();" + NL + "\tpublic void setSomenteMemoria(boolean dado);" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
     for (ProcValorWrapper proc : classe.getListaDerivadaDemanda() ) { 
    stringBuffer.append(TEXT_8);
    stringBuffer.append( proc.getTipo() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( proc.getNomePropriedade() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( proc.getNomePropriedade() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( proc.getTipo() );
    stringBuffer.append(TEXT_12);
     } 
    stringBuffer.append(TEXT_13);
    
	AtributoWrapper atributoW = new AtributoWrapperAndroid();
	AtributoEntidade ident = classe.getIdentificador();
	if (ident!=null) {
		atributoW.setBase(ident);

    stringBuffer.append(TEXT_14);
    
	}
	Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
	while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
		

    stringBuffer.append(TEXT_15);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_19);
    
	if (atributo.ehData()) {

    stringBuffer.append(TEXT_20);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_21);
    
		if (!atributo.ehHora()) {

    stringBuffer.append(TEXT_22);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_24);
    
		}

    
	}

    stringBuffer.append(TEXT_25);
    
	if (atributo.ehDecimal()) {

    stringBuffer.append(TEXT_26);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_27);
    
	}

    stringBuffer.append(TEXT_28);
    
	if (atributo.ehHora()) {

    stringBuffer.append(TEXT_29);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_31);
    
	}
	}

    stringBuffer.append(TEXT_32);
    
		Iterator<RelacionamentoWrapper> itera = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (itera.hasNext()) {
		RelacionamentoWrapper relac = itera.next();
		
    stringBuffer.append(TEXT_33);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_34);
    
		}
	
    stringBuffer.append(TEXT_35);
    return stringBuffer.toString();
  }
}
