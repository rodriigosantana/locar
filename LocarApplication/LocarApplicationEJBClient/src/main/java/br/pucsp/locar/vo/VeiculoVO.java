package br.pucsp.locar.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class VeiculoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1443689040007849094L;
	
	private String placa;
	private long renavam;
	private String chassi;
	private int numPortas;
	private BigDecimal capacidadeTanque;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public long getRenavam() {
		return renavam;
	}
	public void setRenavam(long renavam) {
		this.renavam = renavam;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public BigDecimal getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(BigDecimal capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

}
