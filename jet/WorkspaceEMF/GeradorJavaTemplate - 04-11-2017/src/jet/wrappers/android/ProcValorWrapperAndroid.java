package jet.wrappers.android;

import gerapp.modelo.ProcValor;
import jet.wrappers.base.ProcValorWrapper;

public class ProcValorWrapperAndroid extends ProcValorWrapper{

	private ConverteTipoAndroid converteTipo = new ConverteTipoAndroid();
	
	public ProcValorWrapperAndroid() {
		super();
	}
	public ProcValorWrapperAndroid(ProcValor proc) {
		super(proc);
	}
	
	// substituir pelo metodo acima mais genérico.
	public String getMetodoObtemSqlite() {
		return converteTipo.getMetodoObtemSqlite(base);
	}
	
	@Override
	public String getTipo() {
		return converteTipo.getTipo(base);
	}
	public String getTipoFuncaoMontador() {
		return converteTipo.getMetodoObtemSqlite(base);
	}
	public String getCastTipoJson() {
		return converteTipo.getTipoJson(base);
	}
	@Override
	public String getTipoSqlite() {
		return converteTipo.getTipoSqlite(base);
	}
	
}
