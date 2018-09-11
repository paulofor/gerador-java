package jet.android2.servico;

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
  protected final String TEXT_2 = ".servico.base;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".servico.impl.*;" + NL + "" + NL + "public class FabricaServico {" + NL + "" + NL + "" + NL + "\tprivate static FabricaServico fabrica = new FabricaServico();" + NL + "" + NL + "    public static FabricaServico getInstancia() {" + NL + "        return fabrica;" + NL + "    }" + NL;
  protected final String TEXT_4 = NL + "\tprivate ";
  protected final String TEXT_5 = "Servico ";
  protected final String TEXT_6 = "Servico = null;" + NL + "    public ";
  protected final String TEXT_7 = "Servico get";
  protected final String TEXT_8 = "Servico() {" + NL + "       if (";
  protected final String TEXT_9 = "Servico==null) {";
  protected final String TEXT_10 = NL + "           ";
  protected final String TEXT_11 = "Servico = new ";
  protected final String TEXT_12 = "ServicoImpl();" + NL + "       }" + NL + "       return ";
  protected final String TEXT_13 = "Servico;" + NL + "    }";
  protected final String TEXT_14 = NL + "}";

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
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();

    stringBuffer.append(TEXT_4);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_13);
    
	}

    stringBuffer.append(TEXT_14);
    return stringBuffer.toString();
  }
}
