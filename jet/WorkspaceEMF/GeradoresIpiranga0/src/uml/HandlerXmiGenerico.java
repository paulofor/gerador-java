package uml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;


public class HandlerXmiGenerico implements ContentHandler {

	private boolean exibeDado = false;
	
	
	private UMLOBJ objetoCorrente = null;
	
	private List listaObjeto = new ArrayList();
	private String dadoAnterior = null;
	
	public List getListaObjeto() {
		return listaObjeto;
	}
	
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
			if (objetoCorrente!=null) {
				objetoCorrente.addConteudo(dado);
			}
		}
	}

	public void endDocument() throws SAXException {
		
	}

	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		if (arg1=="OBJ") {
			if (objetoCorrente!=null) {
				UMLOBJ itemPai = objetoCorrente.getItemPai();
				if (itemPai!=null) {
					itemPai.insereObjeto(objetoCorrente);
					objetoCorrente = itemPai;
				} else {
					listaObjeto.add(objetoCorrente);
					objetoCorrente = null;
				}
			}
		}
		if (arg1=="ATTR") {
			if (objetoCorrente!=null) {
				objetoCorrente.endAttr();
			}
		}
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
			if (objetoUml!=null) {
				if (objetoCorrente!=null) {
					objetoUml.setItemPai(objetoCorrente);
				} 
				objetoCorrente = objetoUml;
			}
		}
		
		if (arg1=="ATTR") {
			if (this.objetoCorrente!=null) {
				objetoCorrente.startAttr(arg3);
			}
		}
		
	}

	public void startPrefixMapping(String arg0, String arg1)
			throws SAXException {
		// TODO Auto-generated method stub

	}

}
