package br.com.probid.gerador.execucao.wrappers;

public class ConversorTipo {

	public static String getTipoJava(String tipo) {
		if (tipo.compareTo("Data")==0)
			return "Date";
		if (tipo.compareTo("DataHora")==0)
			return "Timestamp";
		return tipo;
	}
	
	public static String getTipoParametroSql(String tipo) {
		if (tipo.compareTo("Data")==0)
			return "Date";
		if (tipo.compareTo("DataHora")==0)
			return "Timestamp";
		if (tipo.compareTo("Integer")==0)
			return "Int";
		return tipo;
	}
	
	public static String getSqlTypes(String tipo) {
		if (tipo.compareTo("Integer")==0)
			return "Types.INTEGER";
		if (tipo.compareTo("Boolean")==0)
			return "Types.BOOLEAN";
		return tipo;
	}
}
