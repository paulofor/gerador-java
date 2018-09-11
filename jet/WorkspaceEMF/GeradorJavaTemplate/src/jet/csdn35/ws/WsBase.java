package jet.csdn35.ws;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class WsBase
{
  protected static String nl;
  public static synchronized WsBase create(String lineSeparator)
  {
    nl = lineSeparator;
    WsBase result = new WsBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "namespace ";
  protected final String TEXT_2 = ".ws.basica {" + NL + "" + NL + "" + NL + "using System;" + NL + "using System.Web;" + NL + "using System.Web.Services;" + NL + "using System.Collections;" + NL + "using br.com.digicom.ws;" + NL + "using br.com.digicom.lib.dao;" + NL + "using br.com.digicom.lib.util;" + NL + "using ";
  protected final String TEXT_3 = ".servico;" + NL + "using ";
  protected final String TEXT_4 = ".modelo.ws;" + NL + "using ";
  protected final String TEXT_5 = ".modelo;" + NL + "using System.Collections.Generic;" + NL + "" + NL + "" + NL + "" + NL + "[WebService(Namespace=\"http://www.lojadigicom.com.br/webservices/\")]" + NL + "" + NL + "public  class ";
  protected final String TEXT_6 = "WSBase  : DCWebService { " + NL + "" + NL + "\tprotected ";
  protected final String TEXT_7 = "Servico _regraColecao =" + NL + "            FabricaServico.getInstancia().get";
  protected final String TEXT_8 = "Servico" + NL + "            (FabricaServico.LOCAL);" + NL + "" + NL + "\t[WebMethod]" + NL + "\tpublic   ";
  protected final String TEXT_9 = "ObjetoWs[] ListaCorrente()  {" + NL + "\t\tList<";
  protected final String TEXT_10 = "> lista;" + NL + "\t\tlista = _regraColecao.listaTotal();" + NL + "\t\treturn ConverteLista(lista);" + NL + "\t}" + NL + "" + NL + "" + NL + "\t[WebMethod]" + NL + "\tpublic   ";
  protected final String TEXT_11 = "ObjetoWs InsereItem( ";
  protected final String TEXT_12 = "ObjetoWs item  )  {" + NL + "\t\t";
  protected final String TEXT_13 = " objetoVo;" + NL + "\t\tobjetoVo = CopiaParaObjetoVo(item);" + NL + "\t\t_regraColecao.cria(objetoVo);" + NL + "\t\treturn item;" + NL + "\t}" + NL + "" + NL + "\t/*" + NL + "\t[WebMethod]" + NL + "\tpublic   ";
  protected final String TEXT_14 = "ObjetoWs[] Insere";
  protected final String TEXT_15 = "( ";
  protected final String TEXT_16 = "ObjetoWs ";
  protected final String TEXT_17 = "  ,  ";
  protected final String TEXT_18 = "Filtro filtro )  {" + NL + "\t\t";
  protected final String TEXT_19 = "Dao dao;" + NL + "\t\t";
  protected final String TEXT_20 = " objetoVo;" + NL + "\t\tobjetoVo = CopiaParaObjetoVo(";
  protected final String TEXT_21 = ");" + NL + "\t\t//_regraColecao.PreInsercao(objetoVo);" + NL + "\t\tregraColecao.insereItem(objetoVo);" + NL + "\t\treturn ListaPorFiltroObjeto(filtro);" + NL + "\t}" + NL + "" + NL + "" + NL + "\t[WebMethod]" + NL + "\tpublic   ";
  protected final String TEXT_22 = "ObjetoWs[] Altera";
  protected final String TEXT_23 = "( ";
  protected final String TEXT_24 = "ObjetoWs ";
  protected final String TEXT_25 = "  ,  ";
  protected final String TEXT_26 = "Filtro filtro )  {" + NL + "\t\t";
  protected final String TEXT_27 = " objetoVo;" + NL + "\t\tobjetoVo = CopiaParaObjetoVo(";
  protected final String TEXT_28 = ");" + NL + "\t\t//_regraColecao.PreAlteracao(objetoVo);" + NL + "\t\tdao.alteraItem(objetoVo);" + NL + "\t\tdao.liberaConexao(conexao);" + NL + "\t\treturn ListaPorFiltroObjeto(filtro);" + NL + "\t}" + NL + "\t*/" + NL + "\t" + NL + "\t" + NL + "\tprotected   ";
  protected final String TEXT_29 = "ObjetoWs[] ConverteLista( ArrayList lista )  {" + NL + "\t\t";
  protected final String TEXT_30 = "ObjetoWs[] saida;" + NL + "\t\tsaida = new ";
  protected final String TEXT_31 = "ObjetoWs[lista.Count];" + NL + "\t\tfor (int i=0;i<lista.Count;i++) " + NL + "\t\t\tsaida[i] = CopiaParaObjetoWs((";
  protected final String TEXT_32 = ")lista[i]);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + " \tprotected ";
  protected final String TEXT_33 = "ObjetoWs[] ConverteLista(List<";
  protected final String TEXT_34 = "> lista)" + NL + "    {";
  protected final String TEXT_35 = NL + "        ";
  protected final String TEXT_36 = "ObjetoWs[] saida;" + NL + "        saida = new ";
  protected final String TEXT_37 = "ObjetoWs[lista.Count];" + NL + "        for (int i = 0; i < lista.Count; i++)" + NL + "            saida[i] = CopiaParaObjetoWs((";
  protected final String TEXT_38 = ")lista[i]);" + NL + "        return saida;" + NL + "    }" + NL + "    protected List<";
  protected final String TEXT_39 = "> DesConverteLista( ";
  protected final String TEXT_40 = "ObjetoWs[] lista )  {" + NL + "\t\tList<";
  protected final String TEXT_41 = "> saida;" + NL + "\t\tsaida = new List<";
  protected final String TEXT_42 = ">();" + NL + "\t\tfor (int i=0;i<lista.Length;i++) " + NL + "\t\t\tsaida.Add(CopiaParaObjetoVo((";
  protected final String TEXT_43 = "ObjetoWs)lista[i]));" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t/*" + NL + "\tprotected   ArrayList DesConverteLista( ";
  protected final String TEXT_44 = "ObjetoWs[] lista )  {" + NL + "\t\tArrayList saida;" + NL + "\t\tsaida = new ArrayList();" + NL + "\t\tfor (int i=0;i<lista.Length;i++) " + NL + "\t\t\tsaida.Add(CopiaParaObjetoVo((";
  protected final String TEXT_45 = "ObjetoWs)lista[i]));" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t*/" + NL + "" + NL + "" + NL + "" + NL + "" + NL + "" + NL + "" + NL + "\tpublic    static ";
  protected final String TEXT_46 = "ObjetoWs CopiaParaObjetoWs( ";
  protected final String TEXT_47 = " vo )  {" + NL + "\t\t// Nao copia listas associadas, apenas objetos unicos." + NL + "\t\tif (vo==null) return null;" + NL + "\t\t";
  protected final String TEXT_48 = "ObjetoWs objetoWs =  new ";
  protected final String TEXT_49 = "ObjetoWs();" + NL + "\t\t";
  protected final String TEXT_50 = NL + "\t\tobjetoWs.";
  protected final String TEXT_51 = " = vo.";
  protected final String TEXT_52 = ";" + NL + "\t\t";
  protected final String TEXT_53 = NL + "\t\t// *** Inicio Relacionamentos Unicos *** " + NL + "\t\t";
  protected final String TEXT_54 = NL + "\t\tif (vo.";
  protected final String TEXT_55 = "_";
  protected final String TEXT_56 = "!=null)" + NL + "\t\t\tobjetoWs.";
  protected final String TEXT_57 = "_";
  protected final String TEXT_58 = " = ";
  protected final String TEXT_59 = "WSBase.CopiaParaObjetoWs(vo.";
  protected final String TEXT_60 = "_";
  protected final String TEXT_61 = ");" + NL + "\t\t";
  protected final String TEXT_62 = NL + "\t\t// *** Final Relacionamentos Unicos *** " + NL + "\t\treturn objetoWs;" + NL + "\t}" + NL + "" + NL + "\tpublic    static ";
  protected final String TEXT_63 = " CopiaParaObjetoVo( ";
  protected final String TEXT_64 = "ObjetoWs objetoWs )  {" + NL + "\t\tif (objetoWs==null) return null;" + NL + "\t\t";
  protected final String TEXT_65 = " vo =  FabricaVo.cria";
  protected final String TEXT_66 = "();" + NL + "\t\t";
  protected final String TEXT_67 = NL + "\t\tvo.";
  protected final String TEXT_68 = " = objetoWs.";
  protected final String TEXT_69 = ";" + NL + "\t\t";
  protected final String TEXT_70 = NL + "\t\t// *** Inicio Relacionamentos Multiplos *** " + NL + "\t\t";
  protected final String TEXT_71 = NL + "\t\tif (objetoWs.Lista";
  protected final String TEXT_72 = "_";
  protected final String TEXT_73 = " != null) {" + NL + "\t\t\tfor (int i = 0; i < objetoWs.Lista";
  protected final String TEXT_74 = "_";
  protected final String TEXT_75 = ".Length;i++ )" + NL + "\t        {" + NL + "    \t        vo.AddLista";
  protected final String TEXT_76 = "_";
  protected final String TEXT_77 = " = ";
  protected final String TEXT_78 = "WSBase.CopiaParaObjetoVo(objetoWs.Lista";
  protected final String TEXT_79 = "_";
  protected final String TEXT_80 = "[i]);" + NL + "        \t}" + NL + "        }" + NL + "\t\t";
  protected final String TEXT_81 = NL + "     \t// *** Final Relacionamentos Multiplos ***" + NL + "\t\t// *** Inicio Relacionamentos Unicos *** " + NL + "\t\t";
  protected final String TEXT_82 = NL + "\t\tif (objetoWs.";
  protected final String TEXT_83 = "_";
  protected final String TEXT_84 = "!=null)" + NL + "\t\t\tvo.";
  protected final String TEXT_85 = "_";
  protected final String TEXT_86 = " = ";
  protected final String TEXT_87 = "WSBase.CopiaParaObjetoVo(objetoWs.";
  protected final String TEXT_88 = "_";
  protected final String TEXT_89 = ");" + NL + "\t\t";
  protected final String TEXT_90 = NL + "     \t// *** Final Relacionamentos Multiplos ***" + NL + "\t\t " + NL + "\t\treturn vo;" + NL + "\t}" + NL + "" + NL + "\t/*" + NL + "\t[WebMethod]" + NL + "\tpublic   ";
  protected final String TEXT_91 = "ObjetoWs[] ListaPorFiltroObjeto( ";
  protected final String TEXT_92 = "Filtro filtro )  {" + NL + "\t\tArrayList lista;" + NL + "\t\t";
  protected final String TEXT_93 = "RegraColecao regraColecao;" + NL + "\t\tregraColecao = FabricaRegra.getInstancia().get";
  protected final String TEXT_94 = "RegraColecao();" + NL + "\t\tregraColecao.Filtro = filtro;" + NL + "\t\tlista = regraColecao.ListaFiltro();" + NL + "\t\treturn ConverteLista(lista);" + NL + "\t}" + NL + "\t*/" + NL + "" + NL + "\t[WebMethod]" + NL + "\tpublic   ";
  protected final String TEXT_95 = "ObjetoWs ObtemPorChave( long id )  {" + NL + "\t\t";
  protected final String TEXT_96 = " vo;" + NL + "\t\tvo = _regraColecao.obtemPorId(id);" + NL + "\t\treturn CopiaParaObjetoWs(vo);" + NL + "\t}" + NL + "}" + NL + "}";
  protected final String TEXT_97 = NL;

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeParaClasse() );
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
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
    
		Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
		while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
		
    stringBuffer.append(TEXT_50);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_52);
    
		}
		
    stringBuffer.append(TEXT_53);
    
		Iterator<RelacionamentoWrapper> iterador3 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador3.hasNext()) {
		RelacionamentoWrapper relac = iterador3.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_54);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_61);
    
		}
		
    stringBuffer.append(TEXT_62);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_66);
    
		iterador = classe.getListaAtributoTotal().iterator();
		while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
		
    stringBuffer.append(TEXT_67);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_69);
    
		}
		
    stringBuffer.append(TEXT_70);
    
		Iterator<RelacionamentoWrapper> iterador2 = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iterador2.hasNext()) {
		RelacionamentoWrapper relac = iterador2.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_71);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_80);
    
		}
     	
    stringBuffer.append(TEXT_81);
    
		iterador2 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador2.hasNext()) {
		RelacionamentoWrapper relac = iterador2.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_89);
    
		}
     	
    stringBuffer.append(TEXT_90);
    stringBuffer.append( classe.getNomeParaClasse() );
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
    stringBuffer.append(TEXT_97);
    return stringBuffer.toString();
  }
}
