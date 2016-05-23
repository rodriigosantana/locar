package br.pucsp.locar.ws.vo;

import java.io.Serializable;

public class DefaultResponseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 403178990481149249L;
	
	private int codigoRetorno;
	private String mensagemRetorno;
	
	public int getCodigoRetorno() {
		return codigoRetorno;
	}
	public void setCodigoRetorno(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	public String getMensagemRetorno() {
		return mensagemRetorno;
	}
	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
	
}
