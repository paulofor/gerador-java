package jet.wrappers.cpp;

import gerapp.modelo.ProcValor;
import jet.wrappers.base.ProcValorWrapper;

public class ProcValorWrapperCpp extends ProcValorWrapper{

	private ConverteTipoCpp converteTipo = new ConverteTipoCpp();
	
	@Override
	public String getTipo() {
		return converteTipo.getTipo(base);
	}

	public ProcValorWrapperCpp() {
		
	}
	public ProcValorWrapperCpp(ProcValor proc) {
		super(proc);
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
