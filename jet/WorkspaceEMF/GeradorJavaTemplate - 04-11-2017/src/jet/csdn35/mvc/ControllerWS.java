package jet.csdn35.mvc;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class ControllerWS
{
  protected static String nl;
  public static synchronized ControllerWS create(String lineSeparator)
  {
    nl = lineSeparator;
    ControllerWS result = new ControllerWS();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "namespace ";
  protected final String TEXT_2 = ".mvc.controller {" + NL + "" + NL + "using System;" + NL + "using System.Web.Mvc;" + NL + "using System.Collections.Generic;" + NL + "using ";
  protected final String TEXT_3 = ".mvc.controller;" + NL + "using ";
  protected final String TEXT_4 = ".servico;" + NL + "using ";
  protected final String TEXT_5 = ".servico.filtro;" + NL + "using ";
  protected final String TEXT_6 = ".modelo;" + NL + "using ";
  protected final String TEXT_7 = ".modelo.vo;" + NL + "using System.Web.Script.Serialization;" + NL + "using br.com.digicom.lib.util;" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_8 = "WSBaseController : BaseController {" + NL + "" + NL + "\t\tprotected ";
  protected final String TEXT_9 = "Servico servico =" + NL + "            FabricaServico.getInstancia().get";
  protected final String TEXT_10 = "Servico" + NL + "            (FabricaServico.LOCAL);" + NL + "" + NL + "\t\t/*" + NL + "\t\tpublic virtual ActionResult ListaSincronizadaUsuario(int versao, string tmp = null, string cod=null)" + NL + "        {" + NL + "        \tif (tmp!=null) {" + NL + "\t        \ttmp = tmp.Trim();" + NL + "    \t        if (tmp[0] == '+') tmp = tmp.Substring(1);" + NL + "    \t    }" + NL + "            List<";
  protected final String TEXT_11 = "> lista = servico.listaSincronizadaUsuario(tmp,cod);" + NL + "            string json = servico.listaJSon(lista);" + NL + "            ViewData[\"JSON\"] = json;" + NL + "            return PartialView(\"ListaSincronizada\");" + NL + "        }" + NL + "        public virtual ActionResult ListaSincronizadaUsuarioV2(int versao, string tmp = null, string cod=null)" + NL + "        {" + NL + "        \tif (tmp!=null) {" + NL + "\t        \ttmp = tmp.Trim();" + NL + "    \t        if (tmp[0] == '+') tmp = tmp.Substring(1);" + NL + "    \t    }" + NL + "            List<";
  protected final String TEXT_12 = "> lista = servico.listaSincronizadaUsuarioV2(tmp,cod);" + NL + "            string json = servico.listaJSon(lista);" + NL + "            ViewData[\"JSON\"] = json;" + NL + "            return PartialView(\"ListaSincronizada\");" + NL + "        }" + NL + "\t\t*/" + NL + "" + NL + "\t\tpublic virtual ActionResult ListaSincronizada(int versao, string tmp = null, string cod=null, string app = null)" + NL + "        {" + NL + "        \tLogArquivo.Display(\"ListaSincronizada ";
  protected final String TEXT_13 = " (tmp=\" + tmp + \" versao=\" + versao + \")\");" + NL + "        \tif (tmp!=null) {" + NL + "\t        \ttmp = tmp.Trim();" + NL + "    \t        if (tmp[0] == '+') tmp = tmp.Substring(1);" + NL + "    \t    }" + NL + "            List<";
  protected final String TEXT_14 = "> lista = servico.listaSincronizada(tmp,cod, app);" + NL + "            string json = servico.listaJSon(lista);" + NL + "            ViewData[\"JSON\"] = json;" + NL + "            return PartialView(\"ListaSincronizada\");" + NL + "        }" + NL + "        " + NL + "\t\tpublic virtual ActionResult ListaSincronizadaAlteracao(string lista, int versao, string tmp = null, string cod=null)" + NL + "        {" + NL + "\t        if (tmp!=null) {" + NL + "\t        \ttmp = tmp.Trim();" + NL + "    \t        if (tmp[0] == '+') tmp = tmp.Substring(1);" + NL + "    \t    }" + NL + "            var jss = new JavaScriptSerializer();" + NL + "            List<";
  protected final String TEXT_15 = "Vo> listaSinc = (List<";
  protected final String TEXT_16 = "Vo>) jss.Deserialize<List<";
  protected final String TEXT_17 = "Vo>>(lista);" + NL + "            List<";
  protected final String TEXT_18 = ">  listaSrv = RealizaCast(listaSinc);" + NL + "            servico.recebeListaSincronizada(listaSrv, tmp, cod, versao);" + NL + "            ViewData[\"JSON\"] = \"Recebi lista com \" + listaSinc.Count + \" elemento(s)\";" + NL + "            return PartialView(\"ListaSincronizada\");" + NL + "        }" + NL + "" + NL + "        private List<";
  protected final String TEXT_19 = "> RealizaCast(List<";
  protected final String TEXT_20 = "Vo> listaEntrada)" + NL + "        {" + NL + "            List<";
  protected final String TEXT_21 = "> saida = new List<";
  protected final String TEXT_22 = ">();" + NL + "            foreach (";
  protected final String TEXT_23 = " item in listaEntrada)" + NL + "            {" + NL + "            \t/*" + NL + "           \t\tAjustaObjetoRecebido(item);" + NL + "           \t\t// SemChaveEstrangeira" + NL + "\t";
  protected final String TEXT_24 = NL + "\t\t\t\tif (item.ExisteLista";
  protected final String TEXT_25 = "_";
  protected final String TEXT_26 = ") " + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tList<";
  protected final String TEXT_27 = "> lista = item.Lista";
  protected final String TEXT_28 = "_";
  protected final String TEXT_29 = ";" + NL + "\t\t\t\t\t";
  protected final String TEXT_30 = "WSBaseController.AjustaListaRecebida(lista);" + NL + "\t\t\t\t}" + NL + " \t\t";
  protected final String TEXT_31 = NL + "\t\t\t\t*/" + NL + "\t\t\t\tsaida.Add((";
  protected final String TEXT_32 = ")item);" + NL + "            }" + NL + "            return saida;" + NL + "        }" + NL + "        " + NL + "        public static void AjustaListaRecebida(List<";
  protected final String TEXT_33 = "> lista)" + NL + "        {" + NL + "            foreach (";
  protected final String TEXT_34 = " item in lista)" + NL + "            {" + NL + "                AjustaObjetoRecebido(item);" + NL + "            }" + NL + "        }" + NL + "        " + NL + "        public static void AjustaObjetoRecebido(";
  protected final String TEXT_35 = " item)" + NL + "        {";
  protected final String TEXT_36 = NL + "\t\t\t\titem.";
  protected final String TEXT_37 = " = AjustaDataHora(item.";
  protected final String TEXT_38 = ");";
  protected final String TEXT_39 = NL + "\t\t\t\titem.";
  protected final String TEXT_40 = " = AjustaData(item.";
  protected final String TEXT_41 = ");";
  protected final String TEXT_42 = NL + "\t\t\t\titem.";
  protected final String TEXT_43 = " = AjustaHora(item.";
  protected final String TEXT_44 = ");";
  protected final String TEXT_45 = NL + "        }" + NL + "        " + NL + "        " + NL + "        private static string AjustaDataHora(string data)" + NL + "        {" + NL + "            // Data Entrada: AAAA-MM-DD HH:MM:SS" + NL + "            //               0123456789012345678" + NL + "            if (\"null\".Equals(data) || data == null) return null;" + NL + "            string ano = data.Substring(0, 4);" + NL + "            string mes = data.Substring(5, 2);" + NL + "            string dia = data.Substring(8, 2);" + NL + "            string hora = data.Substring(11, 8);" + NL + "            return dia + \"/\" + mes + \"/\" + ano + \" \" + hora;" + NL + "        }" + NL + "        private static string AjustaData(string data)" + NL + "        {" + NL + "            // Data Entrada: AAAA-MM-DD HH:MM:SS" + NL + "            //               0123456789012345678" + NL + "            if (\"null\".Equals(data) || data == null) return null;" + NL + "            string ano = data.Substring(0, 4);" + NL + "            string mes = data.Substring(5, 2);" + NL + "            string dia = data.Substring(8, 2);" + NL + "            string hora = data.Substring(11, 8);" + NL + "            return dia + \"/\" + mes + \"/\" + ano;" + NL + "        }" + NL + "        private static string AjustaHora(string valor)" + NL + "        {" + NL + "            // Data Entrada: AAAA-MM-DD HH:MM:SS" + NL + "            //               0123456789012345678" + NL + "            if (\"null\".Equals(valor) || valor == null) return null;" + NL + "            string ano = valor.Substring(0, 4);" + NL + "            string mes = valor.Substring(5, 2);" + NL + "            string dia = valor.Substring(8, 2);" + NL + "            string hora = valor.Substring(11, 8);" + NL + "            throw new NotImplementedException(\"AjustaHora em ";
  protected final String TEXT_46 = "WSBaseController \");" + NL + "            //return dia + \"/\" + mes + \"/\" + ano;" + NL + "        }" + NL + "}" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespace() );
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
    
		Iterator<RelacionamentoWrapper> iteradorN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN.hasNext()) {
		RelacionamentoWrapper relac = iteradorN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    
		}
	
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    
				Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
				while (iterador.hasNext()) {
				AtributoTotalI atributo = iterador.next();
				if (atributo.ehData() && atributo.ehHora()) {
				
    stringBuffer.append(TEXT_36);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_38);
     
				}
				if (atributo.ehData() && !atributo.ehHora()) {
				
    stringBuffer.append(TEXT_39);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_41);
     
				}
				if (!atributo.ehData() && atributo.ehHora()) {
				
    stringBuffer.append(TEXT_42);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_44);
     
				}
				}
			
    stringBuffer.append(TEXT_45);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_46);
    return stringBuffer.toString();
  }
}
