package jet.wrappers.android;

import gerapp.modelo.AtributoEntidade;
import jet.wrappers.base.AtributoWrapper;

public class AtributoWrapperAndroid extends AtributoWrapper {

	private ConverteTipoAndroid converteTipo = new ConverteTipoAndroid();
	
	public AtributoWrapperAndroid() {
		super();
	}
	public AtributoWrapperAndroid(AtributoEntidade att) {
		super(att);
	}
	
	public String getTipo() {
		return converteTipo.getTipo(base);
	}
	public String getTipoFuncaoMontador() {
		return converteTipo.getMetodoObtemSqlite(base);
	}
	// substituir pelo metodo acima mais genérico.
	public String getMetodoObtemSqlite() {
		return converteTipo.getMetodoObtemSqlite(base);
	}
	
	public String getCastTipoJson() {
		return converteTipo.getTipoJson(base);
	}
	/*
	public String getCastTipoSqlite() {
		return converteTipo.getTipoSqlite(base);
	}
	*/
	@Override
	public String getTipoSqliteSinc() {
		// TODO Auto-generated method stub
		return converteTipo.getTipoSqliteSinc(base);
	}
	@Override
	public String getTipoSqlite() {
		// TODO Auto-generated method stub
		return converteTipo.getTipoSqlite(base);
	}
	@Override
	public String formatoUpdateInsert(String objeto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
