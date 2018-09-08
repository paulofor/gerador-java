package br.com.probid.gerador.importacao.staruml;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;

import br.com.probid.gerador.app.MapaClasses;
import br.com.probid.gerador.interfaces.ClasseI;

public abstract class UMLOBJ {

	private String guid = null;
	private String guidObjeto = null;
	
	private List listaAttr = new ArrayList();
	private List listaRef = new ArrayList();
	protected UMLATTR attrCorrente = null;
	protected UMLREF refCorrente = null;
	protected String nome = null;
	private String estereotipo = null;
	
	private String codigoRef = null;
	
	private UMLOBJ itemPai = null;
	
	public List getListaAttr() {
		return listaAttr;
	}
	
	protected ClasseI obtemClasseRef() {
		if (codigoRef!=null) {
			return MapaClasses.recuperaClasse(codigoRef);
		} else {
			return null;
		}
	}
	public String getGuid() {
		return guid;
	}
	
	public boolean possuiEstereotipo(String nomeEstereotipo) {
		return (this.estereotipo!=null && this.estereotipo.indexOf(nomeEstereotipo)!=-1);
	}
	
	public String getEstereotipo1() {
		if (this.estereotipo==null) return null;
		String[] lista = this.estereotipo.split(",");
		return lista[0];
	}
	
	public UMLOBJ getItemPai() {
		return itemPai;
	}
	public void setItemPai(UMLOBJ itemPai) {
		this.itemPai = itemPai;
	}
	
	public abstract void insereObjeto(UMLOBJ objeto);
	
	public String getNome() {
		return nome;
	}
	
	public void imprime() {
		System.out.println("this->" + nome);
	}
	
	public UMLOBJ(String guid) {
		this.guid = guid;
	}
	public void startAttr(Attributes atributos) {
		attrCorrente = new UMLATTR();
		for (int i=0;i<atributos.getLength();i++) {
			if (atributos.getLocalName(i)=="type") {
				attrCorrente.setType(atributos.getValue(i));
			}
			if (atributos.getLocalName(i)=="name") {
				attrCorrente.setName(atributos.getValue(i));
			}
		}
	}
	public void endAttr() {
		listaAttr.add(attrCorrente);
		if (attrCorrente.getName().compareTo("Name")==0) {
			nome = attrCorrente.getConteudo();
		}
		if (attrCorrente.getName().compareTo("StereotypeName")==0) {
			estereotipo = attrCorrente.getConteudo();
		}
		attrCorrente = null;
	}
	
	public void startRef(Attributes atributos) {
		refCorrente = new UMLREF();
		for (int i=0;i<atributos.getLength();i++) {
			if (atributos.getLocalName(i)=="name") {
				refCorrente.setName(atributos.getValue(i));
			}
		}
	}
	public void endRef() {
		listaRef.add(refCorrente);
		if (refCorrente.getName().compareTo("Type_")==0) {
			codigoRef = refCorrente.getConteudo();
		}
		refCorrente = null;
	}
	public void addConteudo(String dado) {
		if (attrCorrente!=null) attrCorrente.setConteudo(dado);
		if (refCorrente!=null) refCorrente.setConteudo(dado);
	}
	public boolean atributoAtivo() {
		return (attrCorrente!=null);
	}
}
