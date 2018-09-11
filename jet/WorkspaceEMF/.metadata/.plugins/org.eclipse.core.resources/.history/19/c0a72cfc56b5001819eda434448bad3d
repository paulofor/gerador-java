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
  protected final String TEXT_4 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_5 = ".framework.tela.ResourceObj;" + NL + "import ";
  protected final String TEXT_6 = ".framework.util.ItemChoiceManager;" + NL + "import java.util.List;" + NL + "import ";
  protected final String TEXT_7 = ".modelo.";
  protected final String TEXT_8 = ";" + NL + "import com.bumptech.glide.Glide;" + NL + "import android.widget.ImageView;" + NL + "import ";
  protected final String TEXT_9 = ".template.R;" + NL + "import ";
  protected final String TEXT_10 = ".framework.storage.DownloadImageTask;" + NL + "" + NL + "import com.bumptech.glide.Glide;" + NL + "import com.bumptech.glide.load.engine.DiskCacheStrategy;" + NL + "" + NL + "import ";
  protected final String TEXT_11 = ".template.R;" + NL + "" + NL + "/**" + NL + " * Created by Gerador de Codigo." + NL + " */" + NL + "public abstract class ";
  protected final String TEXT_12 = "ListAdapterBase extends RecyclerView.Adapter<";
  protected final String TEXT_13 = "ListViewHolderBase>{" + NL + "" + NL + "    //protected Cursor mCursor;" + NL + "    protected List<";
  protected final String TEXT_14 = "> mLista;" + NL + "    private Context mContext;" + NL + "    private ";
  protected final String TEXT_15 = "ListAdapterOnClickHandler mClickHandler;" + NL + "    private View mEmptyView;" + NL + "    private ItemChoiceManager mICM = null;" + NL + "    protected ResourceObj resourceObj = getLayoutItemResource();" + NL + "" + NL + "    public ";
  protected final String TEXT_16 = "ListAdapterBase(Context context, ";
  protected final String TEXT_17 = "ListAdapterOnClickHandler dh, View emptyView, int choiceMode) {" + NL + "        mContext = context;" + NL + "        mClickHandler = dh;" + NL + "        mEmptyView = emptyView;" + NL + "        //mICM = new ItemChoiceManager(this);" + NL + "        //mICM.setChoiceMode(choiceMode);" + NL + "    }" + NL + "" + NL + "" + NL + "    @Override" + NL + "    public final ";
  protected final String TEXT_18 = "ListViewHolderBase onCreateViewHolder(ViewGroup parent, int viewType) {" + NL + "        if ( parent instanceof RecyclerView ) {" + NL + "            int layoutId = -1;" + NL + "            layoutId = this.resourceObj.getCodigo();" + NL + "            View view = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);" + NL + "            // For?ando para o item de lista aparecer sem erros." + NL + "            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);" + NL + "            view.setLayoutParams(lp);" + NL + "            view.setFocusable(true);";
  protected final String TEXT_19 = NL + "            ";
  protected final String TEXT_20 = "ListViewHolderBase saida = getViewHolder(view);" + NL + "            //DCLog.d(DCLog.TRACE_DISPLAY,this,\"(Adapter)\" + this.getClass().getSimpleName() + \" / \" + saida.getClass().getSimpleName());" + NL + "            saida.setLista(this.mLista);" + NL + "            saida.setOnClickHandler(this.mClickHandler);" + NL + "            return saida;" + NL + "        } else {" + NL + "            throw new RuntimeException(\"Not bound to RecyclerView\");" + NL + "        }" + NL + "    }" + NL + "" + NL + "    //protected abstract int getItemLayoutId() ;" + NL + "    protected abstract ResourceObj getLayoutItemResource();" + NL + "    protected abstract ";
  protected final String TEXT_21 = "ListViewHolderBase getViewHolder(View v);" + NL + "" + NL + "\tpublic String getLayoutItem() {" + NL + "\t\treturn resourceObj.getNome();" + NL + "\t}" + NL + "" + NL + "" + NL + "    @Override" + NL + "    public final int getItemCount() {" + NL + "        if ( null == mLista) return 0;" + NL + "        return mLista.size();" + NL + "    }" + NL + "    public final void onRestoreInstanceState(Bundle savedInstanceState) {" + NL + "        //mICM.onRestoreInstanceState(savedInstanceState);" + NL + "    }" + NL + "" + NL + "    public final void onSaveInstanceState(Bundle outState) {" + NL + "        //mICM.onSaveInstanceState(outState);" + NL + "    }" + NL + "" + NL + "" + NL + "    public final void swapCursor(List<";
  protected final String TEXT_22 = "> novaLista) {" + NL + "        //mCursor = newCursor;" + NL + "        mLista = novaLista;" + NL + "        notifyDataSetChanged();" + NL + "        mEmptyView.setVisibility(getItemCount() == 0 ? View.VISIBLE : View.GONE);" + NL + "    }" + NL + "" + NL + "    public static interface ";
  protected final String TEXT_23 = "ListAdapterOnClickHandler {" + NL + "        void onClick(int id, ";
  protected final String TEXT_24 = "ListViewHolderBase vh);" + NL + "    }" + NL + "    " + NL + "    " + NL + "    @Override" + NL + "    public void onBindViewHolder(";
  protected final String TEXT_25 = "ListViewHolderBase holder, int position) {";
  protected final String TEXT_26 = NL + "        ";
  protected final String TEXT_27 = " obj = mLista.get(position);" + NL + "        holder.setItem(obj);" + NL + "        onBindViewHolderDC(obj,holder,position);" + NL + "    }" + NL + "" + NL + "    protected abstract void onBindViewHolderDC(";
  protected final String TEXT_28 = " item,";
  protected final String TEXT_29 = "ListViewHolderBase holder, int position);" + NL + "    " + NL + "    " + NL + "    //protected void setImagemFromUrl(ImageView obj, String urlImagem) {" + NL + "    //    new DownloadImageTask(obj).execute(urlImagem);" + NL + "    //}" + NL + "    /*" + NL + "    protected void setImagemFromUrl(ImageView obj, String urlImagem) {" + NL + "        Glide.with(mContext)" + NL + "                .load(urlImagem)" + NL + "                .asBitmap()" + NL + "                .error(R.drawable.img_nao_disponivel)" + NL + "                .into(obj)" + NL + "                .getRequest();" + NL + "    }" + NL + "    */" + NL + "    " + NL + "    protected void carregaImagemCache(String urlImagem, ImageView viewImagem) {" + NL + "        Glide.with(mContext)" + NL + "                .load(urlImagem)" + NL + "                .error(R.drawable.img_nao_disponivel)" + NL + "                .diskCacheStrategy(DiskCacheStrategy.ALL)" + NL + "                .into(viewImagem);" + NL + "    }" + NL + "}";
  protected final String TEXT_30 = NL;

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
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaClasse() );
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append(TEXT_30);
    return stringBuffer.toString();
  }
}
