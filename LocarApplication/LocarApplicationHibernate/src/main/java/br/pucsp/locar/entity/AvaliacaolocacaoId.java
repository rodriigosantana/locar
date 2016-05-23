package br.pucsp.locar.entity;
// Generated 15/05/2016 13:10:26 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AvaliacaolocacaoId generated by hbm2java
 */
@Embeddable
public class AvaliacaolocacaoId implements java.io.Serializable {

	private int idAvaliacao;
	private int idLocacao;
	private String idLogin;

	public AvaliacaolocacaoId() {
	}

	public AvaliacaolocacaoId(int idAvaliacao, int idLocacao, String idLogin) {
		this.idAvaliacao = idAvaliacao;
		this.idLocacao = idLocacao;
		this.idLogin = idLogin;
	}

	@Column(name = "idAvaliacao", nullable = false)
	public int getIdAvaliacao() {
		return this.idAvaliacao;
	}

	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	@Column(name = "idLocacao", nullable = false)
	public int getIdLocacao() {
		return this.idLocacao;
	}

	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}

	@Column(name = "idLogin", nullable = false, length = 15)
	public String getIdLogin() {
		return this.idLogin;
	}

	public void setIdLogin(String idLogin) {
		this.idLogin = idLogin;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AvaliacaolocacaoId))
			return false;
		AvaliacaolocacaoId castOther = (AvaliacaolocacaoId) other;

		return (this.getIdAvaliacao() == castOther.getIdAvaliacao())
				&& (this.getIdLocacao() == castOther.getIdLocacao())
				&& ((this.getIdLogin() == castOther.getIdLogin()) || (this.getIdLogin() != null
						&& castOther.getIdLogin() != null && this.getIdLogin().equals(castOther.getIdLogin())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdAvaliacao();
		result = 37 * result + this.getIdLocacao();
		result = 37 * result + (getIdLogin() == null ? 0 : this.getIdLogin().hashCode());
		return result;
	}

}
