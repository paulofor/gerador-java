package jet.android2.modelo;

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
  protected final String TEXT_2 = ".modelo.montador;" + NL + "" + NL + "import java.lang.reflect.InvocationTargetException;" + NL + "import java.sql.Timestamp;" + NL + "import java.text.DateFormat;" + NL + "import java.text.ParseException;" + NL + "import java.text.SimpleDateFormat;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".modelo.";
  protected final String TEXT_4 = ";" + NL + "import ";
  protected final String TEXT_5 = ".modelo.";
  protected final String TEXT_6 = "Vo;" + NL + "//import ";
  protected final String TEXT_7 = ".modelo.vo.FabricaVo;" + NL + "import android.database.Cursor;" + NL + "//import br.com.digicom.dao.MontadorDaoBase;" + NL + "//import br.com.digicom.dao.MontadorDaoI;" + NL + "//import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "//import br.com.digicom.modelo.ObjetoSinc;" + NL + "import ";
  protected final String TEXT_8 = ".framework.modelo.ObjetoSinc;" + NL + "import ";
  protected final String TEXT_9 = ".framework.modelo.DCIObjetoDominio;" + NL + "import ";
  protected final String TEXT_10 = ".framework.dao.MontadorDaoI;" + NL + "import ";
  protected final String TEXT_11 = ".framework.modelo.ObjetoSinc;" + NL + "import ";
  protected final String TEXT_12 = ".framework.dao.DaoException;" + NL + "import ";
  protected final String TEXT_13 = ".framework.dao.DaoItemRetorno;" + NL + "" + NL + "public class ";
  protected final String TEXT_14 = "Montador implements MontadorDaoI {" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_15 = " principal = new ";
  protected final String TEXT_16 = "Vo();" + NL + "\t" + NL + "\tprivate boolean sinc = false;" + NL + "\tpublic ";
  protected final String TEXT_17 = "Montador(boolean sinc) {" + NL + "\t\tthis.sinc = sinc;" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_18 = "Montador() {" + NL + "\t\tthis.sinc = false;" + NL + "\t}" + NL + "\tpublic void desligaSinc() {" + NL + "\t\tthis.sinc = false;" + NL + "\t}" + NL + "" + NL + "\tpublic DCIObjetoDominio getItemSinc(Cursor c) {" + NL + "\t\tDCIObjetoDominio obj = getItem(c);" + NL + "\t\t((ObjetoSinc)obj).setOperacaoSinc(getString(c,quantidadeCampos()));" + NL + "\t\treturn obj;" + NL + "\t}" + NL + "" + NL + "\tpublic boolean getItemListaInterna(Cursor c, DCIObjetoDominio objeto)" + NL + "    {" + NL + "    \tobjeto = ((MontadorDaoI)this).getItem(c);" + NL + "        return true;" + NL + "    }" + NL + "    public boolean getItemRegistroInterno(Cursor c, DCIObjetoDominio objeto)" + NL + "    {" + NL + "    \tobjeto = ((MontadorDaoI)this).getItem(c);" + NL + "        return true;" + NL + "    }" + NL + "" + NL + "\tpublic DCIObjetoDominio getItem(Cursor c) {" + NL + "\t\tDCIObjetoDominio objeto = null;" + NL + "\t\t//objeto = FabricaVo.cria";
  protected final String TEXT_19 = "();" + NL + "\t\tobjeto = new ";
  protected final String TEXT_20 = "Vo();" + NL + "\t\treturn getItem(c, objeto, 0);" + NL + "\t}" + NL + "\tpublic DCIObjetoDominio getItem(Cursor c, int pos) {" + NL + "\t\tDCIObjetoDominio objeto = null;" + NL + "\t\t//objeto = FabricaVo.cria";
  protected final String TEXT_21 = "();" + NL + "\t\tobjeto = new ";
  protected final String TEXT_22 = "Vo();" + NL + "\t\treturn getItem(c, objeto, pos);" + NL + "\t}" + NL + "" + NL + "\tpublic DCIObjetoDominio getItem(Cursor c, DCIObjetoDominio entrada, int pos) {" + NL + "\t\t";
  protected final String TEXT_23 = " item = null;" + NL + "\t\titem = (";
  protected final String TEXT_24 = ") entrada;" + NL + "\t\t";
  protected final String TEXT_25 = "item.set";
  protected final String TEXT_26 = "(get";
  protected final String TEXT_27 = "(c,pos++));" + NL + "\t\t";
  protected final String TEXT_28 = "item.set";
  protected final String TEXT_29 = "(this.getTimestampData(c,pos++));" + NL + "\t\t";
  protected final String TEXT_30 = "item.set";
  protected final String TEXT_31 = "(getInt(c,pos++));" + NL + "\t\t";
  protected final String TEXT_32 = NL + "\t\t";
  protected final String TEXT_33 = NL + "\t\titem.set";
  protected final String TEXT_34 = "(get";
  protected final String TEXT_35 = "(c,pos++)); " + NL + "\t\t";
  protected final String TEXT_36 = NL + "\t\t" + NL + "\t\t//if (sinc) {" + NL + "\t\t//\t((ObjetoSinc)item).setOperacaoSinc(getString(c,pos++));" + NL + "\t\t//}" + NL + "\t\treturn item;" + NL + "\t}" + NL + "   \tpublic int quantidadeCampos()  {" + NL + "   \t\treturn (sinc?";
  protected final String TEXT_37 = "+";
  protected final String TEXT_38 = "+1:";
  protected final String TEXT_39 = "+";
  protected final String TEXT_40 = ");" + NL + " \t}" + NL + " \t" + NL + " \tprotected String getString(Cursor c,int posicao) {" + NL + "\t\treturn c.getString(posicao);" + NL + "\t}" + NL + "\tprotected int getInt(Cursor c,int posicao) {" + NL + "\t\treturn c.getInt(posicao);" + NL + "\t}" + NL + "\tprotected boolean getLogic(Cursor c,int posicao) {" + NL + "\t\tint i= c.getInt(posicao);" + NL + "\t\treturn (i==1);" + NL + "\t}" + NL + "\tprotected float getFloat(Cursor c,int posicao) {" + NL + "\t\tfloat c1 = c.getFloat(posicao);" + NL + "\t\treturn c1;" + NL + "\t}" + NL + "\tprotected Timestamp getTimestamp(Cursor c,int posicao) {" + NL + "\t\tlong num = c.getLong(posicao);" + NL + "\t\tTimestamp ret = new Timestamp(num);" + NL + "\t\treturn ret;" + NL + "\t}" + NL + "\tprotected Timestamp getTimestampData(Cursor c,int posicao) {" + NL + "\t\tTimestamp saida = null;" + NL + "\t\tString idStr = String.valueOf(c.getLong(posicao));" + NL + "\t\tif (idStr==null) return null;;" + NL + "\t    DateFormat formatter = new SimpleDateFormat(\"yyyyMMdd\");" + NL + "\t    try {" + NL + "\t    \tjava.util.Date date = (java.util.Date)formatter.parse(idStr);" + NL + "\t\t    saida = new Timestamp(date.getTime());" + NL + "\t\t} catch (ParseException e) {" + NL + "\t\t\tsaida = null;" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tprotected Timestamp getTimestampDataHora(Cursor c,int posicao) {" + NL + "\t\tTimestamp saida = null;" + NL + "\t\tString idStr = String.valueOf(c.getLong(posicao));" + NL + "\t\tif (idStr==null) return null;;" + NL + "\t    DateFormat formatter = new SimpleDateFormat(\"yyyyMMddHHmmss\");" + NL + "\t    try {" + NL + "\t    \tjava.util.Date date = (java.util.Date)formatter.parse(idStr);" + NL + "\t\t    saida = new Timestamp(date.getTime());" + NL + "\t\t} catch (ParseException e) {" + NL + "\t\t\tsaida = null;" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic DaoItemRetorno extraiRegistroListaInterna(Cursor paramResultadoLista, DCIObjetoDominio objeto)" + NL + "\t\t    throws DaoException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {" + NL + "\t\tobjeto = ((MontadorDaoI)this).getItem(paramResultadoLista);" + NL + "\t\tDaoItemRetorno item = new DaoItemRetorno();" + NL + "\t\titem.setInsere(true);" + NL + "\t\titem.setObjeto(objeto);" + NL + "\t\treturn item;" + NL + "\t}" + NL + "" + NL + "\t" + NL + "\tpublic DaoItemRetorno extraiRegistroListaInternaSinc(Cursor paramResultadoLista, DCIObjetoDominio objeto)" + NL + "\t\t    throws DaoException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {" + NL + "\t\tobjeto = ((MontadorDaoI)this).getItem(paramResultadoLista);" + NL + "\t\tDaoItemRetorno item = new DaoItemRetorno();" + NL + "\t\titem.setInsere(true);" + NL + "\t\titem.setObjeto(objeto);" + NL + "\t\treturn item;" + NL + "\t}" + NL + "}";
  protected final String TEXT_41 = NL;

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
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
     
        Iterator<AtributoEntidade>  iterador = classe.getListaAtributoEntidade().iterator(); 
        int ind=0;
		while (iterador.hasNext()) {
        	atributoW.setBase(iterador.next());
        	if (!atributoW.ehData() || atributoW.ehHora()) {
		
    stringBuffer.append(TEXT_25);
    stringBuffer.append( atributoW.getNomePropriedade() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( atributoW.getMetodoObtemSqlite() );
    stringBuffer.append(TEXT_27);
      } else {	
		
    stringBuffer.append(TEXT_28);
    stringBuffer.append( atributoW.getNomePropriedade() );
    stringBuffer.append(TEXT_29);
    	}
		}
		Iterator<RelacionamentoWrapper> iteradorRel1 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (iteradorRel1.hasNext()) {
			RelacionamentoWrapper relCorrente = iteradorRel1.next();
		
    stringBuffer.append(TEXT_30);
    stringBuffer.append( relCorrente.getNomePropriedade() );
    stringBuffer.append(TEXT_31);
    
		}
		
    stringBuffer.append(TEXT_32);
     for (ProcValorWrapper proc : classe.getListaDerivadaDemanda()) { 
    stringBuffer.append(TEXT_33);
    stringBuffer.append( proc.getNomePropriedade() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( ((ProcValorWrapperAndroid)proc).getMetodoObtemSqlite() );
    stringBuffer.append(TEXT_35);
     } 
    stringBuffer.append(TEXT_36);
    stringBuffer.append( "" + classe.getListaAtributoTotal().size() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( "" + classe.getListaDerivadaDemanda().size() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( "" + classe.getListaAtributoTotal().size() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( "" + classe.getListaDerivadaDemanda().size() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append(TEXT_41);
    return stringBuffer.toString();
  }
}
