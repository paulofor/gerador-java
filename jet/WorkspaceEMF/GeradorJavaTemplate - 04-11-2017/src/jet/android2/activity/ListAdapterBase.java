package jet.android2.activity;

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
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".template.lista;" + NL + "" + NL + "import android.content.Context;" + NL + "import android.database.Cursor;" + NL + "import android.net.Uri;" + NL + "import android.os.Bundle;" + NL + "import android.support.v7.widget.RecyclerView;" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.View;" + NL + "import android.view.ViewGroup;" + NL + "import android.widget.TextView;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".framework.util.ItemChoiceManager;" + NL + "import java.util.List;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.";
  protected final String TEXT_6 = ";" + NL + "" + NL + "" + NL + "/**" + NL + " * Created by Gerador de Codigo." + NL + " */" + NL + "public abstract class ";
  protected final String TEXT_7 = "ListAdapterBase extends RecyclerView.Adapter<";
  protected final String TEXT_8 = "ListViewHolderBase>{" + NL + "" + NL + "    //protected Cursor mCursor;" + NL + "    protected List<";
  protected final String TEXT_9 = "> mLista;" + NL + "    private Context mContext;" + NL + "    private ";
  protected final String TEXT_10 = "ListAdapterOnClickHandler mClickHandler;" + NL + "    private View mEmptyView;" + NL + "    private ItemChoiceManager mICM = null;" + NL + "" + NL + "    public ";
  protected final String TEXT_11 = "ListAdapterBase(Context context, ";
  protected final String TEXT_12 = "ListAdapterOnClickHandler dh, View emptyView, int choiceMode) {" + NL + "        mContext = context;" + NL + "        mClickHandler = dh;" + NL + "        mEmptyView = emptyView;" + NL + "        //mICM = new ItemChoiceManager(this);" + NL + "        //mICM.setChoiceMode(choiceMode);" + NL + "    }" + NL + "" + NL + "" + NL + "    @Override" + NL + "    public final ";
  protected final String TEXT_13 = "ListViewHolderBase onCreateViewHolder(ViewGroup parent, int viewType) {" + NL + "        if ( parent instanceof RecyclerView ) {" + NL + "            int layoutId = -1;" + NL + "            layoutId = getItemLayoutId();" + NL + "            View view = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);" + NL + "            view.setFocusable(true);";
  protected final String TEXT_14 = NL + "            ";
  protected final String TEXT_15 = "ListViewHolderBase saida = getViewHolder(view);" + NL + "            saida.setLista(this.mLista);" + NL + "            saida.setOnClickHandler(this.mClickHandler);" + NL + "            return saida;" + NL + "        } else {" + NL + "            throw new RuntimeException(\"Not bound to RecyclerView\");" + NL + "        }" + NL + "    }" + NL + "" + NL + "    protected abstract int getItemLayoutId() ;" + NL + "    protected abstract ";
  protected final String TEXT_16 = "ListViewHolderBase getViewHolder(View v);" + NL + "" + NL + "" + NL + "" + NL + "    @Override" + NL + "    public final int getItemCount() {" + NL + "        if ( null == mLista) return 0;" + NL + "        return mLista.size();" + NL + "    }" + NL + "    public final void onRestoreInstanceState(Bundle savedInstanceState) {" + NL + "        //mICM.onRestoreInstanceState(savedInstanceState);" + NL + "    }" + NL + "" + NL + "    public final void onSaveInstanceState(Bundle outState) {" + NL + "        //mICM.onSaveInstanceState(outState);" + NL + "    }" + NL + "" + NL + "" + NL + "    public final void swapCursor(List<";
  protected final String TEXT_17 = "> novaLista) {" + NL + "        //mCursor = newCursor;" + NL + "        mLista = novaLista;" + NL + "        notifyDataSetChanged();" + NL + "        mEmptyView.setVisibility(getItemCount() == 0 ? View.VISIBLE : View.GONE);" + NL + "    }" + NL + "" + NL + "    public static interface ";
  protected final String TEXT_18 = "ListAdapterOnClickHandler {" + NL + "        void onClick(int id, ";
  protected final String TEXT_19 = "ListViewHolderBase vh);" + NL + "    }" + NL + "    " + NL + "    " + NL + "    @Override" + NL + "    public void onBindViewHolder(";
  protected final String TEXT_20 = "ListViewHolderBase holder, int position) {";
  protected final String TEXT_21 = NL + "        ";
  protected final String TEXT_22 = " obj = mLista.get(position);" + NL + "        holder.setItem(obj);" + NL + "        onBindViewHolderDC(obj,holder,position);" + NL + "    }" + NL + "" + NL + "    protected abstract void onBindViewHolderDC(";
  protected final String TEXT_23 = " item,";
  protected final String TEXT_24 = "ListViewHolderBase holder, int position);" + NL + "    " + NL + "}";
  protected final String TEXT_25 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
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
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append(TEXT_25);
    return stringBuffer.toString();
  }
}
