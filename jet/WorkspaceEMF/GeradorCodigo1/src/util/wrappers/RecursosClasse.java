package util.wrappers;

public class RecursosClasse {

	private ClasseWrapper classeWrapper = null;
	private ConfiguracaoWrapper configuracaoWrapper = null;
	
	public void setClasse(ClasseWrapper classe) {
		this.classeWrapper = classe;
	}
	public ClasseWrapper getClasse() {
		return this.classeWrapper;
	}
	public void setConfiguracao(ConfiguracaoWrapper configuracao) {
		this.configuracaoWrapper = configuracao;
	}
	public ConfiguracaoWrapper getConfiguracao() {
		return this.configuracaoWrapper;
	}
}
