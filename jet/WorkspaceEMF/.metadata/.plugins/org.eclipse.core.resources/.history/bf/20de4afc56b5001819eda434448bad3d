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
  protected final String TEXT_1 = "apply plugin: 'com.android.library'" + NL + "" + NL + "android {" + NL + "    compileSdkVersion 25" + NL + "    buildToolsVersion \"25.0.0\"" + NL + "" + NL + "    defaultConfig {" + NL + "        minSdkVersion 16" + NL + "        targetSdkVersion 25" + NL + "        versionCode 1" + NL + "        versionName \"1.0\"" + NL + "    }" + NL + "    buildTypes {" + NL + "        release {" + NL + "            minifyEnabled false" + NL + "            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'" + NL + "        }" + NL + "    }" + NL + "}" + NL + "" + NL + "repositories {" + NL + "    maven { url \"https://jitpack.io\" }" + NL + "    // You can also use jcenter if you prefer" + NL + "    mavenCentral()" + NL + "}" + NL + "" + NL + "dependencies {" + NL + "    compile fileTree(include: ['*.jar'], dir: 'libs')" + NL + "    testCompile 'junit:junit:4.12'" + NL + "    " + NL + "    compile 'com.android.support:appcompat-v7:25.0.0'" + NL + "    compile 'com.android.support:design:25.0.0'" + NL + "    compile 'com.android.support:recyclerview-v7:25.0.0'" + NL + "    compile 'com.google.android.gms:play-services:9.8.0'" + NL + "    compile 'com.google.firebase:firebase-messaging:9.0.0'" + NL + "    compile 'com.github.bumptech.glide:glide:3.6.1'" + NL + "    " + NL + "    compile 'com.android.support:support-v4:25.0.0'" + NL + "    compile 'com.android.support:gridlayout-v7:25.0.0'" + NL + "    compile 'com.android.support:cardview-v7:25.0.0'" + NL + "    compile 'com.github.bumptech.glide:glide:3.6.1'" + NL + "    compile 'com.commit451:PhotoView:1.2.4'" + NL + "    compile 'com.github.PhilJay:MPAndroidChart:v3.0.1'" + NL + "    " + NL + "}";

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
