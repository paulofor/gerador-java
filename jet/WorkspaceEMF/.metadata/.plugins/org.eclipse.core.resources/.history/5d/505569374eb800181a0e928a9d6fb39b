package gerapp.app;

import gerapp.modelo.Entidade;

import java.io.IOException;

import jet.cs.mysql.MySqlScript;
import jet.wrappers.base.ClasseWrapper;
import jet.wrappers.cs.ClasseWrapperCs;

public class GeradorArquivosCsMySQL extends GeradorArquivosBase {

	protected Configuracao configuracao = null;
	protected ClasseWrapper entidade = null;
	
	private final String NOME_ARQUIVO = "D:/Fontes/Sql/script.sql";
	
	@Override
	public void criaArquivoEntidade(Recursos recurso) throws IOException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void criaArquivoUnico(Recursos recursos) throws IOException {
		// TODO Auto-generated method stub
		//String nomeArquivo = recursos.getConfiguracao().getPathCs2008() + "//ws//basica//" + recursos.getClasse().getNomeParaClasse() + "WsBase.cs";
		String conteudo = MySqlScript.create("\n").generate(recursos);
		geraArquivoFonte(conteudo,NOME_ARQUIVO);
	}
	@Override
	protected ClasseWrapper criaWrapper(Entidade entidade) {
		return new ClasseWrapperCs(entidade);
	}

	@Override
	public void limpaArquivos(Recursos recurso) throws IOException {
	}
}
