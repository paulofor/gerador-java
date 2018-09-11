package jet.android.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class FabricaServico
{
  protected static String nl;
  public static synchronized FabricaServico create(String lineSeparator)
  {
    nl = lineSeparator;
    FabricaServico result = new FabricaServico();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".*;" + NL + "import ";
  protected final String TEXT_4 = ".*;" + NL + "//import ";
  protected final String TEXT_5 = ".*;" + NL + "" + NL + "public class FabricaServico {" + NL + "" + NL + "\tstatic FabricaServico fabrica = new FabricaServico();" + NL + "\tpublic static final int TIPO_SQLITE = 1;" + NL + "\tpublic static final int TIPO_WSJSON = 2;" + NL + "\t" + NL + "\tpublic static FabricaServico getInstancia() {" + NL + "\t\treturn fabrica;" + NL + "\t}" + NL;
  protected final String TEXT_6 = NL + NL + "\tprivate ";
  protected final String TEXT_7 = "Servico ";
  protected final String TEXT_8 = "ServicoSqlite = null;" + NL + "\tprivate ";
  protected final String TEXT_9 = "Servico ";
  protected final String TEXT_10 = "ServicoJson = null;" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_11 = "Servico get";
  protected final String TEXT_12 = "Servico(int tipo) {" + NL + "\t\tif (tipo==TIPO_SQLITE) {" + NL + "\t\t\tif (";
  protected final String TEXT_13 = "ServicoSqlite==null) {" + NL + "\t\t\t\t";
  protected final String TEXT_14 = "ServicoSqlite = new ";
  protected final String TEXT_15 = "ServicoSqliteImpl();" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_16 = "ServicoSqlite;" + NL + "\t\t}" + NL + "\t\tif (tipo==TIPO_WSJSON) {" + NL + "\t\t\tif (";
  protected final String TEXT_17 = "ServicoJson==null) {" + NL + "\t\t\t\t";
  protected final String TEXT_18 = "ServicoJson = new ";
  protected final String TEXT_19 = "ServicoWsJsonImpl();" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_20 = "ServicoJson;" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_21 = NL + "}" + NL;
  protected final String TEXT_22 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNomePacoteServicoInterface() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNomePacoteServicoSqliteImpl() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNomePacoteServicoWsJsonImpl() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNomePacoteServicoInterface() );
    stringBuffer.append(TEXT_5);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();

    stringBuffer.append(TEXT_6);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_20);
    
	}

    stringBuffer.append(TEXT_21);
    stringBuffer.append(TEXT_22);
    return stringBuffer.toString();
  }
}
