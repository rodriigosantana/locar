package br.pucsp.locar.ws.dto;

import java.io.Serializable;

public class AvaliacaoResponseDTO extends DefaultResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1197097220062827408L;
	
	private int totalInclusoes;

	public int getTotalInclusoes() {
		return totalInclusoes;
	}

	public void setTotalInclusoes(int totalInclusoes) {
		this.totalInclusoes = totalInclusoes;
	}
	
}
