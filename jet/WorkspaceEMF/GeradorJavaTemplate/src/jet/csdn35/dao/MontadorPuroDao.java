package jet.csdn35.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class MontadorPuroDao
{
  protected static String nl;
  public static synchronized MontadorPuroDao create(String lineSeparator)
  {
    nl = lineSeparator;
    MontadorPuroDao result = new MontadorPuroDao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "using System.Collections;" + NL + "using br.com.digicom.lib.dao;" + NL + "using br.com.digicom.lib;" + NL + "using br.com.digicom.lib.util;" + NL + "using ";
  protected final String TEXT_2 = ".modelo;" + NL + "//using Digicom.Seguranca;" + NL + "" + NL + "" + NL + "namespace ";
  protected final String TEXT_3 = ".dao.montador {" + NL + "" + NL + "//  Nao consegui fazer extender classe MontadorDao para nao precisar " + NL + "//  implementar todos os metodos de MontadorDaoI ( metodos novos )" + NL + "//  achei o caminho mais simples colocar os metodos aqui." + NL + "" + NL + "public class ";
  protected final String TEXT_4 = "MontadorPuro  : MontadorDaoI { " + NL + "" + NL + "\t// Altera??o feito em digicomcore2 para possibilitar que nao se" + NL + "\t// precisa ter um objeto por registro na lista de saida" + NL + "\t// Podemos fazer com que varios registros virem uma lista dentro de" + NL + "\t// um unico objeto da lista de saida." + NL + "\tpublic virtual bool extraiRegistroListaInterna(ResultadoLista result,ref DCIObjetoDominio objeto)" + NL + "    {" + NL + "    \tobjeto = ((MontadorDaoI)this).extraiRegistro(result);" + NL + "        return true;" + NL + "    }" + NL + "    public virtual bool extraiRegistroInterno(ResultadoLista result,ref DCIObjetoDominio objeto)" + NL + "    {" + NL + "    \tobjeto = ((MontadorDaoI)this).extraiRegistro(result);" + NL + "        return true;" + NL + "    }" + NL + "    " + NL + "\tpublic DCIObjetoDominio extraiRegistro( ResultadoLista resultadoLista )  {" + NL + "      DCIObjetoDominio objeto;" + NL + "      objeto = FabricaVo.cria";
  protected final String TEXT_5 = "();" + NL + "      return extraiRegistro(resultadoLista, objeto, 0);" + NL + "\t}" + NL + "" + NL + "" + NL + "\tpublic DCIObjetoDominio extraiRegistro( ResultadoLista resultadoLista  ,  int pos )  {" + NL + "      DCIObjetoDominio objeto;" + NL + "      objeto = FabricaVo.cria";
  protected final String TEXT_6 = "();" + NL + "      return extraiRegistro(resultadoLista, objeto, pos );" + NL + "\t}" + NL + "" + NL + "" + NL + "\tpublic  virtual DCIObjetoDominio extraiRegistro( ResultadoLista resultadoLista  ,  DCIObjetoDominio entrada  ,  int pos )  {";
  protected final String TEXT_7 = NL + "      ";
  protected final String TEXT_8 = " objeto;" + NL + "\t  objeto = (";
  protected final String TEXT_9 = ")entrada;";
  protected final String TEXT_10 = "  " + NL + "\t  objeto.";
  protected final String TEXT_11 = " = resultadoLista.get";
  protected final String TEXT_12 = "(pos++);" + NL + "\t  ";
  protected final String TEXT_13 = NL + "\t  objeto.";
  protected final String TEXT_14 = " = Cripto.Descriptograf(resultadoLista.get";
  protected final String TEXT_15 = "(pos++));" + NL + "\t  ";
  protected final String TEXT_16 = NL + "      return objeto;" + NL + "\t}" + NL + "\tpublic int quantidadeCampos()  {" + NL + "      return ";
  protected final String TEXT_17 = ";" + NL + "\t}" + NL + "" + NL + "}" + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    
		Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
		while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();	
		if (!atributo.ehCriptoNome()) {
		
    stringBuffer.append(TEXT_10);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( atributo.getTipoFuncaoMontador() );
    stringBuffer.append(TEXT_12);
     } else { 
    stringBuffer.append(TEXT_13);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( atributo.getTipoFuncaoMontador() );
    stringBuffer.append(TEXT_15);
    
	  	 } // if
		} // while
	
    stringBuffer.append(TEXT_16);
    stringBuffer.append( "" + classe.getListaAtributoTotal().size() );
    stringBuffer.append(TEXT_17);
    return stringBuffer.toString();
  }
}
