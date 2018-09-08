package br.com.probid.gerador.importacao.staruml;

import br.com.probid.gerador.interfaces.AtributoI;



public class UMLAttribute extends UMLOBJ implements AtributoI{

	
	private boolean chave = false;
	private String tipo;
		
	public boolean ehChave() {
		return chave;
	}
	public String getTipo() {
		return tipo;
	}
	
	public UMLAttribute(String guid) {
		super(guid);
	}


	public void insereObjeto(UMLOBJ objeto) {
		// TODO Auto-generated method stub
		
	}
	public void imprime() {
		System.out.println("atributo->" + nome + "[" + this.getEstereotipo1() + "]");
	}
	public void endAttr() {
		
		if (attrCorrente.getName().compareTo("Visibility")==0 && attrCorrente.getConteudo().compareTo("vkProtected")==0) {
			this.chave = true;
		}
		if (attrCorrente.getName().compareTo("TypeExpression")==0) {
			this.tipo = attrCorrente.getConteudo();
		}
		super.endAttr();
	}

}
