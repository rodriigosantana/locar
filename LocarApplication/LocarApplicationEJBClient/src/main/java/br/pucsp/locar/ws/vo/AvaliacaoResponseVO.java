package br.pucsp.locar.ws.vo;

import java.io.Serializable;

public class AvaliacaoResponseVO extends DefaultResponseVO implements Serializable {

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
