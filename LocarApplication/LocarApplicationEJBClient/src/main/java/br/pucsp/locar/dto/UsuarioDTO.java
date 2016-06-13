package br.pucsp.locar.dto;

import java.io.Serializable;
import java.util.Date;

public class UsuarioDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1578424359389439784L;

	private long cpf;
	private long cnh;
	private String email;
	private String nome;
	private Date dtNasc;
	private String rg;
	private String orgaoemissor;

	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public long getCnh() {
		return cnh;
	}
	public void setCnh(long cnh) {
		this.cnh = cnh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getOrgaoemissor() {
		return orgaoemissor;
	}
	public void setOrgaoemissor(String orgaoemissor) {
		this.orgaoemissor = orgaoemissor;
	}
	
}
