package br.pucsp.locar.vo;

import java.io.Serializable;

public class LoginVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2852459418561115920L;
	private String idLogin;
	private String senha;
	
	public String getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(String idLogin) {
		this.idLogin = idLogin;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
