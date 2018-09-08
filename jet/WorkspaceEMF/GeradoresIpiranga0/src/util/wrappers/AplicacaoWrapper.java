package util.wrappers;

public class AplicacaoWrapper {

	private String nomeAplicacao;
	private String pathWorkspace;
	private String nomeProjetoWorkspace;
	private String arquivoEcore;
	private String arquivoUml;
	
	private String nomePacote;
	
	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
		ClassWrapper.APLICACAO_PACOTE += nomePacote;
		ClassWrapper.APLICACAO_PATH += nomePacote;
	}
	public String getNomePacote() {
		return this.nomePacote;
	}
	
	public void setNomeArquivoUml(String arquivo) {
		this.arquivoUml = arquivo;
	}
	public String getNomeArquivoUml() {
		return this.arquivoUml;
	}
	
	public void setNomeAplicacao(String nomeAplicacao) {
		this.nomeAplicacao = nomeAplicacao;
	}
	
	public String getPacoteAplicacao() {
		return this.nomeAplicacao.toLowerCase();
	}
	
	
	public void setPathWorkspace(String pathWorkSpace) {
		this.pathWorkspace = pathWorkSpace;
	}
	public String getPathWorkspace() {
		return this.pathWorkspace;
	}
	
	public void setNomeProjetoWorkspace(String nomeProjetoWorkspace) {
		this.nomeProjetoWorkspace = nomeProjetoWorkspace;
	}
	public String getNomeProjetoWorkspace() {
		return this.nomeProjetoWorkspace;
	}
	
	public void setArquivoEcore(String arquivoEcore) {
		this.arquivoEcore = arquivoEcore;
	}
	public String getArquivoEcore() {
		return this.arquivoEcore;
	}
	
}
