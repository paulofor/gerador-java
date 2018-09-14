package gerapp.app;


import gerapp.modelo.Entidade;

import java.io.IOException;

import jet.csdn35.dao.DaoAplicacao;
import jet.csdn35.dao.DaoBase;
import jet.csdn35.dao.DaoImpl;
import jet.csdn35.dao.DataSourceAplicacao;
import jet.csdn35.dao.FabricaDao;
import jet.csdn35.dao.MontadorDao;
import jet.csdn35.dao.MontadorPuroDao;
import jet.csdn35.modelo.Agregado;
import jet.csdn35.modelo.AgregadoI;
import jet.csdn35.modelo.Carregador;
import jet.csdn35.modelo.Derivada;
import jet.csdn35.modelo.DerivadaBase;
import jet.csdn35.modelo.DerivadaI;
import jet.csdn35.modelo.FabricaVo;
import jet.csdn35.modelo.ModeloI;
import jet.csdn35.modelo.ModeloVo;
import jet.csdn35.mvc.Controller;
import jet.csdn35.mvc.ControllerBase;
import jet.csdn35.mvc.ControllerWS;
import jet.csdn35.mvc.DisplayPageView;
import jet.csdn35.mvc.DisplayView;
import jet.csdn35.mvc.EditView;
import jet.csdn35.mvc.EstruturaView;
import jet.csdn35.mvc.ListaView;
import jet.csdn35.servico.FabricaServico;
import jet.csdn35.servico.FiltroServico;
import jet.csdn35.servico.RegraObjetoServico;
import jet.csdn35.servico.RegraObjetoServicoImpl;
import jet.csdn35.servico.Servico;
import jet.csdn35.servico.ServicoLocalBase;
import jet.csdn35.servico.ServicoLocalImpl;
import jet.csdn35.servico.ServicoRemotoBase;
import jet.csdn35.servico.ServicoRemotoImpl;
import jet.csdn35.ws.WsBase;
import jet.csdn35.ws.WsObjeto;
import jet.wrappers.base.ClasseWrapper;
import jet.wrappers.cs.ClasseWrapperCs;

public class GeradorArquivosCsDN35 extends GeradorArquivosBase {

	
	protected Configuracao configuracao = null;
	protected ClasseWrapper entidade = null;
	
	
	@Override
	public void criaArquivoEntidade(Recursos recursos) throws IOException{
		// TODO Auto-generated method stub
		criaArquivosServicosBase(recursos);
		criaArquivosServicosImpl(recursos);
		criaArquivosModelo(recursos);
		criaArquivosDao(recursos);
		criaArquivosMvc(recursos);
		criaArquivosWs(recursos);
	}

	private void criaArquivosMvc(Recursos recursos) throws IOException {
		// TODO Auto-generated method stub
		String nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//mvc//controller//" + recursos.getClasse().getNomeParaClasse() + "BaseController.cs";
		String conteudo = Controller.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//mvc//view//" + recursos.getClasse().getNomeParaClasse() + "Display.cshtml";
		conteudo = DisplayView.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//mvc//view//" + recursos.getClasse().getNomeParaClasse() + "Lista.cshtml";
		conteudo = ListaView.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//mvc//view//" + recursos.getClasse().getNomeParaClasse() + "Edita.cshtml";
		conteudo = EditView.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//mvc//view//" + recursos.getClasse().getNomeParaClasse() + "Estrutura.cshtml";
		conteudo = EstruturaView.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//mvc//view//" + recursos.getClasse().getNomeParaClasse() + "DisplayPage.cshtml";
		conteudo = DisplayPageView.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		// Projeto WS
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//mvc//controller//" + recursos.getClasse().getNomeParaClasse() + "WSBaseController.cs";
		conteudo = ControllerWS.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);

	}
	private void criaArquivoMvc(Recursos recursos) throws IOException {
		// TODO Auto-generated method stub
		String nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//mvc//controller//BaseController.cs";
		String conteudo = ControllerBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);

	}

	private void criaArquivosWs(Recursos recursos) throws IOException {
		// TODO Auto-generated method stub
		String nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//ws//basica//" + recursos.getClasse().getNomeParaClasse() + "WsBase.cs";
		String conteudo = WsBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//modelo//ws//" + recursos.getClasse().getNomeParaClasse() + "ObjetoWs.cs";
		conteudo = WsObjeto.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);

	}
	
	@Override
	public void criaArquivoUnico(Recursos recursos) throws IOException {
		// TODO Auto-generated method stub
		criaArquivoFabrica(recursos);
		criaArquivoAplicacao(recursos);
		criaArquivoMvc(recursos);
	}
	
	
	@Override
	protected ClasseWrapper criaWrapper(Entidade entidade) {
		// TODO Auto-generated method stub
		return new ClasseWrapperCs(entidade);
	}
	
	private void criaArquivoAplicacao(Recursos recursos) throws IOException {
		String nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//dao//basico//DaoAplicacao.cs";
		String conteudo = DaoAplicacao.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//dao//datasource//DataSourceAplicacao.cs";
		if (!this.existe(nomeArquivo)) {
			conteudo = DataSourceAplicacao.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
	}
	
	private void criaArquivosModelo(Recursos recursos) throws IOException {
		String nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//modelo//" + recursos.getClasse().getNomeParaClasse() + ".cs";
		String conteudo = ModeloI.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//modelo//vo//" + recursos.getClasse().getNomeParaClasse() + "Vo.cs";
		conteudo = ModeloVo.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//modelo//agregados//" + recursos.getClasse().getNomeParaClasse() + "AgregadoI.cs";
		conteudo = AgregadoI.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//modelo//agregados//" + recursos.getClasse().getNomeParaClasse() + "Agregado.cs";
		conteudo = Agregado.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//modelo//derivadas//" + recursos.getClasse().getNomeParaClasse() + "DerivadaI.cs";
		conteudo = DerivadaI.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//modelo//derivadas//" + recursos.getClasse().getNomeParaClasse() + "DerivadaBase.cs";
		conteudo = DerivadaBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);

		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//modelo//derivadas//" + recursos.getClasse().getNomeParaClasse() + "Derivada.cs";
		if (!this.existe(nomeArquivo)) {
			conteudo = Derivada.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//modelo//carregador//" + recursos.getClasse().getNomeParaClasse() + "Carregador.cs";
		conteudo = Carregador.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);

		
	}
	
	private void criaArquivosDao(Recursos recursos) throws IOException {
		String nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//dao//basico//" + recursos.getClasse().getNomeParaClasse() + "DaoBase.cs";
		String conteudo = DaoBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//dao//" + recursos.getClasse().getNomeParaClasse() + "Dao.cs";
		if (!this.existe(nomeArquivo)) {
			conteudo = DaoImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//dao//montador//" + recursos.getClasse().getNomeParaClasse() + "Montador.cs";
		conteudo = MontadorDao.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//dao//montador//" + recursos.getClasse().getNomeParaClasse() + "MontadorPuro.cs";
		conteudo = MontadorPuroDao.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}

	/*
	private void criaArquivosDbHelper(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//dao//base//" + recursos.getClasse().getNomeParaClasse()  + "DBHelperBase.java";
		String conteudo = DBHelper.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		
		nomeArquivo = recursos.getConfiguracao().getPathAndroid() + "//dao//" + recursos.getClasse().getNomeParaClasse()  + "DBHelper.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = DBHelperImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		
	}
	*/
	
	private void criaArquivosServicosBase(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//servico//local//basico//" + recursos.getClasse().getNomeParaClasse()  + "ServicoLocalBase.cs";
		String conteudo = ServicoLocalBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() +  "//servico//remoto//basico//" + recursos.getClasse().getNomeParaClasse()  + "ServicoRemotoBase.cs";
		conteudo = ServicoRemotoBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008()  + "//servico//" + recursos.getClasse().getNomeParaClasse()  + "Servico.cs";
		conteudo = Servico.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//servico//filtro//" + recursos.getClasse().getNomeParaClasse()  + "Filtro.cs";
		conteudo = FiltroServico.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//servico//regra//basico////" + recursos.getClasse().getNomeParaClasse()  + "RegraBase.cs";
		conteudo = RegraObjetoServico.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);

	}
	private void criaArquivosServicosImpl(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//servico//local//" + recursos.getClasse().getNomeParaClasse()  + "LocalImpl.cs";
		if (!this.existe(nomeArquivo)) {
			String conteudo1 = ServicoLocalImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo1,nomeArquivo);
		}
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//servico//remoto//" + recursos.getClasse().getNomeParaClasse()  + "RemotoImpl.cs";
		if (!this.existe(nomeArquivo)) {
			String conteudo2 = ServicoRemotoImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo2,nomeArquivo);
		}
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//servico//regra//" + recursos.getClasse().getNomeParaClasse()  + "RegraImpl.cs";
		//if (!this.existe(nomeArquivo)) {
			String conteudo2 = RegraObjetoServicoImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo2,nomeArquivo);
		//}
	}
	
	/*
	private void criaArquivosModeloVo(Recursos recursos) throws IOException{ 
		String nomeArquivo = recursos.getConfiguracao().getPathPacoteModeloVo() + "//" + recursos.getClasse().getNomeParaClasse()  + ".java";
		//System.out.println("Criando arquivo " + nomeArquivo);
		String conteudo = Vo.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
		
	
	*/
	private void criaArquivoFabrica(Recursos recursos) throws IOException{ 
		String nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//servico//FabricaServico.cs";
		String conteudo = FabricaServico.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//dao//basico//FabricaDao.cs";
		conteudo = FabricaDao.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//modelo//FabricaVo.cs";
		conteudo = FabricaVo.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}

	
	
	@Override
	public void limpaArquivos(Recursos recursos) throws IOException {
		// TODO Auto-generated method stub

		//this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//servico");
		this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//servico//filtro");
		this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//servico//local//basico");
		this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//servico//remoto//basico");
		this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//servico//filtro");
		this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//modelo//agregados");
		this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//modelo//carregador");
		this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//modelo//vo");
		//this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//modelo");
		this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//dao//montador");
		this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//dao//basico");
		this.limpaCaminho(recursos.getConfiguracao().getPathCs2008() + "//mvc//controller");
		
	}

	
}
