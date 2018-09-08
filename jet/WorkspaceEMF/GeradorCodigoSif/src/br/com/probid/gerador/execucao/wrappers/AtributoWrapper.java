package br.com.probid.gerador.execucao.wrappers;

import br.com.probid.gerador.interfaces.AtributoI;

// Gerado para Probid

public class AtributoWrapper {

	private AtributoI base;
	
	public void setBase(AtributoI base) {
		this.base = base;
	}
	public AtributoI getBase() {
		return this.base;
	}
	
	public boolean precisaTratarNullSql() {
		if (base.getTipo().compareTo("Integer")==0 || base.getTipo().compareTo("Boolean")==0)
			return true;
		else
			return false;
	}
	public String getSqlTypes() {
		return ConversorTipo.getSqlTypes(base.getTipo());
	}
	
	public String getNomeMetodo() {
		return base.getNome().substring(0, 1).toUpperCase() + base.getNome().substring(1);
	}
	
	public String getTipoJava() {
		return ConversorTipo.getTipoJava(base.getTipo());
	}
	public String getTipoParametroSql() {
		return ConversorTipo.getTipoParametroSql(base.getTipo());
	}
	public String getNomeVariavel() {
		String nome = base.getNome();
		String saida = "";
		System.out.println("Passou aqui   *********************  ");
		boolean mudar = false;
		for (int i=0;i<nome.length();i++) {
			if (nome.substring(i, i+1).compareTo("_")==0) {
				mudar = true;
			} else {
				if (mudar) {
					saida += nome.substring(i,i+1).toUpperCase();
					mudar = false;
				} else {
					saida += nome.substring(i,i+1);
				}
			}
		}
		return saida;
	}
	public String getNomeCampoTabela() {
		
		return base.getEstereotipo1();
	}
	
}
