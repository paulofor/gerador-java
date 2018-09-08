package br.com.providerit.gerador.app;

import java.io.IOException;
import java.util.Iterator;

import util.wrappers.ClasseFuncionalidade;
import util.wrappers.ClasseWrapper;
import util.wrappers.ConfiguracaoWrapper;
import util.wrappers.FabricaWrapper;
import util.wrappers.RecursosClasse;
import br.com.providerit.gerador.interfaces.AplicacaoI;
import br.com.providerit.gerador.interfaces.ClasseI;

import compiledtemplates.DeployWeb;
import compiledtemplates.Dto;
import compiledtemplates.EjbCD;
import compiledtemplates.EjbCDBean;
import compiledtemplates.EjbCDHome;
import compiledtemplates.EjbCN;
import compiledtemplates.EjbCNBean;
import compiledtemplates.EjbCNHome;
import compiledtemplates.EjbJarXml;
import compiledtemplates.EjbOrionXml;
import compiledtemplates.ProjetoEjbJpr;
import compiledtemplates.ProjetoWebJpr;
import compiledtemplates.ServletCT;
import compiledtemplates.WebXml;

public class ExecutadorTemplates {
	
	
	public void executaGeracao(AplicacaoI aplicacao, Configuracao configuracoes) {
		System.out.println("Vai executar templates");
		Iterator itClasses = aplicacao.getListaClasse().iterator();
		
		ClasseWrapper classeW = null;
		ConfiguracaoWrapper confW = new ConfiguracaoWrapper(configuracoes);
		RecursosClasse recursos = new RecursosClasse();
		recursos.setConfiguracao(confW);
		
		
		while (itClasses.hasNext()) {
			
			ClasseI classe = (ClasseI) itClasses.next();
			classeW = FabricaWrapper.criaClasse(classe);
			recursos.setClasse(classeW);
			try {
			
				if (classe.possuiEstereotipo("Funcionalidade")) {
					ClasseFuncionalidade classeFunc = (ClasseFuncionalidade) classeW;
					this.criaServlet(classeFunc,recursos);
					this.criaDeployWeb(classeFunc, recursos);
					this.criaWebXml(classeFunc, recursos);
					this.criaProjetoWebJpr(classeFunc, recursos);
					
					this.criaEjb(classeFunc,recursos);
					this.criaDeployEjb(classeFunc,recursos);
					this.criaProjetoEjbJpr(classeFunc, recursos);
				}
				
			}
			catch (IOException e) {
				System.out.println("Erro com o arquivo" + e.getMessage());
			}

		}
	}
	
	
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
	
}
