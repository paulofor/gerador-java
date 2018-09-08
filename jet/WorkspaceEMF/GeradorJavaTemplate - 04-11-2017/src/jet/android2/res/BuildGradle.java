package jet.android2.res;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class BuildGradle
{
  protected static String nl;
  public static synchronized BuildGradle create(String lineSeparator)
  {
    nl = lineSeparator;
    BuildGradle result = new BuildGradle();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "apply plugin: 'com.android.library'" + NL + "" + NL + "android {" + NL + "    compileSdkVersion 24" + NL + "    buildToolsVersion \"23.0.3\"" + NL + "" + NL + "    defaultConfig {" + NL + "        minSdkVersion 16" + NL + "        targetSdkVersion 24" + NL + "        versionCode 1" + NL + "        versionName \"1.0\"" + NL + "    }" + NL + "    buildTypes {" + NL + "        release {" + NL + "            minifyEnabled false" + NL + "            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'" + NL + "        }" + NL + "    }" + NL + "}" + NL + "" + NL + "" + NL + "dependencies {" + NL + "    compile fileTree(include: ['*.jar'], dir: 'libs')" + NL + "    testCompile 'junit:junit:4.12'" + NL + "    compile 'com.android.support:appcompat-v7:24.1.1'" + NL + "    compile 'com.android.support:design:24.1.1'" + NL + "    compile 'com.android.support:recyclerview-v7:24.1.1'" + NL + "    compile 'com.google.android.gms:play-services:9.4.0'" + NL + "    compile 'com.google.firebase:firebase-messaging:9.0.0'" + NL + "}";

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
