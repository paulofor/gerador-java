package jet.wrappers.java;

import gerapp.modelo.RelacionamentoEntidade;
import jet.wrappers.base.AtributoWrapper;
import jet.wrappers.base.RelacionamentoWrapper;

public class RelacionamentoWrapperJava extends RelacionamentoWrapper{

	
	public RelacionamentoWrapperJava(RelacionamentoEntidade valor) {
		super(valor);
	}
	@Override
	protected AtributoWrapper criaAtributoWrapper() {
		// TODO Auto-generated method stub
		return new AtributoWrapperJava();
	}

	
	
	
	
	@Override
	public String getNomeCampoTabela() {
		if (entidadeOposta.getId()==entidade.getId()) {
			return this.getNomeCampoTabelaEntidadeOposta();
		} else {
			return super.getNomeCampoTabela();
		}
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
	
	public String formatoUpdateInsert(String objeto) {
		return "\" + " + objeto + ".get" + this.getNomePropriedade() + "() + \" ";
	}
}
