package jet.android2.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DetalheBaseActivity
{
  protected static String nl;
  public static synchronized DetalheBaseActivity create(String lineSeparator)
  {
    nl = lineSeparator;
    DetalheBaseActivity result = new DetalheBaseActivity();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".tela.base.activity.detalhe;" + NL + "" + NL + "import android.annotation.TargetApi;" + NL + "import android.database.Cursor;" + NL + "import android.net.Uri;" + NL + "import android.os.Bundle;" + NL + "import android.os.Build;" + NL + "import android.support.v4.app.LoaderManager;" + NL + "import android.support.v4.content.Loader;" + NL + "import android.support.v7.app.ActionBar;" + NL + "import android.support.v7.app.AppCompatActivity;" + NL + "import android.support.v7.widget.Toolbar;" + NL + "import android.view.View;" + NL + "import android.widget.TextView;" + NL + "import android.widget.ImageView;" + NL + "import android.widget.RatingBar;" + NL + "import android.content.SharedPreferences;" + NL + "import android.view.MenuItem;" + NL + "import android.view.KeyEvent;" + NL + "" + NL + "import com.bumptech.glide.Glide;" + NL + "import com.bumptech.glide.load.engine.DiskCacheStrategy;" + NL + "" + NL + "import android.transition.Transition;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".template.R;" + NL + "" + NL + "import ";
  protected final String TEXT_5 = ".data.contract.";
  protected final String TEXT_6 = "Contract;" + NL + "import ";
  protected final String TEXT_7 = ".framework.dao.MontadorDaoI;" + NL + "import ";
  protected final String TEXT_8 = ".framework.data.DCCursorLoader;" + NL + "import ";
  protected final String TEXT_9 = ".framework.tela.ResourceObj;" + NL + "import ";
  protected final String TEXT_10 = ".modelo.";
  protected final String TEXT_11 = ";" + NL + "import ";
  protected final String TEXT_12 = ".framework.data.MontadorDaoComposite;" + NL + "import ";
  protected final String TEXT_13 = ".tela.base.activity.Constantes;" + NL + "import ";
  protected final String TEXT_14 = ".framework.storage.DownloadImageTask;" + NL + "import ";
  protected final String TEXT_15 = ".framework.log.DCLog;" + NL + "/*" + NL + "O que precisa ter num Activity de Detalhe:" + NL + "" + NL + "1- Imagem - recursos de usar imagem" + NL + "2- Anima??o" + NL + "3- Titulo Variavel (toolbar)  -> precisa do xml (copu/paste)" + NL + "4- Uri (a query fica no consulta) -> passando um id" + NL + "5- metodo que recebe o Id do objeto em detalhe. ( uso de loader )" + NL + "" + NL + "" + NL + "O que todo activity vai precisar:" + NL + "" + NL + "- xml de layout" + NL + "- link com os objetos de tela" + NL + "" + NL + "" + NL + "*/" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_16 = "DetalheBaseActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor>, Transition.TransitionListener {" + NL + "" + NL + "\tString titulo = null;" + NL + "    private static final int DETAIL_LOADER = ";
  protected final String TEXT_17 = " * 10;" + NL + "    private long id";
  protected final String TEXT_18 = " = 0;" + NL + "    " + NL + "    protected Toolbar toolbar = null;" + NL + "" + NL + "\tprotected ResourceObj resourceObj = getLayoutDetalheResource();" + NL + "  " + NL + "\t@Override" + NL + "\tprotected final void onCreate(Bundle savedInstanceState) {" + NL + "\t    DCLog.d(DCLog.TRACE_DISPLAY,this,getClass().getSimpleName() + \" (\" + getLayoutDetalheResource().getNome() + \")\" );" + NL + "        super.onCreate(savedInstanceState);" + NL + "        setContentView(resourceObj.getCodigo());" + NL + "\t    SharedPreferences pref = getPreferences(0);" + NL + " \t\tBundle extra = getIntent().getExtras();" + NL + " \t\ttitulo = (extra!=null?extra.getString(Constantes.CHAVE_TOOLBAR):null);" + NL + "   \t\ttry {" + NL + "            this.id";
  protected final String TEXT_19 = " = extra.getInt(Constantes.";
  protected final String TEXT_20 = "_ID);" + NL + "        } catch (Exception e) {" + NL + "            id";
  protected final String TEXT_21 = " = pref.getLong(this.getClass().getSimpleName(), 0);" + NL + "        }" + NL + "  " + NL + "        if (id";
  protected final String TEXT_22 = "==0) {" + NL + "            throw new RuntimeException(\"Nao recebeu o Id";
  protected final String TEXT_23 = "\");" + NL + "        }" + NL + "        SharedPreferences.Editor edt = pref.edit();" + NL + "        edt.putLong(this.getClass().getSimpleName(), id";
  protected final String TEXT_24 = ");" + NL + "        edt.commit();" + NL + "        this.getSupportLoaderManager().initLoader(DETAIL_LOADER, null, this);" + NL + "        toolbar = (Toolbar) findViewById(getIdToolbar());" + NL + "        setSupportActionBar(toolbar);" + NL + "        if (titulo!=null) toolbar.setTitle(titulo);" + NL + "        getSupportActionBar().setDisplayHomeAsUpEnabled(true); " + NL + "        " + NL + "        complementaOnCreate(id";
  protected final String TEXT_25 = ");" + NL + "        " + NL + "         if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {" + NL + "         \tesconderElementosParaPosAnimacao();" + NL + "            Transition t2 = getWindow().getSharedElementEnterTransition();" + NL + "            t2.addListener(this);" + NL + "        }" + NL + "        preparaTransicao();" + NL + "" + NL + "       " + NL + "    }" + NL + "" + NL + "\tprotected abstract void esconderElementosParaPosAnimacao();" + NL + "" + NL + "    protected abstract ResourceObj getLayoutDetalheResource();" + NL + "" + NL + " \tprotected void preparaTransicao() {" + NL + "    }" + NL + "" + NL + "\t" + NL + "    @Override" + NL + "    public Loader<Cursor> onCreateLoader(int id, Bundle args) {" + NL + "        Uri uri = ";
  protected final String TEXT_26 = "Contract.build";
  protected final String TEXT_27 = "Uri(id";
  protected final String TEXT_28 = ");" + NL + "        uri = completaUri(uri);" + NL + "        return new DCCursorLoader(this,uri,null,null,null,null);" + NL + "    }" + NL + "    // Alterando aqui vai precisar alterar o completaMontador." + NL + "    protected Uri completaUri(Uri uri) {" + NL + "        return uri;" + NL + "    }" + NL + "    /*" + NL + "\tExemplos:" + NL + "\t- Para obter objetos agregados:" + NL + "\t" + NL + "\t@Override" + NL + "    protected Uri completaUri(Uri uri) {" + NL + "        uri = uri.buildUpon().appendPath(";
  protected final String TEXT_29 = "Contract.COM_COMPLEMENTO).build();" + NL + "        uri = ";
  protected final String TEXT_30 = "Contract.adiciona<Objeto><Relacionamento>(uri);" + NL + "        return uri;" + NL + "    } " + NL + "\t*/" + NL + "\t" + NL + "\tprotected MontadorDaoI completaMontador(MontadorDaoComposite montadorDao) {" + NL + "        return montadorDao;" + NL + "    }" + NL + "     /*" + NL + "\tExemplos:" + NL + "\t- Para obter objetos agregados:" + NL + "\t" + NL + "\t@Override" + NL + "    protected MontadorDaoI completaMontador(MontadorDaoComposite montadorDao) {" + NL + "        return ";
  protected final String TEXT_31 = "Contract.adicionaMontador<Objeto><Relacionamento>(montadorDao);" + NL + "    }" + NL + "\t*/" + NL + "    " + NL + "   " + NL + "    " + NL + "    " + NL + "    @Override" + NL + "    public void onLoaderReset(Loader<Cursor> loader) {" + NL + "" + NL + "    }" + NL + "    " + NL + "    @Override" + NL + "    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {" + NL + "\t    data.moveToFirst();" + NL + "\t    // Se o cliente da activity passar no Intent o titulo " + NL + "\t    // Nao sobrepor com o nome do campo de banco de dados." + NL + "\t    ActionBar actionBar = this.getSupportActionBar();" + NL + "\t    // ActionBar pode nao existir" + NL + "\t    if (actionBar!=null) {" + NL + "\t\t    if (titulo==null) {" + NL + "    \t    \tString nome = data.getString(getConstColunaNomeTitulo());" + NL + "\t    \t    actionBar.setTitle(nome);" + NL + "\t\t    } else {" + NL + "    \t        // Nao entendi por que so funciona se colocar aqui" + NL + "        \t    actionBar.setTitle(titulo);" + NL + "        \t}" + NL + "\t    }    " + NL + "        MontadorDaoI montadorDao = ";
  protected final String TEXT_32 = "Contract.getMontadorComposto();" + NL + "        montadorDao = completaMontador((MontadorDaoComposite)montadorDao);";
  protected final String TEXT_33 = NL + "        ";
  protected final String TEXT_34 = " item = (";
  protected final String TEXT_35 = ") montadorDao.getItem(data);" + NL + "        onLoadObject(item);" + NL + "    }" + NL + "   " + NL + "    " + NL + "\tprotected abstract void onLoadObject(";
  protected final String TEXT_36 = " item);" + NL + "" + NL + "\tprotected abstract int getConstColunaNomeTitulo();" + NL + "" + NL + "    protected abstract void complementaOnCreate(long id";
  protected final String TEXT_37 = ");" + NL + "" + NL + "    protected abstract int getIdToolbar();" + NL + "    " + NL + "    " + NL + "    // Se nao for muito adequado passar paraa ExibeItemListaBaseActivity (18-11-2016 ate 18-01-2017)" + NL + "    /*protected void imagemFromUrl(ImageView obj, String urlImagem) {" + NL + "        new DownloadImageTask(obj).execute(urlImagem);" + NL + "    }*/" + NL + "    protected void carregaImagemCache(String urlImagem, ImageView viewImagem) {" + NL + "        Glide.with(this)" + NL + "                .load(urlImagem)" + NL + "                .error(R.drawable.img_nao_disponivel)" + NL + "                .diskCacheStrategy(DiskCacheStrategy.ALL)" + NL + "                .into(viewImagem);" + NL + "    }" + NL + "    " + NL + "    protected void criaBotaoBack() {" + NL + "    \tgetSupportActionBar().setDisplayHomeAsUpEnabled(true);" + NL + "    }" + NL + "    /*" + NL + "    protected void criaToolbar(String texto, int idToolbar) {" + NL + "        Toolbar toolbar = (Toolbar) this.findViewById(idToolbar);" + NL + "        toolbar.setTitle(texto);" + NL + "        setSupportActionBar(toolbar);" + NL + "        getSupportActionBar().setDisplayHomeAsUpEnabled(true);" + NL + "    }" + NL + "    */" + NL + "    @Override" + NL + "    public boolean onOptionsItemSelected(MenuItem item) {" + NL + "        if (item.getItemId()==android.R.id.home) {" + NL + "            //finish();" + NL + "            //Se nao for assim nao executa a animacao." + NL + "            this.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_BACK));" + NL + "            this.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_UP, KeyEvent.KEYCODE_BACK));" + NL + "            return true;" + NL + "        }" + NL + "        return super.onOptionsItemSelected(item);" + NL + "    }" + NL + "    " + NL + "    " + NL + "    // Tem em varios lugares, pode depois ficar centralizada." + NL + "    // (28-11-2016) ate 28-01-2017" + NL + "    protected final TextView getTextView(int id, String nome) {" + NL + "        TextView saida = (TextView) findViewById(id);" + NL + "        if (saida==null) throw new RuntimeException(\"TextView \" + nome + \" nao encontrado em \" + this);" + NL + "        return saida;" + NL + "    }" + NL + "    protected final ImageView getImageView(int id, String nome) {" + NL + "        ImageView saida = (ImageView) findViewById(id);" + NL + "        if (saida==null) throw new RuntimeException(\"ImageView \" + nome + \" nao encontrado em \" + this);" + NL + "        return saida;" + NL + "    }" + NL + "    protected final RatingBar getRatingBar(int id, String nome) {" + NL + "        RatingBar saida = (RatingBar) findViewById(id);" + NL + "        if (saida==null) throw new RuntimeException(\"RatingBar \" + nome + \" nao encontrado em \" + this);" + NL + "        return saida;" + NL + "    }" + NL + "    " + NL + "    " + NL + "    // Transacao de SharedElment - Interface: Transition.TransitionListener" + NL + "    @Override" + NL + "    public void onTransitionStart(Transition transition) {" + NL + "    }" + NL + "    @Override" + NL + "    public void onTransitionCancel(Transition transition) {" + NL + "    }" + NL + "    @Override" + NL + "    public void onTransitionPause(Transition transition) {" + NL + "    }" + NL + "    @Override" + NL + "    public void onTransitionResume(Transition transition) {" + NL + "    }" + NL + "    " + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getId() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaConstante() );
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    return stringBuffer.toString();
  }
}
