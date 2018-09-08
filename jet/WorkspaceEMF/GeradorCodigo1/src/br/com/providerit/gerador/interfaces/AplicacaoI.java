package br.com.providerit.gerador.interfaces;

import java.util.List;

public interface AplicacaoI {
	public List getListaClasse();
	public List getListaClassePorEstereotipo(String estereotipo);
	public void addClasse(ClasseI classe);
	
}
