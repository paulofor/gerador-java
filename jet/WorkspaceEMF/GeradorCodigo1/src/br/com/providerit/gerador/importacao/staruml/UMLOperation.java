package br.com.providerit.gerador.importacao.staruml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.providerit.gerador.interfaces.ClasseI;
import br.com.providerit.gerador.interfaces.OperacaoI;
import br.com.providerit.gerador.interfaces.ParametroI;

public class UMLOperation extends UMLOBJ implements OperacaoI{

	private List listaParametros = new ArrayList();
	
	public UMLOperation(String guid) {
		super(guid);
	}
	

	public void insereObjeto(UMLOBJ objeto) {
		if (objeto instanceof UMLParameter) { 
			listaParametros.add(objeto);
			return;
		}
	}
	
	

	public String getTipoRetorno() {
		// TODO Auto-generated method stub
		return null;
	}
	public List getListaParametro() {
		return listaParametros;
	}


	public ParametroI obtemParametroPorNome(String nome) {
		ParametroI saida = null;
		Iterator it = this.listaParametros.iterator();
		while (it.hasNext()) {
			ParametroI atual = (ParametroI) it.next();
			if (nome.equals(atual.getNome())) {
				saida = atual;
				break;
			}
		}
		return saida;
	}


	public ClasseI obtemClasse() {
		return (ClasseI) this.getItemPai();
	}
	

}
