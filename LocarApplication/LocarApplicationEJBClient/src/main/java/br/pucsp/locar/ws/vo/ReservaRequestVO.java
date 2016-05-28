package br.pucsp.locar.ws.vo;

import java.io.Serializable;

public class ReservaRequestVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2257585720468199099L;
	
	private String codigoLocatario;
	private String placa;
	private String codigoEstacionamento;
	private String dataRetirada;
	private String dataDevolucao;
	private String observacao;
	
	public String getCodigoLocatario() {
		return codigoLocatario;
	}
	public void setCodigoLocatario(String codigoLocatario) {
		this.codigoLocatario = codigoLocatario;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCodigoEstacionamento() {
		return codigoEstacionamento;
	}
	public void setCodigoEstacionamento(String codigoEstacionamento) {
		this.codigoEstacionamento = codigoEstacionamento;
	}
	public String getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(String dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
