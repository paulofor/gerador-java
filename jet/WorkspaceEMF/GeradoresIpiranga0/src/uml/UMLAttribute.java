package uml;

import org.xml.sax.Attributes;



public class UMLAttribute extends UMLOBJ{

	private String estereotipo = null;
	private boolean chave = false;
		
	public boolean ehChave() {
		return chave;
	}
	public String getEstereotipo() {
		return this.estereotipo;
	}
	public UMLAttribute(String guid) {
		super(guid);
	}

	@Override
	public void insereObjeto(UMLOBJ objeto) {
		// TODO Auto-generated method stub
		
	}
	public void imprime() {
		System.out.println("this->" + nome + "[" + this.estereotipo + "]");
	}
	public void endAttr() {
		if (attrCorrente.getName().compareTo("StereotypeName")==0) {
			estereotipo = attrCorrente.getConteudo();
		}
		if (attrCorrente.getName().compareTo("Visibility")==0 && attrCorrente.getConteudo().compareTo("vkProtected")==0) {
			chave = true;
		}
		super.endAttr();
	}

}
