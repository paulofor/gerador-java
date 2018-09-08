package jet.wrappers.android;

import gerapp.modelo.AtributoEntidade;
import gerapp.modelo.Entidade;
import gerapp.modelo.ProcValor;
import gerapp.modelo.RelacionamentoEntidade;
import jet.wrappers.base.AtributoWrapper;
import jet.wrappers.base.ClasseWrapper;
import jet.wrappers.base.ProcValorWrapper;
import jet.wrappers.base.RelacionamentoWrapper;

public class ClasseWrapperAndroid extends ClasseWrapper {

	public ClasseWrapperAndroid(Entidade ent) {
		super(ent);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected RelacionamentoWrapper criaRelacionamentoWrapper(
			RelacionamentoEntidade relac) {
		// TODO Auto-generated method stub
		return new RelacionamentoWrapperAndroid(relac);
	}

	@Override
	protected AtributoWrapper criaAtributoWrapper(AtributoEntidade item) {
		// TODO Auto-generated method stub
		return new AtributoWrapperAndroid(item);
	}

	@Override
	protected ProcValorWrapper criaProcValorWrapper(ProcValor item) {
		// TODO Auto-generated method stub
		return new ProcValorWrapperAndroid(item);
	}

}
