package jet.android.data;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class FiltroContract
{
  protected static String nl;
  public static synchronized FiltroContract create(String lineSeparator)
  {
    nl = lineSeparator;
    FiltroContract result = new FiltroContract();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package  ";
  protected final String TEXT_2 = ".data.contract;" + NL + "" + NL + "import java.util.List;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "import android.content.Context;" + NL + "import java.sql.Timestamp;" + NL + "" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_4 = "Filtro {" + NL;
  protected final String TEXT_5 = NL + "\t\tprivate ";
  protected final String TEXT_6 = " _";
  protected final String TEXT_7 = ";" + NL + "\t\tpublic ";
  protected final String TEXT_8 = " get";
  protected final String TEXT_9 = " () {" + NL + "\t\t\treturn _";
  protected final String TEXT_10 = " ;" + NL + "\t\t}" + NL + "\t\tpublic void set";
  protected final String TEXT_11 = " (";
  protected final String TEXT_12 = " value) {" + NL + "\t\t\t_";
  protected final String TEXT_13 = "  = value;" + NL + "\t\t}" + NL + "\t\tpublic ";
  protected final String TEXT_14 = " valida";
  protected final String TEXT_15 = "() {" + NL + "\t\t\t";
  protected final String TEXT_16 = NL + "\t\t\tif (_";
  protected final String TEXT_17 = " == 0) {" + NL + "\t\t\t\tthrow new RuntimeException(\"";
  protected final String TEXT_18 = " eh zero\");" + NL + "\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_19 = NL + "\t\t\tif (_";
  protected final String TEXT_20 = " == null) {" + NL + "\t\t\t\tthrow new RuntimeException(\"";
  protected final String TEXT_21 = " eh nulo\");" + NL + "\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_22 = NL + "\t\t\treturn _";
  protected final String TEXT_23 = " ;" + NL + "\t\t}";
  protected final String TEXT_24 = NL + NL + "\t\tpublic String getParam() {" + NL + "\t\t\tString saida = \"\";";
  protected final String TEXT_25 = NL + "\t\t\tsaida += \"";
  protected final String TEXT_26 = "=\" + _";
  protected final String TEXT_27 = " + \"&\";";
  protected final String TEXT_28 = NL + "\t\t\treturn saida;" + NL + "\t\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    
		Iterator<FiltroColecao> iteradorF = classe.getListaFiltroColecao().iterator();
		while (iteradorF.hasNext()) {
		FiltroColecao filtro = iteradorF.next();
		String tipoFiltro = null;
		if (filtro.getIdEntidadeT()==0) {
			// Nao tem entidade ? tipo primitivo
			tipoFiltro =  ConverteTipoAndroid.getTipoFiltro(filtro.getTipoCampoFiltro());
		}	
		else { 
			// Tem entidade vai buscar a classe
			ClasseWrapper classeFiltro = AplicacaoWrapper.getPorId(filtro.getIdEntidadeT());
			if (classeFiltro==null) break;
			tipoFiltro = classeFiltro.getNomeParaClasse();
		}

    stringBuffer.append(TEXT_5);
    stringBuffer.append( tipoFiltro );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( tipoFiltro );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( tipoFiltro );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( tipoFiltro );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_15);
     if ("long".equals(tipoFiltro) || "float".equals(tipoFiltro)) { 
    stringBuffer.append(TEXT_16);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_18);
     } else { 
    stringBuffer.append(TEXT_19);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_21);
     } 
    stringBuffer.append(TEXT_22);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_23);
    
		}

    stringBuffer.append(TEXT_24);
    
			iteradorF = classe.getListaFiltroColecao().iterator();
			while (iteradorF.hasNext()) {
				FiltroColecao filtro = iteradorF.next();
				if (filtro.getIdEntidadeT()==0) {

    stringBuffer.append(TEXT_25);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_27);
    
				}
			}

    stringBuffer.append(TEXT_28);
    return stringBuffer.toString();
  }
}
