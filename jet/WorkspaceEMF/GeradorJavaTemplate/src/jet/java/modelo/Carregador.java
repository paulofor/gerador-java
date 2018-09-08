package jet.java.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class Carregador
{
  protected static String nl;
  public static synchronized Carregador create(String lineSeparator)
  {
    nl = lineSeparator;
    Carregador result = new Carregador();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo.agregado;" + NL + "" + NL + "" + NL + "import br.com.digicom.lib.dao.DaoConexao;" + NL + "import br.com.digicom.lib.dao.DaoException;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_4 = ".regracolecao.FabricaRegra;" + NL + "import ";
  protected final String TEXT_5 = ".regracolecao.*;" + NL + "" + NL + "public class ";
  protected final String TEXT_6 = "Carregador {" + NL + "\t" + NL + "\tprivate DaoConexao conexao = null;" + NL + "" + NL + "\tpublic void setConexao(DaoConexao conexao) {" + NL + "\t\tthis.conexao = conexao;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t";
  protected final String TEXT_7 = NL + "\tpublic void CarregaItem";
  protected final String TEXT_8 = "_";
  protected final String TEXT_9 = "(";
  protected final String TEXT_10 = " vo) throws DaoException" + NL + "    {" + NL + "       \t";
  protected final String TEXT_11 = "RegraColecao servico = FabricaRegra.getInstancia().get";
  protected final String TEXT_12 = "RegraColecao();" + NL + "    \tif (conexao!=null ) { " + NL + "            vo.set";
  protected final String TEXT_13 = "(servico.obtemPorChave(vo.get";
  protected final String TEXT_14 = "(), conexao));" + NL + "\t    } else {" + NL + "\t    \tvo.set";
  protected final String TEXT_15 = "(servico.obtemPorChave(vo.get";
  protected final String TEXT_16 = "()));" + NL + "    \t}" + NL + "    }" + NL + " \t";
  protected final String TEXT_17 = NL + "\t" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    
		Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (iterador.hasNext()) {
		RelacionamentoWrapper relac = iterador.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( relac.getNomePropriedade() );
    stringBuffer.append(TEXT_16);
    
	}
    
    stringBuffer.append(TEXT_17);
    return stringBuffer.toString();
  }
}
