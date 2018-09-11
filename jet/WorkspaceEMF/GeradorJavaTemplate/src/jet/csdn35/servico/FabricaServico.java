package jet.csdn35.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
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
  protected final String TEXT_1 = "using System;" + NL + "" + NL + "" + NL + "namespace ";
  protected final String TEXT_2 = ".servico {" + NL + "" + NL + "using ";
  protected final String TEXT_3 = ".servico.local;" + NL + "using ";
  protected final String TEXT_4 = ".servico.remoto;" + NL + "" + NL + "public class FabricaServico {" + NL + "" + NL + "\tstatic FabricaServico fabrica = new FabricaServico();" + NL + "\tpublic static int LOCAL = 1;" + NL + "\tpublic static int REMOTO = 2;" + NL + "\t" + NL + "\tpublic static FabricaServico getInstancia() {" + NL + "\t\treturn fabrica;" + NL + "\t}" + NL;
  protected final String TEXT_5 = NL + NL + "\tprivate ";
  protected final String TEXT_6 = "Servico ";
  protected final String TEXT_7 = "ServicoLocal = null;" + NL + "\tprivate ";
  protected final String TEXT_8 = "Servico ";
  protected final String TEXT_9 = "ServicoRemoto = null;" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_10 = "Servico get";
  protected final String TEXT_11 = "Servico(int tipo) {" + NL + "\t\tif (tipo==LOCAL) {" + NL + "\t\t\t// Mudanca feita para permitir que tente se reaproveitar a conexao com o banco de dados." + NL + "\t\t\t//return new ";
  protected final String TEXT_12 = "ServicoLocalImpl()" + NL + "\t\t\tif (";
  protected final String TEXT_13 = "ServicoLocal==null) {" + NL + "\t\t\t\t";
  protected final String TEXT_14 = "ServicoLocal = new ";
  protected final String TEXT_15 = "ServicoLocalImpl();" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_16 = "ServicoLocal;" + NL + "\t\t}" + NL + "\t\tif (tipo==REMOTO) {" + NL + "\t\t\tif (";
  protected final String TEXT_17 = "ServicoRemoto==null) {" + NL + "\t\t\t\t";
  protected final String TEXT_18 = "ServicoRemoto = new ";
  protected final String TEXT_19 = "ServicoRemotoImpl();" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_20 = "ServicoRemoto;" + NL + "\t\t}" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_21 = NL + "\t}" + NL + "}" + NL;
  protected final String TEXT_22 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();

    stringBuffer.append(TEXT_5);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( corrente.getNomeParaVariavel() );
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
