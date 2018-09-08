package jet.wrappers.cs;

import gerapp.modelo.AtributoEntidade;
import gerapp.modelo.ProcValor;
import jet.wrappers.base.ConverteTipo;

public class ConverteTipoCs extends ConverteTipo{

	public String getTipo(ProcValor proc) {
		return getTipoPorOriginal(proc.getTipo());
	}
	public String getTipo(AtributoEntidade atributo) {
		return getTipoPorOriginal(atributo.getTipo());
	}
	
	public String getTipoPorOriginal(String tipoOriginal) {
		if (tipoOriginal.compareTo("NInt")==0)
			return "long";
		if (tipoOriginal.compareTo("TNota10")==0)
			return "int";
		if (tipoOriginal.compareTo("TLbl")==0 || 
			tipoOriginal.compareTo("TLblLg")==0|| 
			tipoOriginal.compareTo("TDesc")==0)
			return "string";
		if (tipoOriginal.compareTo("Moeda")==0 ||
			tipoOriginal.compareTo("Percent")==0 ||
			tipoOriginal.compareTo("Decimal")==0)
			return "float";
		if (tipoOriginal.compareTo("Data")==0 || 
			//atributo.getTipo().compareTo("Tempo")==0 || 
			tipoOriginal.compareTo("DTemp")==0 ||
			tipoOriginal.compareTo("CriptoTLbl")==0 ||
			tipoOriginal.compareTo("CriptoMoeda")==0)
			return "string";
		if (tipoOriginal.compareTo("Logic")==0)
			return "bool";
		if (tipoOriginal.compareTo("Tempo")==0)
			return "string";
		if (tipoOriginal.compareTo("Itens")==0)
			return "ArrayList";
		return tipoOriginal;
	}
	
	
	
	public static String getTipoFiltro(String tipo) {
		if (tipo.compareTo("NInt")==0 
			)
			return "long";
		if (tipo.compareTo("TLbl")==0 || 
			tipo.compareTo("TLblLg")==0)
			return "string";
		if (tipo.compareTo("Moeda")==0 ||
			tipo.compareTo("Percent")==0)
			return "float";
		if (tipo.compareTo("Data")==0 ||
			tipo.compareTo("DTemp")==0 ||
			tipo.compareTo("Tempo")==0)
			return "string";
		if (tipo.compareTo("Logic")==0)
			return "bool";
		if (tipo.compareTo("Itens")==0)
			return "ArrayList";
		return tipo;
	}
	
	
	public String getTipoJson(ProcValor proc) {
		return getTipoJson(proc.getTipo());
	}
	public String getTipoJson(AtributoEntidade atributo) {
		return getTipoJson(atributo.getTipo());
	}
	
	private String getTipoJson(String tipo) {
		if (tipo.compareTo("NInt")==0)
			return "Integer";
		if (tipo.compareTo("TLbl")==0 || 
			tipo.compareTo("TLblLg")==0)
			return "string";
		if (tipo.compareTo("Moeda")==0)
			return "Float";
		if (tipo.compareTo("Data")==0 ||
			tipo.compareTo("Tempo")==0)
			return "string";
		if (tipo.compareTo("Logic")==0)
			return "bool";
		if (tipo.compareTo("Itens")==0)
			return "ArrayList";
		return tipo;
	}
	
	public String getFuncaoMontador(AtributoEntidade atributo) {
		return getFuncaoMontador(atributo.getTipo());
	}
	public String getFuncaoMontador(ProcValor proc) {
		return getFuncaoMontador(proc.getTipo());
	}
	
	
	private String getFuncaoMontador(String tipo) {
		if (tipo.compareTo("NInt")==0)
			return "Int";
		if (tipo.compareTo("TNota10")==0	)
			return "Int";
		if (tipo.compareTo("TLbl")==0 || 
				tipo.compareTo("TDesc")==0 ||
				tipo.compareTo("CriptoTLbl")==0 ||
				tipo.compareTo("TLblLg")==0)
			return "String";
		if (tipo.compareTo("Moeda")==0 ||
				tipo.compareTo("Percent")==0 ||
				tipo.compareTo("Decimal")==0)
			return "Float";
		if (tipo.compareTo("Data")==0 ||
				tipo.compareTo("DTemp")==0)
			return "String";
		if (tipo.compareTo("Tempo")==0)
			return "HoraMinuto";
		if (tipo.compareTo("Logic")==0)
			return "LogicoConvertido";
		if (tipo.compareTo("Itens")==0)
			return "ArrayList";
		return tipo;
	}
}

