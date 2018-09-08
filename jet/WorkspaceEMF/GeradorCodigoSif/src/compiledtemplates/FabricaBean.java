package compiledtemplates;

import java.util.*;
import br.com.probid.gerador.execucao.wrappers.*;

public class FabricaBean
{
  protected static String nl;
  public static synchronized FabricaBean create(String lineSeparator)
  {
    nl = lineSeparator;
    FabricaBean result = new FabricaBean();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package ";
  protected final String TEXT_2 = ".bean.base;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".bean.*;" + NL + "" + NL + "public class FabricaBean {" + NL + "\t";
  protected final String TEXT_4 = NL + "\t\t" + NL + "\tpublic static bean";
  protected final String TEXT_5 = " criaBean";
  protected final String TEXT_6 = "() {" + NL + "\t\treturn new bean";
  protected final String TEXT_7 = "();" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_8 = NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
RecursosClasse recursos = (RecursosClasse) argument;  
List listaClasse = recursos.getListaClasseW();
ConfiguracaoWrapper conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_3);
    
	Iterator iterador = listaClasse.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper classe = (ClasseWrapper) iterador.next(); 
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_7);
    }
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
