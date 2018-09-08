package br.com.probid.gerador.importacao.staruml;

import br.com.probid.gerador.interfaces.ParametroI;

public class UMLParameter extends UMLOBJ implements ParametroI{

	public UMLParameter(String guid) {
		super(guid);
	}


	public void insereObjeto(UMLOBJ objeto) {
		// TODO Auto-generated method stub
		
	}


	public Object getTipo() {
		Object saida =  super.obtemClasseRef();
		if (saida==null) {
			UMLATTR atributo = (UMLATTR) this.getListaAttr().get(1);
			saida = atributo.getConteudo();
		}
		return saida;
	}

	
}
