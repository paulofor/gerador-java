package br.com.providerit.gerador.importacao.staruml;

import br.com.providerit.gerador.interfaces.AtributoI;



public class UMLAttribute extends UMLOBJ implements AtributoI{

	
	private boolean chave = false;
		
	public boolean ehChave() {
		return chave;
	}
	
	public UMLAttribute(String guid) {
		super(guid);
	}


	public void insereObjeto(UMLOBJ objeto) {
		// TODO Auto-generated method stub
		
	}
	public void imprime() {
		System.out.println("atributo->" + nome + "[" + this.getEstereotipo() + "]");
	}
	public void endAttr() {
		
		if (attrCorrente.getName().compareTo("Visibility")==0 && attrCorrente.getConteudo().compareTo("vkProtected")==0) {
			chave = true;
		}
		super.endAttr();
	}

}
