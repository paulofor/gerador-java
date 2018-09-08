package gerapp.modelo.derivadas;

import br.com.digicom.lib.*;

import gerapp.modelo.*;

public class AtributoEntidadeDerivada implements AtributoEntidadeDerivadaI {
	private AtributoEntidade principal;

	public AtributoEntidadeDerivada(AtributoEntidade itemPrincipal) {
		principal = itemPrincipal;
	}

	private boolean chave;
	private boolean identificador;

	@Override
	public boolean getChave() {
		// TODO Auto-generated method stub
		return chave;
	}

	@Override
	public boolean getIdentificador() {
		// TODO Auto-generated method stub
		return identificador;
	}

	@Override
	public void setChave(boolean dado) {
		// TODO Auto-generated method stub
		chave = dado;
	}

	@Override
	public void setIdentificador(boolean dado) {
		// TODO Auto-generated method stub
		identificador = dado;
	}
}
