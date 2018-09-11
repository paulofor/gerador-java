package jet.java.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class DaoBaseI
{
  protected static String nl;
  public static synchronized DaoBaseI create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoBaseI result = new DaoBaseI();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao.basica;" + NL + "" + NL + "" + NL + "import java.util.*;" + NL + "import br.com.digicom.lib.dao.*;" + NL + "import br.com.digicom.lib.*;" + NL + "import br.com.digicom.lib.util.*;" + NL + "" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_4 = ".dao.*;" + NL + "import ";
  protected final String TEXT_5 = ".regracolecao.filtro.*;" + NL + "" + NL + "public interface ";
  protected final String TEXT_6 = "DaoBaseI" + NL + " extends DaoI { " + NL + "\tpublic void insereItem( ";
  protected final String TEXT_7 = " item )  throws  DaoException;" + NL + "\tpublic void insereItemCompleto( ";
  protected final String TEXT_8 = " item )  throws  DaoException;" + NL + "\tpublic boolean insereSeNaoExiste( ";
  protected final String TEXT_9 = " item )  throws  DaoException;" + NL + "\tpublic void insereItemLoad( ";
  protected final String TEXT_10 = " item )  throws  DaoException;" + NL + "\tpublic void alteraItem( ";
  protected final String TEXT_11 = " item )  throws  DaoException;" + NL + "\tpublic void excluiItem( ";
  protected final String TEXT_12 = " item )  throws  DaoException;" + NL + "\tpublic ";
  protected final String TEXT_13 = " obtemPorChave( long item )  throws  DaoException;" + NL + "\tpublic List ListaFiltro( ";
  protected final String TEXT_14 = "Filtro filtro )  throws  DaoException;" + NL + "\tpublic List ListaFiltroSimples( ";
  protected final String TEXT_15 = "Filtro filtro )  throws  DaoException;" + NL + "\tpublic List ListaCorrente()  throws  DaoException;" + NL + "\tpublic List ListaCorrenteAgrupada()  throws  DaoException;" + NL + "" + NL + "\t//public List ListaPorLojaVirtualReferenteA( long idItem )  throws  DaoException;" + NL + "\t//public List ListaPorNaturezaProdutoReferenteA( long idItem )  throws  DaoException;" + NL + "\t//LojaNatureza obtemPorRel(long idLojaVirtualRa, long idNaturezaProdutoRa) throws DaoException;" + NL + "" + NL + "\t// Tratamento de objetos que possuem FK nesse objeto para objetos associativos" + NL + "\t";
  protected final String TEXT_16 = NL + "\tpublic List ListaPor";
  protected final String TEXT_17 = "(long id) throws DaoException;" + NL + "\t";
  protected final String TEXT_18 = NL + NL + "}" + NL + NL;
  protected final String TEXT_19 = NL;

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
    stringBuffer.append( classe.getNomeParaClasse() );
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    
	Iterator<RelacionamentoWrapper> iteradorRel2 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
	while (iteradorRel2.hasNext()) {
		RelacionamentoWrapper relCorrente2 = iteradorRel2.next();
		
	
    stringBuffer.append(TEXT_16);
    stringBuffer.append( relCorrente2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( relCorrente2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_17);
    
	}
	
    stringBuffer.append(TEXT_18);
    stringBuffer.append(TEXT_19);
    return stringBuffer.toString();
  }
}
