package jet.android2.framework.res;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ListaPadraoXml
{
  protected static String nl;
  public static synchronized ListaPadraoXml create(String lineSeparator)
  {
    nl = lineSeparator;
    ListaPadraoXml result = new ListaPadraoXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"" + NL + "    xmlns:tools=\"http://schemas.android.com/tools\" android:layout_width=\"match_parent\"" + NL + "    android:layout_height=\"match_parent\" android:paddingLeft=\"@dimen/activity_horizontal_margin\"" + NL + "    android:paddingRight=\"@dimen/activity_horizontal_margin\"" + NL + " >" + NL + "" + NL + "    <android.support.v7.widget.RecyclerView" + NL + "        android:id=\"@+id/rec_lista_padrao\"" + NL + "        android:layout_width=\"match_parent\"" + NL + "        android:layout_height=\"match_parent\"/>" + NL + "    <!-- empty list -->" + NL + "    <TextView" + NL + "        android:id=\"@+id/txt_lista_padrao_vazia\"" + NL + "        android:layout_width=\"match_parent\"" + NL + "        android:layout_height=\"match_parent\"" + NL + "        android:gravity=\"center_horizontal\"" + NL + "        android:paddingRight=\"@dimen/activity_horizontal_margin\"" + NL + "        android:paddingEnd=\"@dimen/activity_horizontal_margin\"" + NL + "        android:paddingLeft=\"@dimen/activity_horizontal_margin\"" + NL + "        android:paddingStart=\"@dimen/activity_horizontal_margin\"" + NL + "        android:paddingTop=\"@dimen/activity_vertical_margin\"" + NL + "        android:paddingBottom=\"@dimen/activity_vertical_margin\"" + NL + "        />" + NL + "</FrameLayout>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
