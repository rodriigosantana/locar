package br.pucsp.locar.ws.dto;

import java.io.Serializable;

public class CadastroVeiculoResponseDTO extends DefaultResponseDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8873969209303005557L;
	
	private String placa;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
