package br.com.providerit.gerador.app;

import java.util.HashMap;
import java.util.Map;

import br.com.providerit.gerador.importacao.staruml.UMLClass;
import br.com.providerit.gerador.interfaces.ClasseI;

public class MapaClasses {

	private static Map mapa = new HashMap();
	
	public static void adicionaClasse(ClasseI classe) {
		UMLClass claseUml = (UMLClass) classe;
		mapa.put(claseUml.getGuid(), classe);
	}
	
	public static ClasseI recuperaClasse(String nome) {
		return (ClasseI) mapa.get(nome);
	}
}
