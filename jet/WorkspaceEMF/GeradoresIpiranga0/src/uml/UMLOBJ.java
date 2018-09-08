package uml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.Attributes;

public abstract class UMLOBJ {

	private String guid = null;
	private List listaAttr = new ArrayList();
	protected UMLATTR attrCorrente = null;
	protected String nome = null;
	
	private UMLOBJ itemPai = null;
	
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
		attrCorrente = null;
	}
	public void addConteudo(String dado) {
		if (attrCorrente==null) {
			//System.out.println("Dado não armazenado:" + dado);
		}else{ 
			attrCorrente.setConteudo(dado);
		}
	}
	public boolean atributoAtivo() {
		return (attrCorrente!=null);
	}
}
