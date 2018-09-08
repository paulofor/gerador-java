package jet.wrappers.cpp;

import gerapp.modelo.RelacionamentoEntidade;
import jet.wrappers.base.AtributoWrapper;
import jet.wrappers.base.RelacionamentoWrapper;

public class RelacionamentoWrapperCpp extends RelacionamentoWrapper {

	public RelacionamentoWrapperCpp(RelacionamentoEntidade valor) {
		super(valor);
	}

	@Override
	protected AtributoWrapper criaAtributoWrapper() {
		// TODO Auto-generated method stub
		return new AtributoWrapperCpp();
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
	
	// Quando é retirado os dados do recordset para o objeto de modelo
	// retornat o get<nome-da-funcao> exemplo getInt, getString
	@Override
	public String getTipoFuncaoMontador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean ehMoeda() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
