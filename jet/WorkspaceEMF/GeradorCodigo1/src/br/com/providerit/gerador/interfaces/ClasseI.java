package br.com.providerit.gerador.interfaces;

import java.util.List;

public interface ClasseI extends ObjetoI {
	public List getListaOperacao();
	public List getListaOperacaoPorEstereotipo(String nomeEstereotipo);
	public List getListaAtributo();
	public List getListaAtributoPorEstereotipo(String nomeEstereotipo);
	
}
