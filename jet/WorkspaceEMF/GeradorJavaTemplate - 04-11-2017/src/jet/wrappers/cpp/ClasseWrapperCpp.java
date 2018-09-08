package jet.wrappers.cpp;

import gerapp.modelo.AtributoEntidade;
import gerapp.modelo.Entidade;
import gerapp.modelo.ProcValor;
import gerapp.modelo.RelacionamentoEntidade;
import jet.wrappers.base.AtributoWrapper;
import jet.wrappers.base.ClasseWrapper;
import jet.wrappers.base.ProcValorWrapper;
import jet.wrappers.base.RelacionamentoWrapper;

public class ClasseWrapperCpp extends ClasseWrapper {

	public ClasseWrapperCpp(Entidade ent) {
		super(ent);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected RelacionamentoWrapper criaRelacionamentoWrapper(
			RelacionamentoEntidade relac) {
	
		return new RelacionamentoWrapperCpp(relac);
	}

	@Override
	protected AtributoWrapper criaAtributoWrapper(AtributoEntidade item) {
		// TODO Auto-generated method stub
		return new AtributoWrapperCpp(item);
	}
	
	public String getNomeEstrutura() {
		String nome = this.getNomeParaTabela();
		return nome.toUpperCase();
	}

	@Override
	protected ProcValorWrapper criaProcValorWrapper(ProcValor item) {
		return new ProcValorWrapperCpp(item);
	}

}
