package jet.android.activity;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class TelaListaUsoBase
{
  protected static String nl;
  public static synchronized TelaListaUsoBase create(String lineSeparator)
  {
    nl = lineSeparator;
    TelaListaUsoBase result = new TelaListaUsoBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".tela.listauso.base;" + NL + "" + NL + "import br.com.digicom.R;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_5 = ".servico.FabricaServico;" + NL + "import ";
  protected final String TEXT_6 = ".servico.";
  protected final String TEXT_7 = "Servico;" + NL + "import ";
  protected final String TEXT_8 = ".view.adapter.listauso.base.";
  protected final String TEXT_9 = "ListUsoAdapterBase;" + NL + "import ";
  protected final String TEXT_10 = ".view.adapter.listauso.";
  protected final String TEXT_11 = "ListUsoAdapter;" + NL + "import ";
  protected final String TEXT_12 = ".modelo.vo.FabricaVo;" + NL + "import ";
  protected final String TEXT_13 = ".servico.";
  protected final String TEXT_14 = "Servico;" + NL + "import br.com.digicom.animacao.TrocaQuadro;" + NL + "" + NL + "import java.util.List;" + NL + "" + NL + "import android.content.Context;" + NL + "import android.os.Bundle;" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.View;" + NL + "import android.view.ViewGroup;" + NL + "import android.view.View.OnClickListener;" + NL + "import android.widget.ListView;" + NL + "import android.widget.Button;" + NL + "import br.com.digicom.multimidia.AudioRecurso;" + NL + "import br.com.digicom.quadro.BaseListFragment;" + NL + "import br.com.digicom.quadro.IQuadroLista;" + NL + "import br.com.digicom.activity.DigicomContexto;" + NL + "import br.com.digicom.log.DCLog;" + NL + "import br.com.digicom.layout.ResourceObj;" + NL + "" + NL + "import android.support.v4.app.FragmentActivity;" + NL + "import android.support.v4.app.Fragment;" + NL + "import android.support.v4.app.FragmentTransaction;" + NL + "import br.com.digicom.quadro.IFragment;" + NL + "import br.com.digicom.quadro.IFragmentEdicao;" + NL + "import android.util.Log;" + NL + "import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "import android.widget.BaseAdapter;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_15 = "ListaUsoBase extends BaseListFragment implements IQuadroLista {" + NL + "" + NL + "\tpublic final static String ITEM_CLICK = \"";
  protected final String TEXT_16 = "ItemClick\";" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_17 = "ListUsoAdapterBase adapt = null;" + NL + "\tprivate ";
  protected final String TEXT_18 = "Servico servico = null;" + NL + "\t" + NL + "\t\t" + NL + "\tprotected ";
  protected final String TEXT_19 = "Servico getServico() {" + NL + "\t\treturn servico;" + NL + "\t}" + NL + "\t\t" + NL + "\tpublic BaseAdapter getAdapter() {" + NL + "\t\treturn adapt;" + NL + "\t}" + NL + "\t\t" + NL + "\t\t" + NL + "\t@Override" + NL + "\tprotected void inicializaServicos() {" + NL + "\t\tservico = FabricaServico.getInstancia().get";
  protected final String TEXT_20 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t}" + NL + "" + NL + "\tprotected void atualizaLista() {" + NL + "\t\tadapt.notifyDataSetChanged();" + NL + "\t}" + NL + "\tprotected void atualizaLista(List<";
  protected final String TEXT_21 = "> listaNova) {" + NL + "\t\tadapt.setListaNova(listaNova);" + NL + "\t\tadapt.notifyDataSetChanged();" + NL + "\t}" + NL + "" + NL + "\t" + NL + "" + NL + "\t@Override" + NL + "\tpublic void audioRawConcluido(AudioRecurso audioRecurso) {" + NL + "\t}" + NL + "" + NL + "\tprotected String getPalavraChave() {" + NL + "\t\treturn ITEM_CLICK;" + NL + "\t}" + NL + "" + NL + "\t" + NL + "" + NL + "\tpublic void onStart() {" + NL + "\t\tsuper.onStart();" + NL + "\t\tpreencheLista(); // Talvez nao precise fazer isso sempre j? que existe o adapt.notifyDataSetChanged" + NL + "\t\tadapt.notifyDataSetChanged(); // Colocar dentro do preencheLista ?" + NL + "\t\t// Ao se conhecer melhor o ciclo de vida dos fragments pensar em otimizar esse trecho" + NL + "\t\t// evitar processar algo que n?o muda e evitar n?o processar algo que muda." + NL + "\t\t// Fazendo um algoritmo que sirva para fragments de smartphone, que fica um por tela" + NL + "\t\t// Quanto de tablet que pode ficar mais de um" + NL + "\t\t// Decidir ate 28-06-2014" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "\tprotected ResourceObj getLayoutTela() {" + NL + "\t\tResourceObj recurso = new ResourceObj(R.layout.lista_uso_padrao,\"R.layout.lista_uso_padrao\");" + NL + "\t\treturn recurso;" + NL + "\t}" + NL + "\t// Dois metodos com mesmo objetivo. Excluir at? 21-07-2015 ( 3 meses )" + NL + "\t// TelaListaUsoBase, TelaQuadroListaBase, ViewBase, TelaListaEdicaoBase" + NL + "\t" + NL + "" + NL + "\t@Override" + NL + "\tpublic void onToqueTela(DCIObjetoDominio obj) {" + NL + "\t}" + NL + "\t/*" + NL + "\tPara esse tipo de tela nao est? implementado" + NL + "\t@Override" + NL + "\tpublic void onToqueLongoTela(DCIObjetoDominio obj) {" + NL + "\t}" + NL + "\t*/" + NL + "" + NL + "\t@Override" + NL + "\tprotected void inicializaItensTela() {" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tprotected void inicializaListeners() {" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic void onAlteraQuadro() {" + NL + "\t\tpreencheLista();" + NL + "\t}" + NL + "" + NL + "\tprivate void preencheLista() {" + NL + "        //ListView lista = (ListView) getActivity().findViewById(R.id.listViewPrincipal);";
  protected final String TEXT_22 = NL + "        ";
  protected final String TEXT_23 = "Servico servico = FabricaServico.getInstancia().get";
  protected final String TEXT_24 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "        DigicomContexto dContexto = getContext();" + NL + "        List<";
  protected final String TEXT_25 = "> lista = getListaCorrente(dContexto.getContext(),servico);" + NL + "        // Pode ser necessario um adapter customizado (diferenciar o editar e usar)" + NL + "        adapt =  getAdapter(lista, dContexto);" + NL + "        DCLog.d(DCLog.SERVICO_QUADRO_LISTA, this, \"getListaCorrente : List<";
  protected final String TEXT_26 = "> -> \" + lista.size() + \" itens (Adapter:\" + adapt.getClass().getName() + \")\");" + NL + "        adapt.setRaiz(this);" + NL + "        setListAdapter(adapt);" + NL + "\t}" + NL + "\t" + NL + "\tprotected ";
  protected final String TEXT_27 = "ListUsoAdapterBase getAdapter(List<";
  protected final String TEXT_28 = "> lista,DigicomContexto dContexto) {" + NL + "\t\treturn new ";
  protected final String TEXT_29 = "ListUsoAdapter(lista,dContexto);" + NL + "\t}" + NL + "\t" + NL + "\tprotected List<";
  protected final String TEXT_30 = "> getListaCorrente(Context contexto,";
  protected final String TEXT_31 = "Servico servico) {" + NL + "\t\t";
  protected final String TEXT_32 = NL + "\t\tthrow new UnsupportedOperationException(\"Fazer override de getListaCorrente em ";
  protected final String TEXT_33 = "ListaUso, trata-se de classe de relacionamento\");" + NL + "\t\t";
  protected final String TEXT_34 = NL + "\t\tList<";
  protected final String TEXT_35 = "> saida = servico.getAllTela(contexto);" + NL + "\t\treturn saida;" + NL + "\t\t";
  protected final String TEXT_36 = NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t";
  protected final String TEXT_37 = NL + "\t// Classes dependentes para n?o associativas" + NL + "\tprivate ";
  protected final String TEXT_38 = " ";
  protected final String TEXT_39 = ";" + NL + "\tpublic final void set";
  protected final String TEXT_40 = "(";
  protected final String TEXT_41 = " valor) {" + NL + "\t\t";
  protected final String TEXT_42 = " = valor;" + NL + "\t\t";
  protected final String TEXT_43 = ".setContexto(getContext());" + NL + "\t}" + NL + "\tprotected final ";
  protected final String TEXT_44 = " get";
  protected final String TEXT_45 = "() {" + NL + "\t\treturn ";
  protected final String TEXT_46 = ";" + NL + "\t}" + NL + "\t";
  protected final String TEXT_47 = NL + "\t" + NL + "\t" + NL + "" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
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
    
		if (classe.isAssociativa()) {
		
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    
		} else {
		
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    
		}
		
    stringBuffer.append(TEXT_36);
    
	if (!classe.isAssociativa()) {
		List<RelacionamentoWrapper> lisRel = classe.obtemListaDependentePai();
		for (RelacionamentoWrapper rel : lisRel) {
	
    stringBuffer.append(TEXT_37);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_46);
    
		}
	}
	
    stringBuffer.append(TEXT_47);
    return stringBuffer.toString();
  }
}
