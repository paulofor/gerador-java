package gerapp.app;

import gerapp.modelo.Entidade;

import java.io.IOException;

import jet.android.data.ContentProviderAplicacao;
import jet.android.data.ContentProviderBase;
import jet.android.data.ContractAplicacao;
import jet.android.data.ContractEntidade;
import jet.android.data.DBHelperAplicacao;
import jet.android.data.DBHelperEntidade;
import jet.android.data.FiltroContract;
import jet.android2.activity.ListAdapterBase;
import jet.android2.activity.ListFragmentBase;
import jet.android2.activity.ListViewHolderBase;
import jet.android2.activity.ListaBaseActivity;
import jet.android2.data.OperacaoBaseEntidade;
import jet.android2.data.OperacaoEntidade;
import jet.android2.framework.DCLog;
import jet.android2.framework.MyAdapter;
import jet.android2.framework.SimpleDividerItemDecoration;
import jet.android2.framework.Telefone;
import jet.android2.framework.dao.DBHelperBase;
import jet.android2.framework.dao.DaoException;
import jet.android2.framework.dao.DaoItemRetorno;
import jet.android2.framework.dao.MontadorDaoI;
import jet.android2.framework.data.DatabaseConst;
import jet.android2.framework.data.MontadorDaoComposite;
import jet.android2.framework.faturamento.ConstantesBilling;
import jet.android2.framework.modelo.DCIObjetoDominio;
import jet.android2.framework.modelo.ObjetoSinc;
import jet.android2.framework.res.ListaPadraoXml;
import jet.android2.framework.sincronismo.DCNotificacaoParam;
import jet.android2.framework.sincronismo.DCSincronizador;
import jet.android2.framework.sincronismo.FCMIdServico;
import jet.android2.framework.sincronismo.FCMServico;
import jet.android2.framework.sincronismo.SincronismoBaseTask;
import jet.android2.framework.tela.DCActivityBase;
import jet.android2.framework.tela.DCAplicacao;
import jet.android2.framework.tela.MainActivityBase;
import jet.android2.framework.tela.MainActivityBaseGcm;
import jet.android2.framework.tela.MainActivityBaseSemGcm;
import jet.android2.framework.tela.ResourceObj;
import jet.android2.framework.tela.SplashActivityBase;
import jet.android2.framework.util.ItemChoiceManager;
import jet.android2.framework.util.UtilDatas;
import jet.android2.framework.xml.AuthenticatorXml;
import jet.android2.framework.xml.DimensXml;
import jet.android2.framework.xml.StringXml;
import jet.android2.framework.xml.SyncadapterXml;
import jet.android2.modelo.Agregado;
import jet.android2.modelo.AgregadoInterface;
import jet.android2.modelo.Montador;
import jet.android2.modelo.Vo;
import jet.android2.modelo.VoI;
import jet.android2.res.BuildGradle;
import jet.android2.res.ManifestXml;
import jet.android2.servico.FabricaServico;
import jet.android2.servico.ServicoBase;
import jet.android2.servico.ServicoImpl;
import jet.android2.sincronismo.DataSourceRemoto;
import jet.android2.sincronismo.ObjetoRemote;
import jet.android2.sincronismo.ObjetoSincronismo;
import jet.android2.sync.SyncAdapter;
import jet.android2.sync.SyncAuthenticator;
import jet.android2.sync.SyncAuthenticatorService;
import jet.android2.sync.SyncService;
import jet.android2.tela.Constantes;
import jet.android2.tela.CriaAcoplaBaseActivity;
import jet.android2.tela.DetalheBaseActivity;
import jet.android2.tela.ExibeItemListaBaseActivity;
import jet.android2.tela.FragmentEditaBase;
import jet.wrappers.android.ClasseWrapperAndroid;
import jet.wrappers.base.ClasseWrapper;


public class GeradorArquivosAndroid2 extends GeradorArquivosBase {

	
	protected Configuracao configuracao = null;
	protected ClasseWrapper entidade = null;
	
	//D:\Fontes\ProjetosAndroidStudio\ContatoNoite\app\src\main\java\br\com\digicom\contatonoite
	private static String PATH_TEMPLATES = "E:/Fontes/ProjetosAndroidStudio/";
	
	private String getPath(Recursos recursos) {
		return PATH_TEMPLATES + recursos.getConfiguracao().getNamespace() + "Modulo/template/src/main/java/br/com/lojadigicom/" + recursos.getConfiguracao().getNamespacePath();
	}
	private String getPathRes(Recursos recursos) {
		return PATH_TEMPLATES + recursos.getConfiguracao().getNamespace() + "Modulo/template/src/main/res";
	}
	
	@Override
	public void criaArquivoEntidade(Recursos recursos) throws IOException{
		criaArquivoDatabase(recursos);
		criaArquivoModelo(recursos);
		criaArquivoServico(recursos);
		criaArquivoAplicacao(recursos);
		criaArquivoSincronismo(recursos);
		criaArquivoTemplate(recursos);
		criaArquivosFramework(recursos);
		criaArquvisoFrameworkRes(recursos);
		criaArquivosTela(recursos);
	}
	
	
	public void criaArquivosTela(Recursos recursos) throws IOException {
		String nomeArquivo= null;
		String conteudo = null;
		
		// Retornar na medida das necessidades - estão confundindo.
		
		//nomeArquivo = getPath(recursos) + "//tela//base//" + recursos.getClasse().getNomeParaClasse()  + "FragmentListaUsoBase.java";
		//conteudo = FragmentListaUsoBase.create("\n").generate(recursos);
		//geraArquivoFonte(conteudo,nomeArquivo);
		
		//nomeArquivo = getPath(recursos) + "//tela//base//" + recursos.getClasse().getNomeParaClasse()  + "FragmentListaEditaBase.java";
		//conteudo = FragmentListaEditaBase.create("\n").generate(recursos);
		//geraArquivoFonte(conteudo,nomeArquivo);
		
		//nomeArquivo = getPath(recursos) + "//tela//base//" + recursos.getClasse().getNomeParaClasse()  + "FragmentTrataBase.java";
		//conteudo = FragmentTrataBase.create("\n").generate(recursos);
		//geraArquivoFonte(conteudo,nomeArquivo);
		
		//nomeArquivo = getPath(recursos) + "//tela//base//" + recursos.getClasse().getNomeParaClasse()  + "FragmentExibeBase.java";
		//conteudo = FragmentExibeBase.create("\n").generate(recursos);
		//geraArquivoFonte(conteudo,nomeArquivo);
		
		// Nao pode tirar, usado no ColetorCliente
		nomeArquivo = getPath(recursos) + "//tela//base//activity//detalhe//" + recursos.getClasse().getNomeParaClasse()  + "DetalheBaseActivity.java";
		conteudo = DetalheBaseActivity.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		// Semelhante ao anterior para ser usado em itens de listas
		nomeArquivo = getPath(recursos) + "//tela//base//activity//detalhe//" + recursos.getClasse().getNomeParaClasse()  + "ExibeItemListaBaseActivity.java";
		conteudo = ExibeItemListaBaseActivity.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		
		nomeArquivo = getPath(recursos) + "//tela//base//activity//lista//" + recursos.getClasse().getNomeParaClasse()  + "ListaBaseActivity.java";
		conteudo = ListaBaseActivity.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		//nomeArquivo = getPath(recursos) + "//tela//base//activity//exibe//" + recursos.getClasse().getNomeParaClasse()  + "ExibeBaseActivity.java";
		//conteudo = ExibeBaseActivity.create("\n").generate(recursos);
		//geraArquivoFonte(conteudo,nomeArquivo);
		
		
		// Vitrine - Obtem Um objeto (de sincronismo - vem de um webcrawler) gera outro (de usuario)
		nomeArquivo = getPath(recursos) + "//tela//base//activity//criaacopla//" + recursos.getClasse().getNomeParaClasse()  + "CriaAcoplaBaseActivity.java";
		conteudo = CriaAcoplaBaseActivity.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = getPath(recursos) + "//tela//base//fragment//" + recursos.getClasse().getNomeParaClasse()  + "FragmentEditaBase.java";
		conteudo = FragmentEditaBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	
	}
	
	
	private void criaArquvisoFrameworkRes(Recursos recursos) throws IOException{
		String nomeArquivo = getPathRes(recursos) + "//layout//lista_padrao.xml";
		String conteudo = ListaPadraoXml.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPathRes(recursos) + "//xml//authenticator.xml";
		conteudo = AuthenticatorXml.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo =  getPathRes(recursos) + "//xml//syncadapter.xml";
		conteudo = SyncadapterXml.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo =  getPathRes(recursos) + "//values//strings.xml";
		conteudo = StringXml.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo =  getPathRes(recursos) + "//values//dimens.xml";
		conteudo = DimensXml.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	
	private void criaArquivosFramework(Recursos recursos) throws IOException{
		String nomeArquivo = getPath(recursos) + "//framework//log//DCLog.java";
		String conteudo = DCLog.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//telefonia//Telefone.java";
		conteudo = Telefone.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//dao//MontadorDaoI.java";
		conteudo = MontadorDaoI.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//util//UtilDatas.java";
		conteudo = UtilDatas.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//dao//DaoItemRetorno.java";
		conteudo = DaoItemRetorno.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//modelo//DCIObjetoDominio.java";
		conteudo = DCIObjetoDominio.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//dao//DaoException.java";
		conteudo = DaoException.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//dao//DBHelperBase.java";
		conteudo = DBHelperBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//data//MontadorDaoComposite.java";
		conteudo = MontadorDaoComposite.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//modelo//ObjetoSinc.java";
		conteudo = ObjetoSinc.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//tela//ResourceObj.java";
		conteudo = ResourceObj.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//tela//DCAplicacao.java";
		conteudo = DCAplicacao.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//tela//DCActivityBase.java";
		conteudo = DCActivityBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//tela//SplashActivityBase.java";
		conteudo = SplashActivityBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//faturamento//ConstantesBilling.java";
		conteudo = ConstantesBilling.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}

	private void criaArquivoTemplate(Recursos recursos) throws IOException{
		String nomeArquivo = getPath(recursos) + "//template//lista//" + recursos.getClasse().getNomeParaClasse()  + "ListAdapterBase.java";
		String conteudo = ListAdapterBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//template//lista//" + recursos.getClasse().getNomeParaClasse()  + "ListFragmentBase.java";
		conteudo = ListFragmentBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo =  getPath(recursos) + "//template//lista//" + recursos.getClasse().getNomeParaClasse()  + "ListViewHolderBase.java";
		conteudo = ListViewHolderBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
	}
	private void criaArquivoServico(Recursos recursos) throws IOException{
		String nomeArquivo = getPath(recursos) + "//servico/base//" + recursos.getClasse().getNomeParaClasse()  + "Servico.java";
		String conteudo = ServicoBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//servico//impl//" + recursos.getClasse().getNomeParaClasse()  + "ServicoImpl.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = ServicoImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}

		
	}

	private void criaArquivoSincronismo(Recursos recursos) throws IOException {
		String nomeArquivo = getPath(recursos) + "//remoto//" + recursos.getClasse().getNomeParaClasse()  + "Sincronismo.java";
		String conteudo = ObjetoSincronismo.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//remoto//" + recursos.getClasse().getNomeParaClasse()  + "Remote.java";
		conteudo = ObjetoRemote.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		// ***** FCM **** Firebase Cloud Message
		nomeArquivo =  getPath(recursos) + "//framework//fcm//DCFirebaseInstanceIDService.java";
		conteudo = FCMIdServico.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo =  getPath(recursos) + "//framework//fcm//DCFirebaseMessagingService.java";
		conteudo = FCMServico.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		
		nomeArquivo =  getPath(recursos) + "//framework//fcm//DCSincronizador.java";
		conteudo = DCSincronizador.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//framework//fcm//DCNotificacaoParam.java";
		conteudo = DCNotificacaoParam.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
	}

	@Override
	public void criaArquivoUnico(Recursos recursos) throws IOException {
		limpaArquivos(recursos);
		criaArquivoUnicoDatabase(recursos);
		criaArquivoSync(recursos);
		criaArquivoGlobais(recursos);
		criaArquivoFramework(recursos);
		criaArquivoFabricasApp(recursos);
	}

	private void criaArquivoFramework(Recursos recursos) throws IOException {
		String nomeArquivo = getPath(recursos) + "//tela//MainActivityBase.java";
		String conteudo = MainActivityBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = getPath(recursos) + "//tela//MainActivityBaseSemGcm.java";
		conteudo = MainActivityBaseSemGcm.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = getPath(recursos) + "//tela//MainActivityBaseGcm.java";
		conteudo = MainActivityBaseGcm.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = getPath(recursos) + "//framework//sincronismo//SincronismoBaseTask.java";
		conteudo = SincronismoBaseTask.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = getPath(recursos) + "//data//DatabaseConst.java";
		conteudo = DatabaseConst.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = getPath(recursos) + "//framework//util//ItemChoiceManager.java";
		conteudo = ItemChoiceManager.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = getPath(recursos) + "//MyAdapter.java";
		conteudo = MyAdapter.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = getPath(recursos) + "//framework//tela//SimpleDividerItemDecoration.java";
		conteudo = SimpleDividerItemDecoration.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);

	}
	
	private void criaArquivoGlobais(Recursos recursos) throws IOException {
		String nomeArquivo = getPath(recursos) + "//tela//base//activity//Constantes.java";
		String conteudo = Constantes.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
	}
	private void criaArquivoFabricasApp(Recursos recursos) throws IOException {
		String nomeArquivo = getPath(recursos) + "//servico/base//FabricaServico.java";
		String conteudo = FabricaServico.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
	}
	
	
	@Override
	protected ClasseWrapper criaWrapper(Entidade entidade) {
		return new ClasseWrapperAndroid(entidade);
	}
	
	private void criaArquivoSync(Recursos recursos) throws IOException {
		String nomeArquivo = getPath(recursos) + "//sync//AplicacaoAuthenticator.java";
		String conteudo = SyncAuthenticator.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//sync//AplicacaoAuthenticatorService.java";
		conteudo = SyncAuthenticatorService.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//sync//AplicacaoSyncAdapter.java";
		conteudo = SyncAdapter.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//sync//AplicacaoSyncService.java";
		conteudo = SyncService.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//remoto//DataSourceRemoto.java";
		conteudo = DataSourceRemoto.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	
	private void criaArquivoDatabase(Recursos recursos) throws IOException {
		String nomeArquivo = getPath(recursos) + "//data//provider//" + recursos.getClasse().getNomeParaClasse()  + "Provider.java";
		String conteudo = ContentProviderBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//data//contract//" + recursos.getClasse().getNomeParaClasse()  + "Contract.java";
		conteudo = ContractEntidade.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//data//contract//" + recursos.getClasse().getNomeParaClasse()  + "Filtro.java";
		conteudo = FiltroContract.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//data//helper//" + recursos.getClasse().getNomeParaClasse()  + "DbHelper.java";
		conteudo = DBHelperEntidade.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//data//contract//" + recursos.getClasse().getNomeParaClasse()  + "Operacao.java";
		//if (!this.existe(nomeArquivo)) {
		conteudo = OperacaoEntidade.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		//}
		
		nomeArquivo =  getPath(recursos) + "//data//contract//" + recursos.getClasse().getNomeParaClasse()  + "OperacaoBase.java";
		conteudo = OperacaoBaseEntidade.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		//nomeArquivo =  getPath(recursos) + "//data//provider//" + recursos.getClasse().getNomeParaClasse()  + "Consulta.java";
		//if (!this.existe(nomeArquivo)) {
			//conteudo = ConsultaEntidade.create("\n").generate(recursos);
			//geraArquivoFonte(conteudo,nomeArquivo);
		//}
	
		//Acho que isso não precisa, já tem no Provider
		//nomeArquivo =  getPath(recursos) + "//data//provider//" + recursos.getClasse().getNomeParaClasse()  + "ConsultaBase.java";
		//conteudo = ConsultaBaseEntidade.create("\n").generate(recursos);
		//geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	private void criaArquivoUnicoDatabase(Recursos recursos) throws IOException {
		String nomeArquivo = getPath(recursos) + "//data//contract//AplicacaoContract.java";
		String conteudo = ContractAplicacao.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//data//helper//AplicacaoDbHelper.java";
		conteudo = DBHelperAplicacao.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//data//provider//AplicacaoProvider.java";
		conteudo = ContentProviderAplicacao.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	
	private void criaArquivoModelo(Recursos recursos) throws IOException {
		String nomeArquivo = getPath(recursos) + "//modelo//" + recursos.getClasse().getNomeParaClasse()  + "Vo.java";
		String conteudo = Vo.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//modelo//" + recursos.getClasse().getNomeParaClasse()  + ".java";
		conteudo = VoI.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//modelo//montador//" + recursos.getClasse().getNomeParaClasse()  + "Montador.java";
		conteudo = Montador.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//modelo//agregado//" + recursos.getClasse().getNomeParaClasse()  + "AgregadoI.java";
		conteudo = AgregadoInterface.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo =  getPath(recursos) + "//modelo//agregado//" + recursos.getClasse().getNomeParaClasse()  + "Agregado.java";
		conteudo = Agregado.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	
	@Override
	public void limpaArquivos(Recursos recursos) throws IOException {
		this.limpaCaminho(getPath(recursos) + "//data//contract");
		this.limpaCaminho(getPath(recursos) + "//data//helper");
		this.limpaCaminho(getPath(recursos) + "//data//provider");
		
		this.limpaCaminho(getPath(recursos) + "//modelo");
		this.limpaCaminho(getPath(recursos) + "//modelo//montador");
		this.limpaCaminho(getPath(recursos) + "//modelo//agregado");
		this.limpaCaminho(getPath(recursos) + "//remoto");
		
		this.limpaCaminho(getPath(recursos) + "//tela//base//activity");
		this.limpaCaminho(getPath(recursos) + "//tela//base//activity//exibe");
		this.limpaCaminho(getPath(recursos) + "//tela//base//activity//detalhe");
		this.limpaCaminho(getPath(recursos) + "//tela//base//activity//criaacopla");
		
		this.limpaCaminho(getPath(recursos) + "//tela//base");
		
		this.limpaCaminho(getPath(recursos) + "//template//lista");
	}
	
	private void criaArquivoAplicacao(Recursos recursos) throws IOException{ 

		String nomeArquivo = this.getPath(recursos) + "//..//..//..//..//..//AndroidManifest.xml";
		String conteudo = ManifestXml.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = this.getPath(recursos) + "//..//..//..//..//..//..//..//build.gradle";
		conteudo = BuildGradle.create("\n").generate(recursos);
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

	
}
