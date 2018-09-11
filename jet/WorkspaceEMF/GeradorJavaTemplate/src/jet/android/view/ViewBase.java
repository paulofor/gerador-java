package jet.android.view;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ViewBase
{
  protected static String nl;
  public static synchronized ViewBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ViewBase result = new ViewBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".view.base;" + NL + "" + NL + "import android.app.ActionBar;" + NL + "import android.content.Context;" + NL + "import android.view.inputmethod.InputMethodManager;" + NL + "import android.view.View;" + NL + "import br.com.digicom.multimidia.AudioRecurso;" + NL + "import br.com.digicom.quadro.BaseFragment;" + NL + "import br.com.digicom.layout.ResourceObj;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.";
  protected final String TEXT_5 = ";" + NL + "import ";
  protected final String TEXT_6 = ".app.Constantes;" + NL + "" + NL + "// Mudanca no View para se manter dentro do padrao das demais" + NL + "// classes de UI" + NL + "public abstract class ";
  protected final String TEXT_7 = "ViewBase extends BaseFragment{" + NL + "\t" + NL + "\t" + NL + "\t//Construtor antigo" + NL + "\tpublic ";
  protected final String TEXT_8 = "ViewBase(Context context, ";
  protected final String TEXT_9 = " item) {" + NL + "\t\tthrow new UnsupportedOperationException(\"Usar o construtor novo de ";
  protected final String TEXT_10 = "View\");" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic String getTituloTela() {" + NL + "\t\treturn \"Alterar em \" + this.getClass().getSimpleName();" + NL + "\t}" + NL + "\t" + NL + "\tprivate ";
  protected final String TEXT_11 = " item;" + NL + "\t" + NL + "\tprotected ";
  protected final String TEXT_12 = " getItem() {" + NL + "\t\tthis.item.setContexto(getContext()); // Estranhamente esse dado se perde." + NL + "\t\treturn item;" + NL + "\t}" + NL + "\t" + NL + "\t// Mantendo o objeto no construtor, porque nao faz sentido criar um View sem um" + NL + "\t// objeto para ser exibido." + NL + "\t" + NL + "\t// Se existisse um View <<digicom>> colocaria l? o construtor." + NL + "\tpublic ";
  protected final String TEXT_13 = "ViewBase(";
  protected final String TEXT_14 = " item) {" + NL + "\t\tsuper();" + NL + "\t\tthis.item = item;" + NL + "\t\t" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void audioRawConcluido(AudioRecurso audioRecurso) {" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic void onAlteraQuadro() {" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void onResume() {" + NL + "\t\tsuper.onResume();" + NL + "\t\tthis.onAlteraQuadro();" + NL + "\t\tthis.getActivity().getActionBar().removeAllTabs();" + NL + "\t\tthis.getActivity().getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tprotected ResourceObj getLayoutTela() {" + NL + "\t\tthrow new UnsupportedOperationException(\"Fazer override de getLayoutTela em \" + this.getClass().getSimpleName() + \" retornando view_";
  protected final String TEXT_15 = " ou similar\");" + NL + "\t}" + NL + "\t// Dois metodos com mesmo objetivo. Excluir at? 21-07-2015 ( 3 meses )" + NL + "\t// TelaListaUsoBase, TelaQuadroListaBase, ViewBase" + NL + "\t" + NL + "" + NL + "\t@Override" + NL + "\tprotected void inicializaItensTela() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tprotected void inicializaServicos() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tprotected void carregaElementosTela() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tprotected void inicializaListeners() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tprotected void inicioJogoTela() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "\t" + NL + "\tprotected void retornaTela() {" + NL + "\t\tif (getUltimoCampo()!=null) {" + NL + "\t\t\tInputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);" + NL + "\t\t\timm.hideSoftInputFromWindow(getUltimoCampo().getWindowToken(), 0);" + NL + "\t\t}" + NL + "\t\tgetFragmentManager().popBackStack();" + NL + "\t}" + NL + "\tprotected View getUltimoCampo() {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic final void extraiBundle() {" + NL + "\t\titem = (";
  protected final String TEXT_16 = ") this.getBundle().getObjeto(Constantes.CHAVE_";
  protected final String TEXT_17 = ");" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespace() );
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
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_17);
    return stringBuffer.toString();
  }
}
