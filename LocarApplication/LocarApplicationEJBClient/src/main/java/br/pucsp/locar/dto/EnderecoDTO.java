package br.pucsp.locar.dto;

import java.io.Serializable;

public class EnderecoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1226077702971282016L;
	
	private int codigoCidade;
	private int tipoEndereco;
	private String logradouro;
	private int numero;
	private String bairro;
	private String sigla;
	public int getCodigoCidade() {
		return codigoCidade;
	}
	public void setCodigoCidade(int codigoCidade) {
		this.codigoCidade = codigoCidade;
	}
	public int getTipoEndereco() {
		return tipoEndereco;
	}
	public void setTipoEndereco(int tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
