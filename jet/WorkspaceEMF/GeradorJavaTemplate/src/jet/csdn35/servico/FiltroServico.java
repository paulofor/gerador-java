package jet.csdn35.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class FiltroServico
{
  protected static String nl;
  public static synchronized FiltroServico create(String lineSeparator)
  {
    nl = lineSeparator;
    FiltroServico result = new FiltroServico();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "using System;" + NL + "using ";
  protected final String TEXT_2 = ".modelo;" + NL + "using System.Collections;" + NL + "" + NL + "namespace ";
  protected final String TEXT_3 = ".servico.filtro {" + NL + "" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_4 = "Filtro {" + NL + NL;
  protected final String TEXT_5 = NL + "\t\tprivate ";
  protected final String TEXT_6 = " _";
  protected final String TEXT_7 = ";" + NL + "\t\tpublic ";
  protected final String TEXT_8 = " ";
  protected final String TEXT_9 = " {" + NL + "\t\t\tget {" + NL + "\t\t\t\treturn _";
  protected final String TEXT_10 = ";" + NL + "\t\t\t}" + NL + "\t\t\tset {" + NL + "\t\t\t\t_";
  protected final String TEXT_11 = " = value;" + NL + "\t\t\t}\t" + NL + "\t\t}";
  protected final String TEXT_12 = NL + NL + NL + "\t";
  protected final String TEXT_13 = NL + "\t\tprivate long _codigo";
  protected final String TEXT_14 = "_";
  protected final String TEXT_15 = ";" + NL + "\t\tpublic long Codigo";
  protected final String TEXT_16 = "_";
  protected final String TEXT_17 = " {" + NL + "\t\t\tget {" + NL + "\t\t\t\treturn _codigo";
  protected final String TEXT_18 = "_";
  protected final String TEXT_19 = ";" + NL + "\t\t\t}" + NL + "\t\t\tset {" + NL + "\t\t\t\t_codigo";
  protected final String TEXT_20 = "_";
  protected final String TEXT_21 = " = value;" + NL + "\t\t\t}\t" + NL + "\t\t}" + NL + " \t\t";
  protected final String TEXT_22 = NL + NL + NL + "\t" + NL;
  protected final String TEXT_23 = NL + "\t\t//public ";
  protected final String TEXT_24 = " ";
  protected final String TEXT_25 = ";";
  protected final String TEXT_26 = NL + NL + "\t\t//public String getRequest() {" + NL + "\t\t//\tString saida = \"\";";
  protected final String TEXT_27 = NL + "\t\t//\tif (";
  protected final String TEXT_28 = "!=null)" + NL + "\t\t//\t\tsaida += \"&";
  protected final String TEXT_29 = "=\"+";
  protected final String TEXT_30 = ";";
  protected final String TEXT_31 = NL + "\t\t//\treturn saida;\t" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_32 = NL + "\t\t// ";
  protected final String TEXT_33 = NL + "\t\tprivate string _CodigoTel;" + NL + "\t\tpublic string CodigoTel {" + NL + "\t\t\tget {" + NL + "\t\t\t\treturn _CodigoTel;" + NL + "\t\t\t}" + NL + "\t\t\tset {" + NL + "\t\t\t\t_CodigoTel = value;" + NL + "\t\t\t}\t" + NL + "\t\t}" + NL + "\t\tprivate string _CodigoImei;" + NL + "\t\tpublic string CodigoImei {" + NL + "\t\t\tget {" + NL + "\t\t\t\treturn _CodigoImei;" + NL + "\t\t\t}" + NL + "\t\t\tset {" + NL + "\t\t\t\t_CodigoImei = value;" + NL + "\t\t\t}\t" + NL + "\t\t}";
  protected final String TEXT_34 = NL + "\t\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    
		Iterator<FiltroColecao> iteradorF = classe.getListaFiltroColecao().iterator();
		while (iteradorF.hasNext()) {
		FiltroColecao filtro = iteradorF.next();
		String tipoFiltro = null;
		if (filtro.getIdEntidadeT()==0) {
			// Nao tem entidade ? tipo primitivo
			tipoFiltro =  ConverteTipoCs.getTipoFiltro(filtro.getTipoCampoFiltro());
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
    
		}

    stringBuffer.append(TEXT_12);
    
		Iterator<RelacionamentoWrapper> itRel = classe.obtemListaComChaveEstrangeira().iterator();
		while (itRel.hasNext()) {
		RelacionamentoWrapper relac = itRel.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_21);
    
		}
	
    stringBuffer.append(TEXT_22);
    
		Iterator<FiltroColecao> iterador = classe.getListaFiltroColecao().iterator();
		while (iterador.hasNext()) {
		FiltroColecao filtro = iterador.next();
		if (filtro.getIdEntidadeT()==0) {

    stringBuffer.append(TEXT_23);
    stringBuffer.append( ConverteTipoCs.getTipoFiltro(filtro.getTipoCampoFiltro()) );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_25);
    
		}
		}

    stringBuffer.append(TEXT_26);
    
		iterador = classe.getListaFiltroColecao().iterator();
		while (iterador.hasNext()) {
		FiltroColecao filtro = iterador.next();
		if (filtro.getIdEntidadeT()==0) {

    stringBuffer.append(TEXT_27);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_30);
    
		}
		}

    stringBuffer.append(TEXT_31);
    		if(classe.ehUsuario() || classe.ehDispositivo()) { 
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    		} 
    stringBuffer.append(TEXT_34);
    return stringBuffer.toString();
  }
}
