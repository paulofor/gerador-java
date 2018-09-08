package br.com.probid.gerador.execucao.wrappers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.probid.gerador.interfaces.ClasseI;

public class RecursosClasse {

	private ClasseWrapper classeWrapper = null;
	private ConfiguracaoWrapper configuracaoWrapper = null;
	
	private List listaClassesWrapper = null;
	
	public void setListaClasse(List listaClasse) {
		listaClassesWrapper = new ArrayList();
		Iterator itClasses = listaClasse.iterator();
		while (itClasses.hasNext()) {
			ClasseI classe = (ClasseI) itClasses.next();
			ClasseWrapper classeW = FabricaWrapper.criaClasse(classe);
			listaClassesWrapper.add(classeW);
		}
	}
	public List getListaClasseW() {
		return listaClassesWrapper;
	}
	
	public void setClasse(ClasseWrapper classe) {
		this.classeWrapper = classe;
	}
	public ClasseWrapper getClasse() {
		return this.classeWrapper;
	}
	public void setConfiguracao(ConfiguracaoWrapper configuracao) {
		this.configuracaoWrapper = configuracao;
	}
	public ConfiguracaoWrapper getConfiguracao() {
		return this.configuracaoWrapper;
	}
}
