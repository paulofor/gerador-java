package jet.java.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
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
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo.vo;" + NL + "" + NL + "import java.util.List;" + NL + "import java.text.*;" + NL + "import br.com.digicom.lib.DCIObjetoDominio;" + NL + "import br.com.digicom.lib.dao.DaoConexao;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.agregado.*;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.derivadas.*;" + NL + "" + NL + "// Gera??o autom?tica n?o alterar" + NL + "public class ";
  protected final String TEXT_6 = "Vo implements ";
  protected final String TEXT_7 = NL + "{" + NL + "\t\t" + NL + "\tpublic long getIdObj()" + NL + "    {" + NL + "       return ";
  protected final String TEXT_8 = ";" + NL + "    }" + NL + "    " + NL + "\tpublic String toWS() {" + NL + "\t\treturn \"\" + getIdObj();" + NL + "\t}" + NL + "\t" + NL + "\tprivate String JsonAtributos() {" + NL + "\t\treturn " + NL + "\t";
  protected final String TEXT_9 = "\t";
  protected final String TEXT_10 = " \\\"";
  protected final String TEXT_11 = "\\\" : \\\"\" + ";
  protected final String TEXT_12 = " + \"\\\" \"" + NL + "\t";
  protected final String TEXT_13 = NL + "\t;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tpublic String JSon() {" + NL + "\t\treturn \" { \" + JsonAtributos() + \" } \";" + NL + "\t}" + NL + "\t" + NL + "\tprivate ";
  protected final String TEXT_14 = "Derivada derivada = null;" + NL + "\tprivate ";
  protected final String TEXT_15 = "Derivada getDerivada() {" + NL + "\t\tif (derivada==null) {" + NL + "\t\t\tderivada = new ";
  protected final String TEXT_16 = "Derivada(this);" + NL + "\t\t}" + NL + "\t\treturn derivada;" + NL + "\t}" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_17 = "Agregado agregado = null;" + NL + "\tprivate ";
  protected final String TEXT_18 = "Agregado getAgregado() {" + NL + "\t\tif (agregado==null) {" + NL + "\t\t\tagregado = new ";
  protected final String TEXT_19 = "Agregado(this);" + NL + "\t\t}" + NL + "\t\treturn agregado;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t// Com Chave Estrangeira" + NL + "\t";
  protected final String TEXT_20 = NL + "\t// Montador Tradicional" + NL + "\tpublic ";
  protected final String TEXT_21 = " get";
  protected final String TEXT_22 = "(boolean lazyLoader)" + NL + "\t{" + NL + "\t\treturn getAgregado().get";
  protected final String TEXT_23 = "(lazyLoader); " + NL + "\t} " + NL + "\tpublic void set";
  protected final String TEXT_24 = "(";
  protected final String TEXT_25 = " value) " + NL + "\t{" + NL + "\t\tgetAgregado().set";
  protected final String TEXT_26 = "(value); " + NL + "\t} " + NL + "\t/*" + NL + "\tpublic void set";
  protected final String TEXT_27 = "ComReversao(";
  protected final String TEXT_28 = " value) " + NL + "\t{" + NL + "\t\tgetAgregado().set";
  protected final String TEXT_29 = "ComReversao(value); " + NL + "\t} " + NL + "\t*/" + NL + "\t";
  protected final String TEXT_30 = NL + "\t/*  AutoRelacionamento" + NL + "\t";
  protected final String TEXT_31 = NL + "\t// Montador Alternativo e Tradicional" + NL + "\tpublic void addLista";
  protected final String TEXT_32 = "_";
  protected final String TEXT_33 = "(";
  protected final String TEXT_34 = " value)" + NL + "\t{" + NL + "\t\tgetAgregado().set";
  protected final String TEXT_35 = "(value); " + NL + "\t} " + NL + "\tpublic ";
  protected final String TEXT_36 = " getCorrente";
  protected final String TEXT_37 = "_";
  protected final String TEXT_38 = "()" + NL + "\t{" + NL + "\t\treturn getAgregado().get";
  protected final String TEXT_39 = "(false); " + NL + "\t} " + NL + "\t";
  protected final String TEXT_40 = NL + "\t*/" + NL + "\t";
  protected final String TEXT_41 = NL + "\t";
  protected final String TEXT_42 = NL + "\t" + NL + "\t" + NL + "\t// Um pra um" + NL + "\t";
  protected final String TEXT_43 = NL + "\t// Montador Tradicional" + NL + "\tpublic ";
  protected final String TEXT_44 = " get";
  protected final String TEXT_45 = "()" + NL + "\t{" + NL + "\t\treturn getAgregado().get";
  protected final String TEXT_46 = "(); " + NL + "\t} " + NL + "\tpublic void set";
  protected final String TEXT_47 = "(";
  protected final String TEXT_48 = " value) " + NL + "\t{" + NL + "\t\tgetAgregado().set";
  protected final String TEXT_49 = "(value); " + NL + "\t} " + NL + "\t" + NL + "\t";
  protected final String TEXT_50 = NL + "\t" + NL + "\t" + NL + "\t";
  protected final String TEXT_51 = NL + "\tpublic ";
  protected final String TEXT_52 = " get";
  protected final String TEXT_53 = "()" + NL + "\t{" + NL + "\t\treturn getDerivada().get";
  protected final String TEXT_54 = "(); " + NL + "\t} " + NL + "\tpublic void set";
  protected final String TEXT_55 = "(";
  protected final String TEXT_56 = " value)" + NL + "\t{" + NL + "\t\tgetDerivada().set";
  protected final String TEXT_57 = "(value); " + NL + "\t} " + NL + "\t";
  protected final String TEXT_58 = NL + "\tpublic String ";
  protected final String TEXT_59 = "Tela" + NL + "\t{" + NL + "\t\treturn String.Format(\"{0:0.00}\", ";
  protected final String TEXT_60 = " * 100);  " + NL + "\t} " + NL + "\t";
  protected final String TEXT_61 = NL + "\t" + NL + "\tpublic void setConexaoCarregador(DaoConexao conexao) {" + NL + "\t\tgetAgregado().setConexaoCarregador(conexao);" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t// Sem chave estrangeira" + NL + "\t";
  protected final String TEXT_62 = NL + "\t// Montador Alternativo" + NL + "\tpublic boolean existeLista";
  protected final String TEXT_63 = "_";
  protected final String TEXT_64 = "() {" + NL + "\t\treturn getAgregado().existeLista";
  protected final String TEXT_65 = "_";
  protected final String TEXT_66 = "();" + NL + "\t}" + NL + "\tpublic void criaVaziaLista";
  protected final String TEXT_67 = "_";
  protected final String TEXT_68 = "() {" + NL + "\t\tgetAgregado().criaVaziaLista";
  protected final String TEXT_69 = "_";
  protected final String TEXT_70 = "();" + NL + "\t}" + NL + "\tpublic List<";
  protected final String TEXT_71 = "> getLista";
  protected final String TEXT_72 = "_";
  protected final String TEXT_73 = "() " + NL + "\t{" + NL + "\t\treturn getAgregado().getLista";
  protected final String TEXT_74 = "_";
  protected final String TEXT_75 = "(); " + NL + "\t} " + NL + "\tpublic void setLista";
  protected final String TEXT_76 = "_";
  protected final String TEXT_77 = "(List<";
  protected final String TEXT_78 = "> value) " + NL + "\t{" + NL + "\t\tgetAgregado().setLista";
  protected final String TEXT_79 = "_";
  protected final String TEXT_80 = "(value); " + NL + "\t} " + NL + "\tpublic void addLista";
  protected final String TEXT_81 = "_";
  protected final String TEXT_82 = "(";
  protected final String TEXT_83 = " value) " + NL + "\t{" + NL + "\t\tgetAgregado().addLista";
  protected final String TEXT_84 = "_";
  protected final String TEXT_85 = "(value); " + NL + "\t} " + NL + "\tpublic ";
  protected final String TEXT_86 = " getCorrente";
  protected final String TEXT_87 = "_";
  protected final String TEXT_88 = "()" + NL + "\t{" + NL + "\t\treturn getAgregado().getCorrente";
  protected final String TEXT_89 = "_";
  protected final String TEXT_90 = "(); " + NL + "\t} " + NL + "\t";
  protected final String TEXT_91 = NL + NL + "\t";
  protected final String TEXT_92 = NL + "\t" + NL + "\t";
  protected final String TEXT_93 = NL + "\tpublic String get";
  protected final String TEXT_94 = "Formatada()" + NL + "\t{" + NL + "\t\tDecimalFormat df = new DecimalFormat(\"0.00\");" + NL + "\t\treturn df.format(";
  protected final String TEXT_95 = ");" + NL + "\t}" + NL + "\t";
  protected final String TEXT_96 = NL + "\t" + NL + "\t";
  protected final String TEXT_97 = "\t" + NL + "\tprivate ";
  protected final String TEXT_98 = " ";
  protected final String TEXT_99 = ";" + NL + "\tpublic ";
  protected final String TEXT_100 = " get";
  protected final String TEXT_101 = "() {" + NL + "\t\t// relacionamento" + NL + "\t\tif (";
  protected final String TEXT_102 = "==0 && this.get";
  protected final String TEXT_103 = "(false)!=null) " + NL + "\t\t\treturn get";
  protected final String TEXT_104 = "(false).getIdObj();" + NL + "\t\telse" + NL + "\t\t\treturn ";
  protected final String TEXT_105 = ";" + NL + "\t}" + NL + "\tpublic void set";
  protected final String TEXT_106 = "(";
  protected final String TEXT_107 = " _valor) {" + NL + "\t\t";
  protected final String TEXT_108 = " = _valor;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_109 = NL + "\tprivate ";
  protected final String TEXT_110 = " ";
  protected final String TEXT_111 = ";" + NL + "\tpublic ";
  protected final String TEXT_112 = " get";
  protected final String TEXT_113 = "()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_114 = ";" + NL + "\t}" + NL + "\tpublic  void set";
  protected final String TEXT_115 = "(";
  protected final String TEXT_116 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_117 = " = value; " + NL + "\t}" + NL + "\t";
  protected final String TEXT_118 = NL + "\t" + NL + "\t" + NL + "\t";
  protected final String TEXT_119 = NL + "\tpublic void set";
  protected final String TEXT_120 = "(String value)" + NL + "\t{" + NL + "\t\tderivada.set";
  protected final String TEXT_121 = "(value); " + NL + "\t} " + NL + "\tpublic String  get";
  protected final String TEXT_122 = "()" + NL + "\t{" + NL + "\t\treturn derivada.get";
  protected final String TEXT_123 = "()" + NL + "\t} " + NL + "\t";
  protected final String TEXT_124 = NL + "\t" + NL + "\t" + NL + "\t//-------------------------------------------------------" + NL + "\t" + NL + "\t" + NL + "}";
  protected final String TEXT_125 = NL;

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
	
    stringBuffer.append(TEXT_9);
    stringBuffer.append( (primeiro1?"\"":"+ \",") );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( atributoJson.getNomeVariavel() );
    stringBuffer.append(TEXT_12);
    
	primeiro1 = false;
	}
	
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
    
	Iterator<RelacionamentoWrapper> itRel = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
	while (itRel.hasNext()) {
	RelacionamentoWrapper relac = itRel.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_29);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_30);
     } 
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_39);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_40);
     } 
    stringBuffer.append(TEXT_41);
    
	}
	
    stringBuffer.append(TEXT_42);
    
	Iterator<RelacionamentoWrapper> itRel1x1 = classe.obtemListaUmPraUm().iterator();
	while (itRel1x1.hasNext()) {
	RelacionamentoWrapper relac = itRel1x1.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_49);
    
	}
	
    stringBuffer.append(TEXT_50);
    
	ProcValorWrapper procValor = new ProcValorWrapperJava();
	Iterator<ProcValor> iteradorPV = classe.getListaProcValor().iterator();
	while (iteradorPV.hasNext()) {
		procValor.setProcValor(iteradorPV.next());
	
    stringBuffer.append(TEXT_51);
    stringBuffer.append( procValor.getTipo() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( procValor.getTipo() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_57);
     if (procValor.ehPercentual()) { 
    stringBuffer.append(TEXT_58);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_60);
     }
	}
	
    stringBuffer.append(TEXT_61);
    
	Iterator<RelacionamentoWrapper> itRelN = classe.obtemListaSemChaveEstrangeira().iterator();
	while (itRelN.hasNext()) {
	RelacionamentoWrapper relac = itRelN.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_62);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
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
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_90);
    
	}
	
    stringBuffer.append(TEXT_91);
    
	Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
	while (iterador.hasNext()) {
	AtributoTotalI atributo = iterador.next();
	
    stringBuffer.append(TEXT_92);
     if (atributo.ehMoeda()) { 
    stringBuffer.append(TEXT_93);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_95);
     } 
    stringBuffer.append(TEXT_96);
    
	if (atributo instanceof RelacionamentoWrapper) {
	RelacionamentoWrapper relac = (RelacionamentoWrapper) atributo;
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_97);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_100);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_101);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_102);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_104);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_106);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_107);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_108);
    
	} else {
	
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
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_115);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_116);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_117);
    
	}
	}
	
    stringBuffer.append(TEXT_118);
    
	Iterator itHtml = classe.obtemListaHtml().iterator();
	while (itHtml.hasNext()) {
		String htmlItem = (String) itHtml.next();
	
    stringBuffer.append(TEXT_119);
    stringBuffer.append( htmlItem );
    stringBuffer.append(TEXT_120);
    stringBuffer.append( htmlItem );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( htmlItem );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( htmlItem );
    stringBuffer.append(TEXT_123);
    
	}
	
    stringBuffer.append(TEXT_124);
    stringBuffer.append(TEXT_125);
    return stringBuffer.toString();
  }
}
