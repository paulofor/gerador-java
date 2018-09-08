package uml;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import util.wrappers.AplicacaoWrapper;

import com.sun.org.apache.xerces.internal.parsers.SAXParser;

public class FacadeUml {

	private static HashMap mapaTabelas = new HashMap();
	private static AplicacaoWrapper aplicacao = null;
	
	public static void setAplicacao(AplicacaoWrapper aplicacaoWrapper) {
		aplicacao = aplicacaoWrapper;
		executaParsing();
	}
	
	public static UMLClass getClasseUml(String nomeClasse) {
		return (UMLClass) mapaTabelas.get(nomeClasse);
	}
	
	private static void executaParsing() {
		try {
			HandlerXmiGenerico contentHandler = new HandlerXmiGenerico();
			XMLReader parser = new SAXParser();
			//System.out.println("iniciando...");
			parser.setContentHandler(contentHandler);
			parser.parse(aplicacao.getNomeArquivoUml());
			preencheMap(contentHandler.getListaObjeto());
			//System.out.println("finalizando...");
		} catch (IOException e) {
			System.out.println("Error reading URI: " + e.getMessage());
		} catch (SAXException e) {
			System.out.println("Error in parsing: " + e.getMessage());
		}
	}
	
	private static void preencheMap(List listaObjetos) {
		Iterator iterador = listaObjetos.iterator();
		while (iterador.hasNext()) {
			UMLOBJ objeto = (UMLOBJ) iterador.next();
			if (objeto instanceof UMLClass) {
				mapaTabelas.put(objeto.getNome(), objeto);
			} 
		}
	}
}
