package com.br.brasilcap.cap.obl.autorizacaoresponsavel.servlet;
import com.br.brasilcap.arq.glb.util.view.AbstractServletCT;
import com.br.brasilcap.arq.glb.util.standard.CatalogoGlobal;
import com.br.brasilcap.arq.glb.util.view.FormBean;

public class AutorizacaoresponsavelCT extends  AbstractServletCT
{

private static final String CONTENT_TYPE = "text/html; charset=iso-8859-1";

public String getNomeModulo()
{
return CatalogoGlobal.CST_MODULO_OBRIGACAO_LEGAL;
}

public FormBean getPaginaInicial(FormBean formBean)
{
formBean.setSaida("OblAutorizacaoresponsavelCN.jsp");
return formBean;
}
}
