package br.com.probid.gerador.interfaces;

public interface RelacionamentoI {

	public String getNome();
	public String getGuidTail();
	public String getGuidHead();
	
	public ClasseI getClasseFonte();
	public ClasseI getClasseDestino();
	public void setClasseFonte(ClasseI classe);
	public void setClasseDestino(ClasseI classe);
}
