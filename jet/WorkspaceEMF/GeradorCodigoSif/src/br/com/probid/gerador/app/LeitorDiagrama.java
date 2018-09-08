package br.com.probid.gerador.app;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import br.com.probid.gerador.execucao.ExecutadorTemplates;
import br.com.probid.gerador.importacao.staruml.HandlerXmiGenerico;
import br.com.probid.gerador.importacao.staruml.UMLClass;
import br.com.probid.gerador.importacao.staruml.UMLInterface;
import br.com.probid.gerador.importacao.staruml.UMLOBJ;
import br.com.probid.gerador.interfaces.AplicacaoI;
import br.com.probid.gerador.interfaces.AtributoI;
import br.com.probid.gerador.interfaces.ClasseI;
import br.com.probid.gerador.interfaces.OperacaoI;
import br.com.probid.gerador.interfaces.ParametroI;

import com.sun.org.apache.xerces.internal.parsers.SAXParser;

public class LeitorDiagrama {

	Configuracao conf;
	
	public void executaLeitura(Configuracao conf) {
		try {
			HandlerXmiGenerico contentHandler = new HandlerXmiGenerico();
			XMLReader parser = new SAXParser();
			System.out.println("iniciando...");
			AplicacaoI aplicacao = new Aplicacao();
			contentHandler.setAplicacao(aplicacao);
			parser.setContentHandler(contentHandler);
			parser.parse(conf.getNomeArquivoStarUml());
			aplicacao.parsingCompleto();
			exibeResultado(aplicacao);
			ExecutadorTemplates executador = new ExecutadorTemplates();
			executador.executaGeracao(aplicacao, conf);
			//exibeResultado2(contentHandler.getListaObjeto());
			System.out.println("finalizando...");
		} catch (IOException e) {
			System.out.println("Error reading URI: " + e.getMessage());
		} catch (SAXException e) {
			System.out.println("Error in parsing: " + e.getMessage());
		}
	}
	
	private static void exibeResultado(AplicacaoI aplicacao) {
		Iterator iterador = aplicacao.getListaClasse().iterator();
		while (iterador.hasNext()) {
			ClasseI classe = (ClasseI) iterador.next();
			System.out.println("Classe:" + classe.getNome() + "<<" + classe.getEstereotipo1() + ">>");
			Iterator iteradorAtributos = classe.getListaAtributo().iterator();
			while (iteradorAtributos.hasNext()) {
				Object item = iteradorAtributos.next();
				System.out.println("item:" + item);
				AtributoI atributo = (AtributoI) item;
				System.out.println("   Atributo:" + atributo.getNome() + "<<" + atributo.getEstereotipo1() + ">>");
			}
			Iterator iteradorOperacoes = classe.getListaOperacao().iterator();
			while (iteradorOperacoes.hasNext()) {
				OperacaoI operacao = (OperacaoI) iteradorOperacoes.next();
				System.out.println("   Operacao:" + operacao.getNome() + "<<" + operacao.getEstereotipo1() + ">>");
				Iterator iteradorParametros = operacao.getListaParametro().iterator();
				while (iteradorParametros.hasNext()) {
					ParametroI parametro = (ParametroI) iteradorParametros.next();
					System.out.println("     Parametro:" + parametro.getNome() + ":" + parametro.getTipo());
				}
			}
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
	
	private static void exibeResultado2(List listaObjeto) {
		System.out.println("Total:" + listaObjeto.size());
		Iterator iterador = listaObjeto.iterator();
		while (iterador.hasNext()) {
			UMLOBJ objeto = (UMLOBJ) iterador.next();
			System.out.println("Tipo:" + objeto.toString());
			System.out.println("Nome:" + objeto.getNome());
			//if (objeto instanceof UMLClass) {
			//	UMLClass classe = (UMLClass) objeto;
			//	classe.percorreListaAtributo();
			//}
			System.out.println();
		}
	}
}
