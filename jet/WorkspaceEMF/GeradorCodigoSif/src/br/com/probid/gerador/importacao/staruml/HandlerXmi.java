package br.com.probid.gerador.importacao.staruml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;


public class HandlerXmi implements ContentHandler {

	private boolean exibeDado = false;
	
	private UMLClass objetoClasse = null;
	private UMLAttribute objetoAtributo = null;
	private UMLParameter objetoParametro = null;
	private UMLOperation objetoOperacao = null;
	
	private List listaObjeto = new ArrayList();
	private String dadoAnterior = null;
	
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		String dado = new String(arg0,arg1,arg2);
		if (dadoAnterior!=null) {
			if (arg1==0) {
				dado = dadoAnterior + dado;
				dadoAnterior = null;
			}
		}
		if (arg0.length==(arg1+arg2)) {
			dadoAnterior = dado;
			return;
		}
		if (dado.trim().length()>0) {
			if (objetoAtributo!=null) {
				objetoAtributo.addConteudo(dado);
			} else {
				if (objetoClasse!=null) {
					objetoClasse.addConteudo(dado);
				}
			}
		}
	}

	public void endDocument() throws SAXException {
		System.out.println("Total:" + listaObjeto.size());
		Iterator iterador = listaObjeto.iterator();
		while (iterador.hasNext()) {
			UMLClass objeto = (UMLClass) iterador.next();
			System.out.println("ITEM->");
			objeto.percorreListaAtributo();
		}
	}

	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		/*
		if (arg1=="OBJ") {
			if (objetoParametro!=null && objetoOperacao!=null) {
				objetoOperacao.adicionaParametro(objetoParametro);
				objetoParametro = null;
				return;
			}
			if (objetoOperacao!=null && objetoClasse!=null) {
				objetoClasse.adicionaOperacao(objetoOperacao);
				objetoOperacao = null;
				return;
			}
			if (objetoAtributo!=null && objetoClasse!=null) {
				objetoClasse.adicionaAtributo(objetoAtributo);
				objetoAtributo = null;
				return;
			}
			if (objetoClasse!=null) {
				listaObjeto.add(objetoClasse);
				objetoClasse = null;
				return;
			}
		}
		if (arg1=="ATTR") {
			if (this.objetoParametro!=null) {
				this.objetoParametro.endAttr();
				return;
			}
			if (objetoOperacao!=null) {
				objetoOperacao.endAttr();
				return;
			}
			if (objetoAtributo!=null) {
				objetoAtributo.endAttr();
				return;
			}
			if (objetoClasse!=null) {
				objetoClasse.endAttr();
				return;
			}
		}
		*/
	}

	public void endPrefixMapping(String arg0) throws SAXException {
		// TODO Auto-generated method stub

	}

	public void ignorableWhitespace(char[] arg0, int arg1, int arg2)
			throws SAXException {
		// TODO Auto-generated method stub

	}

	public void processingInstruction(String arg0, String arg1)
			throws SAXException {
		// TODO Auto-generated method stub

	}

	public void setDocumentLocator(Locator arg0) {
		// TODO Auto-generated method stub

	}

	public void skippedEntity(String arg0) throws SAXException {
		// TODO Auto-generated method stub

	}

	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub

	}

	public void startElement(String arg0, String arg1, String arg2,
			Attributes arg3) throws SAXException {
		
		if (arg1=="OBJ") {
			UMLOBJ objetoUml = CriadorObjetoUml.CriaObjetoUml(arg3);
			if (objetoUml instanceof UMLClass) {
				this.objetoClasse = (UMLClass) objetoUml;
			}
			if (objetoUml instanceof UMLAttribute) {
				this.objetoAtributo = (UMLAttribute) objetoUml;
			}
			if (objetoUml instanceof UMLOperation) {
				this.objetoOperacao = (UMLOperation) objetoUml;
			}
			if (objetoUml instanceof UMLParameter) {
				this.objetoParametro = (UMLParameter) objetoUml;
			}
		}
		
		if (arg1=="ATTR") {
			if (this.objetoParametro!=null) {
				objetoParametro.startAttr(arg3);
				return;
			}
			if (this.objetoOperacao!=null) {
				objetoOperacao.startAttr(arg3);
				return;
			}
			if (objetoAtributo!=null) { 
				objetoAtributo.startAttr(arg3);
				return;
			}
			if (objetoClasse!=null) {
				objetoClasse.startAttr(arg3);
				return;
			}
		}
		
		

	}

	public void startPrefixMapping(String arg0, String arg1)
			throws SAXException {
		// TODO Auto-generated method stub

	}

}
