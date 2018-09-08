package jet.android2.activity;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ListFragmentBase
{
  protected static String nl;
  public static synchronized ListFragmentBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ListFragmentBase result = new ListFragmentBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".template.lista;" + NL + "" + NL + "import java.util.ArrayList;" + NL + "import java.util.List;" + NL + "" + NL + "import android.content.Context;" + NL + "import android.content.SharedPreferences;" + NL + "import android.database.Cursor;" + NL + "import android.net.Uri;" + NL + "import android.os.Bundle;" + NL + "import android.support.v4.app.Fragment;" + NL + "import android.support.v4.app.LoaderManager;" + NL + "import android.support.v4.app.FragmentActivity;" + NL + "import android.support.v4.content.CursorLoader;" + NL + "import android.support.v4.content.Loader;" + NL + "import android.support.v7.widget.LinearLayoutManager;" + NL + "import android.support.v7.widget.RecyclerView;" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.View;" + NL + "import android.view.ViewGroup;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".tela.base.activity.Constantes;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.";
  protected final String TEXT_6 = ";" + NL + "import ";
  protected final String TEXT_7 = ".data.contract.";
  protected final String TEXT_8 = "Contract;" + NL + "import ";
  protected final String TEXT_9 = ".template.R;" + NL + "import ";
  protected final String TEXT_10 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_11 = ".framework.tela.ResourceObj;" + NL + "import ";
  protected final String TEXT_12 = ".framework.dao.DBHelperBase;" + NL + "import ";
  protected final String TEXT_13 = ".framework.dao.MontadorDaoI;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_14 = "ListFragmentBase extends Fragment implements LoaderManager.LoaderCallbacks<Cursor>{" + NL + "" + NL + "    private RecyclerView mRecyclerView;" + NL + "    private ";
  protected final String TEXT_15 = "ListAdapterBase mAdapter;" + NL + "" + NL + "    private int mPosition = RecyclerView.NO_POSITION;" + NL + "    private int mChoiceMode;" + NL + "    private static final String SELECTED_KEY = \"selected_position\";" + NL + "    private static final int FORECAST_LOADER = 0;" + NL + "    private boolean mHoldForTransition;" + NL + "" + NL + "\tprotected ResourceObj resourceObj = getLayoutListaResource();" + NL + " \t//protected int getIdLayoutLista() { return R.layout.lista_padrao; }" + NL + "    protected int getIdRecLista() { return R.id.rec_lista_padrao; }" + NL + "    protected int getIdRecListaEmpty() { return R.id.txt_lista_padrao_vazia; }" + NL + "" + NL + "    public interface Callback {" + NL + "        //public void onItemSelected(Uri dateUri, NaturezaProdutoListAdapter.NaturezaProdutoListAdapterViewHolder vh);" + NL + "        public void onItemSelected(int idItemLista, ";
  protected final String TEXT_16 = "ListViewHolderBase vh);" + NL + "    }" + NL + "" + NL + "    public ";
  protected final String TEXT_17 = "ListFragmentBase() {" + NL + "    }" + NL + "" + NL + "\tprotected ResourceObj getLayoutListaResource() {" + NL + "        return new ResourceObj(R.layout.lista_padrao,\"R.layout.lista_padrao\");" + NL + "    }" + NL + "   " + NL + "" + NL + "" + NL + "    @Override" + NL + "    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {" + NL + "\t\tDCLog.d(DCLog.DISPLAY,this,this.getClass().getSimpleName());" + NL + "\t\t//recuperaPosicao();" + NL + "        View rootView = inflater.inflate(resourceObj.getCodigo(), container, false);" + NL + "" + NL + "        // Get a reference to the RecyclerView, and attach this adapter to it." + NL + "        mRecyclerView = (RecyclerView) rootView.findViewById(getIdRecLista());" + NL + "" + NL + "        // Set the layout manager" + NL + "        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));" + NL + "        View emptyView = rootView.findViewById(getIdRecListaEmpty());" + NL + "" + NL + "        // use this setting to improve performance if you know that changes" + NL + "        // in content do not change the layout size of the RecyclerView" + NL + "        mRecyclerView.setHasFixedSize(true);" + NL + "" + NL + "        // The ForecastAdapter will take data from a source and" + NL + "        // use it to populate the RecyclerView it's attached to." + NL + "        mAdapter = getListAdapter(getActivity(), new ";
  protected final String TEXT_18 = "ListAdapterBase.";
  protected final String TEXT_19 = "ListAdapterOnClickHandler() {" + NL + "            @Override" + NL + "            public void onClick(int idItemLista, ";
  protected final String TEXT_20 = "ListViewHolderBase vh) {" + NL + "                //String locationSetting = Utility.getPreferredLocation(getActivity());" + NL + "                ((Callback) getActivity()).onItemSelected(idItemLista, vh);" + NL + "                //registraPosicao(vh);" + NL + "                mPosition = vh.getAdapterPosition();" + NL + "            }" + NL + "        }, emptyView, mChoiceMode);" + NL + "" + NL + "        // specify an adapter (see also next example)" + NL + "        mRecyclerView.setAdapter(mAdapter);" + NL + "" + NL + "        // If there's instance state, mine it for useful information." + NL + "        // The end-goal here is that the user never knows that turning their device sideways" + NL + "        // does crazy lifecycle related things.  It should feel like some stuff stretched out," + NL + "        // or magically appeared to take advantage of room, but data or place in the app was never" + NL + "        // actually *lost*." + NL + "        if (savedInstanceState != null) {" + NL + "            if (savedInstanceState.containsKey(SELECTED_KEY)) {" + NL + "                // The Recycler View probably hasn't even been populated yet.  Actually perform the" + NL + "                // swapout in onLoadFinished." + NL + "                mPosition = savedInstanceState.getInt(SELECTED_KEY);" + NL + "            }" + NL + "            mAdapter.onRestoreInstanceState(savedInstanceState);" + NL + "        }" + NL + "" + NL + "\t\tSharedPreferences pref = getActivity().getSharedPreferences(\"";
  protected final String TEXT_21 = "\", Context.MODE_PRIVATE);" + NL + "        SharedPreferences.Editor edt = pref.edit();" + NL + "        inicializaListaInferior(edt);" + NL + "        edt.commit();" + NL + "" + NL + "        return rootView;" + NL + "    }" + NL + "" + NL + "\tprotected abstract void inicializaListaInferior(SharedPreferences.Editor edt);" + NL + "    protected abstract ";
  protected final String TEXT_22 = "ListAdapterBase getListAdapter(FragmentActivity activity, ";
  protected final String TEXT_23 = "ListAdapterBase.";
  protected final String TEXT_24 = "ListAdapterOnClickHandler onClickHandler, View emptyView, int mChoiceMode);" + NL + "" + NL + "\t/*" + NL + " \tpublic void registraPosicao(";
  protected final String TEXT_25 = "ListViewHolderBase vh) {" + NL + "        SharedPreferences pref = getActivity().getSharedPreferences(\"";
  protected final String TEXT_26 = "\", Context.MODE_PRIVATE);" + NL + "        SharedPreferences.Editor edt = pref.edit();" + NL + "        edt.putInt(Constantes.";
  protected final String TEXT_27 = "_POSICAO, vh.getAdapterPosition());" + NL + "        edt.commit();" + NL + "    }" + NL + "    private void recuperaPosicao() {" + NL + "        SharedPreferences pref = getActivity().getSharedPreferences(\"";
  protected final String TEXT_28 = "\", Context.MODE_PRIVATE);" + NL + "        mPosition = pref.getInt(Constantes.";
  protected final String TEXT_29 = "_POSICAO,RecyclerView.NO_POSITION);" + NL + "    }" + NL + "\t*/" + NL + "" + NL + "" + NL + "    @Override" + NL + "    public final void onActivityCreated(Bundle savedInstanceState) {" + NL + "        // We hold for transition here just in-case the activity" + NL + "        // needs to be re-created. In a standard return transition," + NL + "        // this doesn't actually make a difference." + NL + "        if ( mHoldForTransition ) {" + NL + "            getActivity().supportPostponeEnterTransition();" + NL + "        }" + NL + "        getLoaderManager().initLoader(FORECAST_LOADER, null, this);" + NL + "        super.onActivityCreated(savedInstanceState);" + NL + "    }" + NL + "" + NL + "\t" + NL + "" + NL + "    @Override" + NL + "    public final void onLoadFinished(Loader<Cursor> loader, Cursor data) {" + NL + "    \tList<";
  protected final String TEXT_30 = "> lista = converteLista(data);" + NL + "    \tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Lista ";
  protected final String TEXT_31 = " \" + lista.size() + \" itens\");" + NL + "        this.mAdapter.swapCursor(lista);" + NL + "        if (mPosition != RecyclerView.NO_POSITION) {" + NL + "            // If we don't need to restart the loader, and there's a desired position to restore" + NL + "            // to, do so now." + NL + "            mRecyclerView.smoothScrollToPosition(mPosition);" + NL + "        }" + NL + "        /*" + NL + "        updateEmptyView();" + NL + "        if ( data.getCount() == 0 ) {" + NL + "            getActivity().supportStartPostponedEnterTransition();" + NL + "        } else {" + NL + "            mRecyclerView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {" + NL + "                @Override" + NL + "                public boolean onPreDraw() {" + NL + "                    // Since we know we're going to get items, we keep the listener around until" + NL + "                    // we see Children." + NL + "                    if (mRecyclerView.getChildCount() > 0) {" + NL + "                        mRecyclerView.getViewTreeObserver().removeOnPreDrawListener(this);" + NL + "                        int itemPosition = mAdapter.getSelectedItemPosition();" + NL + "                        if ( RecyclerView.NO_POSITION == itemPosition ) itemPosition = 0;" + NL + "                        RecyclerView.ViewHolder vh = mRecyclerView.findViewHolderForAdapterPosition(itemPosition);" + NL + "                        if ( null != vh && mAutoSelectView ) {" + NL + "                            mAdapter.selectView( vh );" + NL + "                        }" + NL + "                        if ( mHoldForTransition ) {" + NL + "                            getActivity().supportStartPostponedEnterTransition();" + NL + "                        }" + NL + "                        return true;" + NL + "                    }" + NL + "                    return false;" + NL + "                }" + NL + "            });" + NL + "        }" + NL + "        */" + NL + "" + NL + "    }" + NL + "" + NL + "" + NL + "" + NL + "    @Override" + NL + "    public final void onDestroy() {" + NL + "        super.onDestroy();" + NL + "        if (null != mRecyclerView) {" + NL + "            mRecyclerView.clearOnScrollListeners();" + NL + "        }" + NL + "    }" + NL + "" + NL + "    @Override" + NL + "    public final void onLoaderReset(Loader<Cursor> loader) {" + NL + "        mAdapter.swapCursor(null);" + NL + "    }" + NL + "" + NL + "\tprotected MontadorDaoI getMontador() {" + NL + "        return ";
  protected final String TEXT_32 = "Contract.getMontador();" + NL + "    }" + NL + "" + NL + "    protected final List<";
  protected final String TEXT_33 = "> converteLista(Cursor data) {" + NL + "        List lista = new ArrayList();" + NL + "        try {" + NL + "            lista = DBHelperBase.getListaSqlListaInterna(data, getMontador(), this);" + NL + "        } catch (Exception e) {" + NL + "            lista = new ArrayList();" + NL + "        }" + NL + "        return lista;" + NL + "    }" + NL + "}";
  protected final String TEXT_34 = NL;

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
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(TEXT_34);
    return stringBuffer.toString();
  }
}
