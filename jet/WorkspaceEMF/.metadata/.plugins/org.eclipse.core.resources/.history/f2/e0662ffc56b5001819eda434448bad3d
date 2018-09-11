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
  protected final String TEXT_3 = ".template.lista;" + NL + "" + NL + "import java.util.ArrayList;" + NL + "import java.util.List;" + NL + "" + NL + "import android.content.Intent;" + NL + "import android.os.Build;" + NL + "import android.content.Context;" + NL + "import android.content.SharedPreferences;" + NL + "import android.database.Cursor;" + NL + "import android.net.Uri;" + NL + "import android.os.Bundle;" + NL + "import android.support.v4.app.Fragment;" + NL + "import android.support.v4.app.LoaderManager;" + NL + "import android.support.v4.app.FragmentActivity;" + NL + "import android.support.v4.content.CursorLoader;" + NL + "import android.support.v4.content.Loader;" + NL + "import android.support.v4.util.Pair;" + NL + "import android.support.v4.app.ActivityOptionsCompat;" + NL + "import android.support.v7.widget.LinearLayoutManager;" + NL + "import android.support.v7.widget.RecyclerView;" + NL + "" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.View;" + NL + "import android.view.ViewGroup;" + NL + "import android.widget.TextView;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".framework.tela.DCAplicacao;" + NL + "import ";
  protected final String TEXT_5 = ".tela.base.activity.Constantes;" + NL + "import ";
  protected final String TEXT_6 = ".modelo.";
  protected final String TEXT_7 = ";" + NL + "import ";
  protected final String TEXT_8 = ".data.contract.";
  protected final String TEXT_9 = "Contract;" + NL + "import ";
  protected final String TEXT_10 = ".template.R;" + NL + "import ";
  protected final String TEXT_11 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_12 = ".framework.tela.ResourceObj;" + NL + "import ";
  protected final String TEXT_13 = ".framework.dao.DBHelperBase;" + NL + "import ";
  protected final String TEXT_14 = ".framework.dao.MontadorDaoI;" + NL + "import ";
  protected final String TEXT_15 = ".framework.data.DCCursorLoader;" + NL + "import ";
  protected final String TEXT_16 = ".framework.tela.SimpleDividerItemDecoration;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_17 = "ListFragmentBase extends Fragment implements LoaderManager.LoaderCallbacks<Cursor>{" + NL + "" + NL + "    private RecyclerView mRecyclerView;" + NL + "    private ";
  protected final String TEXT_18 = "ListAdapterBase mAdapter;" + NL + "" + NL + "    private int mPosition = RecyclerView.NO_POSITION;" + NL + "    private int mChoiceMode;" + NL + "    private static final String SELECTED_KEY = \"selected_position\";" + NL + "    private static final int FORECAST_LOADER = ";
  protected final String TEXT_19 = ";" + NL + "    private boolean mHoldForTransition;" + NL + "" + NL + "\tprotected ResourceObj resourceObj = getLayoutListaResource();" + NL + " \t//protected int getIdLayoutLista() { return R.layout.lista_padrao; }" + NL + "    protected int getIdRecLista() { return R.id.rec_lista_padrao; }" + NL + "    protected int getIdRecListaEmpty() { return R.id.txt_lista_padrao_vazia; }" + NL + "" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_20 = "ListFragmentBase() {" + NL + "    }" + NL + "" + NL + "" + NL + "\tprivate final void onItemSelected(int idItemLista, ";
  protected final String TEXT_21 = "ListViewHolderBase vh) {" + NL + "        Intent intent = new Intent(getActivity().getApplicationContext(), getOnClickLista());" + NL + "        DCLog.d(\"OnClick\", this, \"Item selecionado ID:\" + idItemLista);" + NL + "        intent.putExtra(Constantes.";
  protected final String TEXT_22 = "_ID,idItemLista);" + NL + "        if (idItemLista==0) {" + NL + "            throw new RuntimeException(\"Id igual a zero\");" + NL + "        }" + NL + "" + NL + "        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {" + NL + "           /* ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this.getActivity()," + NL + "                    Pair.create((View)holder.mNomeProduto, \"trNomeProduto\")," + NL + "                    Pair.create((View)holder.mPrecoAtual, \"trPrecoAtual\"));*/" + NL + "            ArrayList<Pair<View,String>> lista = new ArrayList<Pair<View,String>>();" + NL + "            montaAminacao(vh,lista);" + NL + "            Pair[] listaPar = lista.toArray(new Pair[lista.size()]);" + NL + "            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this.getActivity(),listaPar);" + NL + "           this.startActivity(intent,options.toBundle());" + NL + "        } else {" + NL + "            this.startActivity(intent);" + NL + "        }" + NL + "    }" + NL + "" + NL + "    protected abstract Class getOnClickLista();" + NL + "    protected abstract void montaAminacao(";
  protected final String TEXT_23 = "ListViewHolderBase vh, ArrayList<Pair<View,String>> lista);" + NL + "\t" + NL + "" + NL + "    " + NL + "" + NL + "\tprotected ResourceObj getLayoutListaResource() {" + NL + "        return new ResourceObj(R.layout.lista_padrao,\"R.layout.lista_padrao\");" + NL + "    }" + NL + "   " + NL + "" + NL + "" + NL + "    @Override" + NL + "    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {" + NL + "\t\tDCLog.d(DCLog.DISPLAY,this,this.getClass().getSimpleName());" + NL + "\t    DCLog.d(DCLog.TRACE_DISPLAY,this,getClass().getSimpleName() + \" (\" + getLayoutListaResource().getNome() + \")\" );" + NL + "  \t\t//recuperaPosicao();" + NL + "        View rootView = inflater.inflate(resourceObj.getCodigo(), container, false);" + NL + "" + NL + "        // Get a reference to the RecyclerView, and attach this adapter to it." + NL + "        mRecyclerView = (RecyclerView) rootView.findViewById(getIdRecLista());" + NL + "" + NL + "        // Set the layout manager" + NL + "        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));" + NL + "        mRecyclerView.addItemDecoration(new SimpleDividerItemDecoration(" + NL + "                getActivity().getApplicationContext()" + NL + "        ));" + NL + "        " + NL + "        " + NL + "\t\tTextView emptyView = (TextView) rootView.findViewById(getIdRecListaEmpty());" + NL + "        emptyView.setText(getTextoListaVazia());" + NL + "" + NL + "        // use this setting to improve performance if you know that changes" + NL + "        // in content do not change the layout size of the RecyclerView" + NL + "        mRecyclerView.setHasFixedSize(true);" + NL + "" + NL + "\t\tDCLog.d(DCLog.TRACE_LISTA,this,\"Inicio\");" + NL + "        // The ForecastAdapter will take data from a source and" + NL + "        // use it to populate the RecyclerView it's attached to." + NL + "        mAdapter = getListAdapter(this.getActivity(), new ";
  protected final String TEXT_24 = "ListAdapterBase.";
  protected final String TEXT_25 = "ListAdapterOnClickHandler() {" + NL + "            @Override" + NL + "            public void onClick(int idItemLista, ";
  protected final String TEXT_26 = "ListViewHolderBase vh) {" + NL + "                //String locationSetting = Utility.getPreferredLocation(getActivity());" + NL + "                onItemSelected(idItemLista, vh);" + NL + "                //registraPosicao(vh);" + NL + "                mPosition = vh.getAdapterPosition();" + NL + "            }" + NL + "        }, emptyView, mChoiceMode);" + NL + "\t\tDCLog.d(DCLog.TRACE_LISTA,this,\"Adapter: \" + mAdapter.getClass().getSimpleName());" + NL + "\t\tDCLog.d(DCLog.TRACE_DISPLAY,this,\"(Lista)\" + mAdapter.getClass().getSimpleName() + \"(\" + mAdapter.getLayoutItem() + \")\");" + NL + "\t\t" + NL + "        // specify an adapter (see also next example)" + NL + "        mRecyclerView.setAdapter(mAdapter);" + NL + "" + NL + "        // If there's instance state, mine it for useful information." + NL + "        // The end-goal here is that the user never knows that turning their device sideways" + NL + "        // does crazy lifecycle related things.  It should feel like some stuff stretched out," + NL + "        // or magically appeared to take advantage of room, but data or place in the app was never" + NL + "        // actually *lost*." + NL + "        if (savedInstanceState != null) {" + NL + "            if (savedInstanceState.containsKey(SELECTED_KEY)) {" + NL + "                // The Recycler View probably hasn't even been populated yet.  Actually perform the" + NL + "                // swapout in onLoadFinished." + NL + "                mPosition = savedInstanceState.getInt(SELECTED_KEY);" + NL + "            }" + NL + "            mAdapter.onRestoreInstanceState(savedInstanceState);" + NL + "        }" + NL + "" + NL + "\t\tSharedPreferences pref = getActivity().getSharedPreferences(\"";
  protected final String TEXT_27 = "\", Context.MODE_PRIVATE);" + NL + "        SharedPreferences.Editor edt = pref.edit();" + NL + "        inicializaListaInferior(edt);" + NL + "        edt.commit();" + NL + "" + NL + "" + NL + "        return rootView;" + NL + "    }" + NL + "" + NL + "\tprotected abstract String getTextoListaVazia();" + NL + "" + NL + "\tprotected abstract void inicializaListaInferior(SharedPreferences.Editor edt);" + NL + "    protected abstract ";
  protected final String TEXT_28 = "ListAdapterBase getListAdapter(FragmentActivity activity, ";
  protected final String TEXT_29 = "ListAdapterBase.";
  protected final String TEXT_30 = "ListAdapterOnClickHandler onClickHandler, View emptyView, int mChoiceMode);" + NL + "" + NL + "\t/*" + NL + " \tpublic void registraPosicao(";
  protected final String TEXT_31 = "ListViewHolderBase vh) {" + NL + "        SharedPreferences pref = getActivity().getSharedPreferences(\"";
  protected final String TEXT_32 = "\", Context.MODE_PRIVATE);" + NL + "        SharedPreferences.Editor edt = pref.edit();" + NL + "        edt.putInt(Constantes.";
  protected final String TEXT_33 = "_POSICAO, vh.getAdapterPosition());" + NL + "        edt.commit();" + NL + "    }" + NL + "    private void recuperaPosicao() {" + NL + "        SharedPreferences pref = getActivity().getSharedPreferences(\"";
  protected final String TEXT_34 = "\", Context.MODE_PRIVATE);" + NL + "        mPosition = pref.getInt(Constantes.";
  protected final String TEXT_35 = "_POSICAO,RecyclerView.NO_POSITION);" + NL + "    }" + NL + "\t*/" + NL + "" + NL + "" + NL + "    @Override" + NL + "    public final void onActivityCreated(Bundle savedInstanceState) {" + NL + "    \tif (!(this.getActivity().getApplication() instanceof DCAplicacao)) {" + NL + "            throw new RuntimeException(\"Precisa colocar no tag aplication do manifest: android:name=\\\".app.AplicacaoImpl\\\"\");" + NL + "        }" + NL + "        // We hold for transition here just in-case the activity" + NL + "        // needs to be re-created. In a standard return transition," + NL + "        // this doesn't actually make a difference." + NL + "        if ( mHoldForTransition ) {" + NL + "            getActivity().supportPostponeEnterTransition();" + NL + "        }" + NL + "        getLoaderManager().initLoader(FORECAST_LOADER, null, this);" + NL + "        super.onActivityCreated(savedInstanceState);" + NL + "    }" + NL + "" + NL + "\t@Override" + NL + "    public final Loader<Cursor> onCreateLoader(int id, Bundle args) {" + NL + "        Uri uri = getUri();" + NL + "        DCLog.d(DCLog.TRACE_LISTA,this,\"Uri: \" + uri + \" Ordenacao: \" + getColunaOrdenacao());" + NL + "        DCLog.d(DCLog.TRACE_LISTA,this,\"Montador: \" + getMontador().getClass().getSimpleName());" + NL + "        return new DCCursorLoader(getActivity(),uri,null,null,null,getColunaOrdenacao(),getMontador());" + NL + "    }" + NL + "    protected abstract Uri getUri();" + NL + "    protected abstract String getColunaOrdenacao(); " + NL + "" + NL + "    @Override" + NL + "    public final void onLoadFinished(Loader<Cursor> loader, Cursor data) {" + NL + "    \tList<";
  protected final String TEXT_36 = "> lista = converteLista(data);" + NL + "    \tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Lista ";
  protected final String TEXT_37 = " \" + lista.size() + \" itens\");" + NL + "    \tDCLog.d(DCLog.TRACE_LISTA,this,\"List<";
  protected final String TEXT_38 = "> : \" + lista.size() + \" itens\");" + NL + "        this.mAdapter.swapCursor(lista);" + NL + "        if (mPosition != RecyclerView.NO_POSITION) {" + NL + "            // If we don't need to restart the loader, and there's a desired position to restore" + NL + "            // to, do so now." + NL + "            mRecyclerView.smoothScrollToPosition(mPosition);" + NL + "        }" + NL + "        /*" + NL + "        updateEmptyView();" + NL + "        if ( data.getCount() == 0 ) {" + NL + "            getActivity().supportStartPostponedEnterTransition();" + NL + "        } else {" + NL + "            mRecyclerView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {" + NL + "                @Override" + NL + "                public boolean onPreDraw() {" + NL + "                    // Since we know we're going to get items, we keep the listener around until" + NL + "                    // we see Children." + NL + "                    if (mRecyclerView.getChildCount() > 0) {" + NL + "                        mRecyclerView.getViewTreeObserver().removeOnPreDrawListener(this);" + NL + "                        int itemPosition = mAdapter.getSelectedItemPosition();" + NL + "                        if ( RecyclerView.NO_POSITION == itemPosition ) itemPosition = 0;" + NL + "                        RecyclerView.ViewHolder vh = mRecyclerView.findViewHolderForAdapterPosition(itemPosition);" + NL + "                        if ( null != vh && mAutoSelectView ) {" + NL + "                            mAdapter.selectView( vh );" + NL + "                        }" + NL + "                        if ( mHoldForTransition ) {" + NL + "                            getActivity().supportStartPostponedEnterTransition();" + NL + "                        }" + NL + "                        return true;" + NL + "                    }" + NL + "                    return false;" + NL + "                }" + NL + "            });" + NL + "        }" + NL + "        */" + NL + "" + NL + "    }" + NL + "" + NL + "" + NL + "" + NL + "    @Override" + NL + "    public final void onDestroy() {" + NL + "        super.onDestroy();" + NL + "        if (null != mRecyclerView) {" + NL + "            mRecyclerView.clearOnScrollListeners();" + NL + "        }" + NL + "    }" + NL + "" + NL + "    @Override" + NL + "    public final void onLoaderReset(Loader<Cursor> loader) {" + NL + "        mAdapter.swapCursor(null);" + NL + "    }" + NL + "" + NL + "\tprotected MontadorDaoI getMontador() {" + NL + "        return ";
  protected final String TEXT_39 = "Contract.getMontador();" + NL + "    }" + NL + "" + NL + "    protected final List<";
  protected final String TEXT_40 = "> converteLista(Cursor data) {" + NL + "        List lista = new ArrayList();" + NL + "        try {" + NL + "            lista = DBHelperBase.getListaSqlListaInterna(data, getMontador(), this);" + NL + "        } catch (Exception e) {" + NL + "            lista = new ArrayList();" + NL + "        }" + NL + "        return lista;" + NL + "    }" + NL + "    " + NL + "    // ComChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_41 = NL + "\tprotected long mId";
  protected final String TEXT_42 = ";" + NL + "\tpublic final void setId";
  protected final String TEXT_43 = "(long id) {" + NL + "\t\tmId";
  protected final String TEXT_44 = " = id;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_45 = NL + "}";
  protected final String TEXT_46 = NL;

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getId() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    
Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
while (iterador.hasNext()) {
	RelacionamentoWrapper relac = iterador.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_44);
    
}
	
    stringBuffer.append(TEXT_45);
    stringBuffer.append(TEXT_46);
    return stringBuffer.toString();
  }
}
