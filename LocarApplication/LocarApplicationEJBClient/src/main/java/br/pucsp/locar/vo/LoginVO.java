package br.pucsp.locar.vo;

import java.io.Serializable;

public class LoginVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2852459418561115920L;
	private String codigoLogin;
	private String senha;
	
	public String getCodigoLogin() {
		return codigoLogin;
	}
	public void setCodigoLogin(String codigoLogin) {
		this.codigoLogin = codigoLogin;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
