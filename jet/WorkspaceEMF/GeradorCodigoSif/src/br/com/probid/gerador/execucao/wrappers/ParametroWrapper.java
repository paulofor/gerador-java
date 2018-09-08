package br.com.probid.gerador.execucao.wrappers;

import br.com.probid.gerador.interfaces.ClasseI;
import br.com.probid.gerador.interfaces.ParametroI;

public class ParametroWrapper {

	// Inicio Probid
	public ParametroWrapper() {
		
	}
	public void setBase(ParametroI base) {
		this.base = base;
	}
	public String getTipoString() {
		if (getTipoClasse()!=null) {
			return getTipoClasse().getNomeBasico();
		} else {
			return base.getTipo().toString();
		}
	}
	// Final Probid
	
	private ParametroI base = null;
	
	public ParametroWrapper(ParametroI parametro) {
		base = parametro;
	}
	public ClasseWrapper getTipoClasse() {
		if (base.getTipo() instanceof ClasseI) {
			return new ClasseWrapper((ClasseI)base.getTipo());
		}
		return null;
	}
}
