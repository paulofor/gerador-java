package br.com.providerit.gerador.interfaces;

import java.util.List;

public interface OperacaoI extends ObjetoI {
	public List getListaParametro();
	public String getTipoRetorno();
	public ParametroI obtemParametroPorNome(String nome);
	public ClasseI obtemClasse();
}
