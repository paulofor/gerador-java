package jet.cs.vo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class MobileVo
{
  protected static String nl;
  public static synchronized MobileVo create(String lineSeparator)
  {
    nl = lineSeparator;
    MobileVo result = new MobileVo();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "" + NL + "using ";
  protected final String TEXT_2 = ".modelo.vo;" + NL + "using ";
  protected final String TEXT_3 = ".modelo.mobile;" + NL + "" + NL + "namespace ";
  protected final String TEXT_4 = ".modelo.mobilevo" + NL + "{" + NL + "" + NL + "\tpublic class ";
  protected final String TEXT_5 = "MobileVo : ";
  protected final String TEXT_6 = "Vo, MobileDecoratorI" + NL + "\t{" + NL + "\t\t// Mobile" + NL + "\t\tprivate MobileDecoratorI decorator = null;" + NL + "\t\t" + NL + "\t\tpublic ";
  protected final String TEXT_7 = "MobileVo() : base()" + NL + "\t\t{" + NL + "\t\t\tdecorator = new ";
  protected final String TEXT_8 = "Decorator(this);" + NL + "\t\t}" + NL + "\t\tpublic string Json " + NL + "\t\t{" + NL + "\t\t\tget { return decorator.Json; }" + NL + "\t\t}" + NL + "\t\t" + NL + "\t}" + NL + "}";
  protected final String TEXT_9 = NL;

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
