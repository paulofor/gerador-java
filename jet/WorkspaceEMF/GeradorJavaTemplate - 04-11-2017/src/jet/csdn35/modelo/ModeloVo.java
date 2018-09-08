package jet.csdn35.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class ModeloVo
{
  protected static String nl;
  public static synchronized ModeloVo create(String lineSeparator)
  {
    nl = lineSeparator;
    ModeloVo result = new ModeloVo();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "using System.Collections.Generic;" + NL + "using br.com.digicom.lib.dao;" + NL + "using System.Collections;" + NL + "using ";
  protected final String TEXT_2 = ".modelo.agregados;" + NL + "using ";
  protected final String TEXT_3 = ".modelo.carregador;" + NL + "using ";
  protected final String TEXT_4 = ".modelo.derivadas;" + NL + "" + NL + "namespace ";
  protected final String TEXT_5 = ".modelo.vo" + NL + "{" + NL + "" + NL + "\tpublic class ";
  protected final String TEXT_6 = "Vo : ";
  protected final String TEXT_7 = NL + "\t{" + NL + "\t\t\t" + NL + "\t\tpublic long IdObj" + NL + "        {" + NL + "            get" + NL + "            {" + NL + "                return ";
  protected final String TEXT_8 = ";" + NL + "            }" + NL + "        }" + NL + "\t\tpublic string toWS() {" + NL + "\t\t\treturn IdObj.ToString();" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tprivate string JsonAtributos() {" + NL + "\t\t\treturn " + NL + "\t\t";
  protected final String TEXT_9 = "\t" + NL + "\t\t\t";
  protected final String TEXT_10 = " '";
  protected final String TEXT_11 = "' : '\" + ConverteDataHora2Json(";
  protected final String TEXT_12 = ") + \"' \"" + NL + "\t\t";
  protected final String TEXT_13 = NL + "\t\t\t";
  protected final String TEXT_14 = " '";
  protected final String TEXT_15 = "' : '\" + ConverteData2Json(";
  protected final String TEXT_16 = ") + \"' \"" + NL + "\t\t";
  protected final String TEXT_17 = NL + "\t\t\t";
  protected final String TEXT_18 = " '";
  protected final String TEXT_19 = "' : '\" + ";
  protected final String TEXT_20 = " + \"' \"" + NL + "\t\t";
  protected final String TEXT_21 = NL + "\t\t";
  protected final String TEXT_22 = NL + "\t\t\t+ \", '";
  protected final String TEXT_23 = "' : '\" + ";
  protected final String TEXT_24 = " + \"' \"" + NL + "\t\t";
  protected final String TEXT_25 = NL + "\t\t;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tprivate string ConverteDataHora2Json(string dataHora)" + NL + "        {" + NL + "            // DD-MM-AAAA HH:MM:SS" + NL + "            // 0123456789012345678" + NL + "            string dia = dataHora.Substring(0, 2);" + NL + "            string mes = dataHora.Substring(3, 2);" + NL + "            string ano = dataHora.Substring(6, 4);" + NL + "            string hora = dataHora.Substring(11, 2);" + NL + "            string min = dataHora.Substring(14, 2);" + NL + "            string seg = dataHora.Substring(17, 2);" + NL + "            return ano + mes + dia + hora + min + seg;" + NL + "        }" + NL + "        private string ConverteData2Json(string dataHora)" + NL + "        {" + NL + "            // DD-MM-AAAA" + NL + "            // 0123456789" + NL + "            string dia = dataHora.Substring(0, 2);" + NL + "            string mes = dataHora.Substring(3, 2);" + NL + "            string ano = dataHora.Substring(6, 4);" + NL + "            return ano + mes + dia;" + NL + "        }" + NL + "\t\t" + NL + "\t\tpublic string JSon {" + NL + "\t\t\tget {" + NL + "\t\t\t\treturn \" { \" + JsonAtributos() + \" } \";" + NL + "\t\t\t}" + NL + "\t\t\tset { }" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tprivate ";
  protected final String TEXT_26 = "Derivada derivada = null;" + NL + "\t\tprivate ";
  protected final String TEXT_27 = "Derivada getDerivada() {" + NL + "\t\t\tif (derivada==null) {" + NL + "\t\t\t\tderivada = new ";
  protected final String TEXT_28 = "Derivada(this);" + NL + "\t\t\t}" + NL + "\t\t\treturn derivada;" + NL + "\t\t}" + NL + "\t" + NL + "\t\tprivate ";
  protected final String TEXT_29 = "Agregado agregado = null;" + NL + "\t\tprivate ";
  protected final String TEXT_30 = "Agregado getAgregado() {" + NL + "\t\t\tif (agregado==null) {" + NL + "\t\t\t\tagregado = new ";
  protected final String TEXT_31 = "Agregado(this);" + NL + "\t\t\t}" + NL + "\t\t\treturn agregado;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_32 = NL + NL + "\t\tpublic ";
  protected final String TEXT_33 = " ";
  protected final String TEXT_34 = "_";
  protected final String TEXT_35 = " " + NL + "\t\t{" + NL + "\t\t\tget { return getAgregado().";
  protected final String TEXT_36 = "_";
  protected final String TEXT_37 = "; }" + NL + "\t\t\tset { getAgregado().";
  protected final String TEXT_38 = "_";
  protected final String TEXT_39 = " = value; }" + NL + "\t\t} " + NL + "\t\t";
  protected final String TEXT_40 = NL + "\t\t/*  AutoRelacionamento" + NL + "\t\t";
  protected final String TEXT_41 = NL + "\t\tpublic ";
  protected final String TEXT_42 = " AddLista";
  protected final String TEXT_43 = "_";
  protected final String TEXT_44 = " " + NL + "\t\t{" + NL + "\t\t\tset { getAgregado().";
  protected final String TEXT_45 = "_";
  protected final String TEXT_46 = " = value; }" + NL + "\t\t} " + NL + "\t\tpublic ";
  protected final String TEXT_47 = " Corrente";
  protected final String TEXT_48 = "_";
  protected final String TEXT_49 = " " + NL + "\t\t{" + NL + "\t\t\tget { return getAgregado().";
  protected final String TEXT_50 = "_";
  protected final String TEXT_51 = "; }" + NL + "\t\t} " + NL + "\t\t";
  protected final String TEXT_52 = NL + "\t\t*/" + NL + "\t\t";
  protected final String TEXT_53 = NL + " \t\t";
  protected final String TEXT_54 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_55 = NL + "\t\tpublic ";
  protected final String TEXT_56 = " ";
  protected final String TEXT_57 = "_";
  protected final String TEXT_58 = " " + NL + "\t\t{" + NL + "\t\t\tget { return getAgregado().";
  protected final String TEXT_59 = "_";
  protected final String TEXT_60 = "; }" + NL + "\t\t\tset { getAgregado().";
  protected final String TEXT_61 = "_";
  protected final String TEXT_62 = " = value; }" + NL + "\t\t} " + NL + " \t\t";
  protected final String TEXT_63 = NL + "\t\t" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_64 = NL + "\t\tpublic ";
  protected final String TEXT_65 = " ";
  protected final String TEXT_66 = NL + "\t\t{" + NL + "\t\t\tget { return getDerivada().";
  protected final String TEXT_67 = "; }" + NL + "\t\t\tset { getDerivada().";
  protected final String TEXT_68 = " = value; }" + NL + "\t\t} " + NL + "\t\t";
  protected final String TEXT_69 = NL + "    \tpublic string ";
  protected final String TEXT_70 = "Tela" + NL + "\t\t{" + NL + "\t\t\tget {  return String.Format(\"{0:0.00}\", ";
  protected final String TEXT_71 = " * 100);  }" + NL + "\t\t} " + NL + "\t\t";
  protected final String TEXT_72 = NL + "\t\t" + NL + "\t\tpublic void setConexaoCarregador(DaoConexao conexao) {" + NL + "\t\t\tgetAgregado().setConexaoCarregador(conexao);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_73 = NL + "\t\tpublic bool ExisteLista";
  protected final String TEXT_74 = "_";
  protected final String TEXT_75 = " {" + NL + "\t\t\tget {" + NL + "\t\t\treturn getAgregado().ExisteLista";
  protected final String TEXT_76 = "_";
  protected final String TEXT_77 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tpublic void CriaVaziaLista";
  protected final String TEXT_78 = "_";
  protected final String TEXT_79 = "() {" + NL + "\t\t\tgetAgregado().CriaVaziaLista";
  protected final String TEXT_80 = "_";
  protected final String TEXT_81 = "();" + NL + "\t\t}" + NL + "\t\tpublic List<";
  protected final String TEXT_82 = "> Lista";
  protected final String TEXT_83 = "_";
  protected final String TEXT_84 = " " + NL + "\t\t{" + NL + "\t\t\tget { return getAgregado().Lista";
  protected final String TEXT_85 = "_";
  protected final String TEXT_86 = "; }" + NL + "\t\t\tset { getAgregado().Lista";
  protected final String TEXT_87 = "_";
  protected final String TEXT_88 = " = value; }" + NL + "\t\t} " + NL + "\t\t// Vem direto do JSON do Mobile com esse nome" + NL + "\t\tpublic List<";
  protected final String TEXT_89 = "Vo> Lista";
  protected final String TEXT_90 = "Vo_";
  protected final String TEXT_91 = NL + "        {" + NL + "            set {" + NL + "                List<";
  protected final String TEXT_92 = "Vo> lista = value;" + NL + "                if (lista == null) return;" + NL + "                getAgregado().CriaVaziaLista";
  protected final String TEXT_93 = "_";
  protected final String TEXT_94 = "();" + NL + "                foreach (";
  protected final String TEXT_95 = "Vo item in lista)" + NL + "                {" + NL + "                    this.AddLista";
  protected final String TEXT_96 = "_";
  protected final String TEXT_97 = " = item;" + NL + "                }" + NL + "            }" + NL + "        } " + NL + "\t\tpublic ";
  protected final String TEXT_98 = " AddLista";
  protected final String TEXT_99 = "_";
  protected final String TEXT_100 = " " + NL + "\t\t{" + NL + "\t\t\tset { getAgregado().AddLista";
  protected final String TEXT_101 = "_";
  protected final String TEXT_102 = " = value; }" + NL + "\t\t} " + NL + "\t\tpublic ";
  protected final String TEXT_103 = " Corrente";
  protected final String TEXT_104 = "_";
  protected final String TEXT_105 = " " + NL + "\t\t{" + NL + "\t\t\tget { return getAgregado().Corrente";
  protected final String TEXT_106 = "_";
  protected final String TEXT_107 = "; }" + NL + "\t\t} " + NL + " \t\t";
  protected final String TEXT_108 = NL + "\t" + NL + "\t\t";
  protected final String TEXT_109 = NL + "\t\tprivate ";
  protected final String TEXT_110 = " ";
  protected final String TEXT_111 = ";" + NL + "\t\tpublic ";
  protected final String TEXT_112 = " ";
  protected final String TEXT_113 = NL + "\t\t{" + NL + "\t\t\tget { return ";
  protected final String TEXT_114 = "; }" + NL + "\t\t\tset { ";
  protected final String TEXT_115 = " = value; }" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_116 = NL + "\t\t" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_117 = NL + "\t\tpublic string  ";
  protected final String TEXT_118 = NL + "\t\t{" + NL + "\t\t\tget {  return derivada.";
  protected final String TEXT_119 = "}" + NL + "\t\t\tset {  derivada.";
  protected final String TEXT_120 = " = value; }" + NL + "\t\t} " + NL + " \t\t";
  protected final String TEXT_121 = NL + "\t\t" + NL + "\t\tprivate string operacaoSinc;" + NL + "        public string OperacaoSinc" + NL + "        {" + NL + "            get { return operacaoSinc; }" + NL + "            set { operacaoSinc = value; }" + NL + "        }" + NL + "\t}" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
    stringBuffer.append(TEXT_8);
    
		Iterator<AtributoTotalI> iteradorAtt = classe.getListaAtributoTotal().iterator();
		boolean primeiro1 = true;
		while (iteradorAtt.hasNext()) {
		AtributoTotalI atributoJson = iteradorAtt.next();
			if (atributoJson.ehData()) {
			if (atributoJson.ehHora()) { 
    stringBuffer.append(TEXT_9);
    stringBuffer.append( (primeiro1?"\"":"+ \",") );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( atributoJson.getNomeVariavel() );
    stringBuffer.append(TEXT_12);
      } else { 
    stringBuffer.append(TEXT_13);
    stringBuffer.append( (primeiro1?"\"":"+ \",") );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( atributoJson.getNomeVariavel() );
    stringBuffer.append(TEXT_16);
      }} else { 
    stringBuffer.append(TEXT_17);
    stringBuffer.append( (primeiro1?"\"":"+ \",") );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( atributoJson.getNomeVariavel() );
    stringBuffer.append(TEXT_20);
    
			}
		primeiro1 = false;
		}
		
    stringBuffer.append(TEXT_21);
     for (ProcValorWrapper proc : classe.getListaDerivadaDemanda()) {
    stringBuffer.append(TEXT_22);
    stringBuffer.append( proc.getNomePropriedade() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( proc.getNomeVariavel() );
    stringBuffer.append(TEXT_24);
     } 
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
    
		Iterator<RelacionamentoWrapper> itRel = classe.obtemListaComChaveEstrangeira().iterator();
		while (itRel.hasNext()) {
		RelacionamentoWrapper relac = itRel.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_39);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_40);
     } 
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_51);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_52);
     } 
    stringBuffer.append(TEXT_53);
    
		}
		
    stringBuffer.append(TEXT_54);
    
		Iterator<RelacionamentoWrapper> itRel1x1 = classe.obtemListaUmPraUm().iterator();
		while (itRel1x1.hasNext()) {
		RelacionamentoWrapper relac = itRel1x1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_62);
    
		}
		
    stringBuffer.append(TEXT_63);
    
		ProcValorWrapper procValor = new ProcValorWrapperCs();
		Iterator<ProcValor> iteradorPV = classe.getListaProcValor().iterator();
		while (iteradorPV.hasNext()) {
			procValor.setProcValor(iteradorPV.next());
		
    stringBuffer.append(TEXT_64);
    stringBuffer.append( procValor.getTipo() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_68);
     if (procValor.ehPercentual()) { 
    stringBuffer.append(TEXT_69);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_71);
     }
		}
		
    stringBuffer.append(TEXT_72);
    
		Iterator<RelacionamentoWrapper> itRelN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (itRelN.hasNext()) {
		RelacionamentoWrapper relac = itRelN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
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
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
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
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_100);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_101);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_102);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_104);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_106);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_107);
    
		}
		
    stringBuffer.append(TEXT_108);
    
		Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
		while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
		
    stringBuffer.append(TEXT_109);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_110);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_111);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_112);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_113);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_114);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_115);
    
		}
		
    stringBuffer.append(TEXT_116);
    
		Iterator itHtml = classe.obtemListaHtml().iterator();
		while (itHtml.hasNext()) {
			String htmlItem = (String) itHtml.next();
		
    stringBuffer.append(TEXT_117);
    stringBuffer.append( htmlItem );
    stringBuffer.append(TEXT_118);
    stringBuffer.append( htmlItem );
    stringBuffer.append(TEXT_119);
    stringBuffer.append( htmlItem );
    stringBuffer.append(TEXT_120);
    
		}
		
    stringBuffer.append(TEXT_121);
    return stringBuffer.toString();
  }
}
