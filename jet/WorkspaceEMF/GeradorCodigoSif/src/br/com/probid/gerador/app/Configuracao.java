package br.com.probid.gerador.app;



public class Configuracao {

	private String nomeArquivoStarUml;
	private String pathGeracaoClasses;
	
	
	
	public void setNomeArquivoStarUml(String nomeArquivo) {
		this.nomeArquivoStarUml = nomeArquivo;
	}
	public String getNomeArquivoStarUml() {
		return this.nomeArquivoStarUml;
	}
	
	public void setPathGeracaoClasses(String path) {
		this.pathGeracaoClasses = path;
	}
	public String getPathGeracaoClasses() {
		return this.pathGeracaoClasses;
	}
	
}
