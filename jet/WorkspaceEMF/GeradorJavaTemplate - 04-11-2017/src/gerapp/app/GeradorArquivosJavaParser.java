package gerapp.app;

import gerapp.modelo.Entidade;

import java.io.IOException;

import jet.java.dao.DaoBase;
import jet.java.dao.MontadorDao;
import jet.java.modelo.Agregado;
import jet.java.modelo.AgregadoI;
import jet.java.modelo.Carregador;
import jet.java.modelo.ModeloI;
import jet.java.modelo.ModeloVo;
import jet.java.service.RegraColecaoBase;
import jet.java.servico.FiltroServico;
import jet.java.webparse.DadosParseBase;
import jet.java.webparse.DadosParseImpl;
import jet.java.webparse.DetalheCallbackHtmlBase;
import jet.java.webparse.DetalheCallbackHtmlImpl;
import jet.java.webparse.ListaCallbackHtmlBase;
import jet.java.webparse.ListaCallbackHtmlImpl;
import jet.java.webparse.RegraColecaoAdaptador;
import jet.wrappers.base.ClasseWrapper;
import jet.wrappers.java.ClasseWrapperJava;



public class GeradorArquivosJavaParser extends GeradorArquivosBase {

	protected Configuracao configuracao = null;
	protected ClasseWrapper entidade = null;
	
	@Override
	public void criaArquivoEntidade(Recursos recursos) throws IOException {
		// TODO Auto-generated method stub
		criaArquivosParser(recursos);
		criaArquivosModelo(recursos);
		criaArquivosDao(recursos);
		criaArquivosService(recursos);
	}
	
	private void criaArquivosService(Recursos recursos) throws IOException {
		String nomeArquivo = recursos.getConfiguracao().getPathJava() + "//regracolecao//" + recursos.getClasse().getNomeParaClasse() + "RegraColecao.java";
		String conteudo = RegraColecaoBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//regracolecao//filtro//" + recursos.getClasse().getNomeParaClasse()  + "Filtro.java";
		conteudo = FiltroServico.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	private void criaArquivosDao(Recursos recursos) throws IOException {
		String nomeArquivo = recursos.getConfiguracao().getPathJava() + "//dao//montador//" + recursos.getClasse().getNomeParaClasse() + "Montador.java";
		String conteudo = MontadorDao.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//dao//basica//" + recursos.getClasse().getNomeParaClasse() + "DaoBase.java";
		conteudo = DaoBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	
	private void criaArquivosModelo(Recursos recursos) throws IOException {
		String nomeArquivo = recursos.getConfiguracao().getPathJava() + "//modelo//" + recursos.getClasse().getNomeParaClasse() + ".java";
		String conteudo = ModeloI.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//modelo//vo//" + recursos.getClasse().getNomeParaClasse() + "Vo.java";
		conteudo = ModeloVo.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//modelo//agregado//" + recursos.getClasse().getNomeParaClasse() + "AgregadoI.java";
		conteudo = AgregadoI.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//modelo//agregado//" + recursos.getClasse().getNomeParaClasse() + "Agregado.java";
		conteudo = Agregado.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//modelo//agregado//" + recursos.getClasse().getNomeParaClasse() + "Carregador.java";
		conteudo = Carregador.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
	}
	
	private void criaArquivosParser(Recursos recursos) throws IOException {
		String nomeArquivo = null;
		String conteudo = null;
		// Callback
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//parse//callback//basico//" + recursos.getClasse().getNomeParaClasse() + "ListaCallbackHtmlBase.java";
		conteudo = ListaCallbackHtmlBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//parse//callback//" + recursos.getClasse().getNomeParaClasse() + "ListaCallbackHtml.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = ListaCallbackHtmlImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//parse//callback//basico//" + recursos.getClasse().getNomeParaClasse() + "DetalheCallbackHtmlBase.java";
		conteudo = DetalheCallbackHtmlBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//parse//callback//" + recursos.getClasse().getNomeParaClasse() + "DetalheCallbackHtml.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = DetalheCallbackHtmlImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		// DadosParser
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//parse//dados//basico//" + recursos.getClasse().getNomeParaClasse() + "DadosParseBase.java";
		conteudo = DadosParseBase.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//parse//dados//" + recursos.getClasse().getNomeParaClasse() + "DadosParse.java";
		if (!this.existe(nomeArquivo)) {
			conteudo = DadosParseImpl.create("\n").generate(recursos);
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		// RegraColecaoAdaptador
		nomeArquivo = recursos.getConfiguracao().getPathJava() + "//parse//regracolecaoadaptador//" + recursos.getClasse().getNomeParaClasse() + "RegraColecaoAdaptador.java";
		conteudo = RegraColecaoAdaptador.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		
	}

	

	@Override
	public void criaArquivoUnico(Recursos recurso) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected ClasseWrapper criaWrapper(Entidade entidade) {
		// TODO Auto-generated method stub
		return new ClasseWrapperJava(entidade);
	}

	@Override
	public void limpaArquivos(Recursos recurso) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
