package util.wrappers;

import br.com.providerit.gerador.app.Configuracao;

public class ConfiguracaoWrapper {

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
