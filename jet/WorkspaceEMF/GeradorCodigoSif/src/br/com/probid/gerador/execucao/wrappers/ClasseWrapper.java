package br.com.probid.gerador.execucao.wrappers;

// Essa classe é da aplicação

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import br.com.probid.gerador.interfaces.AtributoI;
import br.com.probid.gerador.interfaces.ClasseI;
import br.com.probid.gerador.interfaces.OperacaoI;

public class ClasseWrapper {

	protected ClasseI base;
	
	// Inicio Probid
	
	public String getNomeBasico() {
		return base.getNome();
	}
	public static String getPathBusinessBase(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getPathAplicacao() + File.separator + "business" + File.separator + "base";
		return caminhoCompleto;
	}
	public static String getPathBusiness(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getPathAplicacao() + File.separator + "business";
		return caminhoCompleto;
	}
	public static String getPathDaoBase(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getPathAplicacao() + File.separator + "dao" + File.separator + "base";
		return caminhoCompleto;
	}
	public static String getPathDao(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getPathAplicacao() + File.separator + "dao";
		return caminhoCompleto;
	}
	public static String getPathBean(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getPathAplicacao() + File.separator + "bean";
		return caminhoCompleto;
	}
	public static String getPathBeanBase(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getPathAplicacao() + File.separator + "bean" + File.separator + "base";
		return caminhoCompleto;
	}
	public static String getPathForm(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getPathCamadaView() + File.separator + "form";
		return caminhoCompleto;
	}
	private static String getPathAplicacao() {
		return "br" + File.separator + "org" + File.separator + "fplf" + File.separator + "sif" + File.separator + "core";
	}
	
	private static String getPathCamadaView() {
		return "br" + File.separator + "org" + File.separator + "fplf";
	}
	
	public String sqlComparaPorChave() {
		String saida = "";
		Iterator itAtributo = base.getListaAtributo().iterator();
		AtributoWrapper atributo = new AtributoWrapper();
		while (itAtributo.hasNext()) {
			atributo.setBase((AtributoI)itAtributo.next());
			if (atributo.getBase().ehChave()) {
				if (saida.length()==0)
					saida += atributo.getNomeCampoTabela() +  " = ? ";
				else 
					saida += " and " + atributo.getNomeCampoTabela() +  " = ? ";
			}
		}
		return saida;
	}
	
	public String sqlCampoInsert() {
		String saida = "(";
		Iterator itAtributo = base.getListaAtributo().iterator();
		AtributoWrapper atributo = new AtributoWrapper();
		while (itAtributo.hasNext()) {
			atributo.setBase((AtributoI)itAtributo.next());
			if (saida.length()==1)
				saida += atributo.getNomeCampoTabela();
			else 
				saida += " , " + atributo.getNomeCampoTabela();
		}
		return saida + ")";
	}
	public String sqlConteudoInsert() {
		String saida = "(";
		Iterator itAtributo = base.getListaAtributo().iterator();
		AtributoWrapper atributo = new AtributoWrapper();
		while (itAtributo.hasNext()) {
			atributo.setBase((AtributoI)itAtributo.next());
			if (saida.length()==1)
				saida += " ? ";
			else 
				saida += " , ? ";
		}
		return saida + ")";
	}
	
	public String getNomeTabela() {
		return base.getEstereotipo1();
	}
	public AtributoWrapper getChaveAuto() {
		AtributoWrapper atributo = null;
		Iterator itAtributo = base.getListaAtributo().iterator();
		while (itAtributo.hasNext()) {
			AtributoI corrente = (AtributoI)itAtributo.next();
			if (corrente.ehChave()) {
				if (corrente.possuiEstereotipo("auto")) {
					atributo = new AtributoWrapper();
					atributo.setBase(corrente);
					break;
				}
			}
		}
		return atributo;
	}
	public boolean possuiChaveAuto() {
		return (getChaveAuto()!=null);
	}
	
	// Final Probid
	
	public String getNomeProjetoEjb() {
		return base.getNome() + "EJB";
	}
	
	public String getNomeRootWeb() {
		return base.getNome() + "Web";
	}
	public String getNomeProjetoWeb() {
		return base.getNome() + "WEB";
	}
	public String nomePacoteProjeto() {
		return getNome().substring(3).toLowerCase();
	}
	public String getPathDto(ConfiguracaoWrapper configuracoes) {
		String caminhoCompleto = configuracoes.getPathGeracaoClasses() +
		File.separator + getNomeProjetoEjb() + File.separator + getCaminhoBase() +
		File.separator + "dto";
		return caminhoCompleto;

	}
	public String getPacoteBase() {
		String pacote = "com." + 
		"br." + 
		"brasilcap." +
		"cap." + 
		"obl." + 
		nomePacoteProjeto();
		return pacote;
	}
	public String getCaminhoBase() {
		String caminho = "com" + File.separator +
		"br" + File.separator +
		"brasilcap" + File.separator +
		"cap" + File.separator +
		"obl" + File.separator +
		nomePacoteProjeto();
		return caminho;
	}
	
	public boolean possuiEstereotipo(String nomeEstereotipo) {
		return (base.getListaOperacaoPorEstereotipo(nomeEstereotipo).size()>0);
	}
	
	public ClasseWrapper(ClasseI item) {
		base = item;
	}
	
	public void setBase(ClasseI base) {
		this.base = base;
	}
	public ClasseI getBase() {
		return this.base;
	}
	
	public String getNome() {
		return base.getNome();
	}
	
	public String getNomeParaClasse() {
		return base.getNome().substring(3);
	}
	
	
	
	public String nomePacoteServlet() {
		return base.getNome();
	}
	public List listaOperacaoServlet() {
		List listaSaida = new LinkedList();
		Iterator iterador = base.getListaOperacaoPorEstereotipo("Servlet").iterator();
		while (iterador.hasNext()) {
			OperacaoI operacao = (OperacaoI) iterador.next();
			listaSaida.add(new OperacaoWrapper(operacao));
		}
		return listaSaida;
	}
}
