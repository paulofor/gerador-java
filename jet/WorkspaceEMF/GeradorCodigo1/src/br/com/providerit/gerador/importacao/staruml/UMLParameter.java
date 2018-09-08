package br.com.providerit.gerador.importacao.staruml;

import br.com.providerit.gerador.app.MapaClasses;
import br.com.providerit.gerador.interfaces.ParametroI;

public class UMLParameter extends UMLOBJ implements ParametroI{

	public UMLParameter(String guid) {
		super(guid);
	}


	public void insereObjeto(UMLOBJ objeto) {
		// TODO Auto-generated method stub
		
	}


	public Object getTipo() {
		return super.obtemClasseRef();
	}

}
