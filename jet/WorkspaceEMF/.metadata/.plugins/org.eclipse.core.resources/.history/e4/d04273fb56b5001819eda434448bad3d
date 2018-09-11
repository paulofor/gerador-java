package jet.android.res.layout;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ListaUsoObjetoXml
{
  protected static String nl;
  public static synchronized ListaUsoObjetoXml create(String lineSeparator)
  {
    nl = lineSeparator;
    ListaUsoObjetoXml result = new ListaUsoObjetoXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"" + NL + "    android:layout_width=\"fill_parent\"" + NL + "    android:layout_height=\"fill_parent\"" + NL + "    android:orientation=\"vertical\"" + NL + "    android:paddingLeft=\"8dp\"" + NL + "    android:paddingRight=\"8dp\" >" + NL + "" + NL + "    <ListView" + NL + "        android:id=\"@id/android:list\"" + NL + "        android:layout_width=\"match_parent\"" + NL + "        android:layout_height=\"match_parent\"" + NL + "        android:layout_alignParentLeft=\"true\"" + NL + "        android:layout_alignParentTop=\"true\" />" + NL + "" + NL + "</RelativeLayout>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
