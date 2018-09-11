package jet.java.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
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
  protected final String TEXT_1 = NL + "package ";
  protected final String TEXT_2 = ".regracolecao.filtro;" + NL + "" + NL + "import java.util.List;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "import javax.swing.JTextArea;" + NL + "" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_4 = "Filtro {" + NL + "" + NL + "\t\tprivate JTextArea texto = null;" + NL + "\t\tpublic void setTextArea(JTextArea dado) {" + NL + "\t\t\ttexto = dado;" + NL + "\t\t}" + NL + "\t\tpublic JTextArea getTextArea() {" + NL + "\t\t\treturn texto;" + NL + "\t\t}" + NL;
  protected final String TEXT_5 = NL + "      \tprivate long _codigo_id";
  protected final String TEXT_6 = " = -1;" + NL + "\t\tpublic long getCodigo";
  protected final String TEXT_7 = "() {" + NL + "\t\t\treturn _codigo_id";
  protected final String TEXT_8 = ";" + NL + "\t\t}" + NL + "\t\tpublic void setCodigo";
  protected final String TEXT_9 = "(long dado) {" + NL + "\t\t\t_codigo_id";
  protected final String TEXT_10 = " = dado;" + NL + "\t\t}" + NL + "      \t";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL + "\t\tprivate ";
  protected final String TEXT_13 = " _";
  protected final String TEXT_14 = ";" + NL + "\t\tpublic ";
  protected final String TEXT_15 = " get";
  protected final String TEXT_16 = " () {" + NL + "\t\t\treturn _";
  protected final String TEXT_17 = " ;" + NL + "\t\t}" + NL + "\t\tpublic void set";
  protected final String TEXT_18 = " (";
  protected final String TEXT_19 = " value) {" + NL + "\t\t\t_";
  protected final String TEXT_20 = "  = value;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tpublic ";
  protected final String TEXT_21 = " valida";
  protected final String TEXT_22 = "() {" + NL + "\t\t\t";
  protected final String TEXT_23 = NL + "\t\t\tif (_";
  protected final String TEXT_24 = " == 0) {" + NL + "\t\t\t\tthrow new RuntimeException(\"";
  protected final String TEXT_25 = " eh zero\");" + NL + "\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_26 = NL + "\t\t\tif (_";
  protected final String TEXT_27 = " == null) {" + NL + "\t\t\t\tthrow new RuntimeException(\"";
  protected final String TEXT_28 = " eh nulo\");" + NL + "\t\t\t}" + NL + "\t\t\t";
  protected final String TEXT_29 = NL + "\t\t\treturn get";
  protected final String TEXT_30 = " ();" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_31 = NL + NL;
  protected final String TEXT_32 = NL + "\t\t//public ";
  protected final String TEXT_33 = " ";
  protected final String TEXT_34 = ";";
  protected final String TEXT_35 = NL + NL + "\t\t" + NL + "}";

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
    
		Iterator<RelacionamentoWrapper> it1 = classe.obtemListaComChaveEstrangeira().iterator();
		while (it1.hasNext()) {
		RelacionamentoWrapper relac = it1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_10);
    
		}
		
    stringBuffer.append(TEXT_11);
    
		Iterator<FiltroColecao> iteradorF = classe.getListaFiltroColecao().iterator();
		while (iteradorF.hasNext()) {
		FiltroColecao filtro = iteradorF.next();
		String tipoFiltro = null;
		if (filtro.getIdEntidadeT()==0) {
			// Nao tem entidade ? tipo primitivo
			tipoFiltro =  ConverteTipoJava.getTipoFiltro(filtro.getTipoCampoFiltro());
		}	
		else { 
			// Tem entidade vai buscar a classe
			ClasseWrapper classeFiltro = AplicacaoWrapper.getPorId(filtro.getIdEntidadeT());
			if (classeFiltro==null) break;
			tipoFiltro = classeFiltro.getNomeParaClasse();
		}

    stringBuffer.append(TEXT_12);
    stringBuffer.append( tipoFiltro );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( tipoFiltro );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( tipoFiltro );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( tipoFiltro );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_22);
     if ("long".equals(tipoFiltro) || "float".equals(tipoFiltro)) { 
    stringBuffer.append(TEXT_23);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_25);
     } else { 
    stringBuffer.append(TEXT_26);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_28);
     } 
    stringBuffer.append(TEXT_29);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_30);
    
		}

    stringBuffer.append(TEXT_31);
    
		Iterator<FiltroColecao> iterador = classe.getListaFiltroColecao().iterator();
		while (iterador.hasNext()) {
		FiltroColecao filtro = iterador.next();
		if (filtro.getIdEntidadeT()==0) {

    stringBuffer.append(TEXT_32);
    stringBuffer.append( ConverteTipoJava.getTipoFiltro(filtro.getTipoCampoFiltro()) );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( filtro.getNomeCampoFiltro() );
    stringBuffer.append(TEXT_34);
    
		}
		}

    stringBuffer.append(TEXT_35);
    return stringBuffer.toString();
  }
}
