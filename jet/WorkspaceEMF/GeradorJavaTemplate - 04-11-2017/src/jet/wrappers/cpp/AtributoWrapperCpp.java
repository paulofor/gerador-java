package jet.wrappers.cpp;

import gerapp.modelo.AtributoEntidade;
import jet.wrappers.base.AtributoWrapper;

public class AtributoWrapperCpp extends AtributoWrapper {

	private ConverteTipoCpp converteTipo = new ConverteTipoCpp();
	
	public AtributoWrapperCpp() {
		super();
	}
	public AtributoWrapperCpp(AtributoEntidade att) {
		super(att);
	}
	
	public String getTipo() {
		return converteTipo.getTipo(base);
	}
	/*
	public String getTipoFuncaoMontador() {
		return converteTipo.getMetodoObtemSqlite(base);
	}
	*/
	
	public String getCastTipoJson() {
		return converteTipo.getTipoJson(base);
	}
	/*
	public String getCastTipoSqlite() {
		return converteTipo.getTipoSqlite(base);
	}
	*/
	
	
	@Override
	public String formatoUpdateInsert(String objeto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTipoSqliteSinc() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTipoSqlite() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getTipoFuncaoMontador() {
		return converteTipo.getFuncaoMontador(base);
	}
	public String getMetodoObtemSqlite() {
		return null;
	}
	
}
