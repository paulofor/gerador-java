package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class Dto
{
  protected static String nl;
  public static synchronized Dto create(String lineSeparator)
  {
    nl = lineSeparator;
    Dto result = new Dto();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package com.br.brasilcap.cap.obl.trataparametros.dto;" + NL + "" + NL + "import com.br.brasilcap.arq.glb.persistencia.standard.AbstractDTO;" + NL + "" + NL + "import java.util.Map;" + NL + "" + NL + "public class Cap_lista_parametros_sps extends AbstractDTO {" + NL + "" + NL + "    private String identificacao;" + NL + "" + NL + "    public Cap_lista_parametros_sps(Map params) throws Exception {" + NL + "        super(params);" + NL + "    }" + NL + "" + NL + "    public String getPrimeiroParametro() {" + NL + "        return \"identificacao\";" + NL + "    }" + NL + "" + NL + "    public void setIdentificacao(String identificacao) {" + NL + "        this.identificacao = identificacao;" + NL + "    }" + NL + "" + NL + "    public String getIdentificacao() {" + NL + "        return identificacao;" + NL + "    }" + NL + "}" + NL;
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
RecursosClasse recursos = (RecursosClasse) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
ConfiguracaoWrapper conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
