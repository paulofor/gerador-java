package jet.android2.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class Vo
{
  protected static String nl;
  public static synchronized Vo create(String lineSeparator)
  {
    nl = lineSeparator;
    Vo result = new Vo();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".modelo;" + NL + "" + NL + "" + NL + "import android.view.View;" + NL + "import java.sql.Timestamp;" + NL + "import java.text.DateFormat;" + NL + "import java.text.ParseException;" + NL + "import java.text.SimpleDateFormat;" + NL + "import java.text.DecimalFormat;" + NL + "import java.util.Date;" + NL + "import java.util.List;" + NL + "import org.json.JSONObject;" + NL + "import org.json.JSONArray;" + NL + "import org.json.JSONException;" + NL + "import android.content.ContentValues;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".framework.util.UtilDatas;" + NL + "import ";
  protected final String TEXT_5 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_6 = ".modelo.agregado.";
  protected final String TEXT_7 = "Agregado;" + NL + "import ";
  protected final String TEXT_8 = ".data.contract.";
  protected final String TEXT_9 = "Contract;" + NL + "" + NL + "public class ";
  protected final String TEXT_10 = "Vo implements ";
  protected final String TEXT_11 = "  {" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_12 = "Vo() {" + NL + "  \t}" + NL + "  \t" + NL + "  \tpublic long getIdObj()" + NL + "    {" + NL + "       return ";
  protected final String TEXT_13 = ";" + NL + "    }" + NL + "" + NL + "\t // ----- INICIO AGREGADO -----------------" + NL + "\tprivate ";
  protected final String TEXT_14 = "Agregado agregado = null;" + NL + "\tprivate ";
  protected final String TEXT_15 = "Agregado getAgregado() {" + NL + "\t\tif (agregado==null) {" + NL + "\t\t\tagregado = new ";
  protected final String TEXT_16 = "Agregado(this);" + NL + "\t\t}" + NL + "\t\treturn agregado;" + NL + "\t}" + NL + "\t// ----- FINAL AGREGADO -----------------" + NL + "" + NL + "" + NL + "\t// ----- PROC VALOR - DERIVADA -----------" + NL + "\t" + NL + "\t";
  protected final String TEXT_17 = NL + "\tprivate ";
  protected final String TEXT_18 = " ";
  protected final String TEXT_19 = ";" + NL + "\tpublic ";
  protected final String TEXT_20 = " get";
  protected final String TEXT_21 = "() {" + NL + "\t\treturn ";
  protected final String TEXT_22 = ";" + NL + "\t}" + NL + "\tpublic void set";
  protected final String TEXT_23 = "(";
  protected final String TEXT_24 = " _valor) {" + NL + "\t\t";
  protected final String TEXT_25 = " = _valor;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_26 = NL + "\t" + NL + "\t// ---- FINAL PROC VALOR - DERIVADA ------" + NL + "" + NL + "  \t" + NL + "  \t";
  protected final String TEXT_27 = NL + "\tprivate ";
  protected final String TEXT_28 = " ";
  protected final String TEXT_29 = ";" + NL + "\tpublic ";
  protected final String TEXT_30 = " get";
  protected final String TEXT_31 = "() {" + NL + "\t\treturn ";
  protected final String TEXT_32 = ";" + NL + "\t}" + NL + "\tpublic void set";
  protected final String TEXT_33 = "(";
  protected final String TEXT_34 = " _valor) {" + NL + "\t\t";
  protected final String TEXT_35 = " = _valor;" + NL + "\t}";
  protected final String TEXT_36 = "\t" + NL + "\tprivate ";
  protected final String TEXT_37 = " ";
  protected final String TEXT_38 = ";" + NL + "\tpublic ";
  protected final String TEXT_39 = " get";
  protected final String TEXT_40 = "() {" + NL + "\t\t// relacionamento - Nao adianta pq na hora de gravar no banco pega o valor da variavel e nao desse " + NL + "\t\t// metodo." + NL + "\t\t//if (this.get";
  protected final String TEXT_41 = "_";
  protected final String TEXT_42 = "()!=null) " + NL + "\t\t//\treturn get";
  protected final String TEXT_43 = "_";
  protected final String TEXT_44 = "().getIdObj();" + NL + "\t\t//else" + NL + "\t\t\treturn ";
  protected final String TEXT_45 = ";" + NL + "\t}" + NL + "\tpublic void set";
  protected final String TEXT_46 = "(";
  protected final String TEXT_47 = " _valor) {" + NL + "\t\t";
  protected final String TEXT_48 = " = _valor;" + NL + "\t}";
  protected final String TEXT_49 = NL;
  protected final String TEXT_50 = "\t" + NL + "\tpublic String get";
  protected final String TEXT_51 = "Tela() {" + NL + "\t\tDecimalFormat df = new DecimalFormat(\"###,###.00\");" + NL + "\t\tString saida = df.format(";
  protected final String TEXT_52 = ");" + NL + "\t\treturn saida;" + NL + "\t}";
  protected final String TEXT_53 = NL;
  protected final String TEXT_54 = NL + "\tpublic String get";
  protected final String TEXT_55 = "DDMMAAAA() {" + NL + "\t\tif (";
  protected final String TEXT_56 = "==null) return null;" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"dd/MM/yyyy\");" + NL + "        return formato.format(";
  protected final String TEXT_57 = ");" + NL + "    }";
  protected final String TEXT_58 = NL + "    public void set";
  protected final String TEXT_59 = "DDMMAAAAComBarra(String arg) {" + NL + "    \tDateFormat formatter = new SimpleDateFormat(\"dd/MM/yyyy\");" + NL + "\t\tDate date;" + NL + "\t\ttry {" + NL + "\t\t\tdate = formatter.parse(arg);" + NL + "\t\t\t";
  protected final String TEXT_60 = " = new Timestamp(date.getTime());" + NL + "\t\t} catch (ParseException e) {" + NL + "\t\t\tDCLog.e(DCLog.MODELO, this, e);" + NL + "\t\t}" + NL + "    }" + NL + "    public void set";
  protected final String TEXT_61 = "DDMMAAAAComTraco(String arg) {" + NL + "    \tDateFormat formatter = new SimpleDateFormat(\"dd-MM-yyyy\");" + NL + "\t\tDate date;" + NL + "\t\ttry {" + NL + "\t\t\tdate = formatter.parse(arg);" + NL + "\t\t\t";
  protected final String TEXT_62 = " = new Timestamp(date.getTime());" + NL + "\t\t} catch (ParseException e) {" + NL + "\t\t\tDCLog.e(DCLog.MODELO, this, e);" + NL + "\t\t}" + NL + "    }";
  protected final String TEXT_63 = NL + NL + NL + NL;
  protected final String TEXT_64 = NL + "\tpublic String get";
  protected final String TEXT_65 = "HHMM() {" + NL + "\t\tif (";
  protected final String TEXT_66 = "==null) return null;" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"HH:mm\");" + NL + "        return formato.format(";
  protected final String TEXT_67 = ");" + NL + "    }" + NL + "    public String get";
  protected final String TEXT_68 = "HHMMSS() {" + NL + "\t\tif (";
  protected final String TEXT_69 = "==null) return null;" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"HH:mm:ss\");" + NL + "        return formato.format(";
  protected final String TEXT_70 = ");" + NL + "    }";
  protected final String TEXT_71 = NL + NL + NL + NL + "\tprivate String operacaoSinc = null;" + NL + "" + NL + "\tpublic String getOperacaoSinc() {" + NL + "\t\treturn operacaoSinc;" + NL + "\t}" + NL + "" + NL + "\tpublic void setOperacaoSinc(String valor) {" + NL + "\t\toperacaoSinc = valor;" + NL + "\t}" + NL + "" + NL + "\t/*" + NL + "\tpublic JSONObject JSonSinc() throws JSONException {" + NL + "\t\tJSONObject json = JSonSimples();" + NL + "\t\tjson.put(\"OperacaoSinc\", operacaoSinc);" + NL + "\t\treturn json;" + NL + "\t}" + NL + "\t*/" + NL + "\t" + NL + "\t" + NL + "\tprivate boolean salvaPreliminar = false;" + NL + "" + NL + "\tpublic void setSalvaPreliminar(boolean valor) {" + NL + "\t\tsalvaPreliminar = valor;" + NL + "\t}" + NL + "" + NL + "\tpublic boolean getSalvaPreliminar() {" + NL + "\t\treturn salvaPreliminar;" + NL + "\t}" + NL + "\t" + NL + "\t// ComChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_72 = NL + "\tpublic long get";
  protected final String TEXT_73 = "LazyLoader() {" + NL + "\t\treturn ";
  protected final String TEXT_74 = ";" + NL + "\t} " + NL + "\t\t";
  protected final String TEXT_75 = NL + "\t" + NL + "\t" + NL + "\tprivate boolean somenteMemoria = true;" + NL + "" + NL + "\tpublic boolean getSomenteMemoria() {" + NL + "\t\treturn somenteMemoria;" + NL + "\t}" + NL + "" + NL + "\tpublic void setSomenteMemoria(boolean dado) {" + NL + "\t\tsomenteMemoria = dado;" + NL + "\t} " + NL + "\t" + NL + "\t" + NL + "\t// ------ AGREGADOS 2-------------------" + NL + "  \t// ComChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_76 = NL + "\t\tpublic ";
  protected final String TEXT_77 = " get";
  protected final String TEXT_78 = "_";
  protected final String TEXT_79 = "() {" + NL + "\t\t\treturn getAgregado().get";
  protected final String TEXT_80 = "_";
  protected final String TEXT_81 = "();" + NL + "\t\t}" + NL + "\t\tpublic void set";
  protected final String TEXT_82 = "_";
  protected final String TEXT_83 = "(";
  protected final String TEXT_84 = " item) {" + NL + "\t\t\t// Coloquei em 10-11-2016" + NL + "\t\t\t";
  protected final String TEXT_85 = " = item.getIdObj();" + NL + "\t\t\tgetAgregado().set";
  protected final String TEXT_86 = "_";
  protected final String TEXT_87 = "(item);" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_88 = NL + "\t\tpublic void addLista";
  protected final String TEXT_89 = "_";
  protected final String TEXT_90 = "(";
  protected final String TEXT_91 = " item) {" + NL + "\t\t\tgetAgregado().addLista";
  protected final String TEXT_92 = "_";
  protected final String TEXT_93 = "(item);" + NL + "\t\t}" + NL + "\t\tpublic ";
  protected final String TEXT_94 = " getCorrente";
  protected final String TEXT_95 = "_";
  protected final String TEXT_96 = "() {" + NL + "\t\t\treturn getAgregado().getCorrente";
  protected final String TEXT_97 = "_";
  protected final String TEXT_98 = "();" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_99 = NL + "\t\t";
  protected final String TEXT_100 = NL + "\t" + NL + "\t// SemChaveEstrangeira" + NL + "\t";
  protected final String TEXT_101 = NL + "\t\tpublic ";
  protected final String TEXT_102 = " getCorrente";
  protected final String TEXT_103 = "_";
  protected final String TEXT_104 = "() {" + NL + "\t\t\treturn getAgregado().getCorrente";
  protected final String TEXT_105 = "_";
  protected final String TEXT_106 = "();" + NL + "\t\t}" + NL + "\t\tpublic void addLista";
  protected final String TEXT_107 = "_";
  protected final String TEXT_108 = "(";
  protected final String TEXT_109 = " item) {" + NL + "\t\t\tgetAgregado().addLista";
  protected final String TEXT_110 = "_";
  protected final String TEXT_111 = "(item);" + NL + "\t\t}" + NL + "\t\tpublic List<";
  protected final String TEXT_112 = "> getLista";
  protected final String TEXT_113 = "_";
  protected final String TEXT_114 = "() {" + NL + "\t\t\treturn getAgregado().getLista";
  protected final String TEXT_115 = "_";
  protected final String TEXT_116 = "();" + NL + "\t\t}" + NL + "\t\tpublic List<";
  protected final String TEXT_117 = "> getLista";
  protected final String TEXT_118 = "_";
  protected final String TEXT_119 = "Original() {" + NL + "\t\t\treturn getAgregado().getLista";
  protected final String TEXT_120 = "_";
  protected final String TEXT_121 = "Original();" + NL + "\t\t}" + NL + "\t\tpublic List<";
  protected final String TEXT_122 = "> getLista";
  protected final String TEXT_123 = "_";
  protected final String TEXT_124 = "(int qtde) {" + NL + "\t\t\treturn getAgregado().getLista";
  protected final String TEXT_125 = "_";
  protected final String TEXT_126 = "(qtde);" + NL + "\t\t}" + NL + "\t\tpublic void setLista";
  protected final String TEXT_127 = "_";
  protected final String TEXT_128 = "(List<";
  protected final String TEXT_129 = "> lista) {" + NL + "\t\t\tgetAgregado().setLista";
  protected final String TEXT_130 = "_";
  protected final String TEXT_131 = "(lista);" + NL + "\t\t}" + NL + "\t\tpublic void setLista";
  protected final String TEXT_132 = "_";
  protected final String TEXT_133 = "ByDao(List<";
  protected final String TEXT_134 = "> lista) {" + NL + "\t\t\tgetAgregado().setLista";
  protected final String TEXT_135 = "_";
  protected final String TEXT_136 = "ByDao(lista);" + NL + "\t\t}" + NL + "\t\tpublic void criaVaziaLista";
  protected final String TEXT_137 = "_";
  protected final String TEXT_138 = "() {" + NL + "\t\t\tgetAgregado().criaVaziaLista";
  protected final String TEXT_139 = "_";
  protected final String TEXT_140 = "();" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tpublic boolean existeLista";
  protected final String TEXT_141 = "_";
  protected final String TEXT_142 = "() {" + NL + "\t\t\treturn getAgregado().existeLista";
  protected final String TEXT_143 = "_";
  protected final String TEXT_144 = "();" + NL + "\t\t}" + NL + " \t\t";
  protected final String TEXT_145 = NL + "\t" + NL + "\t// UmPraUm" + NL + "\t";
  protected final String TEXT_146 = NL + "\t\tpublic ";
  protected final String TEXT_147 = " get";
  protected final String TEXT_148 = "_";
  protected final String TEXT_149 = "() {" + NL + "\t\t\treturn getAgregado().get";
  protected final String TEXT_150 = "_";
  protected final String TEXT_151 = "();" + NL + "\t\t}" + NL + "\t\tpublic void set";
  protected final String TEXT_152 = "_";
  protected final String TEXT_153 = "(";
  protected final String TEXT_154 = " item) {" + NL + "\t\t\tgetAgregado().set";
  protected final String TEXT_155 = "_";
  protected final String TEXT_156 = "(item);" + NL + "\t\t}" + NL + " \t\t";
  protected final String TEXT_157 = NL + "  \t" + NL + "  \t" + NL + "  \t// ------ FINAL AGREGADOS -------------" + NL + "  \t" + NL + "  " + NL + "\tpublic ContentValues getContentValues() {" + NL + "\t\tContentValues valores = new ContentValues();" + NL + "\t";
  protected final String TEXT_158 = NL + "    \tvalores.put(";
  protected final String TEXT_159 = "Contract.COLUNA_";
  protected final String TEXT_160 = ", UtilDatas.getDataHoraLong(";
  protected final String TEXT_161 = "));";
  protected final String TEXT_162 = NL + "    \tvalores.put(";
  protected final String TEXT_163 = "Contract.COLUNA_";
  protected final String TEXT_164 = ", UtilDatas.getDataLong(";
  protected final String TEXT_165 = "));";
  protected final String TEXT_166 = NL + "    \tvalores.put(";
  protected final String TEXT_167 = "Contract.COLUNA_";
  protected final String TEXT_168 = ", ";
  protected final String TEXT_169 = ");";
  protected final String TEXT_170 = NL + "\t\tvalores.put(";
  protected final String TEXT_171 = "Contract.COLUNA_";
  protected final String TEXT_172 = ", ";
  protected final String TEXT_173 = ");" + NL + "\t";
  protected final String TEXT_174 = NL + "\t\treturn valores;" + NL + "  \t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    
	AtributoWrapper atributoW = new AtributoWrapperAndroid();
	AtributoWrapper chaveW = new AtributoWrapperAndroid();
	chaveW.setBase(classe.getChave());
	

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
     for (ProcValorWrapper proc : classe.getListaDerivadaDemanda()) { 
    stringBuffer.append(TEXT_17);
    stringBuffer.append( proc.getTipo() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( proc.getNomeVariavel() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( proc.getTipo() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( proc.getNomePropriedade() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( proc.getNomeVariavel() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( proc.getNomePropriedade() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( proc.getTipo() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( proc.getNomeVariavel() );
    stringBuffer.append(TEXT_25);
     } 
    stringBuffer.append(TEXT_26);
    

	Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
	while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
	if (atributo instanceof AtributoWrapper) {	

    stringBuffer.append(TEXT_27);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_35);
    
	}
	if (atributo instanceof RelacionamentoWrapper) {
	RelacionamentoWrapper relac = (RelacionamentoWrapper) atributo;
	ClasseWrapper classeOposta = relac.getClasseOposta();

    stringBuffer.append(TEXT_36);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_48);
    
	}

    stringBuffer.append(TEXT_49);
    
	if (atributo.ehDecimal()) {

    stringBuffer.append(TEXT_50);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_52);
    
	}

    stringBuffer.append(TEXT_53);
    
	if (atributo.ehData()) {

    stringBuffer.append(TEXT_54);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_57);
    
	if (!atributo.ehHora()) {

    stringBuffer.append(TEXT_58);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_62);
    
}

    stringBuffer.append(TEXT_63);
    
	}
	if (atributo.ehHora()) {

    stringBuffer.append(TEXT_64);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_70);
    
	}
	}

    stringBuffer.append(TEXT_71);
    
		Iterator<RelacionamentoWrapper> itera = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (itera.hasNext()) {
		RelacionamentoWrapper relac = itera.next();
		
    stringBuffer.append(TEXT_72);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( relac.getNomeVariavel() );
    stringBuffer.append(TEXT_74);
    
		}
	
    stringBuffer.append(TEXT_75);
    
		Iterator<RelacionamentoWrapper> iterador01 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (iterador01.hasNext()) {
		RelacionamentoWrapper relac = iterador01.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_76);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
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
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( relac.getNomeVariavel() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_87);
     if (classeOposta.getId()!=classe.getId()) { 
    stringBuffer.append(TEXT_88);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_98);
     } 
    stringBuffer.append(TEXT_99);
    
		}
	
    stringBuffer.append(TEXT_100);
    
		Iterator<RelacionamentoWrapper> iteradorN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN.hasNext()) {
		RelacionamentoWrapper relac = iteradorN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_101);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_102);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_104);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( relac.getNomeRelacionamento() );
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
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_113);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_114);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_115);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_116);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_117);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_118);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_123);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_124);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_125);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_127);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_128);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_131);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_132);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_133);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_134);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_135);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_136);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_137);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_138);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_139);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_140);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_141);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_142);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_143);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_144);
    
		}
	
    stringBuffer.append(TEXT_145);
    
		Iterator<RelacionamentoWrapper> iterador1x1 = classe.obtemListaUmPraUm().iterator();
		while (iterador1x1.hasNext()) {
		RelacionamentoWrapper relac = iterador1x1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_146);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_147);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_148);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_149);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_150);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_151);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_152);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_153);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_154);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_155);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_156);
    
		}
	
    stringBuffer.append(TEXT_157);
    
    for (AtributoEntidade corrente : classe.getListaAtributoEntidade()) {
     	atributoW.setBase(corrente);
     	if (atributoW.ehData()) {
     		if (atributoW.ehHora()) {
    
    stringBuffer.append(TEXT_158);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_159);
    stringBuffer.append( atributoW.getNomeConstante() );
    stringBuffer.append(TEXT_160);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_161);
    		} else {   
    stringBuffer.append(TEXT_162);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_163);
    stringBuffer.append( atributoW.getNomeConstante() );
    stringBuffer.append(TEXT_164);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_165);
      	}  
    	} else {
    stringBuffer.append(TEXT_166);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_167);
    stringBuffer.append( atributoW.getNomeConstante() );
    stringBuffer.append(TEXT_168);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_169);
     }
    }
    for (RelacionamentoWrapper relCorrente : classe.obtemListaComChaveEstrangeiraComUsuario()) {
	
    stringBuffer.append(TEXT_170);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_171);
    stringBuffer.append( relCorrente.getNomeConstante() );
    stringBuffer.append(TEXT_172);
    stringBuffer.append( relCorrente.getNomeVariavel() );
    stringBuffer.append(TEXT_173);
    
	}
	
    stringBuffer.append(TEXT_174);
    return stringBuffer.toString();
  }
}
