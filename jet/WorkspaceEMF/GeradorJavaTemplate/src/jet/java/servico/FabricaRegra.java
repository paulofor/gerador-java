package jet.java.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class FabricaRegra
{
  protected static String nl;
  public static synchronized FabricaRegra create(String lineSeparator)
  {
    nl = lineSeparator;
    FabricaRegra result = new FabricaRegra();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".regracolecao;" + NL + "" + NL + "import  ";
  protected final String TEXT_3 = ".regracolecao.impl.*;" + NL + "" + NL + "// versao templates" + NL + "" + NL + "public  class FabricaRegra   {" + NL + "" + NL + "\tprivate static FabricaRegra _instancia =  null;" + NL + "\tpublic static FabricaRegra getInstancia() {" + NL + "\t\tif (_instancia==null) _instancia = new FabricaRegra();" + NL + "\t\treturn _instancia;" + NL + "\t}" + NL;
  protected final String TEXT_4 = NL + "\tprivate  ";
  protected final String TEXT_5 = "RegraColecao _";
  protected final String TEXT_6 = "RegraColecao;" + NL + "\tpublic  ";
  protected final String TEXT_7 = "RegraColecao get";
  protected final String TEXT_8 = "RegraColecao() {" + NL + "\t\tif (_";
  protected final String TEXT_9 = "RegraColecao==null) _";
  protected final String TEXT_10 = "RegraColecao = new ";
  protected final String TEXT_11 = "RegraColecaoImpl();" + NL + "\t\treturn _";
  protected final String TEXT_12 = "RegraColecao;" + NL + "\t}";
  protected final String TEXT_13 = NL + NL + "}";

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
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_12);
    
}

    stringBuffer.append(TEXT_13);
    return stringBuffer.toString();
  }
}
