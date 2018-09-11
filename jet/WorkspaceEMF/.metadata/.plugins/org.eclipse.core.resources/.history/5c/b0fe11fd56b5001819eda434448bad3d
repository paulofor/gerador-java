package jet.csdn35.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class ServicoRemotoBase
{
  protected static String nl;
  public static synchronized ServicoRemotoBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoRemotoBase result = new ServicoRemotoBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "using System.Collections;" + NL + "using System.Collections.Generic;" + NL + "using br.com.digicom.lib.dao;" + NL + "using ";
  protected final String TEXT_2 = ".modelo;" + NL + "" + NL + "" + NL + "namespace ";
  protected final String TEXT_3 = ".servico.remoto.basico {" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_4 = "ServicoRemotoBase :  ";
  protected final String TEXT_5 = "Servico {" + NL + "" + NL + "\t//private ArrayList<";
  protected final String TEXT_6 = "> listaSaida = null;" + NL + "\t" + NL + "\tprivate static string URL_GET_POSTS_RECENT = " + NL + "\t\t\"http://www.lojadigicom.com.br/";
  protected final String TEXT_7 = "/page/";
  protected final String TEXT_8 = "Page.aspx\";" + NL + "\t//private JSONObject json;" + NL + "\t" + NL + "\t/*" + NL + "\t";
  protected final String TEXT_9 = NL + "\tpublic override ";
  protected final String TEXT_10 = " obtemPor";
  protected final String TEXT_11 = "(long id) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override ";
  protected final String TEXT_12 = " obtemPor";
  protected final String TEXT_13 = "(long id, DaoConexao conexao){" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + " \t";
  protected final String TEXT_14 = NL + "\t*/";
  protected final String TEXT_15 = NL + "\t// Precisa ser colocado por ter passado a assinatura desse metodo" + NL + "\t// como abstract na classe mais generica.argument ( Para ser usada em outros servi?os )" + NL + "\tpublic override ";
  protected final String TEXT_16 = " ";
  protected final String TEXT_17 = "(";
  protected final String TEXT_18 = "){" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override ";
  protected final String TEXT_19 = " ";
  protected final String TEXT_20 = "(";
  protected final String TEXT_21 = "){" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}";
  protected final String TEXT_22 = NL + NL + "\tpublic override void recebeListaSincronizada(List<";
  protected final String TEXT_23 = "> lista, string tmp, string cod, int versao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + " \tpublic override void recebeListaSincronizada(List<";
  protected final String TEXT_24 = "> lista, string tmp, string cod,int versao, DaoConexao conexao) {" + NL + " \t\tthrow new NotImplementedException();" + NL + " \t}" + NL + " \tpublic override List<";
  protected final String TEXT_25 = "> listaSincronizada(string tmp,string cod, string app) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\t/*" + NL + " \tpublic override List<";
  protected final String TEXT_26 = "> listaSincronizada(string tmp, string cod, DaoConexao conexao) {" + NL + " \t\tthrow new NotImplementedException();" + NL + " \t}" + NL + " \t" + NL + " \tpublic override List<";
  protected final String TEXT_27 = "> listaSincronizadaV2(string tmp, string cod, DaoConexao conexao) {" + NL + " \t\tthrow new NotImplementedException();" + NL + " \t}" + NL + " \tpublic override List<";
  protected final String TEXT_28 = "> listaSincronizadaUsuario(string tmp, string cod) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + " \tpublic override List<";
  protected final String TEXT_29 = "> listaSincronizadaUsuario(string tmp, string cod, DaoConexao conexao) {" + NL + " \t\tthrow new NotImplementedException();" + NL + " \t}\t" + NL + " \tpublic override List<";
  protected final String TEXT_30 = "> listaSincronizadaUsuarioV2(string tmp, string cod) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + " \tpublic override List<";
  protected final String TEXT_31 = "> listaSincronizadaUsuarioV2(string tmp, string cod, DaoConexao conexao) {" + NL + " \t\tthrow new NotImplementedException();" + NL + " \t}" + NL + "\t*/" + NL + "\tpublic override  bool atualiza(";
  protected final String TEXT_32 = " item) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  bool atualiza(";
  protected final String TEXT_33 = " item, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\t" + NL + "\t/*" + NL + "\tpublic override  bool atualizaCamposEdicao(";
  protected final String TEXT_34 = " item) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\t*/" + NL + "\tpublic override  bool atualizaCamposEdicao(";
  protected final String TEXT_35 = " item, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "" + NL + "\tpublic override  bool atualizaCamposEdicao(List<";
  protected final String TEXT_36 = "> lista) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\t" + NL + "\tpublic override  bool atualizaCamposEdicao(List<";
  protected final String TEXT_37 = "> lista, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "" + NL + "\tpublic override  bool criaLoad(";
  protected final String TEXT_38 = " novo) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  bool criaLoad(";
  protected final String TEXT_39 = " novo, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  bool criaLoad(List<";
  protected final String TEXT_40 = "> listaNovo) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  bool criaLoad(List<";
  protected final String TEXT_41 = "> listaNovo, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  bool cria(";
  protected final String TEXT_42 = " novo) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  bool cria(";
  protected final String TEXT_43 = " novo, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  bool cria(List<";
  protected final String TEXT_44 = "> listaNovo) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  bool cria(List<";
  protected final String TEXT_45 = "> listaNovo, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "" + NL + "\tpublic override  List<";
  protected final String TEXT_46 = "> listaFiltroChaves() {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  List<";
  protected final String TEXT_47 = "> listaFiltroChaves(DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  ";
  protected final String TEXT_48 = " itemFiltroChaves() {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  ";
  protected final String TEXT_49 = " itemFiltroChaves(DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "" + NL + "\tpublic override  List<";
  protected final String TEXT_50 = "> listaTotal() {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  ";
  protected final String TEXT_51 = " obtemPorId(long id) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  ";
  protected final String TEXT_52 = " obtemCompletoPorId(long id) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  void excluiPorId(long id) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  List<";
  protected final String TEXT_53 = "> listaTotal(DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  ";
  protected final String TEXT_54 = " obtemPorId(long id, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  ";
  protected final String TEXT_55 = " obtemCompletoPorId(long id, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override  void excluiPorId(long id, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\t/*" + NL + "\tprivate List<";
  protected final String TEXT_56 = "> processaResultado(String resultado) {" + NL + "\t\tint inicio = resultado.indexOf('{');" + NL + "\t\tresultado = resultado.substring(inicio);" + NL + "\t\tList<";
  protected final String TEXT_57 = "> listaSaida = new ArrayList<";
  protected final String TEXT_58 = ">();" + NL + "\t\t" + NL + "\t\ttry {" + NL + "\t\t\tjson = new JSONObject(resultado);" + NL + "\t\t\tJSONArray lista = json.getJSONArray(\"";
  protected final String TEXT_59 = "\");" + NL + "\t\t\tint tam = lista.length();" + NL + "\t\t\tJSONObject item = null;" + NL + "\t\t\tString nome = null;" + NL + "\t\t\tfor (int i=0;i<lista.length();i++) {" + NL + "\t\t\t\titem = (JSONObject) lista.get(i);" + NL + "\t\t\t\tlistaSaida.add(new ";
  protected final String TEXT_60 = "(item));" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\treturn listaSaida;\t" + NL + "\t}" + NL + "" + NL + "\t" + NL + "\tpublic void insertAll(List<";
  protected final String TEXT_61 = "> lista) {" + NL + "\t}" + NL + "\t" + NL + "\tpublic List<";
  protected final String TEXT_62 = "> getAll(Context contexto) {" + NL + "" + NL + "\t\t" + NL + "\t\tString resultado = HTTPRequestHelper.getHttpResponse(URL_GET_POSTS_RECENT + \"?op=ListaCorrente\");" + NL + "\t\tint inicio = resultado.indexOf('{');" + NL + "\t\tresultado = resultado.substring(inicio);" + NL + "\t\tlistaSaida = new ArrayList<";
  protected final String TEXT_63 = ">();" + NL + "\t\t" + NL + "\t\ttry {" + NL + "\t\t\tjson = new JSONObject(resultado);" + NL + "\t\t\tJSONArray lista = json.getJSONArray(\"";
  protected final String TEXT_64 = "\");" + NL + "\t\t\tint tam = lista.length();" + NL + "\t\t\tJSONObject item = null;" + NL + "\t\t\tString nome = null;" + NL + "\t\t\tfor (int i=0;i<lista.length();i++) {" + NL + "\t\t\t\titem = (JSONObject) lista.get(i);" + NL + "\t\t\t\tlistaSaida.add(new ";
  protected final String TEXT_65 = "(item));" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t}" + NL + "\t\treturn listaSaida;" + NL + "\t\t" + NL + "\t\t" + NL + "\t}" + NL + "\t*/" + NL + "\t" + NL + "\t";
  protected final String TEXT_66 = NL + "\t" + NL + "\t";
  protected final String TEXT_67 = NL + "\t// Para fazer atualizacoes em objetos associativos." + NL + "\tpublic override bool AtualizaPor";
  protected final String TEXT_68 = "NN(long id, string[] ids) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override bool AtualizaPor";
  protected final String TEXT_69 = "NN(long id, string[] ids, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_70 = NL + "\t" + NL + "\tpublic override List<";
  protected final String TEXT_71 = "> getPor";
  protected final String TEXT_72 = "(long id) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override List<";
  protected final String TEXT_73 = "> getPor";
  protected final String TEXT_74 = "(long id, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override bool excluiPor";
  protected final String TEXT_75 = "(long id) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override bool excluiPor";
  protected final String TEXT_76 = "(long id, DaoConexao conexao) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_77 = NL + "\t" + NL + "\t";
  protected final String TEXT_78 = NL + "\tpublic override List<";
  protected final String TEXT_79 = "> lista";
  protected final String TEXT_80 = "NaoAssociada_";
  protected final String TEXT_81 = "(long id";
  protected final String TEXT_82 = "){" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override List<";
  protected final String TEXT_83 = "> lista";
  protected final String TEXT_84 = "NaoAssociada_";
  protected final String TEXT_85 = "(long id";
  protected final String TEXT_86 = "){" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override ";
  protected final String TEXT_87 = " obtemPorCodigoDuplo(long id";
  protected final String TEXT_88 = ",long id";
  protected final String TEXT_89 = "){" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_90 = NL + "\t";
  protected final String TEXT_91 = NL + "\t// ";
  protected final String TEXT_92 = NL + "\tpublic override ";
  protected final String TEXT_93 = " ObtemPorCodigoTel(string app, DaoConexao conexao){" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override ";
  protected final String TEXT_94 = " ObtemPorCodigoTel(string app){" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override ";
  protected final String TEXT_95 = " ObtemPorCodigoImei(string app, DaoConexao conexao){" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\tpublic override ";
  protected final String TEXT_96 = " ObtemPorCodigoImei(string app){" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}";
  protected final String TEXT_97 = NL + "\t" + NL + "\t}" + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    
	Iterator<RelacionamentoWrapper> iterador4 = classe.obtemListaSemChaveEstrangeira().iterator();
	while (iterador4.hasNext()) {
	RelacionamentoWrapper relac = iterador4.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_13);
    
		}
	
    stringBuffer.append(TEXT_14);
    
	Iterator<RegraColecao> iteradorRegra = classe.getListaRegraColecao().iterator();
	while (iteradorRegra.hasNext()) {
	RegraColecao regra = iteradorRegra.next();
	if (regra.getAtivoCs()) {
		String tipoRetorno = null;
		String param = null;
		String paramConn = null;
		if (regra.getRetornaColecao()) tipoRetorno = "List<" + classe.getNomeParaClasse() + ">";
		else tipoRetorno = classe.getNomeParaClasse();
		if (regra.getRecebeColecao()) { 
			param = "List<" + classe.getNomeParaClasse() + "> lista";
			paramConn = "List<" + classe.getNomeParaClasse() + "> lista, DaoConexao conexao";
		} else {
			param = "";
			paramConn = "DaoConexao conexao";
		}

    stringBuffer.append(TEXT_15);
    stringBuffer.append( tipoRetorno );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( paramConn );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( tipoRetorno );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( param );
    stringBuffer.append(TEXT_21);
    
	}
	}

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_65);
    
	Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeira().iterator();
	while (iterador.hasNext()) {
		RelacionamentoWrapper relCorrente = iterador.next();
	
    stringBuffer.append(TEXT_66);
     if (classe.isAssociativa()) { 
    stringBuffer.append(TEXT_67);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_69);
     } 
    stringBuffer.append(TEXT_70);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_76);
    
	}
	
    stringBuffer.append(TEXT_77);
    
	// *****  Somente associativas ********
	if (classe.isAssociativa()) {
	List<RelacionamentoWrapper> relac = classe.obtemListaComChaveEstrangeira();
	RelacionamentoWrapper rel1 = relac.get(0);
	RelacionamentoWrapper rel2 = relac.get(1);
	
    stringBuffer.append(TEXT_78);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( rel1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( rel2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( rel2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( rel1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_89);
    
	}
	
    stringBuffer.append(TEXT_90);
    	if(classe.ehUsuario() || classe.ehDispositivo()) { 
    stringBuffer.append(TEXT_91);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_96);
    	} 
    stringBuffer.append(TEXT_97);
    return stringBuffer.toString();
  }
}
