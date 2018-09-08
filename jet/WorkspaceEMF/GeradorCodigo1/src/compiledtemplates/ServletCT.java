package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class ServletCT
{
  protected static String nl;
  public static synchronized ServletCT create(String lineSeparator)
  {
    nl = lineSeparator;
    ServletCT result = new ServletCT();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package com.br.brasilcap.";
  protected final String TEXT_2 = ".";
  protected final String TEXT_3 = ".";
  protected final String TEXT_4 = ".servlet;" + NL + "import com.br.brasilcap.arq.glb.util.view.AbstractServletCT;" + NL + "import com.br.brasilcap.arq.glb.util.standard.CatalogoGlobal;" + NL + "import com.br.brasilcap.arq.glb.util.view.FormBean;" + NL + "" + NL + "public class ";
  protected final String TEXT_5 = "CT extends  AbstractServletCT" + NL + "{" + NL + "" + NL + "private static final String CONTENT_TYPE = \"text/html; charset=iso-8859-1\";" + NL + "" + NL + "public String getNomeModulo()" + NL + "{" + NL + "return CatalogoGlobal.CST_MODULO_OBRIGACAO_LEGAL;" + NL + "}";
  protected final String TEXT_6 = NL + "\t/**" + NL + "     * @param fb" + NL + "     * @return" + NL + "     * @throws ViewException" + NL + "     */" + NL + "\tpublic FormBean ";
  protected final String TEXT_7 = "(FormBean formBean)" + NL + "\t{" + NL + "\t\tformBean.setSaida(\"OblAutorizacaoparamCN.jsp\");" + NL + "\t\t";
  protected final String TEXT_8 = " dto = new ";
  protected final String TEXT_9 = "();" + NL + "" + NL + "\t\tfinal String CST_METODO = \"";
  protected final String TEXT_10 = "\";" + NL + "        log.setDebug(CatalogoGlobal.CST_MENSAGEM_METODOINI, CST_METODO); " + NL + "        ";
  protected final String TEXT_11 = NL + "        ";
  protected final String TEXT_12 = " c = null;";
  protected final String TEXT_13 = NL + "        ";
  protected final String TEXT_14 = "Home home = null;" + NL + "        RowSet rs =null;" + NL + "        try {" + NL + "            String nome = getNomeModulo();" + NL + "            log.setDebug(\"Modulo:\" + nome,CST_METODO);" + NL + "            home = (";
  protected final String TEXT_15 = "Home)FacadeHome.getEjbHome(getNomeModulo()," + NL + "                                                  \"";
  protected final String TEXT_16 = "Home\",";
  protected final String TEXT_17 = NL + "                                                 ";
  protected final String TEXT_18 = "Home.class);" + NL + "            cParametros = homeParametros.create();";
  protected final String TEXT_19 = NL + "            ";
  protected final String TEXT_20 = " dto = new ";
  protected final String TEXT_21 = "(fb.getParametros());" + NL + "            //dto.setIdentificacao(fb.getParametro(\"identificacao\"));" + NL + "            //dto.checkError();" + NL + "            " + NL + "            rs =  cParametros.listaParametros(dto,fb.getCredencial());" + NL + "            fb.setLista(rs);";
  protected final String TEXT_22 = NL + "            fb.setSaida(\"";
  protected final String TEXT_23 = ".jsp\");";
  protected final String TEXT_24 = NL + "            return fb;" + NL + "        } " + NL + "        catch (Exception e){" + NL + "            log.setFatal(e.getMessage(), CST_METODO); " + NL + "            throw new ViewException(e);" + NL + "        }" + NL + "\t}";
  protected final String TEXT_25 = NL + NL + NL + "}";
  protected final String TEXT_26 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
RecursosClasse recursos = (RecursosClasse) argument;  
ClasseWrapper classe = recursos.getClasse();
ConfiguracaoWrapper conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getGrupoParaPacote() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getModuloParaPacote() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.nomePacoteServlet() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    
Iterator iterador = classe.listaOperacaoServlet().iterator();
while (iterador.hasNext()) {
	OperacaoWrapper operacao = (OperacaoWrapper) iterador.next();
	ClasseWrapper dtoCl = operacao.obtemTipoClassePorNome("dto");
	ClasseWrapper jspCl = operacao.obtemTipoClassePorNome("jsp");
	

    stringBuffer.append(TEXT_6);
    stringBuffer.append( operacao.getNome() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( dtoCl.getNome() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( dtoCl.getNome() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( operacao.getNome() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(operacao.getNomeEjb() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(operacao.getNomeEjb() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append(operacao.getNomeEjb() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(operacao.getNomeEjb() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(operacao.getNomeEjb() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append(TEXT_19);
    stringBuffer.append( dtoCl.getNome() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( dtoCl.getNome() );
    stringBuffer.append(TEXT_21);
     if (jspCl!=null) { 
    stringBuffer.append(TEXT_22);
    stringBuffer.append( jspCl.getNome() );
    stringBuffer.append(TEXT_23);
     } 
    stringBuffer.append(TEXT_24);
    
}

    stringBuffer.append(TEXT_25);
    stringBuffer.append(TEXT_26);
    return stringBuffer.toString();
  }
}
