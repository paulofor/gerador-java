package jet.android2.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ServicoBase
{
  protected static String nl;
  public static synchronized ServicoBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoBase result = new ServicoBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".servico.base;" + NL + "" + NL + "" + NL + "import android.content.Context;" + NL + "import android.net.Uri;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".data.contract.";
  protected final String TEXT_4 = "Contract;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.";
  protected final String TEXT_6 = ";" + NL + "import ";
  protected final String TEXT_7 = ".framework.log.DCLog;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_8 = "Servico {" + NL + "" + NL + "" + NL + "" + NL + " \tpublic final void insereAtualiza(";
  protected final String TEXT_9 = " item, Context context) {" + NL + "        if (item.getIdObj()==0) {" + NL + "        \tDCLog.d(DCLog.TRACE_CRUD,this,\"insercao\");" + NL + "            insere(item,context);" + NL + "        } else {" + NL + "        \tDCLog.d(DCLog.TRACE_CRUD,this,\"alteracao\");" + NL + "            atualiza(item,context);" + NL + "        }" + NL + "    }" + NL + "    public final void insere(";
  protected final String TEXT_10 = " item, Context ctx) {" + NL + "        Uri uriInsert = ";
  protected final String TEXT_11 = "Contract.buildInsereSinc();" + NL + "        ctx.getContentResolver().insert(uriInsert, item.getContentValues());" + NL + "    }" + NL + "    public final void atualiza(";
  protected final String TEXT_12 = " item, Context ctx) {" + NL + "        Uri uriUpdate = ";
  protected final String TEXT_13 = "Contract.buildAtualizaSinc();" + NL + "        ctx.getContentResolver().update(uriUpdate,item.getContentValues(),null,null);" + NL + "    }" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    return stringBuffer.toString();
  }
}
