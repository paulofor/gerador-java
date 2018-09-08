package jet.wrappers.cs;

import gerapp.modelo.RelacionamentoEntidade;
import jet.wrappers.base.AtributoWrapper;
import jet.wrappers.base.RelacionamentoWrapper;

public class RelacionamentoWrapperCs extends RelacionamentoWrapper {

	public RelacionamentoWrapperCs(RelacionamentoEntidade valor) {
		super(valor);
	}

	@Override
	protected AtributoWrapper criaAtributoWrapper() {
		// TODO Auto-generated method stub
		return new AtributoWrapperCs();
	}

	@Override
	public boolean ehData() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ehHora() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean ehPercentual() {
		return false;
	}

	@Override
	public boolean ehMoeda() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
