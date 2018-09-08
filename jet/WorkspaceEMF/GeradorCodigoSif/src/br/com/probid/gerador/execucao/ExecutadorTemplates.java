package br.com.probid.gerador.execucao;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import br.com.probid.gerador.app.ArquivoGerador;
import br.com.probid.gerador.app.Configuracao;
import br.com.probid.gerador.execucao.wrappers.ClasseWrapper;
import br.com.probid.gerador.execucao.wrappers.ConfiguracaoWrapper;
import br.com.probid.gerador.execucao.wrappers.FabricaWrapper;
import br.com.probid.gerador.execucao.wrappers.RecursosClasse;
import br.com.probid.gerador.interfaces.AplicacaoI;
import br.com.probid.gerador.interfaces.ClasseI;

import compiledtemplates.Bean;
import compiledtemplates.BeanBase;
import compiledtemplates.Business;
import compiledtemplates.BusinessBase;
import compiledtemplates.Dao;
import compiledtemplates.DaoBase;
import compiledtemplates.FabricaBean;
import compiledtemplates.Form;
import compiledtemplates.ServiceLocator;



public class ExecutadorTemplates {
	
	
	public void executaGeracao(AplicacaoI aplicacao, Configuracao configuracoes) {
		System.out.println("Vai executar templates");
		Iterator itClasses = aplicacao.getListaClasse().iterator();
		
		ClasseWrapper classeW = null;
		ConfiguracaoWrapper confW = new ConfiguracaoWrapper(configuracoes);
		RecursosClasse recursos = new RecursosClasse();
		recursos.setConfiguracao(confW);
		recursos.setListaClasse(aplicacao.getListaClasse());
		
		try {

			criaServiceLocator(aplicacao.getListaClasse(),recursos);
			criaFabricaBean(aplicacao.getListaClasse(),recursos);
			
			while (itClasses.hasNext()) {
			
				ClasseI classe = (ClasseI) itClasses.next();
				classeW = FabricaWrapper.criaClasse(classe);
				recursos.setClasse(classeW);
				
				criaBusinessBase(classeW,recursos);
				criaBusiness(classeW,recursos);
				criaDaoBase(classeW,recursos);
				criaDao(classeW,recursos);
				criaBeanBase(classeW,recursos);
				criaBean(classeW,recursos);
				criaForm(classeW,recursos);
			
				List listaAction = classe.getListaOperacaoPorEstereotipo("user");
				
				
				//if (classe.possuiEstereotipo("Funcionalidade")) {
					//ClasseFuncionalidade classeFunc = (ClasseFuncionalidade) classeW;
					//this.criaServlet(classeFunc,recursos);
					//this.criaDeployWeb(classeFunc, recursos);
					//this.criaWebXml(classeFunc, recursos);
					//this.criaProjetoWebJpr(classeFunc, recursos);
					
					//this.criaEjb(classeFunc,recursos);
					//this.criaDeployEjb(classeFunc,recursos);
					//this.criaProjetoEjbJpr(classeFunc, recursos);
				//}
				
			}
		} catch (IOException e) {
			System.out.println("Erro com o arquivo" + e.getMessage());
		}
	}
	
	private void criaBusinessBase(ClasseWrapper classe,  RecursosClasse recursos) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setCaminhoArquivo(classe.getPathBusinessBase(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("busBase" + classe.getNomeBasico() + ".java");
		arquivo.setConteudoArquivo(BusinessBase.create("\n").generate(recursos));
		arquivo.criaCaminho();
		arquivo.salvaAquivo();
	}
	private void criaBusiness(ClasseWrapper classe,  RecursosClasse recursos) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setCaminhoArquivo(classe.getPathBusiness(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("bus" + classe.getNomeBasico() + ".java");
		if (!arquivo.existe()) {
			arquivo.setConteudoArquivo(Business.create("\n").generate(recursos));
			arquivo.criaCaminho();
			arquivo.salvaAquivo();
		}
	}
	private void criaDaoBase(ClasseWrapper classe,  RecursosClasse recursos) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setCaminhoArquivo(classe.getPathDaoBase(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("daoBase" + classe.getNomeBasico() + ".java");
		arquivo.setConteudoArquivo(DaoBase.create("\n").generate(recursos));
		arquivo.criaCaminho();
		arquivo.salvaAquivo();
	}
	private void criaDao(ClasseWrapper classe,  RecursosClasse recursos) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setCaminhoArquivo(classe.getPathDao(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("dao" + classe.getNomeBasico() + ".java");
		if (!arquivo.existe()) {
			arquivo.setConteudoArquivo(Dao.create("\n").generate(recursos));
			arquivo.criaCaminho();
			arquivo.salvaAquivo();
		}
	}
	private void criaServiceLocator(List classes, RecursosClasse recursos) throws IOException {
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setConteudoArquivo(ServiceLocator.create("\n").generate(recursos));
		arquivo.setCaminhoArquivo(ClasseWrapper.getPathBusiness(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("ServiceLocator.java");
		arquivo.salvaAquivo();
	}
	private void criaFabricaBean(List classes, RecursosClasse recursos) throws IOException {
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setConteudoArquivo(FabricaBean.create("\n").generate(recursos));
		arquivo.setCaminhoArquivo(ClasseWrapper.getPathBeanBase(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("FabricaBean.java");
		arquivo.salvaAquivo();
	}
	private void criaBean(ClasseWrapper classe,  RecursosClasse recursos) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setCaminhoArquivo(classe.getPathBean(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("bean" + classe.getNomeBasico() + ".java");
		if (!arquivo.existe()) {
			arquivo.setConteudoArquivo(Bean.create("\n").generate(recursos));
			arquivo.criaCaminho();
			arquivo.salvaAquivo();
		}
	}
	private void criaBeanBase(ClasseWrapper classe,  RecursosClasse recursos) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setCaminhoArquivo(classe.getPathBeanBase(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("beanBase" + classe.getNomeBasico() + ".java");
		arquivo.setConteudoArquivo(BeanBase.create("\n").generate(recursos));
		arquivo.criaCaminho();
		arquivo.salvaAquivo();
	}
	private void criaForm(ClasseWrapper classe,  RecursosClasse recursos) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setCaminhoArquivo(classe.getPathForm(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("form" + classe.getNomeBasico() + ".java");
		if (!arquivo.existe()) {
			arquivo.setConteudoArquivo(Form.create("\n").generate(recursos));
			arquivo.criaCaminho();
			arquivo.salvaAquivo();
		}
	}
	/*
	private void criaServlet(ClasseFuncionalidade classe, RecursosClasse recursos ) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setConteudoArquivo(ServletCT.create("\n").generate(recursos));
		arquivo.setCaminhoArquivo(classe.getPathServletCT(recursos.getConfiguracao()));
		arquivo.setNomeArquivo(classe.getNomeParaClasse() + "CT.java");
		arquivo.criaCaminho();
		arquivo.salvaAquivo();
	}
	private void criaDeployWeb(ClasseFuncionalidade classe, RecursosClasse recursos ) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setConteudoArquivo(DeployWeb.create("\n").generate(recursos));
		arquivo.setCaminhoArquivo(classe.getPathDeployWeb(recursos.getConfiguracao()));
		arquivo.setNomeArquivo(classe.getNome() + ".deploy");
		arquivo.criaCaminho();
		arquivo.salvaAquivo();
	}
	
	private void criaProjetoWebJpr(ClasseFuncionalidade classe, RecursosClasse recursos ) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setConteudoArquivo(ProjetoWebJpr.create("\n").generate(recursos));
		arquivo.setCaminhoArquivo(classe.getPathProjetoWebJpr(recursos.getConfiguracao()));
		arquivo.setNomeArquivo(classe.getNomeProjetoWeb() + ".jpr");
		arquivo.criaCaminho();
		arquivo.salvaAquivo();
	}
	
	private void criaProjetoEjbJpr(ClasseFuncionalidade classe, RecursosClasse recursos ) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setConteudoArquivo(ProjetoEjbJpr.create("\n").generate(recursos));
		arquivo.setCaminhoArquivo(classe.getPathProjetoEjbJpr(recursos.getConfiguracao()));
		arquivo.setNomeArquivo(classe.getNomeProjetoEjb() + ".jpr");
		arquivo.criaCaminho();
		arquivo.salvaAquivo();
	}
	
	private void criaWebXml(ClasseFuncionalidade classe, RecursosClasse recursos ) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setConteudoArquivo(WebXml.create("\n").generate(recursos));
		arquivo.setCaminhoArquivo(classe.getPathWebXml(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("web.xml");
		arquivo.criaCaminho();
		arquivo.salvaAquivo();
	}
	
	// EJBs
	
	private void criaEjb(ClasseFuncionalidade classe, RecursosClasse recursos ) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		
		arquivo.setConteudoArquivo(EjbJarXml.create("\n").generate(recursos));
		arquivo.setCaminhoArquivo(classe.getPathXmlEjb(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("ejb-jar.xml");
		arquivo.criaCaminho();
		arquivo.salvaAquivo();

		arquivo.setConteudoArquivo(EjbOrionXml.create("\n").generate(recursos));
		arquivo.setCaminhoArquivo(classe.getPathXmlEjb(recursos.getConfiguracao()));
		arquivo.setNomeArquivo("orion-ejb-jar.xml");
		arquivo.criaCaminho();
		arquivo.salvaAquivo();

		
		if (classe.possuiEstereotipo("CN")) {
			arquivo.setConteudoArquivo(EjbCN.create("\n").generate(recursos));
			arquivo.setCaminhoArquivo(classe.getPathEjb(recursos.getConfiguracao()));
			arquivo.setNomeArquivo(classe.getNomeParaClasse() + "CN.java");
			arquivo.criaCaminho();
			arquivo.salvaAquivo();
			
			arquivo.setConteudoArquivo(EjbCNBean.create("\n").generate(recursos));
			arquivo.setCaminhoArquivo(classe.getPathEjb(recursos.getConfiguracao()));
			arquivo.setNomeArquivo(classe.getNomeParaClasse() + "CNBean.java");
			arquivo.criaCaminho();
			arquivo.salvaAquivo();
			
			arquivo.setConteudoArquivo(EjbCNHome.create("\n").generate(recursos));
			arquivo.setCaminhoArquivo(classe.getPathEjb(recursos.getConfiguracao()));
			arquivo.setNomeArquivo(classe.getNomeParaClasse() + "CNHome.java");
			arquivo.criaCaminho();
			arquivo.salvaAquivo();
			
		}
		if (classe.possuiEstereotipo("CD")) {
			arquivo.setConteudoArquivo(EjbCD.create("\n").generate(recursos));
			arquivo.setCaminhoArquivo(classe.getPathEjb(recursos.getConfiguracao()));
			arquivo.setNomeArquivo(classe.getNomeParaClasse() + "CD.java");
			arquivo.criaCaminho();
			arquivo.salvaAquivo();
			
			arquivo.setConteudoArquivo(EjbCDBean.create("\n").generate(recursos));
			arquivo.setCaminhoArquivo(classe.getPathEjb(recursos.getConfiguracao()));
			arquivo.setNomeArquivo(classe.getNomeParaClasse() + "CDBean.java");
			arquivo.criaCaminho();
			arquivo.salvaAquivo();
			
			arquivo.setConteudoArquivo(EjbCDHome.create("\n").generate(recursos));
			arquivo.setCaminhoArquivo(classe.getPathEjb(recursos.getConfiguracao()));
			arquivo.setNomeArquivo(classe.getNomeParaClasse() + "CDHome.java");
			arquivo.criaCaminho();
			arquivo.salvaAquivo();
		}
		
		
	}
	
	private void criaDeployEjb(ClasseFuncionalidade classe, RecursosClasse recursos ) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setConteudoArquivo(WebXml.create("\n").generate(recursos));
		arquivo.setCaminhoArquivo(classe.getPathDeployEjb(recursos.getConfiguracao()));
		arquivo.setNomeArquivo(classe.getNome() + ".deploy");
		arquivo.criaCaminho();
		arquivo.salvaAquivo();
	}
	
	private void criaDto(ClasseWrapper classe, RecursosClasse recursos ) throws IOException{
		ArquivoGerador arquivo = new ArquivoGerador();
		arquivo.setConteudoArquivo(Dto.create("\n").generate(recursos));
		arquivo.setCaminhoArquivo(classe.getPathDto(recursos.getConfiguracao()));
		arquivo.setNomeArquivo(classe.getNome()+ ".java");
		arquivo.criaCaminho();
		arquivo.salvaAquivo();
	}
	*/
	
}
