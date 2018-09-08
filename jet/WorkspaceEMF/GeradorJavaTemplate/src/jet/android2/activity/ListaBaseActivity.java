package jet.android2.activity;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ListaBaseActivity
{
  protected static String nl;
  public static synchronized ListaBaseActivity create(String lineSeparator)
  {
    nl = lineSeparator;
    ListaBaseActivity result = new ListaBaseActivity();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".tela.base.activity.lista;" + NL + "" + NL + "import android.net.Uri;" + NL + "import android.support.v7.app.AppCompatActivity;" + NL + "" + NL + "" + NL + "import android.database.Cursor;" + NL + "import android.os.Bundle;" + NL + "import android.support.v4.app.LoaderManager;" + NL + "import android.support.v4.content.Loader;" + NL + "" + NL + "" + NL + "import java.util.ArrayList;" + NL + "import java.util.List;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".framework.dao.DBHelperBase;" + NL + "import ";
  protected final String TEXT_5 = ".framework.dao.MontadorDaoI;" + NL + "import ";
  protected final String TEXT_6 = ".framework.data.DCCursorLoader;" + NL + "import ";
  protected final String TEXT_7 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_8 = ".modelo.";
  protected final String TEXT_9 = ";" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_10 = "ListaBaseActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor>{" + NL + "\t" + NL + "\tprivate static final int DETAIL_LOADER = (";
  protected final String TEXT_11 = " * 10) + 1;" + NL + "\t" + NL + " \t@Override" + NL + "    protected final void onCreate(Bundle savedInstanceState) {" + NL + "        super.onCreate(savedInstanceState);" + NL + "        setContentView(getContentView());" + NL + "        onCreateComplemento(savedInstanceState);" + NL + "        this.getSupportLoaderManager().initLoader(DETAIL_LOADER, null, this);" + NL + "    }" + NL + "    protected abstract void onCreateComplemento(Bundle savedInstanceState);" + NL + "    protected abstract int getContentView();" + NL + "    " + NL + "    @Override" + NL + "    public final Loader<Cursor> onCreateLoader(int id, Bundle args) {" + NL + "        Uri uri = getUri();" + NL + "        DCLog.d(DCLog.TRACE_LISTA,this,\"Uri: \" + uri + \" Ordenacao: \" + getColunaOrdenacao());" + NL + "        DCLog.d(DCLog.TRACE_LISTA,this,\"Montador: \" + getMontador().getClass().getSimpleName());" + NL + "        return new DCCursorLoader(this,uri,null,null,null,getColunaOrdenacao(),getMontador());" + NL + "    }" + NL + "    protected abstract Uri getUri();" + NL + "    protected abstract MontadorDaoI getMontador();" + NL + "    protected abstract String getColunaOrdenacao(); " + NL + "" + NL + "    @Override" + NL + "    public final void onLoadFinished(Loader<Cursor> loader, Cursor data) {" + NL + "        List<";
  protected final String TEXT_12 = "> lista = converteLista(data);" + NL + "       \tDCLog.d(DCLog.TRACE_LISTA,this,\"List<";
  protected final String TEXT_13 = "> : \" + lista.size() + \" itens\");" + NL + "        trataLista(lista);" + NL + "    }" + NL + "    protected abstract void trataLista(List<";
  protected final String TEXT_14 = "> lista);" + NL + "" + NL + "    @Override" + NL + "    public final void onLoaderReset(Loader<Cursor> loader) {" + NL + "" + NL + "    }" + NL + "    private final List<";
  protected final String TEXT_15 = "> converteLista(Cursor data) {" + NL + "        List lista = new ArrayList();" + NL + "        try {" + NL + "            lista = DBHelperBase.getListaSqlListaInterna(data, getMontador(), this);" + NL + "        } catch (Exception e) {" + NL + "            lista = new ArrayList();" + NL + "        }" + NL + "        return lista;" + NL + "    }" + NL + "    " + NL + "}";

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
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getId() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    return stringBuffer.toString();
  }
}
