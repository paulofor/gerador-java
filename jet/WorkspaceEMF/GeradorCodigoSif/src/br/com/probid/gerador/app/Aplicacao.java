package br.com.probid.gerador.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import br.com.probid.gerador.importacao.staruml.UMLOBJ;
import br.com.probid.gerador.interfaces.AplicacaoI;
import br.com.probid.gerador.interfaces.ClasseI;
import br.com.probid.gerador.interfaces.ClasseViewI;
import br.com.probid.gerador.interfaces.RelacionamentoI;

public class Aplicacao implements AplicacaoI {

	private List listaClasse = null;
	private Map mapaClasse = null;
	private Map mapaView = null;
	
	private List listaRelacionamento = new ArrayList();
	private List listaView = new ArrayList();
	
	
	public Aplicacao() {
		listaClasse = new LinkedList();
		mapaClasse = new HashMap();
		mapaView = new HashMap();
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
			if (estereotipo.equals(classe.getEstereotipo1())) {
				listaSaida.add(classe);
			}
		}
		return listaSaida;
	}

	public void addClasse(ClasseI classe) {
		System.out.println("*** Adicionando Classe " + classe.getNome() + "(" + classe.getGuid() + ")");
		this.listaClasse.add(classe);
		UMLOBJ obj = (UMLOBJ) classe;
		this.mapaClasse.put(obj.getGuid(), obj);
		MapaClasses.adicionaClasse(classe);
	}
	public ClasseI obtemPorGuid(String guid) {
		return (ClasseI) this.mapaClasse.get(guid);
	}
	public ClasseI obtemPorGuidViaView(String guid) {
		ClasseViewI view = (ClasseViewI) this.mapaView.get(guid);
		return obtemPorGuid(view.getGuidModel());
	}
	
	public void addClasseView(ClasseViewI classeView) {
		this.listaView.add(classeView);
		this.mapaView.put(classeView.getGuid(), classeView);
		System.out.println("*** Adicionando ClasseView " + classeView);
	}
	
	public void addRelacionamento(RelacionamentoI relacionamento) {
		if (relacionamento.getNome()==null) return;
		this.listaRelacionamento.add(relacionamento);
		System.out.println("*** Adicionando Relacionamento " + relacionamento.getNome());
		/*
		if ((relacionamento.getGuidHead()==null) || (relacionamento.getGuidTail()==null)) return; 
		ClasseI classeTail = obtemPorGuid(relacionamento.getGuidTail());
		ClasseI classeHead = obtemPorGuid(relacionamento.getGuidHead());
		relacionamento.setClasseHead(classeHead);
		relacionamento.setClasseTail(classeTail);
		//classeTail.adicionaRelacionamentoFonte(relacionamento);
		*/
	}
	
	public void parsingCompleto() {
		alocaRelacionamentos();
		alocaViews();
	}
	
	private void alocaViews() {
		
	}
	
	private void alocaRelacionamentos() {
		Iterator itRel = this.listaRelacionamento.iterator();
		while (itRel.hasNext()) {
			RelacionamentoI relacionamento = (RelacionamentoI) itRel.next();
			if ((relacionamento.getGuidHead()==null) || (relacionamento.getGuidTail()==null)) return; 
			ClasseI classeTail = obtemPorGuidViaView(relacionamento.getGuidTail());
			ClasseI classeHead = obtemPorGuidViaView(relacionamento.getGuidHead());
			relacionamento.setClasseDestino(classeHead);
			relacionamento.setClasseFonte(classeTail);
			classeTail.adicionaRelacionamentoFonte(relacionamento);
		}
	}
}
