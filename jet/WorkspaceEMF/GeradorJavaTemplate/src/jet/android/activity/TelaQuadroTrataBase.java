package jet.android.activity;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class TelaQuadroTrataBase
{
  protected static String nl;
  public static synchronized TelaQuadroTrataBase create(String lineSeparator)
  {
    nl = lineSeparator;
    TelaQuadroTrataBase result = new TelaQuadroTrataBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".tela.trata.base;" + NL + "" + NL + "import java.util.List;" + NL + "import android.app.Activity;" + NL + "import android.os.Bundle;" + NL + "import android.support.v4.app.Fragment;" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.View;" + NL + "import android.view.ViewGroup;" + NL + "import android.widget.Button;" + NL + "import android.widget.ArrayAdapter;" + NL + "import android.widget.Spinner;" + NL + "" + NL + "import android.support.v4.app.FragmentTransaction;" + NL + "import br.com.digicom.quadro.IFragment;" + NL + "" + NL + "//import android.widget.CheckBox;" + NL + "//import android.widget.TextView;" + NL + "import android.widget.EditText;" + NL + "import android.content.Context;" + NL + "import android.view.inputmethod.InputMethodManager;" + NL + "import ";
  protected final String TEXT_4 = ".app.R;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_6 = ".modelo.agregado.";
  protected final String TEXT_7 = "AgregadoI;" + NL + "import ";
  protected final String TEXT_8 = ".servico.FabricaServico;" + NL + "import ";
  protected final String TEXT_9 = ".servico.*;" + NL + "import ";
  protected final String TEXT_10 = ".modelo.vo.FabricaVo;" + NL + "import ";
  protected final String TEXT_11 = ".app.Constantes;" + NL + "import br.com.digicom.quadro.BaseDialogFragment;" + NL + "import br.com.digicom.multimidia.AudioRecurso;" + NL + "import br.com.digicom.quadro.IFragment;" + NL + "import br.com.digicom.quadro.IFragmentEdicao;" + NL + "import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "import br.com.digicom.layout.ResourceObj;" + NL + "import br.com.digicom.quadro.ResultadoValidacao;" + NL + "import br.com.digicom.animacao.TrocaQuadro;" + NL + "import br.com.digicom.log.DCLog;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_12 = "QuadroTrataBase extends BaseDialogFragment implements IFragmentEdicao {" + NL + "" + NL + "\t" + NL + "\tprivate ";
  protected final String TEXT_13 = " item = null;" + NL + "\tprivate boolean insercao = false;" + NL + "\tprivate boolean alteracao = false;" + NL + "\t//protected Activity activity = null;" + NL + "\t" + NL + "\t// Para manipular apenas os dados relacionados" + NL + "\tprotected ";
  protected final String TEXT_14 = "AgregadoI getItem() {" + NL + "\t\treturn (";
  protected final String TEXT_15 = "AgregadoI) item;" + NL + "\t}" + NL + "" + NL + "\tpublic void logObjetoInterno() {" + NL + "\t\tDCLog.d(DCLog.OBJETO_INTERNO, this, \"item = \"  + item + \"(\" + (item!=null?item.getClass().getSimpleName():\"-\") + \")\");" + NL + "\t}" + NL + "\t" + NL + "\tpublic void setItem(DCIObjetoDominio item) {" + NL + "\t\tthis.item = (";
  protected final String TEXT_16 = ") item;" + NL + "\t\t//this.activity = activity;" + NL + "\t\t//preencheCampos();" + NL + "\t}" + NL + "\tpublic void setInsercao() {" + NL + "\t\tinsercao = true;" + NL + "\t}" + NL + "\tpublic void setAlteracao() {" + NL + "\t\talteracao = true;" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tprotected final void carregaElementosTelaBase() {" + NL + "\t\tif (item!=null && alteracao) {" + NL + "\t\t\tthis.transfereVoParaTela(item);" + NL + "\t\t}" + NL + "\t\tlogObjetoInterno();" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tprotected void setOnOk(View tela) {" + NL + "\t\tView btn = (View) tela.findViewById(R.id.btnOkTrata";
  protected final String TEXT_17 = ");" + NL + "\t\t// Verificando se existe o bot?o de ok na tela." + NL + "\t\tif (btn==null) {" + NL + "\t\t\tthrow new RuntimeException(\"R.id.btnOkTrata";
  protected final String TEXT_18 = " n?o encontrado em \" + this.getRecurso().getNome());" + NL + "\t\t}" + NL + "\t\tbtn.setOnClickListener(new View.OnClickListener() {" + NL + "\t\t\tpublic void onClick(View v) {" + NL + "\t\t\t\tif (!alteracao && !insercao) {" + NL + "\t\t\t\t\tthrow new UnsupportedOperationException(\"Nao foi selecionado nem alteracao nem insercao para ";
  protected final String TEXT_19 = "QuadroTrata\");" + NL + "\t\t\t\t} else {" + NL + "\t\t\t\t\tif (item==null) {" + NL + "\t\t\t\t\t\tthrow new UnsupportedOperationException(\"Item com valor null em ";
  protected final String TEXT_20 = "QuadroTrataBase\");" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tif (validaCamposTela().getProsseguir()) {" + NL + "\t\t\t\t\t\tif (alteracao) {" + NL + "\t\t\t\t\t\t\talteraItem(item);" + NL + "\t\t\t\t\t\t\tif (posAlteraRetornaTela(item))" + NL + "\t\t\t\t\t\t\t\tretornaTela();" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\tif (insercao) {" + NL + "\t\t\t\t\t\t\tinsereItem(item);" + NL + "\t\t\t\t\t\t\tif (posInsereRetornaTela(item))" + NL + "\t\t\t\t\t\t\t\tretornaTela();" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t});" + NL + "\t}" + NL + "\tpublic boolean posInsereRetornaTela(";
  protected final String TEXT_21 = " valor) {" + NL + "\t\treturn true;" + NL + "\t}" + NL + "\tpublic boolean posAlteraRetornaTela(";
  protected final String TEXT_22 = " valor) {" + NL + "\t\treturn true;" + NL + "\t}" + NL + "" + NL + "\tprotected abstract ResultadoValidacao validaCamposTela();" + NL + "\t//\tthrow new RuntimeException(\"Implementar validaCamposTela de ";
  protected final String TEXT_23 = "QuadroTrataBase\");" + NL + "\t//}" + NL + "" + NL + "\t@Override" + NL + "\tprotected EditText getUltimoCampo() {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic void onAlteraQuadro() {" + NL + "\t}" + NL + "" + NL + "\tprotected final void alteraItem(";
  protected final String TEXT_24 = " valor) {" + NL + "\t\t";
  protected final String TEXT_25 = "Servico exibicaoSrv = FabricaServico.getInstancia().get";
  protected final String TEXT_26 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\t//View saida = LayoutInflater.from(getActivity()).inflate(R.layout.trata_";
  protected final String TEXT_27 = ", null);" + NL + "\t\ttransfereTelaParaVo(valor);" + NL + "\t\t//exibicaoSrv.alteraParaSincronizacao(valor);" + NL + "\t\texibicaoSrv.finalizaItemTela(valor, false, getContext());" + NL + "\t}" + NL + "\t// Passando o parametro que mesmo estando disponivel ? preciso " + NL + "\t// que fique claro qual objeto deve ser tratado, colocado aqui por" + NL + "\t// outro quadro" + NL + "\tprotected final void insereItem(";
  protected final String TEXT_28 = " valor) {" + NL + "\t\t";
  protected final String TEXT_29 = "Servico exibicaoSrv = FabricaServico.getInstancia().get";
  protected final String TEXT_30 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\t//View saida = LayoutInflater.from(getActivity()).inflate(R.layout.trata_";
  protected final String TEXT_31 = ", null);" + NL + "\t\ttransfereTelaParaVo(valor);" + NL + "\t\t//exibicaoSrv.insereParaSincronizacao(valor);" + NL + "\t\texibicaoSrv.finalizaItemTela(valor, true, getContext());" + NL + "\t}" + NL + "\t" + NL + "\tprotected void transfereTelaParaVo(";
  protected final String TEXT_32 = " vo)  {" + NL + "\t\tthrow new UnsupportedOperationException(\"Fazer override de transfereTelaParaVo em ";
  protected final String TEXT_33 = "QuadroTrata ou verificar se nao esta sendo chamada via super\");" + NL + "\t}" + NL + "\tprotected void transfereVoParaTela(final ";
  protected final String TEXT_34 = " vo)  {" + NL + "\t\tthrow new UnsupportedOperationException(\"Fazer override de transfereVoParaTela em \" + this.getClass().getSimpleName() + \" ou verificar se nao esta sendo chamada via super\");" + NL + "\t}" + NL + "\tpublic String getTituloTela()  {" + NL + "\t\treturn \"Alterar em \" + this.getClass().getSimpleName();" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tprotected ResourceObj getLayoutTela() {" + NL + "\t\tResourceObj recurso = new ResourceObj(R.layout.trata_";
  protected final String TEXT_35 = ",\"R.layout.trata_";
  protected final String TEXT_36 = "\");" + NL + "\t\treturn recurso;" + NL + "\t}" + NL + "" + NL + "" + NL + "\t@Override" + NL + "\tprotected final void inicializaItensTelaBase() {" + NL + "\t\tif (item==null) {" + NL + "\t\t\t";
  protected final String TEXT_37 = "Servico servico = FabricaServico.getInstancia().get";
  protected final String TEXT_38 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\t\titem = FabricaVo.cria";
  protected final String TEXT_39 = "();" + NL + "\t\t\titem = servico.inicializaItemTela(item, getContext());" + NL + "\t\t}" + NL + "\t\t\t";
  protected final String TEXT_40 = NL + "\t\tif (this.";
  protected final String TEXT_41 = "!=null) {" + NL + "\t\t\titem.set";
  protected final String TEXT_42 = "_";
  protected final String TEXT_43 = "(";
  protected final String TEXT_44 = ");" + NL + "\t\t}" + NL + "\t\t\t";
  protected final String TEXT_45 = NL + "\t}" + NL + "" + NL + "" + NL + "\t@Override" + NL + "\tprotected void inicializaServicos() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "" + NL + "" + NL + "\t" + NL + "\t" + NL + "" + NL + "\t@Override" + NL + "\tprotected final void inicializaListenersBase() {" + NL + "\t\tsetOnOk(getTela());" + NL + "\t}" + NL + "" + NL + "" + NL + "\t@Override" + NL + "\tprotected void inicioJogoTela() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "\t" + NL + "\t// Como passou a ser um IFragment precisa desse m?todo. " + NL + "\t// N?o sei se faz sentido. Acho que sim. Qualquer trecho de tela pode ter itercao com audio" + NL + "\t@Override" + NL + "\tpublic void audioRawConcluido(AudioRecurso audioRecurso) {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t";
  protected final String TEXT_46 = NL + "\t// Classes dependentes para n?o associativas" + NL + "\tprivate ";
  protected final String TEXT_47 = " ";
  protected final String TEXT_48 = ";" + NL + "\tpublic final void set";
  protected final String TEXT_49 = "(";
  protected final String TEXT_50 = " valor) {" + NL + "\t\t";
  protected final String TEXT_51 = " = valor;" + NL + "\t\t";
  protected final String TEXT_52 = ".setContexto(getContext());" + NL + "\t}" + NL + "\tprotected final ";
  protected final String TEXT_53 = " get";
  protected final String TEXT_54 = "() {" + NL + "\t\treturn ";
  protected final String TEXT_55 = ";" + NL + "\t}" + NL + "\t";
  protected final String TEXT_56 = NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t";
  protected final String TEXT_57 = NL + "\tprotected Spinner getSpinner";
  protected final String TEXT_58 = "(int codigo, String nome) {" + NL + "\t\t";
  protected final String TEXT_59 = "Servico srv = FabricaServico.getInstancia().get";
  protected final String TEXT_60 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\tList<";
  protected final String TEXT_61 = "> listaTela = srv.getAllTela(getContext().getContext());" + NL + "\t\tSpinner spn = this.getSpinner(codigo, nome, listaTela, this.getContext().getContext()); " + NL + "\t\treturn spn;" + NL + "\t}" + NL + "\t/*" + NL + "\tprotected Spinner carregaSpinner";
  protected final String TEXT_62 = "(Spinner spn) {" + NL + "\t\t";
  protected final String TEXT_63 = "Servico srv = FabricaServico.getInstancia().get";
  protected final String TEXT_64 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\tList<";
  protected final String TEXT_65 = "> listaTela = srv.getAllTela(getContext().getContext());" + NL + "\t\tArrayAdapter<";
  protected final String TEXT_66 = "> dataAdapter = new ArrayAdapter<";
  protected final String TEXT_67 = ">(getContext().getContext(), android.R.layout.simple_spinner_item, listaTela);" + NL + "\t\tdataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);" + NL + "\t\tspn.setAdapter(dataAdapter);" + NL + "\t\treturn spn;" + NL + "\t}" + NL + "\t*/" + NL + "\t";
  protected final String TEXT_68 = NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic final void extraiBundle() {" + NL + "\t\tthis.item = (";
  protected final String TEXT_69 = ") this.getBundle().getObjeto(Constantes.CHAVE_";
  protected final String TEXT_70 = ");" + NL + "\t\tif ((Boolean)this.getBundle().getObjeto(Constantes.CHAVE_ALTERACAO))" + NL + "\t\t\tthis.setAlteracao();" + NL + "\t\telse" + NL + "\t\t\tthis.setInsercao();" + NL + "\t\t";
  protected final String TEXT_71 = NL + "\t\tboolean existeItem = false;" + NL + "\t\t";
  protected final String TEXT_72 = NL + "\t\tthis.";
  protected final String TEXT_73 = " = (";
  protected final String TEXT_74 = ") this.getBundle().getObjetoPermiteNull(Constantes.CHAVE_";
  protected final String TEXT_75 = ");" + NL + "\t\texisteItem = existeItem || (this.";
  protected final String TEXT_76 = "!=null);" + NL + "\t\t";
  protected final String TEXT_77 = NL + "\t\tif (!existeItem) throw new RuntimeException(\"Sem referencia\");" + NL + "\t\t";
  protected final String TEXT_78 = NL + "\t\textraiBundleComplemento();" + NL + "\t}" + NL + "\tprotected void extraiBundleComplemento() {" + NL + "\t}" + NL + "\t" + NL + "\t// Se a interface IFragmentEdicao fosse implementada no n?vel superior poderia ficar na arquitetura." + NL + "\t@Override" + NL + "\tpublic boolean validaDadosQuadro() {" + NL + "\t\tthrow new RuntimeException(\"Implementar validaDadosQuadro em \" + this.getClass().getSimpleName());" + NL + "\t}" + NL + "}";
  protected final String TEXT_79 = NL;

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( conf.getNamespace() );
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
    stringBuffer.append( classe.getNomeParaClasse() );
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    
			if (!classe.isAssociativa()) {
				List<RelacionamentoWrapper> lisRel1 = classe.obtemListaDependentePai();
				for (RelacionamentoWrapper rel : lisRel1) {
			
    stringBuffer.append(TEXT_40);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( rel.getNomeRelacionamento() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_44);
    
			}
			}
			
    stringBuffer.append(TEXT_45);
    
	if (!classe.isAssociativa()) {
		List<RelacionamentoWrapper> lisRel = classe.obtemListaDependentePai();
		for (RelacionamentoWrapper rel : lisRel) {
	
    stringBuffer.append(TEXT_46);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_55);
    
		}
	}
	
    stringBuffer.append(TEXT_56);
    
	List<RelacionamentoWrapper> lisRel = classe.obtemListaDependentePai();
		for (RelacionamentoWrapper rel : lisRel) {
	
    stringBuffer.append(TEXT_57);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_67);
    
		}
	
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_70);
    
		if (!classe.isAssociativa() && classe.obtemListaDependentePai().size()>0) {
		
    stringBuffer.append(TEXT_71);
    
			List<RelacionamentoWrapper> lisRel1 = classe.obtemListaDependentePai();
			for (RelacionamentoWrapper rel : lisRel1) {
		
    stringBuffer.append(TEXT_72);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( rel.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( rel.getClasseOposta().getNomeParaConstante() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( rel.getClasseOposta().getNomeParaVariavel() );
    stringBuffer.append(TEXT_76);
    
			}
		
    stringBuffer.append(TEXT_77);
    
		}
		
    stringBuffer.append(TEXT_78);
    stringBuffer.append(TEXT_79);
    return stringBuffer.toString();
  }
}
