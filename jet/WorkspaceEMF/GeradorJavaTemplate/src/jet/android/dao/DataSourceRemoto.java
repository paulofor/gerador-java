package jet.android.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DataSourceRemoto
{
  protected static String nl;
  public static synchronized DataSourceRemoto create(String lineSeparator)
  {
    nl = lineSeparator;
    DataSourceRemoto result = new DataSourceRemoto();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao.datasource;" + NL + "" + NL + "import br.com.digicom.servico.DataSourceRemotoI;" + NL + "" + NL + "public class DataSourceRemoto implements DataSourceRemotoI{" + NL + "\t" + NL + "\tpublic final String SERVER = \"digicom.kinghost.net\";" + NL + "\t//public final String APLICACAO = \"TreinoAcademia\";" + NL + "\t//public final String APLICACAO = \"TreinoAcademiaDesen\";" + NL + "\t" + NL + "\t//public final String SERVER = \"10.0.2.2:61600\";" + NL + "\t//public final String APLICACAO = null;" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic String getServer() {" + NL + "\t\treturn SERVER;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic String getAplicacao() {" + NL + "\t\treturn APLICACAO;" + NL + "\t}" + NL + "}" + NL + NL + NL;
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
