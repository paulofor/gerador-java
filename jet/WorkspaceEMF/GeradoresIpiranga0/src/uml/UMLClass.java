package uml;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;



public class UMLClass extends UMLOBJ{

	private List listaObjetos = new ArrayList();
	private List listaOperacoes = new ArrayList();
	private HashMap mapaAtributos = new HashMap();
	
	
	public UMLAttribute getPorNome(String nome) {
		return (UMLAttribute)mapaAtributos.get(nome); 
	}
	
	public UMLClass(String guid) {
		super(guid);
	}
	public void adicionaOperacao(UMLOperation operacao) {
		listaOperacoes.add(operacao);
	}
	public void adicionaAtributo(UMLAttribute atributo) {
		listaObjetos.add(atributo);
	}
	
	public void percorreLista() {
		Iterator it = listaObjetos.iterator();
		this.imprime();
		while (it.hasNext()) {
			UMLAttribute atributo = (UMLAttribute) it.next();
			atributo.imprime();
		}
	}
	@Override
	public void insereObjeto(UMLOBJ objeto) {
		if (objeto instanceof UMLOperation) { 
			listaOperacoes.add(objeto);
			return;
		}
		if (objeto instanceof UMLAttribute) { 
			listaObjetos.add(objeto);
			mapaAtributos.put(objeto.getNome(), objeto);
			return;
		}
		
	}
	
	/*
	public String getNomeAtributoBD(String nomeAtributo) {
		UMLAttribute atributo = (UMLAttribute) mapaAtributos.get(nomeAtributo);
		if (atributo!=null) {
			return atributo.getEstereotipo();
		}
		return null;
	}
	*/
}
