package util.wrappers;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import br.com.providerit.gerador.interfaces.ClasseI;
import br.com.providerit.gerador.interfaces.OperacaoI;

public class ClasseWrapper {

	protected ClasseI base;
	public String getNomeProjetoEjb() {
		return base.getNome() + "EJB";
	}
	
	public String getNomeRootWeb() {
		return base.getNome() + "Web";
	}
	public String getNomeProjetoWeb() {
		return base.getNome() + "WEB";
	}
	public String nomePacoteProjeto() {
		return getNome().substring(3).toLowerCase();
	}
	public String getPathDto(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getNomeProjetoEjb() + File.separator + getCaminhoBase() +
		File.separator + "dto";
		return caminhoCompleto;

	}
	public String getPacoteBase() {
		String pacote = "com." + 
		"br." + 
		"brasilcap." +
		"cap." + 
		"obl." + 
		nomePacoteProjeto();
		return pacote;
	}
	public String getCaminhoBase() {
		String caminho = "com" + File.separator +
		"br" + File.separator +
		"brasilcap" + File.separator +
		"cap" + File.separator +
		"obl" + File.separator +
		nomePacoteProjeto();
		return caminho;
	}
	
	public boolean possuiEstereotipo(String nomeEstereotipo) {
		return (base.getListaOperacaoPorEstereotipo(nomeEstereotipo).size()>0);
	}
	
	public ClasseWrapper(ClasseI item) {
		base = item;
	}
	
	public void setBase(ClasseI base) {
		this.base = base;
	}
	
	public String getNome() {
		return base.getNome();
	}
	
	public String getNomeParaClasse() {
		return base.getNome().substring(3);
	}
	
	
	
	public String nomePacoteServlet() {
		return base.getNome();
	}
	public List listaOperacaoServlet() {
		List listaSaida = new LinkedList();
		Iterator iterador = base.getListaOperacaoPorEstereotipo("Servlet").iterator();
		while (iterador.hasNext()) {
			OperacaoI operacao = (OperacaoI) iterador.next();
			listaSaida.add(new OperacaoWrapper(operacao));
		}
		return listaSaida;
	}
}
