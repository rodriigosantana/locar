package br.pucsp.locar.ws.vo;

import java.io.Serializable;

public class ReservaResponseVO extends DefaultResponseVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6723278781773952632L;

	private int numeroReserva;

	public int getNumeroReserva() {
		return numeroReserva;
	}

	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}
	
}
