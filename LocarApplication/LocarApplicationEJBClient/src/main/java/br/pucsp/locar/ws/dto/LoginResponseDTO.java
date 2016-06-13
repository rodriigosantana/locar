package br.pucsp.locar.ws.dto;

import java.io.Serializable;

public class LoginResponseDTO extends DefaultResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -104383740780825660L;
	
	private boolean success;
	private String motivo;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
}
