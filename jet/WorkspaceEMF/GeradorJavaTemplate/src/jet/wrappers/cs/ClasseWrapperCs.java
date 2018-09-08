package jet.wrappers.cs;

import gerapp.modelo.AtributoEntidade;
import gerapp.modelo.Entidade;
import gerapp.modelo.ProcValor;
import gerapp.modelo.RelacionamentoEntidade;
import jet.wrappers.android.RelacionamentoWrapperAndroid;
import jet.wrappers.base.AtributoWrapper;
import jet.wrappers.base.ClasseWrapper;
import jet.wrappers.base.ProcValorWrapper;
import jet.wrappers.base.RelacionamentoWrapper;

public class ClasseWrapperCs extends ClasseWrapper {

	public ClasseWrapperCs(Entidade ent) {
		super(ent);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	protected AtributoWrapper criaAtributoWrapper(AtributoEntidade item) {
		
		return new AtributoWrapperCs(item);
	}



	@Override
	protected RelacionamentoWrapper criaRelacionamentoWrapper(
			RelacionamentoEntidade item) {
		// TODO Auto-generated method stub
		return new RelacionamentoWrapperCs(item);
	}



	@Override
	protected ProcValorWrapper criaProcValorWrapper(ProcValor item) {
		return new ProcValorWrapperCs(item);
	}

}
