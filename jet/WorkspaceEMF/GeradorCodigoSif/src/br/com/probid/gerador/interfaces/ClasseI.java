package br.com.probid.gerador.interfaces;

import java.util.List;

public interface ClasseI extends ObjetoI {
	public void adicionaRelacionamentoFonte(RelacionamentoI relacionamento);
	public List getListaRelacionamentoFonte();
	public List getListaOperacao();
	public List getListaOperacaoPorEstereotipo(String nomeEstereotipo);
	public List getListaAtributo();
	public List getListaAtributoPorEstereotipo(String nomeEstereotipo);
	
}
