package jet.android2.framework.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class MontadorDaoComposite
{
  protected static String nl;
  public static synchronized MontadorDaoComposite create(String lineSeparator)
  {
    nl = lineSeparator;
    MontadorDaoComposite result = new MontadorDaoComposite();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".framework.data;" + NL + "" + NL + "" + NL + "import android.database.Cursor;" + NL + "" + NL + "import java.lang.reflect.InvocationTargetException;" + NL + "import java.lang.reflect.Method;" + NL + "import java.util.LinkedList;" + NL + "import java.util.List;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".framework.dao.DaoException;" + NL + "import ";
  protected final String TEXT_5 = ".framework.dao.DaoItemRetorno;" + NL + "import ";
  protected final String TEXT_6 = ".framework.dao.MontadorDaoI;" + NL + "import ";
  protected final String TEXT_7 = ".framework.modelo.DCIObjetoDominio;" + NL + "" + NL + "public class MontadorDaoComposite implements MontadorDaoI {" + NL + "" + NL + "\tprivate List classes;" + NL + "\tprivate List<MontadorDaoI> montadores;" + NL + "\tprivate List<String> propriedades;" + NL + "\t" + NL + "\tpublic MontadorDaoComposite() {" + NL + "\t\tclasses = new LinkedList();" + NL + "\t\tmontadores = new LinkedList<MontadorDaoI>();" + NL + "\t\tpropriedades = new LinkedList<String>();" + NL + "\t}" + NL + "\t" + NL + "\tpublic void desligaSinc() {" + NL + "\t\tfor (MontadorDaoI montador:montadores) {" + NL + "\t\t\tmontador.desligaSinc();" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\tpublic void adicionaMontador(MontadorDaoI montador, String nomePropriedade) {" + NL + "\t\tmontadores.add(montador);" + NL + "\t\tpropriedades.add(nomePropriedade);" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic DCIObjetoDominio getItem(Cursor c, int posicao) {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t" + NL + "\tprivate MontadorDaoI getMontador(int idx) {" + NL + "\t\tMontadorDaoI montador = montadores.get(idx);" + NL + "\t\tif (montador instanceof MontadorDaoComposite) " + NL + "\t\t\tthrow new RuntimeException(\"Montador composto nao pode obter outro montador composto\");" + NL + "\t\treturn montador;" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic DCIObjetoDominio getItem(Cursor c) {" + NL + "\t\tObject objFinal = null;" + NL + "\t\tint posicao = 0;" + NL + "\t\tString propriedade = null;" + NL + "\t\tMontadorDaoI oi = getMontador(0);" + NL + "\t\tDCIObjetoDominio objCorrente = oi.getItem(c);" + NL + "\t\tposicao += oi.quantidadeCampos();" + NL + "\t\tfor (int i = 1; i < this.montadores.size(); i++)" + NL + "\t\t{" + NL + "\t\t\tpropriedade = (String) this.propriedades.get(i);" + NL + "\t\t\toi = getMontador(i);" + NL + "\t\t\ttry {" + NL + "" + NL + "\t\t\t\tClass classeVo = obtemClasseVo(objCorrente);" + NL + "\t\t\t\tDCIObjetoDominio dominio2 = oi.getItem(c, posicao);" + NL + "\t\t\t\tClass classeDominio2 = obtemClasseInterface(dominio2);" + NL + "\t\t\t\tMethod metodo = null;" + NL + "\t\t\t\ttry {" + NL + "\t\t\t\t\tmetodo = classeVo.getMethod(\"set\" + propriedade, new Class[] {classeDominio2});" + NL + "\t\t\t\t} catch (NoSuchMethodException e) {" + NL + "\t\t\t\t\t// Uma visao mais simplificada do problema, desenvolver melhor depois" + NL + "\t\t\t\t\tmetodo = classeVo.getMethod(\"addLista\" + propriedade, new Class[] {classeDominio2});" + NL + "\t\t\t\t}" + NL + "\t\t\t\tmetodo.invoke(objCorrente, dominio2);" + NL + "\t\t\t} catch (Exception e) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "\t\t\t//PropertyInfo info = this.posicionaObjeto(objCorrente, propriedade, objFinal);" + NL + "\t\t\t//DCIObjetoDominio dominio2 = oi.getItem(c, posicao);" + NL + "\t\t\t//info.SetValue(objFinal, dominio2, null);" + NL + "\t\t\tposicao += oi.quantidadeCampos();" + NL + "\t\t}" + NL + "\t\treturn objCorrente;" + NL + "\t}" + NL + "\t" + NL + "\tprivate Class obtemClasseVo(Object objeto) throws ClassNotFoundException{" + NL + "\t\t//Class classe = objeto.getClass();" + NL + "\t\t//String nome = classe.getName();" + NL + "\t\t//String nome2 = nome.replaceAll(\"derivada.impl\", \"vo\");" + NL + "\t\t//String nomeVo = nome2.replaceAll(\"Derivada\", \"Vo\");" + NL + "\t\t//Class classeVo = Class.forName(nomeVo);" + NL + "\t\t//return classeVo;" + NL + "\t\treturn objeto.getClass();" + NL + "\t}" + NL + "\tprivate Class obtemClasseInterface(Object objeto) throws ClassNotFoundException{" + NL + "\t\tClass classe = objeto.getClass();" + NL + "\t\tString nome = classe.getName();" + NL + "\t\tString nome2 = nome.replaceAll(\".vo\", \"\");" + NL + "\t\tString nomeVo = nome2.replaceAll(\"Vo\", \"\");" + NL + "\t\tClass classeVo = Class.forName(nomeVo);" + NL + "\t\treturn classeVo;" + NL + "\t}" + NL + "\t" + NL + "\tpublic int quantidadeCampos()" + NL + "\t{" + NL + "\t\treturn 0;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic DCIObjetoDominio getItemSinc(Cursor c) {" + NL + "\t\tthrow new UnsupportedOperationException(\"MontadorDaoComposite nao trabalha com getItemSinc\");" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic DaoItemRetorno extraiRegistroListaInterna(" + NL + "\t\t\tCursor paramResultadoLista, DCIObjetoDominio objeto)" + NL + "\t\t\tthrows DaoException, ClassNotFoundException, NoSuchMethodException," + NL + "\t\t\tInvocationTargetException, IllegalAccessException {" + NL + "\t\tDaoItemRetorno itemRetorno = new DaoItemRetorno();" + NL + "\t\tboolean saida = false;" + NL + "" + NL + "\t\tObject objAux = null;" + NL + "\t\tif (objeto == null) {" + NL + "\t\t\t// Objeto Principal - Inicial" + NL + "\t\t\tint posicao = 0;" + NL + "\t\t\tString propriedade = null;" + NL + "\t\t\tMontadorDaoI oi = getMontador(0);" + NL + "\t\t\t// Obtem o primeiro objeto" + NL + "\t\t\tobjeto = oi.getItem(paramResultadoLista);" + NL + "\t\t\tposicao += oi.quantidadeCampos();" + NL + "\t\t\tfor (int i = 1; i < this.montadores.size(); i++) {" + NL + "\t\t\t\t// loop nos montadores" + NL + "\t\t\t\tpropriedade = (String) this.propriedades.get(i);" + NL + "\t\t\t\tString listaProp[] = propriedade.split(\"\\\\.\");" + NL + "\t\t\t\tString propriedadeCorrente = listaProp[listaProp.length-1];" + NL + "\t\t\t\toi = getMontador(i);" + NL + "\t\t\t\t// posiciona objeto que vai ter o metodo set acionado" + NL + "\t\t\t\tobjAux = posicionaObjeto(objeto, propriedade);" + NL + "\t\t\t\t// novo objeto" + NL + "\t\t\t\tDCIObjetoDominio obj2 = oi.getItem(paramResultadoLista,posicao);" + NL + "\t\t\t\tposicao += oi.quantidadeCampos();" + NL + "\t\t\t\t// seta objeto" + NL + "\t\t\t\tif (obj2.getIdObj()!=0) {" + NL + "\t\t\t\t\tClass classeVo = obtemClasseVo(objAux);" + NL + "\t\t\t\t\tClass classeDominio2 = obtemClasseInterface(obj2);" + NL + "\t\t\t\t\tMethod metodo = this.getMetodoSet(classeVo, propriedadeCorrente, classeDominio2);" + NL + "\t\t\t\t\tmetodo.invoke(objAux, obj2);" + NL + "\t\t\t\t}" + NL + "\t\t\t\t// Insercaoo" + NL + "\t\t\t\tsaida = true;" + NL + "\t\t\t}" + NL + "\t\t} else {" + NL + "\t\t\t// Ja existe um objeto" + NL + "\t\t\tint posicao = 0;" + NL + "\t\t\tString propriedade = null;" + NL + "\t\t\tMontadorDaoI oi = getMontador(0);" + NL + "\t\t\t// Obteve primeiro objeto do pr?ximo registro" + NL + "\t\t\tDCIObjetoDominio objetoNovo = oi.getItem(paramResultadoLista);" + NL + "\t\t\tif (objetoNovo.getIdObj() == objeto.getIdObj()) {" + NL + "\t\t\t\t// Se for o mesmo significa que ? um objeto para adicionar em" + NL + "\t\t\t\t// lista" + NL + "\t\t\t\tposicao += oi.quantidadeCampos();" + NL + "\t\t\t\tfor (int i = 1; i < this.montadores.size(); i++) {" + NL + "\t\t\t\t\t// posiciona objeto que vai ter o metodo set acionado" + NL + "\t\t\t\t\tpropriedade = (String) this.propriedades.get(i);" + NL + "\t\t\t\t\toi = getMontador(i);" + NL + "\t\t\t\t\tobjAux = posicionaObjeto(objeto, propriedade);" + NL + "\t\t\t\t\t// novo objeto" + NL + "\t\t\t\t\tDCIObjetoDominio obj2 = oi.getItem(paramResultadoLista, posicao);" + NL + "\t\t\t\t\t// seta objeto dentro do que ja esta na lista" + NL + "\t\t\t\t\tif (obj2.getIdObj()!=0) {" + NL + "\t\t\t\t\t\tClass classeVo = obtemClasseVo(objAux);" + NL + "\t\t\t\t\t\tClass classeDominio2 = obtemClasseInterface(obj2);" + NL + "\t\t\t\t\t\tString[] prop = propriedade.split(\"\\\\.\");" + NL + "\t\t\t\t\t\tMethod metodo = this.getMetodoSet(classeVo, prop[prop.length-1], classeDominio2);" + NL + "\t\t\t\t\t\tmetodo.invoke(objAux, obj2);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tposicao += oi.quantidadeCampos();" + NL + "\t\t\t\t}" + NL + "\t\t\t\tsaida = false;" + NL + "\t\t\t} else {" + NL + "\t\t\t\t// E um novo objeto principal para ser incluido na lista" + NL + "\t\t\t\tobjeto = objetoNovo;" + NL + "\t\t\t\tposicao += oi.quantidadeCampos();" + NL + "\t\t\t\tfor (int i = 1; i < this.montadores.size(); i++) {" + NL + "\t\t\t\t\t// loop nos montadores" + NL + "\t\t\t\t\tpropriedade = (String) this.propriedades.get(i);" + NL + "\t\t\t\t\tString listaProp[] = propriedade.split(\"\\\\.\");" + NL + "\t\t\t\t\tString propriedadeCorrente = listaProp[listaProp.length-1];" + NL + "\t\t\t\t\toi = getMontador(i);" + NL + "\t\t\t\t\t// posiciona objeto que vai ter o metodo set acionado" + NL + "\t\t\t\t\tobjAux = posicionaObjeto(objeto, propriedade);" + NL + "\t\t\t\t\t// novo objeto" + NL + "\t\t\t\t\tDCIObjetoDominio obj2 = oi.getItem(paramResultadoLista,posicao);" + NL + "\t\t\t\t\tposicao += oi.quantidadeCampos();" + NL + "\t\t\t\t\t// seta objeto" + NL + "\t\t\t\t\tif (obj2.getIdObj()!=0) {" + NL + "\t\t\t\t\t\tClass classeVo = obtemClasseVo(objAux);" + NL + "\t\t\t\t\t\tClass classeDominio2 = obtemClasseInterface(obj2);" + NL + "\t\t\t\t\t\tMethod metodo = this.getMetodoSet(classeVo, propriedadeCorrente, classeDominio2);" + NL + "\t\t\t\t\t\tmetodo.invoke(objAux, obj2);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t\tsaida = true;" + NL + "\t\t\t}" + NL + "" + NL + "\t\t}" + NL + "\t\titemRetorno.setInsere(saida);" + NL + "\t\titemRetorno.setObjeto(objeto);" + NL + "\t\treturn itemRetorno;" + NL + "\t}" + NL + "" + NL + "\tprivate Object posicionaObjeto(Object objetoRaiz, String propriedade)" + NL + "\t\t\tthrows ClassNotFoundException, NoSuchMethodException," + NL + "\t\t\tInvocationTargetException, IllegalAccessException {" + NL + "\t\t// Percorrendo a arvore de objetos ate chegar no desejado." + NL + "\t\tDCIObjetoDominio proximoObjeto;" + NL + "\t\tObject saida = objetoRaiz;" + NL + "\t\tif (propriedade==null)  return saida;" + NL + "\t\tString[] prop = propriedade.split(\"\\\\.\");" + NL + "\t\tfor (int i = 0; i < prop.length-1; i++) {" + NL + "\t\t\tString propCorrente = prop[i];" + NL + "\t\t\tClass classeVo = saida.getClass();" + NL + "\t\t\tMethod metodo = classeVo.getMethod(\"get\" + propCorrente);" + NL + "\t\t\t//Method metodo = classeVo.getMethod(\"getCorrente\" + propCorrente);" + NL + "\t\t\tObject obj = metodo.invoke(saida,null);" + NL + "\t\t\tsaida = obj;" + NL + "\t\t}" + NL + "" + NL + "\t\treturn saida;" + NL + "" + NL + "\t}" + NL + "" + NL + "\tprivate Method getMetodoSet(Class classeVo, String propriedade, Class classeSet) throws NoSuchMethodException {" + NL + "\t\tMethod saida = null;" + NL + "\t\ttry {" + NL + "\t\t\tsaida = classeVo.getMethod(\"set\" + propriedade,\tnew Class[] { classeSet });" + NL + "\t\t} catch (NoSuchMethodException e) {" + NL + "\t\t\tsaida = classeVo.getMethod(\"addLista\" + propriedade,\tnew Class[] { classeSet });" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "" + NL + "" + NL + "\t" + NL + "}";
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
