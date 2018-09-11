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
  protected final String TEXT_4 = ".modelo.derivadas;" + NL + "using System.Globalization;" + NL + "" + NL + "namespace ";
  protected final String TEXT_5 = ".modelo.vo" + NL + "{" + NL + "" + NL + "\tpublic class ";
  protected final String TEXT_6 = "Vo : ";
  protected final String TEXT_7 = NL + "\t{" + NL + "\t\t\t" + NL + "\t\tpublic long IdObj" + NL + "        {" + NL + "            get" + NL + "            {" + NL + "                return ";
  protected final String TEXT_8 = ";" + NL + "            }" + NL + "        }" + NL + "\t\tpublic string toWS() {" + NL + "\t\t\treturn IdObj.ToString();" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tprivate string JsonAtributos() {" + NL + "\t\t\treturn " + NL + "\t\t";
  protected final String TEXT_9 = NL + "\t\t\t\t";
  protected final String TEXT_10 = " '";
  protected final String TEXT_11 = "' : '\" + ConverteParaDecimal(";
  protected final String TEXT_12 = ") + \"' \"" + NL + "\t\t\t\t";
  protected final String TEXT_13 = NL + "\t\t\t";
  protected final String TEXT_14 = NL + "\t\t\t";
  protected final String TEXT_15 = NL + "\t\t\t\t";
  protected final String TEXT_16 = " '";
  protected final String TEXT_17 = "' : '\" + ConverteDataHora2Json(";
  protected final String TEXT_18 = ") + \"' \"" + NL + "\t\t\t\t";
  protected final String TEXT_19 = NL + "\t\t\t";
  protected final String TEXT_20 = NL + "\t\t\t";
  protected final String TEXT_21 = NL + "\t\t\t\t";
  protected final String TEXT_22 = " '";
  protected final String TEXT_23 = "' : '\" + ConverteData2Json(";
  protected final String TEXT_24 = ") + \"' \"" + NL + "\t\t\t\t";
  protected final String TEXT_25 = NL + "\t\t\t";
  protected final String TEXT_26 = NL + "\t\t\t";
  protected final String TEXT_27 = NL + "\t\t\t\t";
  protected final String TEXT_28 = " '";
  protected final String TEXT_29 = "' : '\" + ";
  protected final String TEXT_30 = " + \"' \"" + NL + "\t\t\t";
  protected final String TEXT_31 = NL + "\t\t";
  protected final String TEXT_32 = NL + "\t\t";
  protected final String TEXT_33 = NL + "\t\t\t+ \", '";
  protected final String TEXT_34 = "' : '\" + ";
  protected final String TEXT_35 = " + \"' \"" + NL + "\t\t";
  protected final String TEXT_36 = NL + "\t\t;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tprivate string ConverteDataHora2Json(string dataHora)" + NL + "        {" + NL + "            // DD-MM-AAAA HH:MM:SS" + NL + "            // 0123456789012345678" + NL + "            if (dataHora == null) return \"0\"; // Retornando 0 pq no mobile e um numerico." + NL + "            string dia = dataHora.Substring(0, 2);" + NL + "            string mes = dataHora.Substring(3, 2);" + NL + "            string ano = dataHora.Substring(6, 4);" + NL + "            string hora = dataHora.Substring(11, 2);" + NL + "            string min = dataHora.Substring(14, 2);" + NL + "            string seg = dataHora.Substring(17, 2);" + NL + "            return ano + mes + dia + hora + min + seg;" + NL + "        }" + NL + "        private string ConverteData2Json(string dataHora)" + NL + "        {" + NL + "            // DD-MM-AAAA" + NL + "            // 0123456789" + NL + "            if (dataHora == null) return \"0\"; // Retornando 0 pq no mobile e um numerico." + NL + "            string dia = dataHora.Substring(0, 2);" + NL + "            string mes = dataHora.Substring(3, 2);" + NL + "            string ano = dataHora.Substring(6, 4);" + NL + "            return ano + mes + dia;" + NL + "        }" + NL + "\t\t" + NL + "\t\tpublic string JSon {" + NL + "\t\t\tget {" + NL + "\t\t\t\treturn \" { \" + JsonAtributos() + \" } \";" + NL + "\t\t\t}" + NL + "\t\t\tset { }" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tprivate ";
  protected final String TEXT_37 = "Derivada derivada = null;" + NL + "\t\tprivate ";
  protected final String TEXT_38 = "Derivada getDerivada() {" + NL + "\t\t\tif (derivada==null) {" + NL + "\t\t\t\tderivada = new ";
  protected final String TEXT_39 = "Derivada(this);" + NL + "\t\t\t}" + NL + "\t\t\treturn derivada;" + NL + "\t\t}" + NL + "\t" + NL + "\t\tprivate ";
  protected final String TEXT_40 = "Agregado agregado = null;" + NL + "\t\tprivate ";
  protected final String TEXT_41 = "Agregado getAgregado() {" + NL + "\t\t\tif (agregado==null) {" + NL + "\t\t\t\tagregado = new ";
  protected final String TEXT_42 = "Agregado(this);" + NL + "\t\t\t}" + NL + "\t\t\treturn agregado;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_43 = NL + NL + "\t\tpublic ";
  protected final String TEXT_44 = " ";
  protected final String TEXT_45 = "_";
  protected final String TEXT_46 = " " + NL + "\t\t{" + NL + "\t\t\tget { return getAgregado().";
  protected final String TEXT_47 = "_";
  protected final String TEXT_48 = "; }" + NL + "\t\t\tset { getAgregado().";
  protected final String TEXT_49 = "_";
  protected final String TEXT_50 = " = value; }" + NL + "\t\t} " + NL + "\t\t";
  protected final String TEXT_51 = NL + "\t\t/*  AutoRelacionamento" + NL + "\t\t";
  protected final String TEXT_52 = NL + "\t\tpublic ";
  protected final String TEXT_53 = " AddLista";
  protected final String TEXT_54 = "_";
  protected final String TEXT_55 = " " + NL + "\t\t{" + NL + "\t\t\tset { getAgregado().";
  protected final String TEXT_56 = "_";
  protected final String TEXT_57 = " = value; }" + NL + "\t\t} " + NL + "\t\tpublic ";
  protected final String TEXT_58 = " Corrente";
  protected final String TEXT_59 = "_";
  protected final String TEXT_60 = " " + NL + "\t\t{" + NL + "\t\t\tget { return getAgregado().";
  protected final String TEXT_61 = "_";
  protected final String TEXT_62 = "; }" + NL + "\t\t} " + NL + "\t\t";
  protected final String TEXT_63 = NL + "\t\t*/" + NL + "\t\t";
  protected final String TEXT_64 = NL + " \t\t";
  protected final String TEXT_65 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_66 = NL + "\t\tpublic ";
  protected final String TEXT_67 = " ";
  protected final String TEXT_68 = "_";
  protected final String TEXT_69 = " " + NL + "\t\t{" + NL + "\t\t\tget { return getAgregado().";
  protected final String TEXT_70 = "_";
  protected final String TEXT_71 = "; }" + NL + "\t\t\tset { getAgregado().";
  protected final String TEXT_72 = "_";
  protected final String TEXT_73 = " = value; }" + NL + "\t\t} " + NL + " \t\t";
  protected final String TEXT_74 = NL + "\t\t" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_75 = NL + "\t\tpublic ";
  protected final String TEXT_76 = " ";
  protected final String TEXT_77 = NL + "\t\t{" + NL + "\t\t\tget { return getDerivada().";
  protected final String TEXT_78 = "; }" + NL + "\t\t\tset { getDerivada().";
  protected final String TEXT_79 = " = value; }" + NL + "\t\t} " + NL + "\t\t";
  protected final String TEXT_80 = NL + "    \tpublic string ";
  protected final String TEXT_81 = "Tela" + NL + "\t\t{" + NL + "\t\t\tget {  return String.Format(\"{0:0.00}\", ";
  protected final String TEXT_82 = " * 100);  }" + NL + "\t\t} " + NL + "\t\t";
  protected final String TEXT_83 = NL + "\t\t" + NL + "\t\tpublic void setConexaoCarregador(DaoConexao conexao) {" + NL + "\t\t\tgetAgregado().setConexaoCarregador(conexao);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_84 = NL + "\t\tpublic bool ExisteLista";
  protected final String TEXT_85 = "_";
  protected final String TEXT_86 = " {" + NL + "\t\t\tget {" + NL + "\t\t\treturn getAgregado().ExisteLista";
  protected final String TEXT_87 = "_";
  protected final String TEXT_88 = ";" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tpublic void CriaVaziaLista";
  protected final String TEXT_89 = "_";
  protected final String TEXT_90 = "() {" + NL + "\t\t\tgetAgregado().CriaVaziaLista";
  protected final String TEXT_91 = "_";
  protected final String TEXT_92 = "();" + NL + "\t\t}" + NL + "\t\tpublic List<";
  protected final String TEXT_93 = "> Lista";
  protected final String TEXT_94 = "_";
  protected final String TEXT_95 = " " + NL + "\t\t{" + NL + "\t\t\tget { return getAgregado().Lista";
  protected final String TEXT_96 = "_";
  protected final String TEXT_97 = "; }" + NL + "\t\t\tset { getAgregado().Lista";
  protected final String TEXT_98 = "_";
  protected final String TEXT_99 = " = value; }" + NL + "\t\t} " + NL + "\t\t// Vem direto do JSON do Mobile com esse nome" + NL + "\t\tpublic List<";
  protected final String TEXT_100 = "Vo> Lista";
  protected final String TEXT_101 = "Vo_";
  protected final String TEXT_102 = NL + "        {" + NL + "            set {" + NL + "                List<";
  protected final String TEXT_103 = "Vo> lista = value;" + NL + "                if (lista == null) return;" + NL + "                getAgregado().CriaVaziaLista";
  protected final String TEXT_104 = "_";
  protected final String TEXT_105 = "();" + NL + "                foreach (";
  protected final String TEXT_106 = "Vo item in lista)" + NL + "                {" + NL + "                    this.AddLista";
  protected final String TEXT_107 = "_";
  protected final String TEXT_108 = " = item;" + NL + "                }" + NL + "            }" + NL + "        } " + NL + "\t\tpublic ";
  protected final String TEXT_109 = " AddLista";
  protected final String TEXT_110 = "_";
  protected final String TEXT_111 = " " + NL + "\t\t{" + NL + "\t\t\tset { getAgregado().AddLista";
  protected final String TEXT_112 = "_";
  protected final String TEXT_113 = " = value; }" + NL + "\t\t} " + NL + "\t\tpublic ";
  protected final String TEXT_114 = " Corrente";
  protected final String TEXT_115 = "_";
  protected final String TEXT_116 = " " + NL + "\t\t{" + NL + "\t\t\tget { return getAgregado().Corrente";
  protected final String TEXT_117 = "_";
  protected final String TEXT_118 = "; }" + NL + "\t\t} " + NL + " \t\t";
  protected final String TEXT_119 = NL + "\t" + NL + "\t\t";
  protected final String TEXT_120 = NL + "\t\tprivate ";
  protected final String TEXT_121 = " ";
  protected final String TEXT_122 = ";" + NL + "\t\tpublic ";
  protected final String TEXT_123 = " ";
  protected final String TEXT_124 = NL + "\t\t{" + NL + "\t\t\tget { return ";
  protected final String TEXT_125 = "; }" + NL + "\t\t\tset { ";
  protected final String TEXT_126 = " = value; }" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_127 = NL + "\t\t" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_128 = NL + "\t\tpublic string  ";
  protected final String TEXT_129 = NL + "\t\t{" + NL + "\t\t\tget {  return derivada.";
  protected final String TEXT_130 = "}" + NL + "\t\t\tset {  derivada.";
  protected final String TEXT_131 = " = value; }" + NL + "\t\t} " + NL + " \t\t";
  protected final String TEXT_132 = NL + "\t\t" + NL + "\t\tprivate string operacaoSinc;" + NL + "        public string OperacaoSinc" + NL + "        {" + NL + "            get { return operacaoSinc; }" + NL + "            set { operacaoSinc = value; }" + NL + "        }" + NL + "        " + NL + "        private String ConverteParaDecimal(float numero)" + NL + "        {" + NL + "            CultureInfo us = new CultureInfo(\"en-US\");" + NL + "            return numero.ToString(\"######.00\",us);" + NL + "        }" + NL + "\t}" + NL + "}";

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
		outerloop:
		while (iteradorAtt.hasNext()) {
			AtributoTotalI atributoJson = iteradorAtt.next();
			boolean entrou = false;			
			if (atributoJson.ehMoeda()) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append( (primeiro1?"\"":"+ \",") );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( atributoJson.getNomeVariavel() );
    stringBuffer.append(TEXT_12);
     entrou = true; 
    stringBuffer.append(TEXT_13);
     } 
    stringBuffer.append(TEXT_14);
     if (!entrou && atributoJson.ehHora()) { 
    stringBuffer.append(TEXT_15);
    stringBuffer.append( (primeiro1?"\"":"+ \",") );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( atributoJson.getNomeVariavel() );
    stringBuffer.append(TEXT_18);
     entrou = true; 
    stringBuffer.append(TEXT_19);
     } 
    stringBuffer.append(TEXT_20);
     if (!entrou && atributoJson.ehData()) { 
    stringBuffer.append(TEXT_21);
    stringBuffer.append( (primeiro1?"\"":"+ \",") );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( atributoJson.getNomeVariavel() );
    stringBuffer.append(TEXT_24);
     entrou = true; 
    stringBuffer.append(TEXT_25);
     } 
    stringBuffer.append(TEXT_26);
     if (!entrou) { 
    stringBuffer.append(TEXT_27);
    stringBuffer.append( (primeiro1?"\"":"+ \",") );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( atributoJson.getNomeVariavel() );
    stringBuffer.append(TEXT_30);
     } 
    stringBuffer.append(TEXT_31);
    
		primeiro1 = false;
		}
		
    stringBuffer.append(TEXT_32);
     for (ProcValorWrapper proc : classe.getListaDerivadaDemanda()) {
    stringBuffer.append(TEXT_33);
    stringBuffer.append( proc.getNomePropriedade() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( proc.getNomeVariavel() );
    stringBuffer.append(TEXT_35);
     } 
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
    
		Iterator<RelacionamentoWrapper> itRel = classe.obtemListaComChaveEstrangeira().iterator();
		while (itRel.hasNext()) {
		RelacionamentoWrapper relac = itRel.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_50);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_51);
     } 
    stringBuffer.append(TEXT_52);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_62);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_63);
     } 
    stringBuffer.append(TEXT_64);
    
		}
		
    stringBuffer.append(TEXT_65);
    
		Iterator<RelacionamentoWrapper> itRel1x1 = classe.obtemListaUmPraUm().iterator();
		while (itRel1x1.hasNext()) {
		RelacionamentoWrapper relac = itRel1x1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_66);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_73);
    
		}
		
    stringBuffer.append(TEXT_74);
    
		ProcValorWrapper procValor = new ProcValorWrapperCs();
		Iterator<ProcValor> iteradorPV = classe.getListaProcValor().iterator();
		while (iteradorPV.hasNext()) {
			procValor.setProcValor(iteradorPV.next());
		
    stringBuffer.append(TEXT_75);
    stringBuffer.append( procValor.getTipo() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_79);
     if (procValor.ehPercentual()) { 
    stringBuffer.append(TEXT_80);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_82);
     }
		}
		
    stringBuffer.append(TEXT_83);
    
		Iterator<RelacionamentoWrapper> itRelN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (itRelN.hasNext()) {
		RelacionamentoWrapper relac = itRelN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
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
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
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
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_107);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_108);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_109);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_110);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_111);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_112);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_113);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_114);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_115);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_116);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_117);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_118);
    
		}
		
    stringBuffer.append(TEXT_119);
    
		Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
		while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
		
    stringBuffer.append(TEXT_120);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_123);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_124);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_125);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_126);
    
		}
		
    stringBuffer.append(TEXT_127);
    
		Iterator itHtml = classe.obtemListaHtml().iterator();
		while (itHtml.hasNext()) {
			String htmlItem = (String) itHtml.next();
		
    stringBuffer.append(TEXT_128);
    stringBuffer.append( htmlItem );
    stringBuffer.append(TEXT_129);
    stringBuffer.append( htmlItem );
    stringBuffer.append(TEXT_130);
    stringBuffer.append( htmlItem );
    stringBuffer.append(TEXT_131);
    
		}
		
    stringBuffer.append(TEXT_132);
    return stringBuffer.toString();
  }
}
