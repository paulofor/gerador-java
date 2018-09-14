package jet.wrappers.java;

import gerapp.modelo.ProcValor;
import jet.wrappers.base.ProcValorWrapper;

public class ProcValorWrapperJava extends ProcValorWrapper{

	private ConverteTipoJava converteTipo = new ConverteTipoJava();
	
	@Override
	public String getTipo() {
		return converteTipo.getTipo(base);
	}

	public ProcValorWrapperJava() {
		super();
	}
	public ProcValorWrapperJava(ProcValor item) {
		super(item);
	}

	@Override
	public String getCastTipoJson() {
		throw new RuntimeException("Metodo nao implementado");
	}

	@Override
	public String getTipoFuncaoMontador() {
		throw new RuntimeException("Metodo nao implementado");
	}
	@Override
	public String getTipoSqlite() {
		throw new RuntimeException("Metodo nao implementado");
	}
}
