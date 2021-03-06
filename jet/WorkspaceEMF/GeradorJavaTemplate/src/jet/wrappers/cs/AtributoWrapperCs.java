package jet.wrappers.cs;

import gerapp.modelo.AtributoEntidade;
import jet.wrappers.base.AtributoWrapper;




public class AtributoWrapperCs extends AtributoWrapper {

	
	private ConverteTipoCs converteTipo = new ConverteTipoCs();
	
	public AtributoWrapperCs(AtributoEntidade att) {
		super(att);
	}
	public AtributoWrapperCs() {
		super();
	}
	public String formatoUpdateInsert(String objeto) {
		String saida = null;
		if (this.ehLogico()) {
			return "'\" + (" + objeto + "." + this.getNomePropriedade() + "?\"S\":\"N\") + \"' ";
		}
		if (this.ehData() && this.ehHora()) {
			return "\" + (" + objeto + "." + this.getNomePropriedade() + "==null?\"null\":\"'\" +  ConverteDataHoraVo2Sql(" + objeto + "." + this.getNomePropriedade() + ") + \"'\") + \" ";
			//return "\" + (" + objeto + "." + this.getNomePropriedade() + "==null?\"null\":\"'\" +  DCConvert.ToDataAAAA_MM_DD_HHMMSS(" + objeto + "." + this.getNomePropriedade() + ") + \"'\") + \" ";
		}
		if (this.ehHora()) {
			return "\" + (" + objeto + "." + this.getNomePropriedade() + "==null?\"null\":\"'\" + " + objeto + "." + this.getNomePropriedade() + " + \"'\") + \" ";
		}
		if (this.ehData()) {
			return "\" + (" + objeto + "." + this.getNomePropriedade() + "==null?\"null\":\"'\" +  ConverteData2Sql(" + objeto + "." + this.getNomePropriedade() + ") + \"'\") + \" ";
		}
		
		if (this.ehDecimal()) {
			return "'\" +  DCConvert.ToDataBase(" + objeto + "." + this.getNomePropriedade() + ") + \"' ";
		}
		return "'\" + " + objeto + "." + this.getNomePropriedade() + " + \"' ";
	}
	public String getTipo() {
		return converteTipo.getTipo(base);
	}
	
	public String getMetodoObtemSqlite() {
		return null;
	}
	
	public String getCastTipoJson() {
		return converteTipo.getTipoJson(base);
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
	
	
}
