package br.com.probid.gerador.importacao.staruml;

import br.com.probid.gerador.interfaces.ClasseI;
import br.com.probid.gerador.interfaces.RelacionamentoI;

public class UMLAssociationView extends UMLOBJ implements RelacionamentoI {
	
	private String nome = null;
	private String guidTail = null;
	private String guidHead = null;
	
	private ClasseI classeDestino = null;
	private ClasseI classeFonte = null;
	
	public void setClasseDestino(ClasseI classe) {
		this.classeDestino = classe;
	}
	public void setClasseFonte(ClasseI classe) {
		this.classeFonte = classe;
	}
	public ClasseI getClasseDestino() {
		return this.classeDestino;
	}
	public ClasseI getClasseFonte() {
		return this.classeFonte;
	}
	
	public String getNome() {
		return nome;
	}
	public String getGuidTail() {
		return guidTail;
	}
	public String getGuidHead() {
		return guidHead;
	}

	public UMLAssociationView(String guid) {
		super(guid);
	}
	
	@Override
	public void insereObjeto(UMLOBJ objeto) {
		// TODO Auto-generated method stub
		System.out.println("objeto:" + objeto);
	}
	
	public void endAttr() {
		
		if (attrCorrente.getName().compareTo("Text")==0) {
			this.nome = attrCorrente.getConteudo();
		}
		super.endAttr();
	}
	
	public void endRef() {
		if (refCorrente.getName().compareTo("Head")==0) {
			this.guidHead = refCorrente.getConteudo();
		}
		if (refCorrente.getName().compareTo("Tail")==0) {
			this.guidTail = refCorrente.getConteudo();
		}
		super.endRef();
	}

}
