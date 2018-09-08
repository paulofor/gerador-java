package uml;

import java.util.ArrayList;
import java.util.List;

public class UMLOperation extends UMLOBJ {

	private List listaParametros = new ArrayList();
	
	public UMLOperation(String guid) {
		super(guid);
	}
	public void adicionaParametro(UMLParameter parametro) {
		listaParametros.add(parametro);
	}
	@Override
	public void insereObjeto(UMLOBJ objeto) {
		// TODO Auto-generated method stub
		
	}

}
