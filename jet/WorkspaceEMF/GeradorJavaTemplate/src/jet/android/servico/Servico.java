package jet.android.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class Servico
{
  protected static String nl;
  public static synchronized Servico create(String lineSeparator)
  {
    nl = lineSeparator;
    Servico result = new Servico();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package  ";
  protected final String TEXT_2 = ".servico;" + NL + "" + NL + "import java.util.List;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "import android.content.Context;" + NL + "import br.com.digicom.activity.DigicomContexto;" + NL + "import ";
  protected final String TEXT_4 = ".servico.filtro.";
  protected final String TEXT_5 = "Filtro;" + NL + "import br.com.digicom.video.DigicomVideoView;" + NL + "//import ";
  protected final String TEXT_6 = ".";
  protected final String TEXT_7 = "DBHelper;" + NL + "//import ";
  protected final String TEXT_8 = ".";
  protected final String TEXT_9 = "Servico;" + NL + "import br.com.digicom.log.DCLog;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_10 = "Servico {" + NL + "" + NL + "/*" + NL + "\tprotected Context ctx = null;" + NL + "\tpublic void setContext(Context context) {" + NL + "\t\tctx = context;" + NL + "\t}" + NL + "*/" + NL + "\t// Alterar para o Impl ? ( Decidir ate 29-05-2014 )" + NL + "\tprivate DigicomVideoView video = null;" + NL + "\tpublic void setVideo(DigicomVideoView video) {" + NL + "\t\tthis.video = video;" + NL + "\t}" + NL + "\t" + NL + "" + NL + "" + NL + "\tprotected void reproduzVideo(String arquivo, int posIni, int posFim) {" + NL + "\t\tDCLog.d(DigicomVideoView.TAG, this, \": Arquivo:\" + arquivo);" + NL + "\t\ttry {" + NL + "\t\t\tif (video==null) throw new Exception(\"video=null\");" + NL + "\t\t\tvideo.setVideoPath(arquivo);" + NL + "\t\t\tvideo.start();" + NL + "\t\t\tvideo.requestFocus();" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\tDCLog.e(DigicomVideoView.TAG, this, e);" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_11 = "Filtro filtro = null;" + NL + "\tpublic ";
  protected final String TEXT_12 = "Filtro getFiltro() {" + NL + "\t\tif (filtro==null) {" + NL + "\t\t\tfiltro = new ";
  protected final String TEXT_13 = "Filtro();" + NL + "\t\t}" + NL + "\t\treturn filtro;" + NL + "\t}" + NL + "" + NL + "\tpublic abstract ";
  protected final String TEXT_14 = " getById(long id, Context contexto);" + NL + "\tpublic abstract ";
  protected final String TEXT_15 = " getById(long id);" + NL + "\tpublic abstract List<";
  protected final String TEXT_16 = "> getAll(Context contexto);" + NL + "\tpublic abstract List<";
  protected final String TEXT_17 = "> getAllTela(Context contexto);" + NL + "\tpublic List<";
  protected final String TEXT_18 = "> listaSincronizada(Context contexto) {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_19 = NL + "\tpublic abstract ";
  protected final String TEXT_20 = " getCorrente();" + NL + "\t";
  protected final String TEXT_21 = NL + "\tpublic abstract void insertAll(List<";
  protected final String TEXT_22 = "> lista, Context contexto);" + NL + "\tpublic abstract void insertSincAll(List<";
  protected final String TEXT_23 = "> lista, Context contexto);" + NL + "\t" + NL + "\t// Itens Tela" + NL + "\tpublic abstract ";
  protected final String TEXT_24 = " inicializaItemTela(DigicomContexto contexto);" + NL + "\tpublic abstract ";
  protected final String TEXT_25 = " inicializaItemTela(";
  protected final String TEXT_26 = " itemTela, DigicomContexto contexto);" + NL + "\tpublic abstract void finalizaItemTela(";
  protected final String TEXT_27 = " itemTela, boolean insercao, DigicomContexto contexto);" + NL + "\tpublic abstract void processaItemTela(";
  protected final String TEXT_28 = " itemTela, DigicomContexto contexto);" + NL + "\t" + NL + "\tpublic abstract ";
  protected final String TEXT_29 = " ultimoInicializado();" + NL + "\tpublic abstract void dropCreate(Context contexto);" + NL + "\tpublic abstract void alteraParaSincronizacao(";
  protected final String TEXT_30 = " item);" + NL + "\tpublic abstract void insereParaSincronizacao(";
  protected final String TEXT_31 = " item);" + NL + "\tpublic abstract void excluiParaSincronizacao(";
  protected final String TEXT_32 = " item);" + NL + "\tpublic abstract void criaTabelaSincronizacao();" + NL + "\t";
  protected final String TEXT_33 = NL + "\tpublic abstract List<";
  protected final String TEXT_34 = "> getPor";
  protected final String TEXT_35 = "(Context contexto, long id);" + NL + "\tpublic abstract List<";
  protected final String TEXT_36 = "> getPor";
  protected final String TEXT_37 = "(Context contexto, long id, int qtde);" + NL + "\tpublic abstract List<";
  protected final String TEXT_38 = "> getPor";
  protected final String TEXT_39 = "(long id);" + NL + "\tpublic abstract List<";
  protected final String TEXT_40 = "> getPor";
  protected final String TEXT_41 = "(long id, int qtde);" + NL + "\t";
  protected final String TEXT_42 = NL + "\t" + NL + "\t";
  protected final String TEXT_43 = NL + "\tpublic abstract ";
  protected final String TEXT_44 = " ";
  protected final String TEXT_45 = "(";
  protected final String TEXT_46 = ");";
  protected final String TEXT_47 = NL + NL;
  protected final String TEXT_48 = NL + "\tpublic abstract void atualizaRelacionamento(List<DCIObjetoDominio> inclusao, List<DCIObjetoDominio> exclusao);";
  protected final String TEXT_49 = NL + "\tpublic abstract void atualizaRelacionamento(";
  protected final String TEXT_50 = " item, List<DCIObjetoDominio> listaEscolhidos);" + NL + "\tpublic abstract void atualizaRelacionamento(";
  protected final String TEXT_51 = " item, List<DCIObjetoDominio> listaEscolhidos);" + NL + "\tpublic abstract boolean comparaRelacionamentoComItem(Object item, Object relacionamento);" + NL + "\t";
  protected final String TEXT_52 = NL + NL + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNomePacoteDaoBase() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNomePacoteServicoInterface() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
     if (classe.ehUsuario() || classe.ehDispositivo()) { 
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
     } 
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    
	Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeira().iterator();
	while (iterador.hasNext()) {
		RelacionamentoWrapper relCorrente = iterador.next();
	
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_41);
    
	}
	
    stringBuffer.append(TEXT_42);
    
	Iterator<RegraColecao> iteradorRegra2 = classe.getListaRegraColecao().iterator();
	while (iteradorRegra2.hasNext()) {
	RegraColecao regra = iteradorRegra2.next();
	if (regra.getAtivoFlex()) {
		String tipoRetorno = null;
		String param = null;
		String paramConn = null;
		if (regra.getRetornaColecao()) tipoRetorno = "List<" + classe.getNomeParaClasse() + ">";
		else tipoRetorno = classe.getNomeParaClasse();
		if (regra.getRecebeColecao()) { 
			param = "DigicomContexto contexto , List<" + classe.getNomeParaClasse() + "> lista";
			paramConn = "lista, conexao";
		} else {
			param = "DigicomContexto contexto ";
			paramConn = "conexao";
		}

    stringBuffer.append(TEXT_43);
    stringBuffer.append( tipoRetorno );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( param );
    stringBuffer.append(TEXT_46);
    
	}
	}

    stringBuffer.append(TEXT_47);
    
	if (classe.isAssociativa()) {

    stringBuffer.append(TEXT_48);
    
	List<RelacionamentoWrapper> lista = classe.obtemListaComChaveEstrangeira();
	RelacionamentoWrapper relCorrente2 = lista.get(0);
	RelacionamentoWrapper relOutro = lista.get(1);
	if (relOutro.getClasseOposta().getId()!= relCorrente2.getClasseOposta().getId()) {
	
    stringBuffer.append(TEXT_49);
    stringBuffer.append( relCorrente2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_51);
    
	} // autorel
	} // associativa

    stringBuffer.append(TEXT_52);
    return stringBuffer.toString();
  }
}
