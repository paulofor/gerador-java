package com.br.brasilcap.dto;

import java.util.Map;

import com.br.brasilcap.arq.glb.persistencia.standard.AbstractDTO;
import com.br.brasilcap.arq.glb.util.standard.BusinessException;

public class pgt_tipo_comp_pgt_sps extends AbstractDTO {

	

	public pgt_tipo_comp_pgt_sps(Map parametros) throws BusinessException {
		super(parametros);

	}

	public pgt_tipo_comp_pgt_sps() throws BusinessException {
		super(null);

	}


	public String getPrimeiroParametro() {

		return "";
	}

}
