package jet.wrappers.cpp;

import gerapp.modelo.AtributoEntidade;
import gerapp.modelo.ProcValor;
import jet.wrappers.base.ConverteTipo;

public class ConverteTipoCpp extends ConverteTipo{

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
	
	
	public String getTipoJson(AtributoEntidade atributo) {
		if (atributo.getTipo().compareTo("NInt")==0)
			return "Integer";
		if (atributo.getTipo().compareTo("TLbl")==0 || 
			atributo.getTipo().compareTo("TLblLg")==0)
			return "string";
		if (atributo.getTipo().compareTo("Moeda")==0)
			return "Float";
		if (atributo.getTipo().compareTo("Data")==0 ||
			atributo.getTipo().compareTo("Tempo")==0)
			return "string";
		if (atributo.getTipo().compareTo("Logic")==0)
			return "bool";
		if (atributo.getTipo().compareTo("Itens")==0)
			return "ArrayList";
		return atributo.getTipo();
	}
	
	public String getFuncaoMontador(AtributoEntidade atributo) {
		if (atributo.getTipo().compareTo("NInt")==0)
			return "Int";
		if (atributo.getTipo().compareTo("TNota10")==0	)
			return "Int";
		if (atributo.getTipo().compareTo("TLbl")==0 || 
			atributo.getTipo().compareTo("TDesc")==0 ||
			atributo.getTipo().compareTo("CriptoTLbl")==0 ||
			atributo.getTipo().compareTo("TLblLg")==0)
			return "String";
		if (atributo.getTipo().compareTo("Moeda")==0 ||
			atributo.getTipo().compareTo("Percent")==0 ||
			atributo.getTipo().compareTo("Decimal")==0)
			return "Float";
		if (atributo.getTipo().compareTo("Data")==0 ||
			atributo.getTipo().compareTo("DTemp")==0)
			return "String";
		if (atributo.getTipo().compareTo("Tempo")==0)
			return "HoraMinuto";
		if (atributo.getTipo().compareTo("Logic")==0)
			return "LogicoConvertido";
		if (atributo.getTipo().compareTo("Itens")==0)
			return "ArrayList";
		return atributo.getTipo();
	}
	
}

