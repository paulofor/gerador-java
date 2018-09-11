package jet.android.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DBHelperImpl
{
  protected static String nl;
  public static synchronized DBHelperImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    DBHelperImpl result = new DBHelperImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao;" + NL + "" + NL + "import java.util.ArrayList;" + NL + "import java.util.List;" + NL + "import br.com.digicom.Constants;" + NL + "import br.com.digicom.dao.DBHelperBase;" + NL + "" + NL + "import android.content.ContentValues;" + NL + "import android.content.Context;" + NL + "import android.database.Cursor;" + NL + "import android.database.SQLException;" + NL + "import android.database.sqlite.SQLiteDatabase;" + NL + "import android.database.sqlite.SQLiteOpenHelper;" + NL + "import android.util.Log;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.";
  protected final String TEXT_4 = ";" + NL + "import ";
  protected final String TEXT_5 = ".dao.base.";
  protected final String TEXT_6 = "DBHelperBase;" + NL + "" + NL + "public class ";
  protected final String TEXT_7 = "DBHelper extends ";
  protected final String TEXT_8 = "DBHelperBase{" + NL + "" + NL + "   " + NL + "}";
  protected final String TEXT_9 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    
	AtributoWrapper atributoW = new AtributoWrapperAndroid();
	AtributoWrapper chaveW = new AtributoWrapperAndroid();
	chaveW.setBase(classe.getChave());
	

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
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
