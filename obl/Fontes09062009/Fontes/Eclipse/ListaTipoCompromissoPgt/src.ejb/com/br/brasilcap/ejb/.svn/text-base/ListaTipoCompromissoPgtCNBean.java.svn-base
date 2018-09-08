package com.br.brasilcap.ejb;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.sql.RowSet;

import com.br.brasilcap.arq.glb.log.standard.Log;
import com.br.brasilcap.arq.glb.persistencia.standard.Command;
import com.br.brasilcap.arq.glb.persistencia.standard.CommandFactory;
import com.br.brasilcap.arq.glb.persistencia.standard.ConcreteCommandFactory;
import com.br.brasilcap.arq.glb.util.standard.BusinessException;
import com.br.brasilcap.arq.glb.util.standard.CatalogoGlobal;
import com.br.brasilcap.dto.pgt_tipo_comp_pgt_sps;

public class ListaTipoCompromissoPgtCNBean implements SessionBean {
	private static SessionContext _context;
	private static Log log;
	private static final String jndi = CatalogoGlobal.CST_JNDI_INFOFIN;
	
	public void ejbCreate() {
		final String CST_METODO = "ejbCreate0";
		log = new Log(CatalogoGlobal.CST_MODULO_INFOFIN,ListaTipoCompromissoPgtCNBean.class);
		log.setInfo(CatalogoGlobal.CST_MENSAGEM_CRIAOBJ, CST_METODO);
	}

	public void setSessionContext(SessionContext context) throws EJBException {
		_context = context;
	}

	public void ejbRemove() throws EJBException {
		final String CST_METODO = "ejbRemove";
		log.setInfo(CatalogoGlobal.CST_MENSAGEM_CRIAOBJ, CST_METODO);
	}

	public void ejbActivate() throws EJBException {
		final String CST_METODO = "ejbActivate";
		log.setInfo(CatalogoGlobal.CST_MENSAGEM_CRIAOBJ, CST_METODO);
	}

	public void ejbPassivate() throws EJBException {
		final String CST_METODO = "ejbPassivate";
		log.setInfo(CatalogoGlobal.CST_MENSAGEM_CRIAOBJ, CST_METODO);
	}

	
	public String getNomeModulo() {
		return CatalogoGlobal.CST_MODULO_INFOFIN;
	}


	public RowSet execute(String credencial, pgt_tipo_comp_pgt_sps obj, String metodo) throws BusinessException {
		try {
            RowSet result = null;

            CommandFactory cmf = new ConcreteCommandFactory();
            Command comando = cmf.createSelectCommand();
            comando.setCredencial(credencial);
            comando.setJNDI(jndi);
            comando.setParam(obj);
            comando.setModulo(CatalogoGlobal.CST_MODULO_INFOFIN);
            comando.execute();
            
            result = (RowSet)comando.getResult();
            
            
            log.setInfo("Método Finalizado", metodo);
            return result;
        } catch (Exception e){
            log.setFatal(e.getMessage(), metodo); 
            throw new BusinessException(e);
        }
    }
		
	}

	

