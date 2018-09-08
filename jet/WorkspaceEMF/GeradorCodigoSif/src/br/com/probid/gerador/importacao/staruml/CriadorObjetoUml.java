package br.com.probid.gerador.importacao.staruml;

import org.xml.sax.Attributes;

public class CriadorObjetoUml {
	
	
	public static UMLOBJ CriaObjetoUml(Attributes atributos) {
		String tipo = null;
		String guid = null;
		String nome = null;

		for (int i=0;i<atributos.getLength();i++) {
			if (atributos.getLocalName(i)=="type") {
				tipo = atributos.getValue(i);
			}
			if (atributos.getLocalName(i)=="guid") {
				guid = atributos.getValue(i);
			}
			if (atributos.getLocalName(i)=="name") {
				nome = atributos.getValue(i);
			}
		}
		if (tipo.compareTo("UMLAttribute")==0) {
			return new UMLAttribute(guid);
		}
		if (tipo.compareTo("UMLClass")==0) {
			return new UMLClass(guid);
		}
		if (tipo.compareTo("UMLOperation")==0) {
			return new UMLOperation(guid);
		}
		if (tipo.compareTo("UMLParameter")==0) {
			return new UMLParameter(guid);
		}
		if (tipo.compareTo("UMLInterface")==0) {
			return new UMLInterface(guid);
		}
		if (tipo.compareTo("UMLAssociationView")==0) {
			return new UMLAssociationView(guid);
		}
		if (tipo.compareTo("UMLClassView")==0) {
			return new UMLClassView(guid);
		}
		return null;
	}
}
