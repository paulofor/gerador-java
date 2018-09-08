package br.com.probid.gerador.execucao.wrappers;

import java.util.Iterator;
import java.util.List;

import br.com.probid.gerador.interfaces.ClasseI;
import br.com.probid.gerador.interfaces.OperacaoI;
import br.com.probid.gerador.interfaces.ParametroI;

public class OperacaoWrapper {

	// Inicio Probid
	public void setBase(OperacaoI base) {
		this.base = base;
	}
	
	public boolean possuiParametros() {
		return base.getListaParametro().size() > 0;
	}
	
	public String getAssinaturaJava(String complemento) {
		if (possuiParametros())
			return getAssinaturaJava() + ", " + complemento;
		else
			return getAssinaturaJava() + complemento;
	}
	public String getAssinaturaJavaSemTipo(String complemento) {
		if (possuiParametros())
			return getAssinaturaJavaSemTipo() + ", " + complemento;
		else
			return getAssinaturaJavaSemTipo() + complemento;
	}
	
	public String getAssinaturaJava() {
		ParametroWrapper paramW = new ParametroWrapper();
		String saida = "";
		Iterator it = base.getListaParametro().iterator();
		while (it.hasNext()) {
			ParametroI parametro = (ParametroI) it.next();
			paramW.setBase(parametro);
			if (saida.length()>0) {
				saida += " , ";
			}
			saida += ConversorTipo.getTipoJava(paramW.getTipoString()) + " " + parametro.getNome();
		}
		return saida;
	}
	public String getAssinaturaJavaSemTipo() {
		ParametroWrapper paramW = new ParametroWrapper();
		String saida = "";
		Iterator it = base.getListaParametro().iterator();
		while (it.hasNext()) {
			ParametroI parametro = (ParametroI) it.next();
			paramW.setBase(parametro);
			if (saida.length()>0) {
				saida += " , ";
			}
			saida += parametro.getNome();
		}
		return saida;
	}
	// Final Probid
	
	
	private OperacaoI base;
	public OperacaoWrapper() {
		
	}
	public OperacaoWrapper(OperacaoI inicial) {
		base = inicial;
	}
	
	
	public String getNomeEjb() {
		if (base.getEstereotipo1().indexOf("CD")!=-1) return base.obtemClasse().getNome() + "CD";
		if (base.getEstereotipo1().indexOf("CN")!=-1) return base.obtemClasse().getNome() + "CN";
		return null;
	}
	
	public String getNome() {
		return base.getNome();
	}
	
	public List listaParametros() {
		return base.getListaParametro();
	}
	
	public ParametroWrapper obtemParametroPorNome(String nome) {
		Iterator itParam = base.getListaParametro().iterator();
		while (itParam.hasNext()) {
			ParametroI param = (ParametroI) itParam.next();
			if (param.getNome().equals(nome)) {
				return new ParametroWrapper(param);
			}
		}
		return null;
	}
	
	public ClasseWrapper obtemTipoClassePorNome(String nome) {
		Iterator itParam = base.getListaParametro().iterator();
		while (itParam.hasNext()) {
			ParametroI param = (ParametroI) itParam.next();
			if (param.getNome().equals(nome)) {
				Object tipoClasse = param.getTipo();
				if (tipoClasse instanceof ClasseI)
					return new ClasseWrapper((ClasseI)tipoClasse);
				else
					return null;
			}
		}
		return null;
	}
}
