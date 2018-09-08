package br.com.providerit.gerador.importacao.staruml;



import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import com.sun.org.apache.xerces.internal.parsers.SAXParser;


public class LeituraSimples {

	/**
	 * @param args
	 */
	//static String uri = "C:/Documentos/diagramas/ModeloFidelizacao3.uml";
	static String uri = "I:/Ipiranga/diagramas/ModeloFidelizacao3.uml";
	//static String uri = "C:/Documentos/diagramas/melhorias/exemplo.uml";
	
	public static void main(String[] args) {
		
		try {
			ContentHandler contentHandler = new HandlerXmiGenerico();
			XMLReader parser = new SAXParser();
			System.out.println("iniciando...");
			parser.setContentHandler(contentHandler);
			parser.parse(uri);
			exibeResultado(((HandlerXmiGenerico)contentHandler).getListaObjeto());
			System.out.println("finalizando...");
		} catch (IOException e) {
			System.out.println("Error reading URI: " + e.getMessage());
		} catch (SAXException e) {
			System.out.println("Error in parsing: " + e.getMessage());
		}
	}
	
	private static void exibeResultado(List listaObjeto) {
		System.out.println("Total:" + listaObjeto.size());
		Iterator iterador = listaObjeto.iterator();
		while (iterador.hasNext()) {
			UMLOBJ objeto = (UMLOBJ) iterador.next();
			if (objeto instanceof UMLInterface) {
				System.out.println("  *****************************************************************************  Interface  ***");
			} else {
				System.out.println("ITEM->");
				((UMLClass)objeto).percorreListaAtributo();
			}
		}
	}

}
