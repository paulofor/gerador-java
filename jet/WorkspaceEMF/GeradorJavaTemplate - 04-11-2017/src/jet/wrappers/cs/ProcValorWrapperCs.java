package jet.wrappers.cs;

import gerapp.modelo.ProcValor;
import jet.wrappers.base.ProcValorWrapper;

public class ProcValorWrapperCs extends ProcValorWrapper{

	private ConverteTipoCs converteTipo = new ConverteTipoCs();
	
	@Override
	public String getTipo() {
		return converteTipo.getTipo(base);
	}

	public ProcValorWrapperCs() {
		super();
	}
	public ProcValorWrapperCs(ProcValor item ) {
		super(item);
	}

	@Override
	public String getCastTipoJson() {
		return converteTipo.getTipoJson(base);
	}

	@Override
	public String getTipoFuncaoMontador() {
		return converteTipo.getFuncaoMontador(base);
	}
	
	@Override
	public String getTipoSqlite() {
		throw new RuntimeException("Metodo nao implementado");
	}
}
