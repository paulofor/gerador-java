package br.com.probid.gerador.interfaces;

public interface ObjetoI {

	public String getGuid();
	public String getNome();
	public String getEstereotipo1();
	
	public boolean possuiEstereotipo(String nomeEstereotipo);
}
