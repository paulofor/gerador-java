package util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;

import util.wrappers.ClassWrapper;

public class FormataTexto {

	public String primeiraMaiuscula(String palavra) {
		return palavra.substring(0, 1).toUpperCase() + palavra.substring(1);
	}
	
	public String primeiraMinuscula(String palavra) {
		return palavra.substring(0, 1).toLowerCase() + palavra.substring(1);
	}
	
	public static String getTipo(ENamedElement objeto) {
		if (objeto.getName()=="EString") return "String";
		if (objeto.getName()=="EDoubleObject"  || objeto.getName()=="EDouble") return "float";
		if (objeto.getName()=="EBooleanObject" || objeto.getName()=="EBoolean") return "boolean";
		if (objeto.getName()=="ELongObject"  || objeto.getName()=="ELong") return "long";
		if (objeto.getName()=="EIntegerObject") return "int";
		if (objeto.getName()=="EByteObject") return "List";
		if (objeto.getName()=="EFloat") return "String[]";

		if (objeto instanceof EClass) {
			ClassWrapper classeWrapper = new ClassWrapper();
			classeWrapper.setClasse((EClass)objeto);
			return classeWrapper.getNomeModeloI();
		}
		return objeto.getName();
	}
}
