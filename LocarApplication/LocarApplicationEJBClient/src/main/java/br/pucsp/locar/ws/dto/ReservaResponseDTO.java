package br.pucsp.locar.ws.dto;

import java.io.Serializable;

public class ReservaResponseDTO extends DefaultResponseDTO implements Serializable{

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
