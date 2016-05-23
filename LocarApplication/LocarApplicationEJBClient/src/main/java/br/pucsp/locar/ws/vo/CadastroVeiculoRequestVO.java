package br.pucsp.locar.ws.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class CadastroVeiculoRequestVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5357141611656937018L;
	
	private String placa;
	private int modeloVeiculo;
	private String codigoLocador;
	private long renavam;
	private String chassi;
	private int numeroPortas;
	private BigDecimal capacidadeTanqueCombustivel;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getModeloVeiculo() {
		return modeloVeiculo;
	}
	public void setModeloVeiculo(int modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	public String getCodigoLocador() {
		return codigoLocador;
	}
	public void setCodigoLocador(String codigoLocador) {
		this.codigoLocador = codigoLocador;
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
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public BigDecimal getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}
	public void setCapacidadeTanqueCombustivel(BigDecimal capacidadeTanqueCombustivel) {
		this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
	}
	
}
