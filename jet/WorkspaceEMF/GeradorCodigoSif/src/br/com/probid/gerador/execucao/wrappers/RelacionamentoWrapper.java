package br.com.probid.gerador.execucao.wrappers;

import br.com.probid.gerador.interfaces.ClasseI;
import br.com.probid.gerador.interfaces.RelacionamentoI;

public class RelacionamentoWrapper {

	private RelacionamentoI base;
	
	public void setBase(RelacionamentoI base){
		this.base = base;
	}
	
	public String getNomeClasseDestino() {
		ClasseI classe = base.getClasseDestino();
		return classe.getNome();
	}
	public String getNomeRelacionamentoSufixo() {
		return base.getNome().substring(0,1).toUpperCase() + base.getNome().substring(1);
	}
}
