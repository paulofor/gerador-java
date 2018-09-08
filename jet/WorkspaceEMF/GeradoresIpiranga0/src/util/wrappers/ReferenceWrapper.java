package util.wrappers;

import org.eclipse.emf.ecore.EReference;

import util.FormataTexto;

public class ReferenceWrapper {

	private EReference referencia;

	private FormataTexto formatador;
	
	public ReferenceWrapper(EReference reference) {

		formatador = new FormataTexto();
		this.referencia = reference;
	}
	
	public boolean isMany() {
		return referencia.isMany();
	}
	public boolean isManyLadoOposto() {
		return referencia.getEOpposite().isMany();
	}
	
	public ClassWrapper getClasseOposta() {
		ClassWrapper classeW = new ClassWrapper();
		classeW.setClasse(referencia.getEReferenceType());
		return classeW;
	}
	
	public ReferenceWrapper getReferenciaOposta() {
		ReferenceWrapper referenciaW = new ReferenceWrapper(referencia.getEOpposite());
		return referenciaW;
	}

	
	public String getGetter() {
		ClassWrapper classeWrapper = new ClassWrapper();
		classeWrapper.setClasse(referencia.getEReferenceType());
		return classeWrapper.getGetter();
		//return "get" + referencia.getEReferenceType().getName();
	}
	
	public String getSetter() {
		ClassWrapper classeWrapper = new ClassWrapper();
		classeWrapper.setClasse(referencia.getEReferenceType());
		return classeWrapper.getSetter();
		//return "set" + referencia.getEReferenceType().getName();
	}
	
	public String getGetterMultiplo() {
		ClassWrapper classeWrapper = new ClassWrapper();
		classeWrapper.setClasse(referencia.getEReferenceType());
		return classeWrapper.getGetterMultiplo();
		//return "getLista" + referencia.getEReferenceType().getName();
	}
	
	public String getSetterMultiplo() {
		ClassWrapper classeWrapper = new ClassWrapper();
		classeWrapper.setClasse(referencia.getEReferenceType());
		return classeWrapper.getSetterMultiplo();
		//return "setLista" + referencia.getEReferenceType().getName();
	}
	
	public String metodoObtemServico() {
		return "obtemPor" + referencia.getEReferenceType().getName();
	}
	public String metodoExisteRelacionamento() {
		return "existe" + referencia.getEReferenceType().getName();
	}
	
	// Classe e variavel para ser usada como parametros em metodos
	public String declaracaoParametro() {
		return this.getClasseOposta().getNomeModeloI() + " " + this.getClasseOposta().getNomeVariavel();
	}

}
