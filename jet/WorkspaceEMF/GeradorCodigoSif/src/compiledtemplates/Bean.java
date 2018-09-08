package compiledtemplates;

import java.util.*;
import br.com.probid.gerador.execucao.wrappers.*;
import br.com.probid.gerador.interfaces.*;

public class Bean
{
  protected static String nl;
  public static synchronized Bean create(String lineSeparator)
  {
    nl = lineSeparator;
    Bean result = new Bean();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".bean;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".bean.base.beanBase";
  protected final String TEXT_4 = ";" + NL + "" + NL + "public class bean";
  protected final String TEXT_5 = " extends beanBase";
  protected final String TEXT_6 = "{ " + NL + "  " + NL + "}" + NL;
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
RecursosClasse recursos = (RecursosClasse) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
ConfiguracaoWrapper conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
