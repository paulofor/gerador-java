package jet.android.res.layout;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ItemListaXml
{
  protected static String nl;
  public static synchronized ItemListaXml create(String lineSeparator)
  {
    nl = lineSeparator;
    ItemListaXml result = new ItemListaXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + NL + " <br.com.digicom.layout.ItemLista xmlns:android=\"http://schemas.android.com/apk/res/android\"" + NL + "     android:layout_width=\"match_parent\"" + NL + "     android:layout_height=\"wrap_content\"" + NL + "     android:minHeight=\"?android:attr/listPreferredItemHeight\"" + NL + "     android:orientation=\"vertical\">" + NL + "" + NL + "\t<!--" + NL + "     <TextView" + NL + "         android:id=\"@+id/Nome\"" + NL + "         android:layout_width=\"0dp\"" + NL + "         android:layout_height=\"wrap_content\"" + NL + "         android:layout_weight=\"2\"" + NL + "         android:text=\"Nome\"" + NL + "         android:layout_gravity=\"center\"" + NL + "         android:textAppearance=\"?android:attr/textAppearanceMedium\"" + NL + "         android:textStyle=\"bold\" />" + NL + "\t-->" + NL + "</br.com.digicom.layout.ItemLista>";

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
