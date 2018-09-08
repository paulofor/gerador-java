package jet.wrappers.java;

import gerapp.modelo.AtributoEntidade;
import jet.wrappers.android.ConverteTipoAndroid;
import jet.wrappers.base.AtributoWrapper;

public class AtributoWrapperJava extends AtributoWrapper{
	
	private ConverteTipoJava converteTipo = new ConverteTipoJava();
	
	public AtributoWrapperJava(AtributoEntidade item) {
		super(item);
	}
	public AtributoWrapperJava() {
		super();
	}
	@Override
	public String getCastTipoJson() {
		return converteTipo.getTipoJson(base);
	}
	@Override
	public String getMetodoObtemSqlite() {
		return null;
	}
	@Override
	public String getTipo() {
		return converteTipo.getTipo(base);
	}
	@Override
	public String getTipoSqlite() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTipoSqliteSinc() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTipoFuncaoMontador() {
		// TODO Auto-generated method stub
		return converteTipo.getFuncaoMontador(base);
	}
	@Override
	public String formatoUpdateInsert(String objeto) {
		String saida = null;
		if (this.ehLogico()) {
			return "'\" + (" + objeto + ".get" + this.getNomePropriedade() + "()?\"S\":\"N\") + \"' ";
		}
		if (this.ehData() && this.ehHora()) {
			return "\" + (" + objeto + ".get" + this.getNomePropriedade() + "()==null?\"null\": DCConvert.ToDataSqlAAAA_MM_DD_HHMMSS(" + objeto + ".get" + this.getNomePropriedade() + "()) ) + \" ";
		}
		if (this.ehHora()) {
			return "\" + (" + objeto + ".get" + this.getNomePropriedade() + "()==null?\"null\":\"'\" + " + objeto + ".get" + this.getNomePropriedade() + "() + \"'\") + \" ";
		}
		if (this.ehData()) {
			return "\" + (" + objeto + ".get" + this.getNomePropriedade() + "()==null?\"null\":DCConvert.ToDataSqlAAAA_MM_DD(" + objeto + ".get" + this.getNomePropriedade() + "()) ) + \" ";
		}
		
		if (this.ehDecimal()) {
			return "'\" +  DCConvert.ToDataBase(" + objeto + ".get" + this.getNomePropriedade() + "()) + \"' ";
		}
		return "'\" + " + objeto + ".get" + this.getNomePropriedade() + "() + \"' ";

	}

	

}
