package jet.android.complementares;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DrawableBgActionBar
{
  protected static String nl;
  public static synchronized DrawableBgActionBar create(String lineSeparator)
  {
    nl = lineSeparator;
    DrawableBgActionBar result = new DrawableBgActionBar();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + NL + "<shape xmlns:android=\"http://schemas.android.com/apk/res/android\" android:shape=\"rectangle\" >" + NL + "    <gradient" + NL + "  \tandroid:startColor=\"@color/dcPalette5\"" + NL + "    android:endColor=\"@color/dcPalette5\"" + NL + "    android:gradientRadius=\"326\"" + NL + "    android:type=\"radial\"/>" + NL + "</shape>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
