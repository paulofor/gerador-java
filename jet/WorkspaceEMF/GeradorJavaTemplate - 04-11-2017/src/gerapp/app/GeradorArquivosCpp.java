package gerapp.app;


import gerapp.modelo.Entidade;

import java.io.IOException;

import jet.cpp.dao.DaoBaseCpp;
import jet.cpp.dao.DaoBaseH;
import jet.cpp.dao.DaoCpp;
import jet.cpp.dao.DaoH;
import jet.cpp.modelo.ObjetosH;
import jet.cpp.servico.ServicoBaseCpp;
import jet.cpp.servico.ServicoBaseH;
import jet.cpp.servico.ServicoCpp;
import jet.cpp.servico.ServicoH;
import jet.wrappers.base.ClasseWrapper;
import jet.wrappers.cpp.ClasseWrapperCpp;

public class GeradorArquivosCpp extends GeradorArquivosBase {

	
	protected Configuracao configuracao = null;
	protected ClasseWrapper entidade = null;
	
	
	@Override
	public void criaArquivoEntidade(Recursos recursos) throws IOException{
		criaArquivosServico(recursos);
		criaArquivosDao(recursos);
	}

	@Override
	public void criaArquivoUnico(Recursos recursos) throws IOException {
		criaEstruturas(recursos);
	}


	@Override
	protected ClasseWrapper criaWrapper(Entidade entidade) {
		return new ClasseWrapperCpp(entidade);
	}

	

	
	private void criaArquivosServico(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathCpp() + "//" + recursos.getClasse().getNomeParaClasse()  + "Servico.cpp";
		String conteudo = ServicoCpp.create("\n").generate(recursos);
		if (!this.existe(nomeArquivo)) {
			geraArquivoFonte(conteudo,nomeArquivo);
		}
		nomeArquivo = recursos.getConfiguracao().getPathCpp() + "//" + recursos.getClasse().getNomeParaClasse()  + "Servico.h";
		conteudo = ServicoH.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		// *********************************************
		nomeArquivo = recursos.getConfiguracao().getPathCpp() + "//" + recursos.getClasse().getNomeParaClasse()  + "ServicoBase.h";
		conteudo = ServicoBaseH.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCpp() + "//" + recursos.getClasse().getNomeParaClasse()  + "ServicoBase.cpp";
		conteudo = ServicoBaseCpp.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}

	private void criaArquivosDao(Recursos recursos) throws IOException{
		String nomeArquivo = recursos.getConfiguracao().getPathCpp() + "//" + recursos.getClasse().getNomeParaClasse()  + "Dao.cpp";
		String conteudo = DaoCpp.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCpp() + "//" + recursos.getClasse().getNomeParaClasse()  + "Dao.h";
		conteudo = DaoH.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		// *********************************************
		nomeArquivo = recursos.getConfiguracao().getPathCpp() + "//" + recursos.getClasse().getNomeParaClasse()  + "DaoBase.h";
		conteudo = DaoBaseH.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
		nomeArquivo = recursos.getConfiguracao().getPathCpp() + "//" + recursos.getClasse().getNomeParaClasse()  + "DaoBase.cpp";
		conteudo = DaoBaseCpp.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	private void criaEstruturas(Recursos recursos) throws IOException{ 
		String nomeArquivo = recursos.getConfiguracao().getPathCpp() + "//estruturaobjeto.h";
		String conteudo = ObjetosH.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,nomeArquivo);
	}
	
	@Override
	public void limpaArquivos(Recursos recurso) throws IOException {
		this.limpaCaminho(recurso.getConfiguracao().getPathPacoteRegraColecaoBase());
	}

	
}
