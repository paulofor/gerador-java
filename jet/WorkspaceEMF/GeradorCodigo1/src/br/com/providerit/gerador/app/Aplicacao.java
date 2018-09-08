package br.com.providerit.gerador.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import br.com.providerit.gerador.importacao.staruml.UMLOBJ;
import br.com.providerit.gerador.interfaces.AplicacaoI;
import br.com.providerit.gerador.interfaces.ClasseI;

public class Aplicacao implements AplicacaoI {

	private List listaClasse = null;
	private Map mapaClasse = null;
	
	public Aplicacao() {
		listaClasse = new LinkedList();
		mapaClasse = new HashMap();
	}
	
	public List getListaClasse() {
		// TODO Auto-generated method stub
		return listaClasse;
	}

	public List getListaClassePorEstereotipo(String estereotipo) {
		List listaSaida = new LinkedList();
		Iterator iterador = listaClasse.iterator();
		while (iterador.hasNext()) {
			ClasseI classe = (ClasseI) iterador.next();
			if (estereotipo.equals(classe.getEstereotipo())) {
				listaSaida.add(classe);
			}
		}
		return listaSaida;
	}

	public void addClasse(ClasseI classe) {
		this.listaClasse.add(classe);
		UMLOBJ obj = (UMLOBJ) classe;
		this.mapaClasse.put(obj.getGuid(), obj);
		MapaClasses.adicionaClasse(classe);
	}
	public ClasseI obtemPorGuid(String guid) {
		return (ClasseI) this.mapaClasse.get(guid);
	}

}
