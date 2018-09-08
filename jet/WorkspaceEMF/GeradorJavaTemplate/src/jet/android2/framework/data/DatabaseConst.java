package jet.android2.framework.data;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DatabaseConst
{
  protected static String nl;
  public static synchronized DatabaseConst create(String lineSeparator)
  {
    nl = lineSeparator;
    DatabaseConst result = new DatabaseConst();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".data;" + NL + "" + NL + "/**" + NL + " * Created by Paulo on 18/06/2016." + NL + " */" + NL + "public abstract class DatabaseConst {" + NL + "" + NL + "    public abstract  int getVersion();" + NL + "    public abstract  String getName();" + NL + "}";
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
