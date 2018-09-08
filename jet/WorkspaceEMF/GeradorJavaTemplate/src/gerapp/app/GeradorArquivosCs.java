package gerapp.app;


import gerapp.modelo.Entidade;

import java.io.IOException;

import jet.android.servico.FabricaServico;
import jet.android.servico.Servico;
import jet.android.servico.ServicoJsonBase;
import jet.android.servico.ServicoJsonImpl;
import jet.android.servico.ServicoSqliteBase;
import jet.android.servico.ServicoSqliteImpl;
import jet.cs.vo.FabricaVoMobile;
import jet.cs.vo.MobileDecorator;
import jet.cs.vo.MobileVo;
import jet.cs.web.PageAspx;
import jet.cs.web.PageCs;
import jet.wrappers.android.ClasseWrapperAndroid;
import jet.wrappers.base.ClasseWrapper;

public class GeradorArquivosCs extends GeradorArquivosBase {

	
	protected Configuracao configuracao = null;
	protected ClasseWrapper entidade = null;
	
	
	@Override
	public void criaArquivoEntidade(Recursos recursos) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Vai gerar arquivos");
		criaAspxPage(recursos);
		criaAspxCs(recursos);
		criaMobileDecorator(recursos);
		criaMobileVo(recursos);
		//criaArquivosServicosImpl(recursos);
		//criaArquivosModeloVo(recursos);
		//criaArquivosDbHelper(recursos);
		
	}

	@Override
	public void criaArquivoUnico(Recursos recursos) throws IOException {
		// TODO Auto-generated method stub
		criaArquivoFabricaVoMobile(recursos);
		
	}

	@Override
	protected ClasseWrapper criaWrapper(Entidade entidade) {
		// TODO Auto-generated method stub
		return new ClasseWrapperAndroid(entidade);
	}

	private void criaAspxPage(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathAspxPage() + "//" + recursos.getClasse().getNomeParaClasse()  + "Page.aspx";
		System.out.println("Criando arquivo " + nomeArquivo);
		String conteudo = PageAspx.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	private void criaAspxCs(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathAspxCs() + "//" + recursos.getClasse().getNomeParaClasse()  + "Page.aspx.cs";
		String conteudo = PageCs.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	private void criaMobileDecorator(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathMobileDecoratorCs() + "//" + recursos.getClasse().getNomeParaClasse()  + "Decorator.cs";
		String conteudo = MobileDecorator.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	private void criaMobileVo(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathMobileVoCs() + "//" + recursos.getClasse().getNomeParaClasse()  + "MobileVo.cs";
		String conteudo = MobileVo.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	
	
	private void criaArquivoFabricaVoMobile(Recursos recursos) throws IOException{ 
		String nomeArquivo = recursos.getConfiguracao().getPathCs() + "//modelo//FabricaVo.cs";
		String conteudo = FabricaVoMobile.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}

	@Override
	public void limpaArquivos(Recursos recurso) throws IOException {
		// TODO Auto-generated method stub
		this.limpaCaminho(recurso.getConfiguracao().getPathPacoteRegraColecaoBase());
		
	}

	
}
