package br.pucsp.locar.ws.dto;

import java.io.Serializable;

public class ConsultaVeiculoRequestDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5651134453393471217L;

	private String codigoLocador;

	public String getCodigoLocador() {
		return codigoLocador;
	}

	public void setCodigoLocador(String codigoLocador) {
		this.codigoLocador = codigoLocador;
	}
	
}
