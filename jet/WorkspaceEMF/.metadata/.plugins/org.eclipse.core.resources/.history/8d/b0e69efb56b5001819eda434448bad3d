package jet.android.view;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ListAdapterBase
{
  protected static String nl;
  public static synchronized ListAdapterBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ListAdapterBase result = new ListAdapterBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package  ";
  protected final String TEXT_2 = ".view.adapter.base;" + NL + "" + NL + "import java.util.List;" + NL + "import android.content.Context;" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.MotionEvent;" + NL + "import android.view.View;" + NL + "import android.view.ViewGroup;" + NL + "import br.com.digicom.adapter.DCBaseAdapter;" + NL + "import android.view.View.OnTouchListener;" + NL + "import android.view.View.OnLongClickListener;" + NL + "import android.os.Vibrator;" + NL + "import ";
  protected final String TEXT_3 = ".app.R;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.";
  protected final String TEXT_5 = ";" + NL + "" + NL + "import br.com.digicom.layout.ItemLista;" + NL + "import br.com.digicom.quadro.IQuadroListaEdicao;" + NL + "import br.com.digicom.quadro.IFragment;" + NL + "import ";
  protected final String TEXT_6 = ".tela.quadro.base.";
  protected final String TEXT_7 = "QuadroListaBase;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_8 = "ListAdapterBase extends DCBaseAdapter implements OnTouchListener, OnLongClickListener{" + NL + "\t" + NL + "\tprivate Context context;" + NL + "\tprivate List<";
  protected final String TEXT_9 = "> lista;" + NL + "\t//private IQuadroListaEdicao raiz;" + NL + "\t" + NL + "\tprivate Vibrator v = null;" + NL + "\tprivate boolean edicao = false;" + NL + "" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_10 = "ListAdapterBase(List<";
  protected final String TEXT_11 = "> lista, Context context ) {" + NL + "\t\tthis.context = context;" + NL + "\t\tthis.lista = lista;" + NL + "\t\t//this.raiz = origem;" + NL + "\t}" + NL + "" + NL + "\t" + NL + "\tpublic Context getContextAndroid() {" + NL + "\t\treturn context;" + NL + "\t}" + NL + "" + NL + "\tprotected int getColor(int valor) {" + NL + "\t\treturn context.getResources().getColor(valor);" + NL + "\t}" + NL + "" + NL + "\t" + NL + "\t" + NL + "\tpublic int getCount() {" + NL + "\t\treturn lista.size();" + NL + "\t}" + NL + "\tpublic Object getItem(int position) {" + NL + "\t\treturn lista.get(position);" + NL + "\t}" + NL + "\tpublic long getItemId(int position) {" + NL + "\t\treturn position;" + NL + "\t}" + NL + "\t" + NL + "\tpublic View getView(int position, View convertView, ViewGroup parent) {" + NL + "\t\t";
  protected final String TEXT_12 = " item = lista.get(position);" + NL + "\t\t" + NL + "\t\tView saida = LayoutInflater.from(context).inflate(R.layout.item_";
  protected final String TEXT_13 = ", null);" + NL + "\t\tif (!(saida instanceof ItemLista))" + NL + "\t\t\tthrow new RuntimeException(\"Alterar layout raiz de R.layout.item_";
  protected final String TEXT_14 = " para br.com.digicom.layout.IItemLista\");" + NL + "\t\t((ItemLista)saida).setItem(item);" + NL + "\t\tthis.setTela(saida);" + NL + "\t\tmontaItemLista(position, item, saida);" + NL + "\t\t/*" + NL + "\t\tTextView nomeTxt = (TextView) saida.findViewById(R.id.Nome);" + NL + "\t\tTextView codigoTxt = (TextView) saida.findViewById(R.id.Codigo);" + NL + "\t\tnomeTxt.setText(item.getNome());" + NL + "\t\tcodigoTxt.setText(\"\" + item.getIdProdutoEstrategico());" + NL + "\t\t*/" + NL + "\t\tsaida.setOnTouchListener(this);" + NL + "\t\tsaida.setOnLongClickListener(this);" + NL + "\t\treturn saida;" + NL + "\t\t//return new ProdutoEstrategicoView(this.context, item );" + NL + "\t}" + NL + "\t" + NL + "\tprotected void montaItemLista(int posicao, ";
  protected final String TEXT_15 = " item, View saida) {" + NL + "\t\tthrow new UnsupportedOperationException(\"Fazer override de montaItemLista em \"  + this.getClass().getSimpleName() + \" ou verificar se nao esta sendo chamada via super. Arquivo de visao padrao eh: R.layout.item_";
  protected final String TEXT_16 = "\");" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic boolean onTouch(View view, MotionEvent avent) {" + NL + "\t \tItemLista objeto = (ItemLista) view;" + NL + "\t\t";
  protected final String TEXT_17 = " item = (";
  protected final String TEXT_18 = ") objeto.getItem();" + NL + "\t\tgetQuadroLista().onToqueTela(item);" + NL + "\t\treturn false;" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic boolean onLongClick(View view) {" + NL + "\t\tItemLista objeto = (ItemLista) view;" + NL + "\t\t";
  protected final String TEXT_19 = " item = (";
  protected final String TEXT_20 = ") objeto.getItem();" + NL + "\t\tif (edicao) {" + NL + "\t\t\tv.vibrate(500);" + NL + "\t\t}" + NL + "\t\t((IQuadroListaEdicao)getQuadroLista()).onToqueLongoTela(item);" + NL + "\t\treturn false;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "" + NL + "}";
  protected final String TEXT_21 = NL;

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
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append(TEXT_21);
    return stringBuffer.toString();
  }
}
