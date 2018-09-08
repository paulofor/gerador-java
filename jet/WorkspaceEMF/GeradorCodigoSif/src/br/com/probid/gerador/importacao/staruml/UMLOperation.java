package br.com.probid.gerador.importacao.staruml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.xml.sax.Attributes;

import br.com.probid.gerador.interfaces.ClasseI;
import br.com.probid.gerador.interfaces.OperacaoI;
import br.com.probid.gerador.interfaces.ParametroI;

public class UMLOperation extends UMLOBJ implements OperacaoI{

	private List listaParametros = new ArrayList();
	private String tipoRetorno = null;
	
	public UMLOperation(String guid) {
		super(guid);
	}
	

	public void insereObjeto(UMLOBJ objeto) {
		if (objeto instanceof UMLParameter) {
			UMLATTR attr = (UMLATTR) objeto.getListaAttr().get(0);
			if (attr.getConteudo().compareTo("pdkReturn")==0) {
				attr = (UMLATTR) objeto.getListaAttr().get(1);
				tipoRetorno = attr.getConteudo();
			} else {
				listaParametros.add(objeto);
			}
			return;
		}
	}
	

	public boolean tipoVoid() {
		return (tipoRetorno.compareTo("void")==0);
	}

	public String getTipoRetorno() {
		// TODO Auto-generated method stub
		return tipoRetorno;
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
