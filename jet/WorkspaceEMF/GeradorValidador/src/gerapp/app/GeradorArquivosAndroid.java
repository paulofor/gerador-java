package gerapp.app;


import gerapp.modelo.Entidade;
import jet.android.activity.PrincipalActivityBase;
import jet.android.activity.SincronizadorBase;
import jet.android.activity.TelaListaEdicaoBase;
import jet.android.activity.TelaListaUsoBase;
import jet.android.activity.TelaQuadroLista;
import jet.android.activity.TelaQuadroListaBase;
import jet.android.activity.TelaQuadroTrataBase;
import jet.android.complementares.DrawableBgActionBar;
import jet.android.complementares.MenuFragment;
import jet.android.complementares.PrincipalActivity;
import jet.android.complementares.Sincronizador;
import jet.android.dao.DBHelper;
import jet.android.dao.DBHelperImpl;
import jet.android.dao.DataSourceAplicacao;
import jet.android.dao.DataSourceRemoto;
import jet.android.dao.FabricaDao;
import jet.android.dao.Montador;
import jet.android.modelo.Agregado;
import jet.android.modelo.AgregadoInterface;
import jet.android.modelo.Derivada;
import jet.android.modelo.DerivadaInterface;
import jet.android.modelo.Display;
import jet.android.modelo.DisplayInterface;
import jet.android.modelo.FabricaVo;
import jet.android.modelo.Vo;
import jet.android.modelo.VoInterface;
import jet.android.res.ManifestXml;
import jet.android.res.layout.ItemListaXml;
import jet.android.res.layout.ListaObjetoXml;
import jet.android.res.layout.TrataObjetoXml;
import jet.android.servico.FabricaServico;
import jet.android.servico.FiltroServico;
import jet.android.servico.Servico;
import jet.android.servico.ServicoJsonBase;
import jet.android.servico.ServicoJsonImpl;
import jet.android.servico.ServicoMultimidiaBase;
import jet.android.servico.ServicoMultimidiaImpl;
import jet.android.servico.ServicoSqliteBase;
import jet.android.servico.ServicoSqliteImpl;
import jet.android.view.ListAdapter;
import jet.android.view.ListAdapterBase;
import jet.android.view.ListEdicaoAdapter;
import jet.android.view.ListEdicaoAdapterBase;
import jet.android.view.ListUsoAdapter;
import jet.android.view.ListUsoAdapterBase;
import jet.android.view.View;
import jet.android.view.ViewBase;
import jet.wrappers.android.ClasseWrapperAndroid;
import jet.wrappers.base.ClasseWrapper;
import java.io.IOException;

public class GeradorArquivosAndroid extends GeradorArquivosBase {

	
	protected Configuracao configuracao = null;
	protected ClasseWrapper entidade = null;
	
	
	@Override
	public void criaArquivoEntidade(Recursos recursos) throws IOException{
		// TODO Auto-generated method stub
		criaArquivosServicosBase(recursos);
		criaArquivosServicosImpl(recursos);
		criaArquivosModeloVo(recursos);
		criaArquivosDbHelper(recursos);
		criaArquivosView(recursos);
		criaArquivosTelaQuadro(recursos);
		criaArquivosRes(recursos);
		
	}

	@Override
	public void criaArquivoUnico(Recursos recursos) throws IOException {
		// TODO Auto-generated method stub
		criaArquivoFabrica(recursos);
		criaArquivoAplicacao(recursos);
		criaComplementares(recursos);
	}

	private void criaComplementares(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//app//Sincronizador.java";
		String conteudo = null;
		if (!this.existe(nomeArquivo)) {
			conteudo = Sincronizador.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//app//" + recursos.getConfiguracao().getNomeAplicacao() + "PrincipalActivity.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = PrincipalActivity.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		//nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//app//MenuFragment.java";
		//if (!this.existe(nomeArquivo)) {
		//	conteudo = MenuFragment.create("\n").generate(recursos);
		//	geraArquivoFonte(conteudo,nomeArquivo);
		//}
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//..//..//res//drawable//bg_action_bar.xml";
		conteudo = DrawableBgActionBar.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}

	@Override
	protected ClasseWrapper criaWrapper(Entidade entidade) {
		// TODO Auto-generated method stub
		return new ClasseWrapperAndroid(entidade);
	}

	private void criaArquivosTelaQuadro(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//tela//quadro//base//" + recursos.getClasse().getNomeParaClasse()  + "QuadroListaBase.java";
		String conteudo = TelaQuadroListaBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		

		//nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//tela//quadro//" + recursos.getClasse().getNomeParaClasse()  + "QuadroLista.java";
		//if (!this.existe(nomeArquivo)) {
		//	conteudo = TelaQuadroLista.create("\n").generate(recursos);
		//	geraArquivoFonte(conteudo,nomeArquivo);
		//}
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//tela//trata//base//" + recursos.getClasse().getNomeParaClasse()  + "QuadroTrataBase.java";
		conteudo = TelaQuadroTrataBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);

		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//tela//listaedicao//base//" + recursos.getClasse().getNomeParaClasse()  + "ListaEdicaoBase.java";
		conteudo = TelaListaEdicaoBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//tela//listauso//base//" + recursos.getClasse().getNomeParaClasse()  + "ListaUsoBase.java";
		conteudo = TelaListaUsoBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	private void criaArquivosRes(Recursos recursos) throws IOException{
		String nomeArquivo = null;
		String conteudo = null;
		/*
		String nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//dao//base//" + recursos.getClasse().getNomeParaClasse()  + "DBHelperBase.java";
		String conteudo = DBHelper.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		*/
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//..//..//res//layout//item_" + recursos.getClasse().getNomeParaTabela() + ".xml";
		if (!this.existe(nomeArquivo)) {
			conteudo = ItemListaXml.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//..//..//res//layout//trata_" + recursos.getClasse().getNomeParaTabela() + ".xml";
		if (!this.existe(nomeArquivo)) {
			conteudo = TrataObjetoXml.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//..//..//res//layout//lista_" + recursos.getClasse().getNomeParaTabela() + ".xml";
		if (!this.existe(nomeArquivo)) {
			conteudo = ListaObjetoXml.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		/*
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//..//..//res//layout//lista_uso_" + recursos.getClasse().getNomeParaTabela() + ".xml";
		if (!this.existe(nomeArquivo)) {
			conteudo = ListaUsoObjetoXml.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		*/
	}
	
	
	private void criaArquivosDbHelper(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//dao//base//" + recursos.getClasse().getNomeParaClasse()  + "DBHelperBase.java";
		String conteudo = DBHelper.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//dao//" + recursos.getClasse().getNomeParaClasse()  + "DBHelper.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = DBHelperImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//dao//montador//" + recursos.getClasse().getNomeParaClasse()  + "Montador.java";
		conteudo = Montador.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//dao//datasource//DataSourceAplicacao.java";
		//if (!this.existe(nomeArquivo)) {
			conteudo = DataSourceAplicacao.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		//}
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//dao//datasource//DataSourceRemoto.java";
		if (!this.existe(nomeArquivo)) {
				conteudo = DataSourceRemoto.create("\n").generate(recursos);
				geraArquivoFonte(conteudo,nomeArquivo);
		}

	}
	
	private void criaArquivosServicosBase(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathServicoInterface() + "//" + recursos.getClasse().getNomeParaClasse()  + "Servico.java";
		String conteudo = Servico.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathServicoSqliteBase() + "//" + recursos.getClasse().getNomeParaClasse()  + "ServicoSqliteBase.java";
		conteudo = ServicoSqliteBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathServicoWsJsonBase() + "//" + recursos.getClasse().getNomeParaClasse()  + "ServicoWsJsonBase.java";
		conteudo = ServicoJsonBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//servico//filtro//" + recursos.getClasse().getNomeParaClasse()  + "Filtro.java";
		conteudo = FiltroServico.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//servico//multimidia//base//" + recursos.getClasse().getNomeParaClasse()  + "ServicoMultimidiaBase.java";
		conteudo = ServicoMultimidiaBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	private void criaArquivosServicosImpl(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathServicoSqliteImpl() + "//" + recursos.getClasse().getNomeParaClasse()  + "ServicoSqliteImpl.java";
		if (!this.existe(nomeArquivo)) {
			String conteudo = ServicoSqliteImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		nomeArquivo = recursos.getConfiguracao().getPathServicoWsJsonImpl() + "//" + recursos.getClasse().getNomeParaClasse()  + "ServicoWsJsonImpl.java";
		if (!this.existe(nomeArquivo)) {
			String conteudo = ServicoJsonImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//servico//multimidia//impl//" + recursos.getClasse().getNomeParaClasse()  + "ServicoMultimidia.java";
		if (!this.existe(nomeArquivo)) {
			String conteudo = ServicoMultimidiaImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
	}
	
	private void criaArquivosView(Recursos recursos) throws IOException {
		String nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//view//adapter//base//" + recursos.getClasse().getNomeParaClasse()  + "ListAdapterBase.java";
		String conteudo = ListAdapterBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//view//adapter//" + recursos.getClasse().getNomeParaClasse()  + "ListAdapter.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = ListAdapter.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//view//base//" + recursos.getClasse().getNomeParaClasse()  + "ViewBase.java";
		conteudo = ViewBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		//nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//view//" + recursos.getClasse().getNomeParaClasse()  + "View.java";
		//if (!this.existe(nomeArquivo)) {
		//	conteudo = View.create("\n").generate(recursos);
		//	geraArquivoFonte(conteudo,nomeArquivo);
		//}
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//view//adapter//listaedicao//base//" + recursos.getClasse().getNomeParaClasse()  + "ListEdicaoAdapterBase.java";
		conteudo = ListEdicaoAdapterBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//view//adapter//listauso//base//" + recursos.getClasse().getNomeParaClasse()  + "ListUsoAdapterBase.java";
		conteudo = ListUsoAdapterBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//view//adapter//listaedicao//" + recursos.getClasse().getNomeParaClasse()  + "ListEdicaoAdapter.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = ListEdicaoAdapter.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//view//adapter//listauso//" + recursos.getClasse().getNomeParaClasse()  + "ListUsoAdapter.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = ListUsoAdapter.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}

	}
	
	private void criaArquivosModeloVo(Recursos recursos) throws IOException{ 
		String nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//modelo//vo//" + recursos.getClasse().getNomeParaClasse()  + "Vo.java";
		//System.out.println("Criando arquivo " + nomeArquivo);
		String conteudo = Vo.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//modelo//" + recursos.getClasse().getNomeParaClasse()  + ".java";
		conteudo = VoInterface.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//modelo//agregado//" + recursos.getClasse().getNomeParaClasse()  + "AgregadoI.java";
		conteudo = AgregadoInterface.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//modelo//agregado//" + recursos.getClasse().getNomeParaClasse()  + "Agregado.java";
		conteudo = Agregado.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//modelo//derivada//" + recursos.getClasse().getNomeParaClasse()  + "DerivadaI.java";
		//if (!this.existe(nomeArquivo)) {
			conteudo = DerivadaInterface.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		//}
		nomeArquivo =recursos.getConfiguracao().getPathAndroid() + "//modelo//derivada//impl//" + recursos.getClasse().getNomeParaClasse()  + "Derivada.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = Derivada.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
	
	
		//nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//modelo//display//" + recursos.getClasse().getNomeParaClasse()  + "DisplayI.java";
		//conteudo = DisplayInterface.create("\n").generate(recursos);
		//geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =recursos.getConfiguracao().getPathAndroid() + "//modelo//display//impl//" + recursos.getClasse().getNomeParaClasse()  + "Display.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = Display.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		
	}
		
	
	
	private void criaArquivoFabrica(Recursos recursos) throws IOException{ 
		String nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//servico//FabricaServico.java";
		String conteudo = FabricaServico.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//dao//FabricaDao.java";
		conteudo = FabricaDao.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//modelo//vo//FabricaVo.java";
		conteudo = FabricaVo.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	private void criaArquivoAplicacao(Recursos recursos) throws IOException{ 
		String nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//app//base//PrincipalActivityBase.java";
		String conteudo = PrincipalActivityBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//app//base//SincronizadorBase.java";
		conteudo = SincronizadorBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);

		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//..//..//AndroidManifestInicial.xml";
		conteudo = ManifestXml.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);

		/*
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//dao//FabricaDao.java";
		conteudo = FabricaDao.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//modelo//vo//FabricaVo.java";
		conteudo = FabricaVo.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
				nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//..//..//res//layout//lista_" + recursos.getClasse().getNomeParaTabela() + ".xml";
		conteudo = ListaObjetoXml.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);

		*/
	}

	@Override
	public void limpaArquivos(Recursos recurso) throws IOException {
		// TODO Auto-generated method stub
		this.limpaCaminho(recurso.getConfiguracao().getPathPacoteRegraColecaoBase());
		
	}

	
}
