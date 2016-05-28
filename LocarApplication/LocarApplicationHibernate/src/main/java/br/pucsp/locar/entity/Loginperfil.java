package br.pucsp.locar.entity;
// Generated 28/05/2016 00:02:55 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Loginperfil generated by hbm2java
 */
@Entity
@Table(name = "loginperfil", catalog = "schema_locar")
public class Loginperfil implements java.io.Serializable {

	private LoginperfilId id;
	private Login login;
	private Tipoperfil tipoperfil;
	private BigDecimal mediaavaliacao;
	private Date dtinclusao;
	private Date dtalteracao;

	public Loginperfil() {
	}

	public Loginperfil(LoginperfilId id, Login login, Tipoperfil tipoperfil, Date dtinclusao) {
		this.id = id;
		this.login = login;
		this.tipoperfil = tipoperfil;
		this.dtinclusao = dtinclusao;
	}

	public Loginperfil(LoginperfilId id, Login login, Tipoperfil tipoperfil, BigDecimal mediaavaliacao, Date dtinclusao,
			Date dtalteracao) {
		this.id = id;
		this.login = login;
		this.tipoperfil = tipoperfil;
		this.mediaavaliacao = mediaavaliacao;
		this.dtinclusao = dtinclusao;
		this.dtalteracao = dtalteracao;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idLogin", column = @Column(name = "idLogin", nullable = false, length = 15)),
			@AttributeOverride(name = "codPerfil", column = @Column(name = "codPerfil", nullable = false)) })
	public LoginperfilId getId() {
		return this.id;
	}

	public void setId(LoginperfilId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLogin", nullable = false, insertable = false, updatable = false)
	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codPerfil", nullable = false, insertable = false, updatable = false)
	public Tipoperfil getTipoperfil() {
		return this.tipoperfil;
	}

	public void setTipoperfil(Tipoperfil tipoperfil) {
		this.tipoperfil = tipoperfil;
	}

	@Column(name = "mediaavaliacao", precision = 1, scale = 1)
	public BigDecimal getMediaavaliacao() {
		return this.mediaavaliacao;
	}

	public void setMediaavaliacao(BigDecimal mediaavaliacao) {
		this.mediaavaliacao = mediaavaliacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtinclusao", nullable = false, length = 19)
	public Date getDtinclusao() {
		return this.dtinclusao;
	}

	public void setDtinclusao(Date dtinclusao) {
		this.dtinclusao = dtinclusao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtalteracao", length = 19)
	public Date getDtalteracao() {
		return this.dtalteracao;
	}

	public void setDtalteracao(Date dtalteracao) {
		this.dtalteracao = dtalteracao;
	}

}
