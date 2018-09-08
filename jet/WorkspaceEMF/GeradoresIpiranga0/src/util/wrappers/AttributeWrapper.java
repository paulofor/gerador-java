package util.wrappers;

import org.eclipse.emf.ecore.EAttribute;


import util.FormataTexto;

public class AttributeWrapper {
	
	private EAttribute atributo;
	
	private FormataTexto formatador;
	
	private String nomeBancoDados;
	
	public void setNomeBD(String nome) {
		nomeBancoDados = nome;
	}
	public String getNomeBD() {
		return this.nomeBancoDados;
	}
	
	public AttributeWrapper() {
		
		formatador = new FormataTexto();
	}
	
	public void setAtributo(EAttribute atributo) {
		this.atributo = atributo;
	}
	
	public String getTipo() {
		//if (atributo.getEAttributeType().getName()=="EString") return "String";
		//if (atributo.getEAttributeType().getName()=="EDoubleObject") return "float";
		//return "";
		return formatador.getTipo(atributo.getEAttributeType());
	}
	
	public boolean tipoString() {
		return (getTipo().compareTo("String")==0);
	}
	public boolean tipoLong() {
		return (getTipo().compareTo("long")==0);
	}
	public boolean tipoBoolean() {
		return (getTipo().compareTo("boolean")==0);
	}
	public boolean tipoFloat() {
		return (getTipo().compareTo("float")==0);
	}
	
	public String getSetter() {
		return "set" + formatador.primeiraMaiuscula(atributo.getName());
	}
	public String getGetter() {
		return "get" + formatador.primeiraMaiuscula(atributo.getName());
	}
}
