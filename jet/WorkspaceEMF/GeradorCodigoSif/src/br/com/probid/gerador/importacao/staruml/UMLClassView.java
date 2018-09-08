package br.com.probid.gerador.importacao.staruml;

import br.com.probid.gerador.interfaces.ClasseViewI;

public class UMLClassView extends UMLOBJ implements ClasseViewI{

	private String guidModel = null;
	
	public String getGuidModel() {
		return guidModel;
	}
	
	public UMLClassView(String guid) {
		super(guid);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insereObjeto(UMLOBJ objeto) {
		// TODO Auto-generated method stub

	}

	public void endRef() {
		if (refCorrente.getName().compareTo("Model")==0) {
			this.guidModel = refCorrente.getConteudo();
		}
		super.endRef();
	}
	
}
