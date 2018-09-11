package jet.android2.framework.sincronismo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DCNotificacaoParam
{
  protected static String nl;
  public static synchronized DCNotificacaoParam create(String lineSeparator)
  {
    nl = lineSeparator;
    DCNotificacaoParam result = new DCNotificacaoParam();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".framework.fcm;" + NL + "" + NL + "" + NL + "" + NL + "import android.content.ContentResolver;" + NL + "import ";
  protected final String TEXT_3 = ".framework.tela.DCAplicacao;" + NL + "" + NL + "" + NL + "public abstract class DCNotificacaoParam {" + NL + "\tprivate int idIcone;" + NL + "\tprivate String titulo;" + NL + "\tprivate String texto;" + NL + "\t" + NL + "\tprivate Class mainClasse;" + NL + "\tprivate DCAplicacao aplicacao = null;" + NL + "\t" + NL + "" + NL + "\tpublic DCNotificacaoParam(Class classePrincipal, String titulo, DCAplicacao app) {" + NL + "\t\tthis.mainClasse = classePrincipal;" + NL + "\t\tthis.titulo = titulo;" + NL + "\t\taplicacao = app;" + NL + "\t}" + NL + "" + NL + "\tprotected ContentResolver getContentResolver() {" + NL + "\t\treturn aplicacao.getContentResolver();" + NL + "\t}" + NL + "" + NL + "    public abstract int getIdIcone();" + NL + "    public String getTitulo() {" + NL + "    \treturn titulo;" + NL + "    }" + NL + "" + NL + "    public abstract String getTexto();" + NL + "    " + NL + "    public abstract boolean existeAlteracao();" + NL + "    public Class getMainClass() {" + NL + "    \treturn mainClasse;" + NL + "    }" + NL + "}";
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
