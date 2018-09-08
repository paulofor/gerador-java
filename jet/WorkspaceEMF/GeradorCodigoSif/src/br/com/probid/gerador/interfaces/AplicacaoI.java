package br.com.probid.gerador.interfaces;

import java.util.List;

public interface AplicacaoI {
	public void parsingCompleto();
	public List getListaClasse();
	public List getListaClassePorEstereotipo(String estereotipo);
	public void addClasse(ClasseI classe);
	public void addRelacionamento(RelacionamentoI relacionamento);
	public void addClasseView(ClasseViewI classeView);
}
