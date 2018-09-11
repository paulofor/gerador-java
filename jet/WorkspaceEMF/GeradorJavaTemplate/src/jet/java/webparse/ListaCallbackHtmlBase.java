package jet.java.webparse;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class ListaCallbackHtmlBase
{
  protected static String nl;
  public static synchronized ListaCallbackHtmlBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ListaCallbackHtmlBase result = new ListaCallbackHtmlBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".parse.callback.basico;" + NL + "" + NL + "import java.net.MalformedURLException;" + NL + "import java.net.URL;" + NL + "import java.util.List;" + NL + "" + NL + "import br.com.digicom.parse.callback.CallbackParseHtml;" + NL + "import br.com.digicom.parse.callback.IDadosParse;" + NL + "import ";
  protected final String TEXT_3 = ".parse.dados.basico.";
  protected final String TEXT_4 = "DadosParseBase;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.";
  protected final String TEXT_6 = ";" + NL + "import br.com.digicom.parse.log.ArquivoLog;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_7 = "ListaCallbackHtmlBase  extends CallbackParseHtml{" + NL + "" + NL + "\tprotected ";
  protected final String TEXT_8 = "DadosParseBase dadosParse;" + NL + "\tprotected boolean ligaColetaLista = false;" + NL + "\tprotected List<";
  protected final String TEXT_9 = "> lista = null;" + NL + "\tprotected ";
  protected final String TEXT_10 = " corrente = null;" + NL + "\tprotected boolean loop = false;" + NL + "\t" + NL + "\tprotected String urlCorrente = null;" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic URL getJsonUrl() throws MalformedURLException {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t// Se a pagina estiver com erro de acentos e precisa usar um versao de charset diferente." + NL + "\t// Possibilidades: CallbackParseHtml.HTML4_CHARSET ou CallbackParseHtml.HTML5_CHARSET" + NL + "\t@Override" + NL + "\tpublic String getCharSet() {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "\tprotected String getUrlPrefixo() {" + NL + "\t\treturn \"\";" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic final URL getUrl() throws MalformedURLException {" + NL + "\t\t//if (urlCorrente==null)" + NL + "\t\turlCorrente = dadosParse.getUrlLista();" + NL + "\t\tif (urlCorrente.indexOf(\"http\")==-1)" + NL + "\t\t\tif (urlCorrente.indexOf(0)!='/')" + NL + "\t\t\t\turlCorrente = getUrlPrefixo() + \"/\" + urlCorrente;" + NL + "\t\t\telse" + NL + "\t\t\t\turlCorrente = getUrlPrefixo() + urlCorrente;" + NL + "\t\tURL url = new URL(urlCorrente);" + NL + "\t\treturn url;" + NL + "\t}" + NL + "" + NL + "" + NL + "\t@Override" + NL + "\tpublic final void setDados(IDadosParse paramIDadosParse) {" + NL + "\t\tdadosParse = (";
  protected final String TEXT_11 = "DadosParseBase) paramIDadosParse;" + NL + "\t}" + NL + "" + NL + "\t" + NL + "" + NL + "\t@Override" + NL + "\tpublic final void finalizacaoErro() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\tArquivoLog.getInstancia().salvaLog(\" *** Finalizacao com erro ***\");" + NL + "\t\t//if (lista==null) throw new RuntimeException(\"objeto lista em ";
  protected final String TEXT_12 = "DetalheCallbackHtmlBase esta null\");" + NL + "\t\tdadosParse.finalizacaoOkLista();" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic final void finalizacaoOk() {" + NL + "\t\t//if (lista==null) throw new RuntimeException(\"objeto lista em ";
  protected final String TEXT_13 = "ListaCallbackHtmlBase esta null\");" + NL + "\t\tdadosParse.finalizacaoOkLista();" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic final void inicializacao() {" + NL + "\t\t//if (lista!=null) " + NL + "\t\t//\tlista.clear();" + NL + "\t\tSystem.out.println(\"Parser: \" + this.getClass().getSimpleName());" + NL + "\t\tinicializacaoPagina();" + NL + "\t\tdadosParse.inicializacaoLista();" + NL + "\t}" + NL + "\tprotected void inicializacaoPagina() {" + NL + "\t\t" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic final boolean getLoop() {" + NL + "\t\treturn loop;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic boolean isPost() {" + NL + "\t\treturn false;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic List camposPost() {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "\tprotected final float extraiValorPreco(String valor) {" + NL + "\t\tint ini, fimtexto;" + NL + "\t\tif (valor==null) return 0;" + NL + "\t\tif (valor.indexOf(\",\")==-1 && valor.indexOf(\".\")!=-1) {" + NL + "\t\t\tvalor = valor.replace('.', ',');" + NL + "\t\t}" + NL + "\t\tini = valor.indexOf(\"$\");" + NL + "\t\tfimtexto = valor.indexOf(\",\") + 3;" + NL + "\t\tvalor = valor.substring(ini+1,fimtexto).trim();" + NL + "\t\tvalor = valor.replace(\".\",\"\");" + NL + "\t\tvalor = valor.replace(',', '.');" + NL + "\t\treturn Float.valueOf(valor);" + NL + "\t}" + NL + "}";

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
    return stringBuffer.toString();
  }
}
