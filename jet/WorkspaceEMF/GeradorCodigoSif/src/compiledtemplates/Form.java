package compiledtemplates;

import java.util.*;
import br.com.probid.gerador.execucao.wrappers.*;

public class Form
{
  protected static String nl;
  public static synchronized Form create(String lineSeparator)
  {
    nl = lineSeparator;
    Form result = new Form();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package br.org.fplf.form;" + NL + "" + NL + "import ";
  protected final String TEXT_2 = ".bean.base.FabricaBean;" + NL + "import ";
  protected final String TEXT_3 = ".bean.bean";
  protected final String TEXT_4 = ";" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import java.util.Vector;" + NL + "" + NL + "public class form";
  protected final String TEXT_5 = " extends ActionForm {" + NL + "" + NL + "\tprivate bean";
  protected final String TEXT_6 = " item;" + NL + "\t" + NL + "\tpublic bean";
  protected final String TEXT_7 = " getItem() {" + NL + "\t\tif (item==null) item = FabricaBean.criaBean";
  protected final String TEXT_8 = "();" + NL + "\t\treturn item;" + NL + "    }" + NL + "    public void setItem(bean";
  protected final String TEXT_9 = " item) {" + NL + "    \tthis.item = item;" + NL + "    }" + NL + "    " + NL + "    /*" + NL + "    private Vector<bean";
  protected final String TEXT_10 = "> lista;" + NL + "\t" + NL + "\tpublic Vector<bean";
  protected final String TEXT_11 = "> getLista() {" + NL + "\t\tif (lista==null) lista = new Vector<bean";
  protected final String TEXT_12 = ">();" + NL + "\t\treturn lista;" + NL + "    }" + NL + "    public void setLista(Vector<bean";
  protected final String TEXT_13 = "> lista) {" + NL + "    \tthis.lista = lista;" + NL + "    }" + NL + "    */" + NL + "}" + NL;
  protected final String TEXT_14 = NL;

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
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append(TEXT_14);
    return stringBuffer.toString();
  }
}
