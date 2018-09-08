package jet.java.webparse;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class DetalheCallbackHtmlBase
{
  protected static String nl;
  public static synchronized DetalheCallbackHtmlBase create(String lineSeparator)
  {
    nl = lineSeparator;
    DetalheCallbackHtmlBase result = new DetalheCallbackHtmlBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".parse.callback.basico;" + NL + "" + NL + "import java.net.MalformedURLException;" + NL + "import java.net.URL;" + NL + "import java.util.List;" + NL + "" + NL + "import br.com.digicom.parse.callback.CallbackParseHtml;" + NL + "import br.com.digicom.parse.callback.IDadosParse;" + NL + "import ";
  protected final String TEXT_3 = ".parse.dados.basico.";
  protected final String TEXT_4 = "DadosParseBase;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.";
  protected final String TEXT_6 = ";" + NL + "import ";
  protected final String TEXT_7 = ".log.ArquivoLog;" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_8 = "DetalheCallbackHtmlBase  extends CallbackParseHtml{" + NL + "" + NL + "\tprotected ";
  protected final String TEXT_9 = "DadosParseBase dadosParse;" + NL + "\tprotected boolean ligaColetaLista = false;" + NL + "\tprotected String urlCorrente = null;" + NL + "\tprotected boolean loop = false;" + NL + "\tprivate String urlOrigem = null;" + NL + "\t" + NL + "\t" + NL + "\t// Se a pagina estiver com erro de acentos e precisa usar um versao de charset diferente." + NL + "\t// Possibilidades: CallbackParseHtml.HTML4_CHARSET ou CallbackParseHtml.HTML5_CHARSET" + NL + "\t@Override" + NL + "\tpublic String getCharSet() {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t" + NL + "\tprotected String getUrlPrefixo() {" + NL + "\t\treturn \"\";" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic final URL getUrl() throws MalformedURLException {" + NL + "\t\tif (urlCorrente==null)" + NL + "\t\t\turlCorrente = dadosParse.getUrlDetalhe();" + NL + "\t\tif (urlCorrente.indexOf(\"http\")==-1)" + NL + "\t\t\tif (urlCorrente.indexOf(0)!='/')" + NL + "\t\t\t\turlCorrente = getUrlPrefixo() + \"/\" + urlCorrente;" + NL + "\t\t\telse" + NL + "\t\t\t\turlCorrente = getUrlPrefixo() + urlCorrente;" + NL + "\t\turlOrigem = urlCorrente;" + NL + "\t\tURL url = new URL(urlCorrente);" + NL + "\t\treturn url;" + NL + "\t}" + NL + "\t" + NL + "\tprotected String getUrlOrigem() {" + NL + "\t\treturn urlOrigem;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic final void setDados(IDadosParse paramIDadosParse) {" + NL + "\t\tdadosParse = (";
  protected final String TEXT_10 = "DadosParseBase) paramIDadosParse;" + NL + "\t\tArquivoLog.getInstancia().salvaLog(\"";
  protected final String TEXT_11 = "(detalhe):\"  + dadosParse.displayLog(dadosParse.getItemDetalhe()));" + NL + "\t}" + NL + "" + NL + "\t" + NL + "" + NL + "\t@Override" + NL + "\tpublic final void finalizacaoErro() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic final void finalizacaoOk() {" + NL + "\t\t//if (lista==null) throw new RuntimeException(\"objeto lista em ";
  protected final String TEXT_12 = "ListaCallbackHtmlBase esta null\");" + NL + "\t\tfinalizaObjeto();" + NL + "\t\tdadosParse.finalizacaoOkDetalhe();" + NL + "\t\tlimpaListasInternas();" + NL + "\t}" + NL + "\tprotected void finalizaObjeto() {" + NL + "\t}" + NL + "\tprivate void limpaListasInternas() {" + NL + "\t";
  protected final String TEXT_13 = NL + "\t\tthis.dadosParse.getItemDetalhe().setLista";
  protected final String TEXT_14 = "_";
  protected final String TEXT_15 = "(null);" + NL + " \t";
  protected final String TEXT_16 = NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic void inicializacao() {" + NL + "\t\tSystem.out.println(\"Parser: \" + this.getClass().getSimpleName());" + NL + "\t\tdadosParse.inicializacaoDetalhe();" + NL + "\t\tloop = false;" + NL + "\t\turlCorrente = null;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic final boolean getLoop() {" + NL + "\t\treturn loop;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic final boolean isPost() {" + NL + "\t\treturn (dadosParse.camposPost()!=null);" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic final List camposPost() {" + NL + "\t\treturn dadosParse.camposPost();" + NL + "\t}" + NL + "" + NL + "\t" + NL + "\tprotected final float extraiValorPreco(String valor) {" + NL + "\t\tint ini, fimtexto;" + NL + "\t\tif (valor==null) return 0;" + NL + "\t\tif (valor.indexOf(\",\")==-1 && valor.indexOf(\".\")!=-1) {" + NL + "\t\t\tvalor = valor.replace('.', ',');" + NL + "\t\t}" + NL + "\t\tini = valor.indexOf(\"$\");" + NL + "\t\tfimtexto = valor.indexOf(\",\") + 3;" + NL + "\t\tvalor = valor.substring(ini+1,fimtexto).trim();" + NL + "\t\tvalor = valor.replace(\".\",\"\");" + NL + "\t\tvalor = valor.replace(',', '.');" + NL + "\t\treturn Float.valueOf(valor);" + NL + "\t}" + NL + "\t" + NL + "\tprotected final int extraiParcelas(String parcelamento) {" + NL + "\t\tif (parcelamento==null) return 0;" + NL + "\t\tint posicao = parcelamento.toLowerCase().indexOf(\"x\");" + NL + "\t\tString parcelas = parcelamento.substring(0,posicao).trim();" + NL + "\t\tparcelas = this.retiraLetras(parcelas);" + NL + "\t\tint qtde = Integer.parseInt(parcelas);" + NL + "\t\treturn qtde;" + NL + "\t}" + NL + "\tprotected final float extraiValorParcelas(String parcelamento) {" + NL + "\t\tif (parcelamento==null) return 0;" + NL + "\t\tparcelamento = retiraLetras(parcelamento);" + NL + "\t\treturn this.extraiValorPreco(parcelamento);" + NL + "\t}" + NL + "\t" + NL + "\tprivate String retiraLetras(String texto) {" + NL + "\t\tString saida = \"\";" + NL + "\t\tfor (int i=0;i<texto.length();i++) {" + NL + "\t\t\tif (texto.substring(i, i+1).matches(\"[0-9]\") || texto.charAt(i)=='.' ||  texto.charAt(i)==',')" + NL + "\t\t\t\tsaida += texto.substring(i, i+1);" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
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
    
	Iterator<RelacionamentoWrapper> iteradorN = classe.obtemListaSemChaveEstrangeira().iterator();
	while (iteradorN.hasNext()) {
	RelacionamentoWrapper relac = iteradorN.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_15);
    
	}
	
    stringBuffer.append(TEXT_16);
    return stringBuffer.toString();
  }
}
