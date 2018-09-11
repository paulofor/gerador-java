package jet.android.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class Montador
{
  protected static String nl;
  public static synchronized Montador create(String lineSeparator)
  {
    nl = lineSeparator;
    Montador result = new Montador();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao.montador;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".modelo.";
  protected final String TEXT_4 = ";" + NL + "import ";
  protected final String TEXT_5 = ".modelo.vo.FabricaVo;" + NL + "import android.database.Cursor;" + NL + "import br.com.digicom.dao.MontadorDaoBase;" + NL + "import br.com.digicom.dao.MontadorDaoI;" + NL + "import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "import br.com.digicom.modelo.ObjetoSinc;" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_6 = "Montador extends MontadorDaoBase implements MontadorDaoI{" + NL + "" + NL + "\t" + NL + "\t// Existem casos em que o tratamento do objeto sinc esta" + NL + "\t// no metodo do DAO porem para aa listaInterna usando DaoComposite" + NL + "\t// que se trata de algo mais complexo o tratamento esta " + NL + "\t// nesse flag, no futuro poderemos evoluir todos para esse formato." + NL + "\tprivate boolean sinc = false;" + NL + "\tpublic ";
  protected final String TEXT_7 = "Montador(boolean sinc) {" + NL + "\t\tthis.sinc = sinc;" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_8 = "Montador() {" + NL + "\t\tthis.sinc = false;" + NL + "\t}" + NL + "\tpublic void desligaSinc() {" + NL + "\t\tthis.sinc = false;" + NL + "\t}" + NL + "" + NL + "\tpublic DCIObjetoDominio getItemSinc(Cursor c) {" + NL + "\t\treturn super.getItemSinc(c);" + NL + "\t}" + NL + "" + NL + "\tpublic boolean getItemListaInterna(Cursor c, DCIObjetoDominio objeto)" + NL + "    {" + NL + "    \tobjeto = ((MontadorDaoI)this).getItem(c);" + NL + "        return true;" + NL + "    }" + NL + "    public boolean getItemRegistroInterno(Cursor c, DCIObjetoDominio objeto)" + NL + "    {" + NL + "    \tobjeto = ((MontadorDaoI)this).getItem(c);" + NL + "        return true;" + NL + "    }" + NL + "" + NL + "\tpublic DCIObjetoDominio getItem(Cursor c) {" + NL + "\t\tDCIObjetoDominio objeto = null;" + NL + "\t\tobjeto = FabricaVo.cria";
  protected final String TEXT_9 = "();" + NL + "\t\treturn getItem(c, objeto, 0);" + NL + "\t}" + NL + "\tpublic DCIObjetoDominio getItem(Cursor c, int pos) {" + NL + "\t\tDCIObjetoDominio objeto = null;" + NL + "\t\tobjeto = FabricaVo.cria";
  protected final String TEXT_10 = "();" + NL + "\t\treturn getItem(c, objeto, pos);" + NL + "\t}" + NL + "" + NL + "\tpublic DCIObjetoDominio getItem(Cursor c, DCIObjetoDominio entrada, int pos) {" + NL + "\t\t";
  protected final String TEXT_11 = " item = null;" + NL + "\t\titem = (";
  protected final String TEXT_12 = ") entrada;";
  protected final String TEXT_13 = "item.set";
  protected final String TEXT_14 = "(get";
  protected final String TEXT_15 = "(c,pos++));" + NL + "\t\t";
  protected final String TEXT_16 = "item.set";
  protected final String TEXT_17 = "(getInt(c,pos++));" + NL + "\t\t";
  protected final String TEXT_18 = "if (sinc) {" + NL + "\t\t\t((ObjetoSinc)item).setOperacaoSinc(getString(c,pos++));" + NL + "\t\t}" + NL + "\t\treturn item;" + NL + "\t}" + NL + "   \tpublic int quantidadeCampos()  {" + NL + "   \t\treturn (sinc?";
  protected final String TEXT_19 = "+1:";
  protected final String TEXT_20 = ");" + NL + " \t}" + NL + "}";
  protected final String TEXT_21 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    
	AtributoWrapper atributoW = new AtributoWrapperAndroid();
	AtributoWrapper chaveW = new AtributoWrapperAndroid();
	chaveW.setBase(classe.getChave());
	

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
     
        Iterator<AtributoEntidade>  iterador = classe.getListaAtributoEntidade().iterator(); 
        int ind=0;
		while (iterador.hasNext()) {
        	atributoW.setBase(iterador.next());
		
    stringBuffer.append(TEXT_13);
    stringBuffer.append( atributoW.getNomePropriedade() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( atributoW.getMetodoObtemSqlite() );
    stringBuffer.append(TEXT_15);
    
		}
		Iterator<RelacionamentoWrapper> iteradorRel1 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (iteradorRel1.hasNext()) {
			RelacionamentoWrapper relCorrente = iteradorRel1.next();
		
    stringBuffer.append(TEXT_16);
    stringBuffer.append( relCorrente.getNomePropriedade() );
    stringBuffer.append(TEXT_17);
    
		}
		
    stringBuffer.append(TEXT_18);
    stringBuffer.append( "" + classe.getListaAtributoTotal().size() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( "" + classe.getListaAtributoTotal().size() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append(TEXT_21);
    return stringBuffer.toString();
  }
}
