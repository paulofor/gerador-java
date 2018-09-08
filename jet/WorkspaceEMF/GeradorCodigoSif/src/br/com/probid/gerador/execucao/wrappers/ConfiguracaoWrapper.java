package br.com.probid.gerador.execucao.wrappers;

import br.com.probid.gerador.app.Configuracao;

public class ConfiguracaoWrapper {

	public String getNomePacoteModel() {
		return "br.org.fplf.sif.core";
	}
	
	private final String WORKSPACE = "AplicacaoOBL";
	
	private Configuracao configuracaoClasse = null;
	
	public ConfiguracaoWrapper(Configuracao conf) {
		configuracaoClasse = conf;
	}
	
	public String getCaminhoWorkspace() {
		return WORKSPACE;
	}
	public String getNomeWorkspace() {
		return WORKSPACE;
	}
	
	public String getModuloParaPacote() {
		return "obl";
	}
	public String getGrupoParaPacote() {
		return "cap";
	}
	public String getPathGeracaoClasses() {
		return configuracaoClasse.getPathGeracaoClasses();
	}
}
