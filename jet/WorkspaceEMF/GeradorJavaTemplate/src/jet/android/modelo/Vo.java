package jet.android.modelo;

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
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo.vo;" + NL + "" + NL + "import android.view.View;" + NL + "import java.sql.Timestamp;" + NL + "import java.text.DateFormat;" + NL + "import java.text.ParseException;" + NL + "import java.text.SimpleDateFormat;" + NL + "import java.util.Date;" + NL + "import java.util.List;" + NL + "import org.json.JSONObject;" + NL + "import org.json.JSONArray;" + NL + "import org.json.JSONException;" + NL + "import br.com.digicom.log.DCLog;" + NL + "import br.com.digicom.modelo.ObjetoSinc;" + NL + "import br.com.digicom.util.ConversorJson;" + NL + "import br.com.digicom.activity.DigicomContexto;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.agregado.";
  protected final String TEXT_5 = "Agregado;" + NL + "import ";
  protected final String TEXT_6 = ".modelo.derivada.impl.";
  protected final String TEXT_7 = "Derivada;" + NL + "import ";
  protected final String TEXT_8 = ".modelo.display.impl.";
  protected final String TEXT_9 = "Display;" + NL + "import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_10 = "Vo implements ";
  protected final String TEXT_11 = " , ObjetoSinc{ " + NL + "  " + NL + "  " + NL + "  \tpublic long getIdObj()" + NL + "    {" + NL + "       return ";
  protected final String TEXT_12 = ";" + NL + "    }" + NL + "  " + NL + "  " + NL + "  \tprivate DigicomContexto _contexto = null;" + NL + "    public DigicomContexto getContexto() {" + NL + "    \tif (_contexto==null) " + NL + "    \t\tthrow new RuntimeException(\"DigicomContexto n?o inicializado\");" + NL + "    \treturn _contexto;" + NL + "    }" + NL + "  \tpublic void setContexto(DigicomContexto ctx) {" + NL + "  \t\t_contexto = ctx;" + NL + "  \t}" + NL + "  \t" + NL + "  " + NL + "  \tpublic ";
  protected final String TEXT_13 = "Vo() {" + NL + "  \t}" + NL + "   \t// -----  Inicio JSON -----" + NL + "  \tprivate String JsonAtributosOld() {" + NL + "\t\treturn " + NL + "\t\t";
  protected final String TEXT_14 = " \\\"";
  protected final String TEXT_15 = "\\\" : \\\"\" + ";
  protected final String TEXT_16 = " + \"\\\" \"" + NL + "\t\t";
  protected final String TEXT_17 = NL + "\t;" + NL + "\t}" + NL + "\tprivate JSONObject JSonAtributos() throws JSONException{" + NL + "\t\tJSONObject json = new JSONObject();" + NL + "\t\t//try {" + NL + "\t\t";
  protected final String TEXT_18 = "\tjson.put(\"";
  protected final String TEXT_19 = "\",";
  protected final String TEXT_20 = ");" + NL + "\t\t";
  protected final String TEXT_21 = NL + "\t\t//} catch (JSONException e) {" + NL + "\t\t//\tDCLog.e(\"JSONTag\", this, e);" + NL + "\t\t//}" + NL + "\t\treturn json;" + NL + "\t}" + NL + "" + NL + "\tpublic JSONObject JSonSimples() throws JSONException{" + NL + "\t\treturn JSonAtributos();" + NL + "\t}" + NL + "" + NL + "\t// apagar em 04-05-2015" + NL + "\t/**" + NL + " \t* @deprecated  Substituir por JSonSimples()" + NL + " \t*/" + NL + "\t@Deprecated" + NL + "\tpublic JSONObject JSon() throws JSONException{" + NL + "\t\tJSONObject json = JSonAtributos();" + NL + "\t\t//try {" + NL + "\t";
  protected final String TEXT_22 = "\tJSONArray lista";
  protected final String TEXT_23 = "_";
  protected final String TEXT_24 = " = JSonLista";
  protected final String TEXT_25 = "_";
  protected final String TEXT_26 = "();" + NL + "\t\tif (lista";
  protected final String TEXT_27 = "_";
  protected final String TEXT_28 = "!=null) {" + NL + "\t\t\tjson.put(\"Lista";
  protected final String TEXT_29 = "Vo_";
  protected final String TEXT_30 = "\",lista";
  protected final String TEXT_31 = "_";
  protected final String TEXT_32 = ");" + NL + "\t\t} " + NL + "\t";
  protected final String TEXT_33 = NL + "\t\t//} catch (JSONException e) {" + NL + "\t\t//\tDCLog.e(\"JSONTag\", this, e);" + NL + "\t\t//}" + NL + "\t\treturn json;" + NL + "\t}" + NL + "" + NL + "" + NL + "\t// SemChaveEstrangeira" + NL + "\t";
  protected final String TEXT_34 = NL + "\tprivate JSONArray JSonLista";
  protected final String TEXT_35 = "_";
  protected final String TEXT_36 = "() throws JSONException{" + NL + "\t\tif (getLista";
  protected final String TEXT_37 = "_";
  protected final String TEXT_38 = "()==null) return null;" + NL + "\t\tJSONArray lista = new JSONArray();" + NL + "\t\tfor (";
  protected final String TEXT_39 = " item:this.getLista";
  protected final String TEXT_40 = "_";
  protected final String TEXT_41 = "Original()) {" + NL + "\t\t\tlista.put(((ObjetoSinc)item).JSonSinc());" + NL + "\t\t\t//lista.put(item.JSon());" + NL + "\t\t}" + NL + "\t\treturn lista;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_42 = NL + "  \t// -----  Final JSon -----------" + NL + " " + NL + " " + NL + " \tpublic String debug() {" + NL + "\t\treturn " + NL + "\t\t";
  protected final String TEXT_43 = " \" ";
  protected final String TEXT_44 = "=\" + get";
  protected final String TEXT_45 = "() " + NL + "\t\t";
  protected final String TEXT_46 = NL + "\t;" + NL + "\t}" + NL + " " + NL + " " + NL + " \t// ---------  Metodos DCIObjeto ----------------" + NL + " \t" + NL + " \tpublic long getId() {" + NL + " \t\treturn ";
  protected final String TEXT_47 = ";" + NL + " \t}" + NL + " \tpublic String getNomeClasse() {" + NL + " \t\treturn \"";
  protected final String TEXT_48 = "\";" + NL + " \t}" + NL + " \t// ---------------------------------------------" + NL + " " + NL + " " + NL + "    // ----- INICIO DISPLAY -----------------" + NL + "\tprivate ";
  protected final String TEXT_49 = "Display display = null;" + NL + "\tprivate ";
  protected final String TEXT_50 = "Display getObjetoDisplay() {" + NL + "\t\tif (display==null) {" + NL + "\t\t\tdisplay = new ";
  protected final String TEXT_51 = "Display(this);" + NL + "\t\t}" + NL + "\t\treturn display;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic View getItemListaView() {" + NL + "\t\treturn getObjetoDisplay().getItemListaView();" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic String getItemListaTexto() {" + NL + "\t\treturn getObjetoDisplay().getItemListaTexto();" + NL + "\t}" + NL + "\t// ----- FINAL DISPLAY -----------------" + NL + " " + NL + "    // ----- INICIO AGREGADO -----------------" + NL + "\tprivate ";
  protected final String TEXT_52 = "Agregado agregado = null;" + NL + "\tprivate ";
  protected final String TEXT_53 = "Agregado getAgregado() {" + NL + "\t\tif (agregado==null) {" + NL + "\t\t\tagregado = new ";
  protected final String TEXT_54 = "Agregado(this);" + NL + "\t\t}" + NL + "\t\treturn agregado;" + NL + "\t}" + NL + "\t// ----- FINAL AGREGADO -----------------" + NL + "\t" + NL + "\t// ----- INICIO DERIVADA -----------------" + NL + "\tprivate ";
  protected final String TEXT_55 = "Derivada derivada = null;" + NL + "\tprivate ";
  protected final String TEXT_56 = "Derivada getDerivada() {" + NL + "\t\tif (derivada==null) {" + NL + "\t\t\tderivada = new ";
  protected final String TEXT_57 = "Derivada(this);" + NL + "\t\t}" + NL + "\t\treturn derivada;" + NL + "\t}" + NL + "\tpublic String getTituloTela()" + NL + "\t{" + NL + "\t\treturn getDerivada().getTituloTela(); " + NL + "\t} " + NL + "\t";
  protected final String TEXT_58 = NL + "\tpublic ";
  protected final String TEXT_59 = " get";
  protected final String TEXT_60 = "()" + NL + "\t{" + NL + "\t\treturn getDerivada().get";
  protected final String TEXT_61 = "(); " + NL + "\t} " + NL + "\tpublic void set";
  protected final String TEXT_62 = "(";
  protected final String TEXT_63 = " value)" + NL + "\t{" + NL + "\t\tgetDerivada().set";
  protected final String TEXT_64 = "(value); " + NL + "\t} " + NL + "\t";
  protected final String TEXT_65 = NL + "\t// Tela" + NL + "\tpublic String get";
  protected final String TEXT_66 = "Tela()" + NL + "\t{" + NL + "\t\treturn getDerivada().get";
  protected final String TEXT_67 = "Tela(); " + NL + "\t} " + NL + "\t";
  protected final String TEXT_68 = NL + "\t" + NL + "\t// ----- FINAL DERIVADA -----------------" + NL + "\t" + NL + "\t" + NL + "\t" + NL + " " + NL + "  " + NL + "  " + NL + "  \t// ------ AGREGADOS 2-------------------" + NL + "  \t// ComChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_69 = NL + "\t\tpublic ";
  protected final String TEXT_70 = " get";
  protected final String TEXT_71 = "_";
  protected final String TEXT_72 = "() {" + NL + "\t\t\treturn getAgregado().get";
  protected final String TEXT_73 = "_";
  protected final String TEXT_74 = "();" + NL + "\t\t}" + NL + "\t\tpublic void set";
  protected final String TEXT_75 = "_";
  protected final String TEXT_76 = "(";
  protected final String TEXT_77 = " item) {" + NL + "\t\t\tgetAgregado().set";
  protected final String TEXT_78 = "_";
  protected final String TEXT_79 = "(item);" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_80 = NL + "\t\tpublic void addLista";
  protected final String TEXT_81 = "_";
  protected final String TEXT_82 = "(";
  protected final String TEXT_83 = " item) {" + NL + "\t\t\tgetAgregado().addLista";
  protected final String TEXT_84 = "_";
  protected final String TEXT_85 = "(item);" + NL + "\t\t}" + NL + "\t\tpublic ";
  protected final String TEXT_86 = " getCorrente";
  protected final String TEXT_87 = "_";
  protected final String TEXT_88 = "() {" + NL + "\t\t\treturn getAgregado().getCorrente";
  protected final String TEXT_89 = "_";
  protected final String TEXT_90 = "();" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_91 = NL + "\t\t";
  protected final String TEXT_92 = NL + "\t" + NL + "\t// SemChaveEstrangeira" + NL + "\t";
  protected final String TEXT_93 = NL + "\t\tpublic ";
  protected final String TEXT_94 = " getCorrente";
  protected final String TEXT_95 = "_";
  protected final String TEXT_96 = "() {" + NL + "\t\t\treturn getAgregado().getCorrente";
  protected final String TEXT_97 = "_";
  protected final String TEXT_98 = "();" + NL + "\t\t}" + NL + "\t\tpublic void addLista";
  protected final String TEXT_99 = "_";
  protected final String TEXT_100 = "(";
  protected final String TEXT_101 = " item) {" + NL + "\t\t\tgetAgregado().addLista";
  protected final String TEXT_102 = "_";
  protected final String TEXT_103 = "(item);" + NL + "\t\t}" + NL + "\t\tpublic List<";
  protected final String TEXT_104 = "> getLista";
  protected final String TEXT_105 = "_";
  protected final String TEXT_106 = "() {" + NL + "\t\t\treturn getAgregado().getLista";
  protected final String TEXT_107 = "_";
  protected final String TEXT_108 = "();" + NL + "\t\t}" + NL + "\t\tpublic List<";
  protected final String TEXT_109 = "> getLista";
  protected final String TEXT_110 = "_";
  protected final String TEXT_111 = "Original() {" + NL + "\t\t\treturn getAgregado().getLista";
  protected final String TEXT_112 = "_";
  protected final String TEXT_113 = "Original();" + NL + "\t\t}" + NL + "\t\tpublic List<";
  protected final String TEXT_114 = "> getLista";
  protected final String TEXT_115 = "_";
  protected final String TEXT_116 = "(int qtde) {" + NL + "\t\t\treturn getAgregado().getLista";
  protected final String TEXT_117 = "_";
  protected final String TEXT_118 = "(qtde);" + NL + "\t\t}" + NL + "\t\tpublic void setLista";
  protected final String TEXT_119 = "_";
  protected final String TEXT_120 = "(List<";
  protected final String TEXT_121 = "> lista) {" + NL + "\t\t\tgetAgregado().setLista";
  protected final String TEXT_122 = "_";
  protected final String TEXT_123 = "(lista);" + NL + "\t\t}" + NL + "\t\tpublic void setLista";
  protected final String TEXT_124 = "_";
  protected final String TEXT_125 = "ByDao(List<";
  protected final String TEXT_126 = "> lista) {" + NL + "\t\t\tgetAgregado().setLista";
  protected final String TEXT_127 = "_";
  protected final String TEXT_128 = "ByDao(lista);" + NL + "\t\t}" + NL + "\t\tpublic void criaVaziaLista";
  protected final String TEXT_129 = "_";
  protected final String TEXT_130 = "() {" + NL + "\t\t\tgetAgregado().criaVaziaLista";
  protected final String TEXT_131 = "_";
  protected final String TEXT_132 = "();" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\tpublic boolean existeLista";
  protected final String TEXT_133 = "_";
  protected final String TEXT_134 = "() {" + NL + "\t\t\treturn getAgregado().existeLista";
  protected final String TEXT_135 = "_";
  protected final String TEXT_136 = "();" + NL + "\t\t}" + NL + " \t\t";
  protected final String TEXT_137 = NL + "\t" + NL + "\t// UmPraUm" + NL + "\t";
  protected final String TEXT_138 = NL + "\t\tpublic ";
  protected final String TEXT_139 = " get";
  protected final String TEXT_140 = "_";
  protected final String TEXT_141 = "() {" + NL + "\t\t\treturn getAgregado().get";
  protected final String TEXT_142 = "_";
  protected final String TEXT_143 = "();" + NL + "\t\t}" + NL + "\t\tpublic void set";
  protected final String TEXT_144 = "_";
  protected final String TEXT_145 = "(";
  protected final String TEXT_146 = " item) {" + NL + "\t\t\tgetAgregado().set";
  protected final String TEXT_147 = "_";
  protected final String TEXT_148 = "(item);" + NL + "\t\t}" + NL + " \t\t";
  protected final String TEXT_149 = NL + "  \t" + NL + "  \t" + NL + "  \t// ------ FINAL AGREGADOS -------------" + NL + "  " + NL + "  " + NL + "  \tpublic ";
  protected final String TEXT_150 = "Vo(JSONObject json) throws JSONException{";
  protected final String TEXT_151 = NL + "\t\t";
  protected final String TEXT_152 = " =  ConversorJson.get";
  protected final String TEXT_153 = "(json, \"";
  protected final String TEXT_154 = "\");";
  protected final String TEXT_155 = NL + "  \t}";
  protected final String TEXT_156 = NL + "  \tpublic String toString() {" + NL + "  \t\treturn \"\" + ";
  protected final String TEXT_157 = ";" + NL + "  \t}";
  protected final String TEXT_158 = NL + "\tprivate ";
  protected final String TEXT_159 = " ";
  protected final String TEXT_160 = ";" + NL + "\tpublic ";
  protected final String TEXT_161 = " get";
  protected final String TEXT_162 = "() {" + NL + "\t\treturn ";
  protected final String TEXT_163 = ";" + NL + "\t}" + NL + "\tpublic void set";
  protected final String TEXT_164 = "(";
  protected final String TEXT_165 = " _valor) {" + NL + "\t\t";
  protected final String TEXT_166 = " = _valor;" + NL + "\t}";
  protected final String TEXT_167 = "\t" + NL + "\tprivate ";
  protected final String TEXT_168 = " ";
  protected final String TEXT_169 = ";" + NL + "\tpublic ";
  protected final String TEXT_170 = " get";
  protected final String TEXT_171 = "() {" + NL + "\t\t// relacionamento" + NL + "\t\tif (";
  protected final String TEXT_172 = "==0 && this.get";
  protected final String TEXT_173 = "_";
  protected final String TEXT_174 = "()!=null) " + NL + "\t\t\treturn get";
  protected final String TEXT_175 = "_";
  protected final String TEXT_176 = "().getId();" + NL + "\t\telse" + NL + "\t\t\treturn ";
  protected final String TEXT_177 = ";" + NL + "\t}" + NL + "\tpublic void set";
  protected final String TEXT_178 = "(";
  protected final String TEXT_179 = " _valor) {" + NL + "\t\t";
  protected final String TEXT_180 = " = _valor;" + NL + "\t}";
  protected final String TEXT_181 = NL;
  protected final String TEXT_182 = "\t" + NL + "\tpublic String get";
  protected final String TEXT_183 = "Tela() {" + NL + "\t\treturn String.format(\"%.2f\",";
  protected final String TEXT_184 = ").replace(\".\", \",\");" + NL + "\t}";
  protected final String TEXT_185 = NL;
  protected final String TEXT_186 = NL + "\tpublic String get";
  protected final String TEXT_187 = "DDMMAAAA() {" + NL + "\t\tif (";
  protected final String TEXT_188 = "==null) return null;" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"dd/MM/yyyy\");" + NL + "        return formato.format(";
  protected final String TEXT_189 = ");" + NL + "    }";
  protected final String TEXT_190 = NL + "    public void set";
  protected final String TEXT_191 = "DDMMAAAAComBarra(String arg) {" + NL + "    \tDateFormat formatter = new SimpleDateFormat(\"dd/MM/yyyy\");" + NL + "\t\tDate date;" + NL + "\t\ttry {" + NL + "\t\t\tdate = formatter.parse(arg);" + NL + "\t\t\t";
  protected final String TEXT_192 = " = new Timestamp(date.getTime());" + NL + "\t\t} catch (ParseException e) {" + NL + "\t\t\tDCLog.e(DCLog.MODELO, this, e);" + NL + "\t\t}" + NL + "    }";
  protected final String TEXT_193 = NL + NL + NL + NL;
  protected final String TEXT_194 = NL + "\tpublic String get";
  protected final String TEXT_195 = "HHMM() {" + NL + "\t\tif (";
  protected final String TEXT_196 = "==null) return null;" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"HH:mm\");" + NL + "        return formato.format(";
  protected final String TEXT_197 = ");" + NL + "    }" + NL + "    public String get";
  protected final String TEXT_198 = "HHMMSS() {" + NL + "\t\tif (";
  protected final String TEXT_199 = "==null) return null;" + NL + "        SimpleDateFormat formato = new SimpleDateFormat(\"HH:mm:ss\");" + NL + "        return formato.format(";
  protected final String TEXT_200 = ");" + NL + "    }";
  protected final String TEXT_201 = NL + NL + NL + NL + "\tprivate String operacaoSinc = null;" + NL + "\t@Override" + NL + "\tpublic String getOperacaoSinc() {" + NL + "\t\treturn operacaoSinc;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic void setOperacaoSinc(String valor) {" + NL + "\t\toperacaoSinc = valor;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic JSONObject JSonSinc() throws JSONException {" + NL + "\t\tJSONObject json = JSonSimples();" + NL + "\t\tjson.put(\"OperacaoSinc\", operacaoSinc);" + NL + "\t\treturn json;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tprivate boolean salvaPreliminar = false;" + NL + "\t@Override" + NL + "\tpublic void setSalvaPreliminar(boolean valor) {" + NL + "\t\tsalvaPreliminar = valor;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic boolean getSalvaPreliminar() {" + NL + "\t\treturn salvaPreliminar;" + NL + "\t}" + NL + "\t" + NL + "\t// ComChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_202 = NL + "\tpublic long get";
  protected final String TEXT_203 = "LazyLoader() {" + NL + "\t\treturn ";
  protected final String TEXT_204 = ";" + NL + "\t} " + NL + "\t\t";
  protected final String TEXT_205 = NL + "\t" + NL + "\t" + NL + "\tprivate boolean somenteMemoria = true;" + NL + "\t@Override" + NL + "\tpublic boolean getSomenteMemoria() {" + NL + "\t\treturn somenteMemoria;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic void setSomenteMemoria(boolean dado) {" + NL + "\t\tsomenteMemoria = dado;" + NL + "\t} " + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    
		Iterator<AtributoTotalI> iteradorAtt = classe.getListaAtributoTotal().iterator();
		boolean primeiro1 = true;
		while (iteradorAtt.hasNext()) {
		AtributoTotalI atributoJson = iteradorAtt.next();
		
    stringBuffer.append( (primeiro1?"\"":"+ \",") );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( atributoJson.getNomeVariavel() );
    stringBuffer.append(TEXT_16);
    
		primeiro1 = false;
		}
		
    stringBuffer.append(TEXT_17);
    
		Iterator<AtributoTotalI> iteradorAtt1 = classe.getListaAtributoTotal().iterator();
		while (iteradorAtt1.hasNext()) {
		AtributoTotalI atributoJson = iteradorAtt1.next();
		
    stringBuffer.append(TEXT_18);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( atributoJson.getNomeVariavel() );
    stringBuffer.append(TEXT_20);
    
		}
		
    stringBuffer.append(TEXT_21);
    
		Iterator<RelacionamentoWrapper> iteradorN2 = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN2.hasNext()) {
		RelacionamentoWrapper relac = iteradorN2.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_32);
    
		}
	
    stringBuffer.append(TEXT_33);
    
		Iterator<RelacionamentoWrapper> iteradorN1 = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN1.hasNext()) {
		RelacionamentoWrapper relac = iteradorN1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_41);
    
		}
	
    stringBuffer.append(TEXT_42);
    
		Iterator<AtributoTotalI> iteradorAtt2 = classe.getListaAtributoTotal().iterator();
		primeiro1 = true;
		while (iteradorAtt2.hasNext()) {
		AtributoTotalI atributoJson = iteradorAtt2.next();
		
    stringBuffer.append( (primeiro1?"":"+ ") );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_45);
    
		primeiro1 = false;
		}
		
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
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
    
	ProcValorWrapper procValor = new ProcValorWrapperAndroid();
	Iterator<ProcValor> iterador2 = classe.getListaProcValor().iterator();
	while (iterador2.hasNext()) {
		procValor.setProcValor(iterador2.next());
	
    stringBuffer.append(TEXT_58);
    stringBuffer.append( procValor.getTipo() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( procValor.getTipo() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_64);
     if (procValor.ehPercentual() || procValor.ehDecimal()) { 
    stringBuffer.append(TEXT_65);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( procValor.getNomePropriedade() );
    stringBuffer.append(TEXT_67);
     }
	}
	
    stringBuffer.append(TEXT_68);
    
		Iterator<RelacionamentoWrapper> iterador01 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (iterador01.hasNext()) {
		RelacionamentoWrapper relac = iterador01.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_69);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_79);
     if (classeOposta.getId()!=classe.getId()) { 
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
    
		}
	
    stringBuffer.append(TEXT_92);
    
		Iterator<RelacionamentoWrapper> iteradorN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN.hasNext()) {
		RelacionamentoWrapper relac = iteradorN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
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
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_100);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_101);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_102);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
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
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_123);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_124);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_125);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_127);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_128);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_131);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_132);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_133);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_134);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_135);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_136);
    
		}
	
    stringBuffer.append(TEXT_137);
    
		Iterator<RelacionamentoWrapper> iterador1x1 = classe.obtemListaUmPraUm().iterator();
		while (iterador1x1.hasNext()) {
		RelacionamentoWrapper relac = iterador1x1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_138);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_139);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_140);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_141);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_142);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_143);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_144);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_145);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_146);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_147);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_148);
    
		}
	
    stringBuffer.append(TEXT_149);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_150);
    
	Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
	while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();

    stringBuffer.append(TEXT_151);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_152);
    stringBuffer.append( atributo.getCastTipoJson() );
    stringBuffer.append(TEXT_153);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_154);
    
	}

    stringBuffer.append(TEXT_155);
    
	AtributoWrapper atributoW = new AtributoWrapperAndroid();
	AtributoEntidade ident = classe.getIdentificador();
	if (ident!=null) {
		atributoW.setBase(ident);

    stringBuffer.append(TEXT_156);
    stringBuffer.append( atributoW.getNomeVariavel() );
    stringBuffer.append(TEXT_157);
    
	}
	iterador = classe.getListaAtributoTotal().iterator();
	while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
	if (atributo instanceof AtributoWrapper) {	

    stringBuffer.append(TEXT_158);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_159);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_160);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_161);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_162);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_163);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_164);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_165);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_166);
    
	}
	if (atributo instanceof RelacionamentoWrapper) {
	RelacionamentoWrapper relac = (RelacionamentoWrapper) atributo;
	ClasseWrapper classeOposta = relac.getClasseOposta();

    stringBuffer.append(TEXT_167);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_168);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_169);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_170);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_171);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_172);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_173);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_174);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_175);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_176);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_177);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_178);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_179);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_180);
    
	}

    stringBuffer.append(TEXT_181);
    
	if (atributo.ehDecimal()) {

    stringBuffer.append(TEXT_182);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_183);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_184);
    
	}

    stringBuffer.append(TEXT_185);
    
	if (atributo.ehData()) {

    stringBuffer.append(TEXT_186);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_187);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_188);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_189);
    
	if (!atributo.ehHora()) {

    stringBuffer.append(TEXT_190);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_191);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_192);
    
}

    stringBuffer.append(TEXT_193);
    
	}
	if (atributo.ehHora()) {

    stringBuffer.append(TEXT_194);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_195);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_196);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_197);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_198);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_199);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_200);
    
	}
	}

    stringBuffer.append(TEXT_201);
    
		Iterator<RelacionamentoWrapper> itera = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (itera.hasNext()) {
		RelacionamentoWrapper relac = itera.next();
		
    stringBuffer.append(TEXT_202);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_203);
    stringBuffer.append( relac.getNomeVariavel() );
    stringBuffer.append(TEXT_204);
    
		}
	
    stringBuffer.append(TEXT_205);
    return stringBuffer.toString();
  }
}
