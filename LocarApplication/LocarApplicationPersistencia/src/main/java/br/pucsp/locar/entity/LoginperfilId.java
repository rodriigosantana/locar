package br.pucsp.locar.entity;
// Generated 28/05/2016 00:02:55 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LoginperfilId generated by hbm2java
 */
@Embeddable
public class LoginperfilId implements java.io.Serializable {

	private String idLogin;
	private int codPerfil;

	public LoginperfilId() {
	}

	public LoginperfilId(String idLogin, int codPerfil) {
		this.idLogin = idLogin;
		this.codPerfil = codPerfil;
	}

	@Column(name = "idLogin", nullable = false, length = 15)
	public String getIdLogin() {
		return this.idLogin;
	}

	public void setIdLogin(String idLogin) {
		this.idLogin = idLogin;
	}

	@Column(name = "codPerfil", nullable = false)
	public int getCodPerfil() {
		return this.codPerfil;
	}

	public void setCodPerfil(int codPerfil) {
		this.codPerfil = codPerfil;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LoginperfilId))
			return false;
		LoginperfilId castOther = (LoginperfilId) other;

		return ((this.getIdLogin() == castOther.getIdLogin()) || (this.getIdLogin() != null
				&& castOther.getIdLogin() != null && this.getIdLogin().equals(castOther.getIdLogin())))
				&& (this.getCodPerfil() == castOther.getCodPerfil());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdLogin() == null ? 0 : this.getIdLogin().hashCode());
		result = 37 * result + this.getCodPerfil();
		return result;
	}

}
