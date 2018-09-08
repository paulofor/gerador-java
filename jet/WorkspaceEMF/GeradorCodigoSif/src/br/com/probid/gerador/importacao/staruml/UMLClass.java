package br.com.probid.gerador.importacao.staruml;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import br.com.probid.gerador.interfaces.AtributoI;
import br.com.probid.gerador.interfaces.ClasseI;
import br.com.probid.gerador.interfaces.OperacaoI;
import br.com.probid.gerador.interfaces.RelacionamentoI;



public class UMLClass extends UMLOBJ implements ClasseI{

	private List listaAtributos = new ArrayList();
	private List listaOperacoes = new ArrayList();
	private HashMap mapaAtributos = new HashMap();
	private List listaRelacionamentoFonte = new ArrayList();
	//private String estereotipo = null;
	
	public UMLAttribute getPorNome(String nome) {
		return (UMLAttribute)mapaAtributos.get(nome); 
	}
	
	public UMLClass(String guid) {
		super(guid);
	}
	
	public void adicionaRelacionamentoFonte(RelacionamentoI relacionamento) {
		this.listaRelacionamentoFonte.add(relacionamento);
	}
	/*
	public void adicionaOperacao(UMLOperation operacao) {
		listaOperacoes.add(operacao);
	}
	public void adicionaAtributo(UMLAttribute atributo) {
		listaAtributos.add(atributo);
	}
	*/
	
	public void percorreListaOperacao() {
		Iterator it = listaAtributos.iterator();
		this.imprime();
		while (it.hasNext()) {
			UMLOperation operacao = (UMLOperation) it.next();
			operacao.imprime();
		}
	}
	
	public void percorreListaAtributo() {
		Iterator it = listaAtributos.iterator();
		this.imprime();
		while (it.hasNext()) {
			UMLAttribute atributo = (UMLAttribute) it.next();
			atributo.imprime();
		}
	}
	
	public void insereObjeto(UMLOBJ objeto) {
		if (objeto instanceof UMLOperation) { 
			listaOperacoes.add(objeto);
			return;
		}
		if (objeto instanceof UMLAttribute) { 
			listaAtributos.add(objeto);
			mapaAtributos.put(objeto.getNome(), objeto);
			return;
		}
		
	}

	public List getListaRelacionamentoFonte() {
		return this.listaRelacionamentoFonte;
	}
	public List getListaAtributo() {
		return listaAtributos;
	}

	public List getListaAtributoPorEstereotipo(String nomeEstereotipo) {
		List listaSaida = new LinkedList();
		Iterator iterador = listaAtributos.iterator();
		while (iterador.hasNext()) {
			AtributoI atributo = (AtributoI) iterador.next();
			if (atributo.possuiEstereotipo(nomeEstereotipo)) {
				listaSaida.add(atributo);
			}
		}
		return listaSaida;
	}

	public List getListaOperacao() {
		return listaOperacoes;
	}

	public List getListaOperacaoPorEstereotipo(String nomeEstereotipo) {
		List listaSaida = new LinkedList();
		Iterator iterador = this.listaOperacoes.iterator();
		while (iterador.hasNext()) {
			OperacaoI operacao = (OperacaoI) iterador.next();
			System.out.println(nomeEstereotipo);
			if (operacao.possuiEstereotipo(nomeEstereotipo)) {
				listaSaida.add(operacao);
			}
		}
		return listaSaida;
	}

	
	
	/*
	public String getNomeAtributoBD(String nomeAtributo) {
		UMLAttribute atributo = (UMLAttribute) mapaAtributos.get(nomeAtributo);
		if (atributo!=null) {
			return atributo.getEstereotipo();
		}
		return null;
	}
	*/
}
