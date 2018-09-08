package jet.android2.sincronismo;

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
  protected final String TEXT_2 = ".remoto;" + NL + "" + NL + "" + NL + "public class DataSourceRemoto {" + NL + "" + NL + "    public static final String SERVER = \"digicom.kinghost.net\";" + NL + "    public static final String APLICACAO = \"";
  protected final String TEXT_3 = "\";" + NL + "" + NL + "    //public static final String SERVER = \"10.0.2.2:63199\";" + NL + "    //public static final String APLICACAO = null;" + NL + "" + NL + "" + NL + "    public static String getServer() {" + NL + "        return SERVER;" + NL + "    }" + NL + "    public static String getAplicacao() {" + NL + "        return APLICACAO;" + NL + "    }" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNomeAplicacao() );
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
