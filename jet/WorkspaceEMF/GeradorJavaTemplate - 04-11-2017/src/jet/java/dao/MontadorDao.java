package jet.java.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class MontadorDao
{
  protected static String nl;
  public static synchronized MontadorDao create(String lineSeparator)
  {
    nl = lineSeparator;
    MontadorDao result = new MontadorDao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao.montador;" + NL + "" + NL + "" + NL + "import java.util.*;" + NL + "import br.com.digicom.lib.dao.*;" + NL + "import br.com.digicom.lib.*;" + NL + "import br.com.digicom.lib.util.*;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.";
  protected final String TEXT_4 = ";" + NL + "import ";
  protected final String TEXT_5 = ".modelo.FabricaVo;" + NL + "" + NL + "" + NL + "//  Nao consegui fazer extender classe MontadorDao para nao precisar " + NL + "//  implementar todos os metodos de MontadorDaoI ( metodos novos )" + NL + "//  achei o caminho mais simples colocar os metodos aqui." + NL + "public class ";
  protected final String TEXT_6 = "Montador   implements MontadorDaoI { " + NL + "" + NL + "\tpublic DaoItemRetorno extraiRegistroListaInterna(ResultadoLista result,DCIObjetoDominio objeto) throws  DaoException" + NL + "    {" + NL + "\t\tDaoItemRetorno retorno = new DaoItemRetorno();" + NL + "    \tobjeto = ((MontadorDaoI)this).extraiRegistro(result);" + NL + "    \tretorno.setInsere(true);" + NL + "    \tretorno.setObjeto(objeto);" + NL + "        return retorno;" + NL + "    }" + NL + "\t" + NL + "    public DaoItemRetorno extraiRegistroInterno(ResultadoLista result, DCIObjetoDominio objeto) throws  DaoException" + NL + "    {" + NL + "    \tDaoItemRetorno retorno = new DaoItemRetorno();" + NL + "    \tobjeto = ((MontadorDaoI)this).extraiRegistro(result);" + NL + "    \tretorno.setInsere(true);" + NL + "    \tretorno.setObjeto(objeto);" + NL + "        return retorno;" + NL + "    }" + NL + "    " + NL + "    public  DCIObjetoDominio extraiRegistro( ResultadoLista resultadoLista )  throws  DaoException{" + NL + "\t\tDCIObjetoDominio objeto;" + NL + "\t\tobjeto = FabricaVo.cria";
  protected final String TEXT_7 = "();" + NL + "\t\treturn extraiRegistro(resultadoLista, objeto, 1);" + NL + "\t}" + NL + "" + NL + "" + NL + "\tpublic  DCIObjetoDominio extraiRegistro( ResultadoLista resultadoLista  ,  int pos )  throws  DaoException{" + NL + "\t\tDCIObjetoDominio objeto;" + NL + "\t\tobjeto = FabricaVo.cria";
  protected final String TEXT_8 = "();" + NL + "\t\treturn extraiRegistro(resultadoLista, objeto, pos );" + NL + "\t}" + NL + "\t" + NL + "\tpublic  DCIObjetoDominio extraiRegistro( ResultadoLista resultadoLista  ,  DCIObjetoDominio entrada  ,  int pos )  throws  DaoException{" + NL + "\t\t";
  protected final String TEXT_9 = " objeto;" + NL + "\t\tobjeto = (";
  protected final String TEXT_10 = ")entrada;" + NL + "\t\t";
  protected final String TEXT_11 = "  " + NL + "\t  \tobjeto.set";
  protected final String TEXT_12 = "(resultadoLista.get";
  protected final String TEXT_13 = "(pos++));";
  protected final String TEXT_14 = NL + "      \treturn objeto;" + NL + "\t}" + NL + "\t\t" + NL + "\tpublic int quantidadeCampos()  {" + NL + "      return ";
  protected final String TEXT_15 = ";" + NL + "\t}" + NL + "\t" + NL + "\t/*" + NL + "\tAcho que fiz errado criando isso." + NL + "\t@Override" + NL + "\tpublic DaoItemRetorno extraiRegistroListaInterna(ResultadoLista paramResultadoLista, DCIObjetoDominio objeto) throws DaoException, ClassNotFoundException," + NL + "\t\t\tNoSuchMethodException, InvocationTargetException, IllegalAccessException {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic DaoItemRetorno extraiRegistroInterno(ResultadoLista paramResultadoLista, DCIObjetoDominio objeto) throws DaoException {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\t*/" + NL + "" + NL + "}";
  protected final String TEXT_16 = NL;

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
    stringBuffer.append( classe.getNomeParaClasse() );
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
    
		Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
		while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();	
    stringBuffer.append(TEXT_11);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( atributo.getTipoFuncaoMontador() );
    stringBuffer.append(TEXT_13);
    
		}
		
    stringBuffer.append(TEXT_14);
    stringBuffer.append( "" + classe.getListaAtributoTotal().size() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(TEXT_16);
    return stringBuffer.toString();
  }
}
