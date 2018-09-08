
package com.br.brasilcap.cap.obl.OblTrataparametros.servlet;
import com.br.brasilcap.arq.glb.util.view.AbstractServletCT;
import com.br.brasilcap.arq.glb.util.standard.CatalogoGlobal;
import com.br.brasilcap.arq.glb.util.view.FormBean;

public class TrataparametrosCT extends  AbstractServletCT
{

private static final String CONTENT_TYPE = "text/html; charset=iso-8859-1";

public String getNomeModulo()
{
return CatalogoGlobal.CST_MODULO_OBRIGACAO_LEGAL;
}
	/**
     * @param fb
     * @return
     * @throws ViewException
     */
	public FormBean listaParametros(FormBean formBean)
	{
		formBean.setSaida("OblAutorizacaoparamCN.jsp");
		Cap_lista_parametros_sps dto = new Cap_lista_parametros_sps();

		final String CST_METODO = "listaParametros";
        log.setDebug(CatalogoGlobal.CST_MENSAGEM_METODOINI, CST_METODO); 
        
        OblTrataparametrosCN c = null;
        OblTrataparametrosCNHome home = null;
        RowSet rs =null;
        try {
            String nome = getNomeModulo();
            log.setDebug("Modulo:" + nome,CST_METODO);
            home = (OblTrataparametrosCNHome)FacadeHome.getEjbHome(getNomeModulo(),
                                                  "OblTrataparametrosCNHome",
                                                 OblTrataparametrosCNHome.class);
            cParametros = homeParametros.create();
            Cap_lista_parametros_sps dto = new Cap_lista_parametros_sps(fb.getParametros());
            //dto.setIdentificacao(fb.getParametro("identificacao"));
            //dto.checkError();
            
            rs =  cParametros.listaParametros(dto,fb.getCredencial());
            fb.setLista(rs);
            return fb;
        } 
        catch (Exception e){
            log.setFatal(e.getMessage(), CST_METODO); 
            throw new ViewException(e);
        }
	}
	/**
     * @param fb
     * @return
     * @throws ViewException
     */
	public FormBean insereParametro(FormBean formBean)
	{
		formBean.setSaida("OblAutorizacaoparamCN.jsp");
		Cap_insere_parametro_spi dto = new Cap_insere_parametro_spi();

		final String CST_METODO = "insereParametro";
        log.setDebug(CatalogoGlobal.CST_MENSAGEM_METODOINI, CST_METODO); 
        
        OblTrataparametrosCD c = null;
        OblTrataparametrosCDHome home = null;
        RowSet rs =null;
        try {
            String nome = getNomeModulo();
            log.setDebug("Modulo:" + nome,CST_METODO);
            home = (OblTrataparametrosCDHome)FacadeHome.getEjbHome(getNomeModulo(),
                                                  "OblTrataparametrosCDHome",
                                                 OblTrataparametrosCDHome.class);
            cParametros = homeParametros.create();
            Cap_insere_parametro_spi dto = new Cap_insere_parametro_spi(fb.getParametros());
            //dto.setIdentificacao(fb.getParametro("identificacao"));
            //dto.checkError();
            
            rs =  cParametros.listaParametros(dto,fb.getCredencial());
            fb.setLista(rs);
            return fb;
        } 
        catch (Exception e){
            log.setFatal(e.getMessage(), CST_METODO); 
            throw new ViewException(e);
        }
	}
	/**
     * @param fb
     * @return
     * @throws ViewException
     */
	public FormBean alteraParametro(FormBean formBean)
	{
		formBean.setSaida("OblAutorizacaoparamCN.jsp");
		Cap_altera_parametro_spu dto = new Cap_altera_parametro_spu();

		final String CST_METODO = "alteraParametro";
        log.setDebug(CatalogoGlobal.CST_MENSAGEM_METODOINI, CST_METODO); 
        
        OblTrataparametrosCD c = null;
        OblTrataparametrosCDHome home = null;
        RowSet rs =null;
        try {
            String nome = getNomeModulo();
            log.setDebug("Modulo:" + nome,CST_METODO);
            home = (OblTrataparametrosCDHome)FacadeHome.getEjbHome(getNomeModulo(),
                                                  "OblTrataparametrosCDHome",
                                                 OblTrataparametrosCDHome.class);
            cParametros = homeParametros.create();
            Cap_altera_parametro_spu dto = new Cap_altera_parametro_spu(fb.getParametros());
            //dto.setIdentificacao(fb.getParametro("identificacao"));
            //dto.checkError();
            
            rs =  cParametros.listaParametros(dto,fb.getCredencial());
            fb.setLista(rs);
            return fb;
        } 
        catch (Exception e){
            log.setFatal(e.getMessage(), CST_METODO); 
            throw new ViewException(e);
        }
	}
	/**
     * @param fb
     * @return
     * @throws ViewException
     */
	public FormBean listaObrigacoesLegal(FormBean formBean)
	{
		formBean.setSaida("OblAutorizacaoparamCN.jsp");
		Cap_lista_obrigacao_legal_sps dto = new Cap_lista_obrigacao_legal_sps();

		final String CST_METODO = "listaObrigacoesLegal";
        log.setDebug(CatalogoGlobal.CST_MENSAGEM_METODOINI, CST_METODO); 
        
        null c = null;
        nullHome home = null;
        RowSet rs =null;
        try {
            String nome = getNomeModulo();
            log.setDebug("Modulo:" + nome,CST_METODO);
            home = (nullHome)FacadeHome.getEjbHome(getNomeModulo(),
                                                  "nullHome",
                                                 nullHome.class);
            cParametros = homeParametros.create();
            Cap_lista_obrigacao_legal_sps dto = new Cap_lista_obrigacao_legal_sps(fb.getParametros());
            //dto.setIdentificacao(fb.getParametro("identificacao"));
            //dto.checkError();
            
            rs =  cParametros.listaParametros(dto,fb.getCredencial());
            fb.setLista(rs);
            return fb;
        } 
        catch (Exception e){
            log.setFatal(e.getMessage(), CST_METODO); 
            throw new ViewException(e);
        }
	}
	/**
     * @param fb
     * @return
     * @throws ViewException
     */
	public FormBean listaStatus(FormBean formBean)
	{
		formBean.setSaida("OblAutorizacaoparamCN.jsp");
		Cap_lista_status_sps dto = new Cap_lista_status_sps();

		final String CST_METODO = "listaStatus";
        log.setDebug(CatalogoGlobal.CST_MENSAGEM_METODOINI, CST_METODO); 
        
        null c = null;
        nullHome home = null;
        RowSet rs =null;
        try {
            String nome = getNomeModulo();
            log.setDebug("Modulo:" + nome,CST_METODO);
            home = (nullHome)FacadeHome.getEjbHome(getNomeModulo(),
                                                  "nullHome",
                                                 nullHome.class);
            cParametros = homeParametros.create();
            Cap_lista_status_sps dto = new Cap_lista_status_sps(fb.getParametros());
            //dto.setIdentificacao(fb.getParametro("identificacao"));
            //dto.checkError();
            
            rs =  cParametros.listaParametros(dto,fb.getCredencial());
            fb.setLista(rs);
            return fb;
        } 
        catch (Exception e){
            log.setFatal(e.getMessage(), CST_METODO); 
            throw new ViewException(e);
        }
	}
	/**
     * @param fb
     * @return
     * @throws ViewException
     */
	public FormBean retornaListaParametros(FormBean formBean)
	{
		formBean.setSaida("OblAutorizacaoparamCN.jsp");
		Cap_lista_status_sps dto = new Cap_lista_status_sps();

		final String CST_METODO = "retornaListaParametros";
        log.setDebug(CatalogoGlobal.CST_MENSAGEM_METODOINI, CST_METODO); 
        
        OblTrataparametrosCN c = null;
        OblTrataparametrosCNHome home = null;
        RowSet rs =null;
        try {
            String nome = getNomeModulo();
            log.setDebug("Modulo:" + nome,CST_METODO);
            home = (OblTrataparametrosCNHome)FacadeHome.getEjbHome(getNomeModulo(),
                                                  "OblTrataparametrosCNHome",
                                                 OblTrataparametrosCNHome.class);
            cParametros = homeParametros.create();
            Cap_lista_status_sps dto = new Cap_lista_status_sps(fb.getParametros());
            //dto.setIdentificacao(fb.getParametro("identificacao"));
            //dto.checkError();
            
            rs =  cParametros.listaParametros(dto,fb.getCredencial());
            fb.setLista(rs);
            return fb;
        } 
        catch (Exception e){
            log.setFatal(e.getMessage(), CST_METODO); 
            throw new ViewException(e);
        }
	}


}
