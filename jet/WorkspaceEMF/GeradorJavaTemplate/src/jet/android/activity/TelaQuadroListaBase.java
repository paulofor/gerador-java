package jet.android.activity;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class TelaQuadroListaBase
{
  protected static String nl;
  public static synchronized TelaQuadroListaBase create(String lineSeparator)
  {
    nl = lineSeparator;
    TelaQuadroListaBase result = new TelaQuadroListaBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".tela.quadro.base;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".app.R;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.";
  protected final String TEXT_6 = ";" + NL + "import ";
  protected final String TEXT_7 = ".servico.FabricaServico;" + NL + "import ";
  protected final String TEXT_8 = ".servico.";
  protected final String TEXT_9 = "Servico;" + NL + "import ";
  protected final String TEXT_10 = ".view.adapter.";
  protected final String TEXT_11 = "ListAdapter;" + NL + "import ";
  protected final String TEXT_12 = ".modelo.vo.FabricaVo;" + NL + "import ";
  protected final String TEXT_13 = ".servico.";
  protected final String TEXT_14 = "Servico;" + NL + "" + NL + "import java.util.List;" + NL + "" + NL + "import android.content.Context;" + NL + "import android.os.Bundle;" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.View;" + NL + "import android.view.ViewGroup;" + NL + "import android.view.View.OnClickListener;" + NL + "import android.widget.ListView;" + NL + "import android.widget.Button;" + NL + "import br.com.digicom.multimidia.AudioRecurso;" + NL + "import br.com.digicom.quadro.BaseListFragment;" + NL + "import br.com.digicom.quadro.IQuadroListaEdicao;" + NL + "import br.com.digicom.activity.DigicomContexto;" + NL + "import br.com.digicom.log.DCLog;" + NL + "" + NL + "import android.app.Fragment;" + NL + "import android.app.FragmentTransaction;" + NL + "import android.app.DialogFragment;" + NL + "import br.com.digicom.quadro.IFragment;" + NL + "import br.com.digicom.quadro.IFragmentEdicao;" + NL + "import android.util.Log;" + NL + "import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "import br.com.digicom.layout.ResourceObj;" + NL + "import android.widget.BaseAdapter;" + NL + "import br.com.digicom.animacao.TrocaQuadro;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_15 = "QuadroListaBase extends BaseListFragment implements IQuadroListaEdicao {" + NL + "" + NL + "\tpublic final static String ITEM_CLICK = \"";
  protected final String TEXT_16 = "ItemClick\";" + NL + "" + NL + "\t";
  protected final String TEXT_17 = "ListAdapter adapt = null;" + NL + "\tprivate Button btnCriaItem = null;" + NL + "\t" + NL + "\t";
  protected final String TEXT_18 = "Servico servico = null;" + NL + "\t" + NL + "\t" + NL + "\tpublic BaseAdapter getAdapter() {" + NL + "\t\treturn adapt;" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tprotected void inicializaItensTelaBase() {" + NL + "\t\tbtnCriaItem = (Button) getTela().findViewById(R.id.btnCria";
  protected final String TEXT_19 = ");" + NL + "\t}" + NL + "\t@Override" + NL + "\tprotected void inicializaListenersBase() {" + NL + "\t\tbtnCriaItem.setOnClickListener(new OnClickListener() {" + NL + "\t\t\t@Override" + NL + "\t\t\tpublic void onClick(View v) {" + NL + "\t\t\t\tchamaCriaItem();" + NL + "\t\t\t}" + NL + "\t\t});" + NL + "\t}" + NL + "\t" + NL + "" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "\tprotected void inicializaServicos() {" + NL + "\t\tservico = FabricaServico.getInstancia().get";
  protected final String TEXT_20 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t}" + NL + "" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void onToqueLongoTela(DCIObjetoDominio obj) {" + NL + "\t\tIFragmentEdicao quadro = criaQuadroTrata();" + NL + "\t\tquadro.setItem(obj);" + NL + "\t\tquadro.setAlteracao();" + NL + "\t\talteraQuadro(quadro);" + NL + "\t}" + NL + "" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void audioRawConcluido(AudioRecurso audioRecurso) {" + NL + "\t}" + NL + "" + NL + "\tprotected String getPalavraChave() {" + NL + "\t\treturn ITEM_CLICK;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic void onAlteraQuadro() {" + NL + "\t}" + NL + "\t" + NL + "" + NL + "\tpublic void onStart() {" + NL + "\t\tsuper.onStart();" + NL + "\t\tpreencheLista(); // Talvez nao precise fazer isso sempre j? que existe o adapt.notifyDataSetChanged" + NL + "\t    // Ao se conhecer melhor o ciclo de vida dos fragments pensar em otimizar esse trecho" + NL + "\t\t// evitar processar algo que n?o muda e evitar n?o processar algo que muda." + NL + "\t\t// Fazendo um algoritmo que sirva para fragments de smartphone, que fica um por tela" + NL + "\t\t// Quanto de tablet que pode ficar mais de um" + NL + "\t\t// Decidir ate 28-06-2014" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tprotected ResourceObj getLayoutTela() {" + NL + "\t\tResourceObj recurso = new ResourceObj(R.layout.lista_";
  protected final String TEXT_21 = ",\"R.layout.lista_";
  protected final String TEXT_22 = "\");" + NL + "\t\treturn recurso;" + NL + "\t}" + NL + "\t// Dois metodos com mesmo objetivo. Excluir at? 21-07-2015 ( 3 meses )" + NL + "\t// TelaListaUsoBase, TelaQuadroListaBase, ViewBase" + NL + "\t" + NL + "\t" + NL + "\t// Delegando a cria??o de objeto ao inicializaItemTela na camada servico" + NL + "\tpublic final void chamaCriaItem() {" + NL + "\t\tIFragmentEdicao quadro = criaQuadroTrata();" + NL + "\t\t//";
  protected final String TEXT_23 = " nova = servico.inicializaItemTela(getContext());" + NL + "\t\t";
  protected final String TEXT_24 = " nova = FabricaVo.cria";
  protected final String TEXT_25 = "();" + NL + "\t\t//nova = insereObjetoPrincipal(nova);" + NL + "\t\tnova = servico.inicializaItemTela(nova,getContext());" + NL + "\t\tquadro.setItem(nova);" + NL + "\t\tquadro.setInsercao();" + NL + "\t\t" + NL + "\t}" + NL + "\t" + NL + "\tprotected boolean getDialog() {" + NL + "\t\treturn false;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tprotected ";
  protected final String TEXT_26 = " criaNova() {" + NL + "\t\treturn servico.inicializaItemTela(getContext());" + NL + "\t\t//throw new UnsupportedOperationException(\"Fazer override de criaNova em ";
  protected final String TEXT_27 = "QuadroLista retornando new ";
  protected final String TEXT_28 = " com inicializa??o de listas internas se necessario\");" + NL + "\t\t/* Exemplo - Criar inicializando dados e listas internas " + NL + "\t\tprotected SerieTreino criaNova() {" + NL + "\t\t\tSerieTreino nova = FabricaVo.criaSerieTreino();" + NL + "\t\t\tnova.setDataInicial(UtilDatas.getTimestampAtual());" + NL + "\t\t\tList<ItemSerie> lista = new ArrayList<ItemSerie>();" + NL + "\t\t\tnova.setListaItemSerie_Possui(lista);" + NL + "\t\t\treturn nova;" + NL + "\t\t}" + NL + "\t\t*/" + NL + "\t}" + NL + "\tprotected IFragmentEdicao criaQuadroTrata() {" + NL + "\t\tthrow new UnsupportedOperationException(\"Fazer override de criaQuadroTrata em ";
  protected final String TEXT_29 = "QuadroLista retornando new ";
  protected final String TEXT_30 = "QuadroTrata ou verificar se nao esta sendo chamada via super\");" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic void onToqueTela(DCIObjetoDominio obj) {" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tprotected void inicializaItensTela() {" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tprotected void inicializaListeners() {" + NL + "\t}" + NL + "" + NL + "\tprotected void preencheLista() {" + NL + "        //ListView lista = (ListView) getActivity().findViewById(R.id.listViewPrincipal);";
  protected final String TEXT_31 = NL + "        ";
  protected final String TEXT_32 = "Servico servico = FabricaServico.getInstancia().get";
  protected final String TEXT_33 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "        DigicomContexto dContexto = getContext();" + NL + "        List<";
  protected final String TEXT_34 = "> lista = getListaCorrente(dContexto.getContext(),servico);" + NL + "        DCLog.d(DCLog.SERVICO_QUADRO_LISTA, this, \"preencheLista : List<";
  protected final String TEXT_35 = "> -> \" + lista.size() + \" itens\");" + NL + "        // Pode ser necessario um adapter customizado (diferenciar o editar e usar)" + NL + "        adapt =  getAdapter(lista, dContexto);" + NL + "        adapt.setRaiz(this);" + NL + "        setListAdapter(adapt);" + NL + "        adapt.notifyDataSetChanged();" + NL + "\t}" + NL + "\t" + NL + "\tprotected ";
  protected final String TEXT_36 = "ListAdapter getAdapter(List<";
  protected final String TEXT_37 = "> lista,DigicomContexto dContexto) {" + NL + "\t\treturn new ";
  protected final String TEXT_38 = "ListAdapter(lista,dContexto.getContext());" + NL + "\t}" + NL + "\t" + NL + "\tprotected List<";
  protected final String TEXT_39 = "> getListaCorrente(Context contexto,";
  protected final String TEXT_40 = "Servico servico) {" + NL + "\t\tList<";
  protected final String TEXT_41 = "> saida = servico.getAllTela(contexto);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t// Tive que manter para que se possa criar Dialogs caso seja necess?rio." + NL + "\t// Pode ser feito de outra forma mas acho essa mais simples. Avaliar !!! ( 18-10-2015)" + NL + "\tprivate void alteraQuadro(IFragment quadro) {" + NL + "\t\tif (getDialog())" + NL + "\t\t\tTrocaQuadro.getInstancia().criaDialog(quadro,this);" + NL + "\t\telse" + NL + "\t\t\tTrocaQuadro.getInstancia().alteraQuadroPrincipal(quadro);" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( conf.getNamespace() );
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
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaTabela() );
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
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeParaClasse() );
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_41);
    return stringBuffer.toString();
  }
}
