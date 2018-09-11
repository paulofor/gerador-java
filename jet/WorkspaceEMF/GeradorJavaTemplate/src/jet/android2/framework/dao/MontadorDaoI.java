package jet.android2.framework.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class MontadorDaoI
{
  protected static String nl;
  public static synchronized MontadorDaoI create(String lineSeparator)
  {
    nl = lineSeparator;
    MontadorDaoI result = new MontadorDaoI();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".framework.dao;" + NL + "" + NL + "import java.lang.reflect.InvocationTargetException;" + NL + "" + NL + "import android.database.Cursor;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".framework.dao.DaoException;" + NL + "import ";
  protected final String TEXT_5 = ".framework.dao.DaoItemRetorno;" + NL + "import ";
  protected final String TEXT_6 = ".framework.modelo.DCIObjetoDominio;" + NL + "" + NL + "" + NL + "public interface MontadorDaoI {" + NL + "" + NL + "\tpublic void desligaSinc();" + NL + "\tpublic DCIObjetoDominio getItem(Cursor c, int posicao);" + NL + "\tpublic DCIObjetoDominio getItem(Cursor c);" + NL + "\tpublic DCIObjetoDominio getItemSinc(Cursor c);" + NL + "\tpublic int quantidadeCampos();" + NL + "\tpublic DaoItemRetorno extraiRegistroListaInterna(Cursor c, DCIObjetoDominio objeto)" + NL + "\t\t\t    throws DaoException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException;" + NL + "}";

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
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
