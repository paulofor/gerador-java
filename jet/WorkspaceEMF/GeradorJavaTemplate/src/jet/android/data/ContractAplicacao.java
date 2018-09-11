package jet.android.data;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ContractAplicacao
{
  protected static String nl;
  public static synchronized ContractAplicacao create(String lineSeparator)
  {
    nl = lineSeparator;
    ContractAplicacao result = new ContractAplicacao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".data.contract;" + NL + "" + NL + "//import android.content.ContentResolver;" + NL + "import android.app.Application;" + NL + "import android.net.Uri;" + NL + "//import android.provider.BaseColumns;" + NL + "" + NL + "public abstract class AplicacaoContract {" + NL + "" + NL + "\t//public static final String CONTENT_AUTHORITY = \"br.com.lojadigicom.";
  protected final String TEXT_4 = "\";" + NL + "\t//public static final Uri BASE_CONTENT_URI = Uri.parse(\"content://\" + CONTENT_AUTHORITY);" + NL + "\t" + NL + "\tprivate static String codigoAplicacaoSinc = null;" + NL + "\tprivate static AplicacaoContract contract = null;" + NL + "\tprotected Application application = null;" + NL + "\t" + NL + "\t// Pode no futuro usar o NomePacote ?" + NL + "\tpublic abstract String getContentAuthority();" + NL + "" + NL + "\tpublic String getNomePacoteApp() {" + NL + "\t\treturn application.getPackageName();" + NL + "\t}" + NL + "" + NL + "\tpublic static void setCodigoAplicacaoSinc(String valor) {" + NL + "\t\tcodigoAplicacaoSinc = valor;" + NL + "\t}" + NL + "\tpublic static String getCodigoAplicacaoSinc() { " + NL + "\t\treturn codigoAplicacaoSinc;" + NL + "\t}" + NL + "" + NL + "" + NL + "\tpublic Uri getBaseContentUri() {" + NL + "\t\treturn Uri.parse(\"content://\" + getContentAuthority());" + NL + "\t}" + NL + "\t" + NL + "\tpublic static String getIdAplicacao() {" + NL + "\t\treturn contract.getContentAuthority();" + NL + "\t}" + NL + "\t" + NL + "\tpublic static void setAplicacaoContract(AplicacaoContract contract){" + NL + "\t\tAplicacaoContract.contract = contract;" + NL + "\t";
  protected final String TEXT_5 = NL + "\t\t";
  protected final String TEXT_6 = "Contract.setAplicacaoContract(contract);" + NL + "\t";
  protected final String TEXT_7 = NL + "\t}" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();
	
    stringBuffer.append(TEXT_5);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    
	}
	
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
