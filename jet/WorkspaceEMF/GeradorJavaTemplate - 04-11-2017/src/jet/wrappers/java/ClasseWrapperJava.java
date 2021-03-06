package jet.wrappers.java;

import gerapp.modelo.AtributoEntidade;
import gerapp.modelo.Entidade;
import gerapp.modelo.ProcValor;
import gerapp.modelo.RelacionamentoEntidade;
import jet.wrappers.base.AtributoWrapper;
import jet.wrappers.base.ClasseWrapper;
import jet.wrappers.base.ProcValorWrapper;
import jet.wrappers.base.RelacionamentoWrapper;

public class ClasseWrapperJava extends ClasseWrapper {

	public ClasseWrapperJava(Entidade ent) {
		super(ent);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected RelacionamentoWrapper criaRelacionamentoWrapper(
			RelacionamentoEntidade relac) {
		// TODO Auto-generated method stub
		return new RelacionamentoWrapperJava(relac);
	}

	@Override
	protected AtributoWrapper criaAtributoWrapper(AtributoEntidade item) {
		return new AtributoWrapperJava(item);
	}

	@Override
	protected ProcValorWrapper criaProcValorWrapper(ProcValor item) {
		return new ProcValorWrapperJava(item);
	}

	

}
