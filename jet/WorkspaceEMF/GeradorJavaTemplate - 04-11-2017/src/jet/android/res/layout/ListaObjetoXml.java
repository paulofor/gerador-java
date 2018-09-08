package jet.android.res.layout;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ListaObjetoXml
{
  protected static String nl;
  public static synchronized ListaObjetoXml create(String lineSeparator)
  {
    nl = lineSeparator;
    ListaObjetoXml result = new ListaObjetoXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"" + NL + "    android:layout_width=\"match_parent\"" + NL + "    android:layout_height=\"match_parent\"" + NL + "    android:orientation=\"vertical\"" + NL + "    android:paddingLeft=\"8dp\"" + NL + "    android:paddingRight=\"8dp\" >" + NL + "" + NL + "    <ListView" + NL + "        android:id=\"@id/android:list\"" + NL + "        android:layout_width=\"match_parent\"" + NL + "        android:layout_height=\"wrap_content\"" + NL + "        android:layout_above=\"@+id/btnCria";
  protected final String TEXT_2 = "\"" + NL + "        android:layout_alignParentLeft=\"true\"" + NL + "        android:layout_alignParentTop=\"true\" />" + NL + "" + NL + "    <Button" + NL + "        android:id=\"@+id/btnCria";
  protected final String TEXT_3 = "\"" + NL + "        android:layout_width=\"match_parent\"" + NL + "        android:layout_height=\"wrap_content\"" + NL + "        android:layout_alignParentBottom=\"true\"" + NL + "        android:layout_alignParentLeft=\"true\"" + NL + "        android:text=\"Novo\" />" + NL + "" + NL + "</RelativeLayout>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
