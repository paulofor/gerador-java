package util.wrappers;

import java.io.File;
import java.util.List;

import br.com.providerit.gerador.interfaces.ClasseI;

public class ClasseFuncionalidade extends ClasseWrapper {

	
	public ClasseFuncionalidade(ClasseI classe) {
		super(classe);
	}
	
	public List listaDto() {
		return null;
	}
	
	
	public String getCaminhoPacoteServlet() {
		return getCaminhoBase() + File.separator + "servlet";
	}
	
	public String getPacoteServlet() {
		return getPacoteBase() + ".servlet";
	}
	public String getPacoteEjb() {
		return getPacoteBase() + ".ejbsession";
	}
	
	public String nomePacoteProjeto() {
		return super.getNome().substring(3).toLowerCase();
	}
	
	
	
	public String getPathDeployWeb(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getNomeProjetoWeb();
		return caminhoCompleto;

	}
	
	public String getPathWebXml(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getNomeProjetoWeb() +
		File.separator + "paginas" + 
		File.separator + "WEB-INF";
		return caminhoCompleto;

	}
	
	public String getPathEjb(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getNomeProjetoEjb() + 
		File.separator + "src" +
		File.separator + getCaminhoBase() +
		File.separator + "ejbsession";
		return caminhoCompleto;
	}
	
	public String getPathXmlEjb(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getNomeProjetoEjb() +
		File.separator + "src" + 
		File.separator + "META-INF";
		return caminhoCompleto;

	}
	
	public String getPathDeployEjb(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getNomeProjetoEjb();
		return caminhoCompleto;

	}
	public String getPathServletCT(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getNomeProjetoWeb() +
		File.separator + "src" +
		File.separator + getCaminhoPacoteServlet();
		return caminhoCompleto;

	}
	public String getPathProjetoWebJpr(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getNomeProjetoWeb();
		return caminhoCompleto;

	}
	
	public String getPathProjetoEjbJpr(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getNomeProjetoEjb();
		return caminhoCompleto;

	}

}
