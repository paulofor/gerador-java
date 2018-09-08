package br.com.digicom.ws;



import gerapp.app.GeradorArquivosAndroid;
import gerapp.app.GeradorArquivosAndroid2;
import gerapp.app.GeradorArquivosBase;
import gerapp.app.GeradorArquivosCpp;
import gerapp.app.GeradorArquivosCs;
import gerapp.app.GeradorArquivosCsDN35;
import gerapp.app.GeradorArquivosCsMySQL;
import gerapp.app.GeradorArquivosJavaParser;
import gerapp.modelo.Aplicacao;
import gerapp.modelo.FabricaVo;
import gerapp.regracolecao.EntidadeRegraColecao;
import gerapp.regracolecao.FabricaRegra;
import gerapp.regracolecao.filtro.EntidadeFiltro;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.digicom.lib.dao.DaoException;


@WebService()
@Stateless() // Isso aqui faz com que a classe se torne um ejb para o servidor
// Se gerar problemas na compilacao, olhar no ant onde ele esta buscando
// os pacotes do j2ee
public class PrincipalFacade {

	
	public List getListaEntidade(Aplicacao aplicacao) throws DaoException{
		EntidadeRegraColecao entidadeRC = FabricaRegra.getInstancia().getEntidadeRegraColecao();
		List listaSaida = null;
		EntidadeFiltro filtro = entidadeRC.getFiltro();
		filtro.setCodigoAplicacao(aplicacao.getIdAplicacao());
		listaSaida = entidadeRC.ListaCorrente();
		return listaSaida;
	}
	
	@WebMethod(operationName = "geraTemplatesJava")
	public void geraTemplatesJava(@WebParam(name = "idAplicacao") String idAplicacao) {
		System.out.println("Gera Template Java Id:" + idAplicacao);
		PrincipalFacade facade = new PrincipalFacade();
		Aplicacao aplicacao = FabricaVo.criaAplicacao();
		aplicacao.setIdAplicacao(Long.parseLong(idAplicacao));
		GeradorArquivosJavaParser gerador = new GeradorArquivosJavaParser();
		try {
			gerador.setAplicacao(aplicacao);
			gerador.criaArquivos();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	} 
	
	@WebMethod(operationName = "geraTemplatesAndroid")
	public void geraTemplatesAndroid(@WebParam(name = "idAplicacao") String idAplicacao) {
		System.out.println("Gera Template Android Id:" + idAplicacao);
		PrincipalFacade facade = new PrincipalFacade();
		Aplicacao aplicacao = FabricaVo.criaAplicacao();
		aplicacao.setIdAplicacao(Long.parseLong(idAplicacao));
		GeradorArquivosBase gerador = new GeradorArquivosAndroid();
		try {
			gerador.setAplicacao(aplicacao);
			gerador.criaArquivos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	@WebMethod(operationName = "geraTemplatesAndroid2")
	public void geraTemplatesAndroid2(@WebParam(name = "idAplicacao") String idAplicacao) {
		System.out.println("Gera Template Android2 Id:" + idAplicacao);
		PrincipalFacade facade = new PrincipalFacade();
		Aplicacao aplicacao = FabricaVo.criaAplicacao();
		aplicacao.setIdAplicacao(Long.parseLong(idAplicacao));
		GeradorArquivosBase gerador = new GeradorArquivosAndroid2();
		try {
			gerador.setAplicacao(aplicacao);
			gerador.criaArquivos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	@WebMethod(operationName = "geraScriptSql")
	public void geraScriptSql(@WebParam(name = "idAplicacao") String idAplicacao) {
		System.out.println("Gera Script SQL Id:" + idAplicacao);
		PrincipalFacade facade = new PrincipalFacade();
		Aplicacao aplicacao = FabricaVo.criaAplicacao();
		aplicacao.setIdAplicacao(Long.parseLong(idAplicacao));
		GeradorArquivosBase gerador = new GeradorArquivosCsMySQL();
		try {
			gerador.setAplicacao(aplicacao);
			gerador.criaArquivos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	@WebMethod(operationName = "geraTemplatesCs")
	public void geraTemplatesCs(@WebParam(name = "idAplicacao") String idAplicacao) {
		System.out.println("Gera Template Cs Id:" + idAplicacao);
		PrincipalFacade facade = new PrincipalFacade();
		Aplicacao aplicacao = FabricaVo.criaAplicacao();
		aplicacao.setIdAplicacao(Long.parseLong(idAplicacao));
		GeradorArquivosBase gerador = new GeradorArquivosCs();
		try {
			gerador.setAplicacao(aplicacao);
			gerador.criaArquivos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	@WebMethod(operationName = "geraTemplatesCpp")
	public void geraTemplatesCpp(@WebParam(name = "idAplicacao") String idAplicacao) {
		System.out.println("Gera Template Cpp Id:" + idAplicacao);
		PrincipalFacade facade = new PrincipalFacade();
		Aplicacao aplicacao = FabricaVo.criaAplicacao();
		aplicacao.setIdAplicacao(Long.parseLong(idAplicacao));
		GeradorArquivosBase gerador = new GeradorArquivosCpp();
		try {
			gerador.setAplicacao(aplicacao);
			gerador.criaArquivos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	
	@WebMethod(operationName = "geraTemplatesFlex")
	public void geraTemplatesFlex(@WebParam(name = "idAplicacao") String idAplicacao) {
		System.out.println("Gera Template Java Id:" + idAplicacao);
	} 
	
	
	@WebMethod(operationName = "geraCoreCsDN35")
	public void geraCoreCsDN35(@WebParam(name = "idAplicacao") String idAplicacao) {
		System.out.println("geraCoreCsDN35 Id:" + idAplicacao);
		PrincipalFacade facade = new PrincipalFacade();
		Aplicacao aplicacao = FabricaVo.criaAplicacao();
		aplicacao.setIdAplicacao(Long.parseLong(idAplicacao));
		GeradorArquivosCsDN35 gerador = new GeradorArquivosCsDN35();
		try {
			gerador.setAplicacao(aplicacao);
			gerador.criaArquivos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	@WebMethod(operationName = "geraCoreJava")
	public void geraCoreJava(@WebParam(name = "idAplicacao") String idAplicacao) {
		System.out.println("geraCoreJava Id:" + idAplicacao);
	} 
}
