package br.pucsp.locar.dto;

import java.io.Serializable;

public class TelefoneDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6167240389985224489L;
	
	private int tipoTelefone;
	private int ddd;
	private int numero;
	
	public int getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(int tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
