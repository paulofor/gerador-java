package uml;

public class UMLATTR {

	private String name;
	private String conteudo;
	private String type;
	
	public String toString() {
		return "name=" + name + ", type=" + type + ", conteudo=" + conteudo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
	public String getConteudo() {
		return this.conteudo;
	}
}
