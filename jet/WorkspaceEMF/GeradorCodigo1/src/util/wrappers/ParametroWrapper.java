package util.wrappers;

import br.com.providerit.gerador.interfaces.ClasseI;
import br.com.providerit.gerador.interfaces.ParametroI;

public class ParametroWrapper {

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
