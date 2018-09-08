package util.wrappers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;

import util.FormataTexto;

public class OperationWrapper {

	EOperation operacao = null;
	FormataTexto formataTexto = null;
	ClassWrapper classeWrapper = null;
	EClass classeOrigem = null;
	
	public OperationWrapper() {
		formataTexto = new FormataTexto();
		classeWrapper = new ClassWrapper();
	}
	
	private String getNomeClasse() {
		return classeOrigem.getName();
	}
	
	public void setOperation(EOperation operacao) {
		classeOrigem = (EClass) operacao.eContainer();
		classeWrapper.setClasse(classeOrigem);
		this.operacao = operacao;
	}
	
	public String getTipo() {
		if (operacao.getEType()==null)
			return "List";
		else
			return FormataTexto.getTipo(operacao.getEType());
		/*
		if (operacao.getEType()!=null && operacao.getEType().getName().compareTo(getNomeClasse())==0)
			return classeWrapper.getNomeModeloI();
		else
			return "List";
		*/
	}
	
	public String getAssinatura() {
		return operacao.getName() + getParametros();
	}
	
	private String getParametros() {
		StringBuffer saida = new StringBuffer("(");
		boolean primeiro = true;
		for (EParameter parametro : operacao.getEParameters()) {
			if (primeiro) primeiro = false;
			else saida.append(",");
			
			saida.append(formataTexto.getTipo((ENamedElement)parametro.getEType())+ " ");
			//saida.append(parametro.getEType().getName() + " ");
			saida.append(parametro.getName());
		}
		saida.append(")");
		return saida.toString();
	}
}
