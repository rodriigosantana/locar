package br.pucsp.locar.entity;
// Generated 15/05/2016 13:10:26 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Reserva generated by hbm2java
 */
@Entity
@Table(name = "reserva", catalog = "schema_locar")
public class Reserva implements java.io.Serializable {

	private Integer idReserva;
	private Login loginByIdEstacionamento;
	private Login loginByIdLocador;
	private Login loginByIdLocatario;
	private Statusreserva statusreserva;
	private Date dtinclusao;
	private Date dtalteracao;
	private String observacao;
	private Set<Locacao> locacaos = new HashSet<Locacao>(0);

	public Reserva() {
	}

	public Reserva(Login loginByIdLocador, Login loginByIdLocatario, Statusreserva statusreserva, Date dtinclusao) {
		this.loginByIdLocador = loginByIdLocador;
		this.loginByIdLocatario = loginByIdLocatario;
		this.statusreserva = statusreserva;
		this.dtinclusao = dtinclusao;
	}

	public Reserva(Login loginByIdEstacionamento, Login loginByIdLocador, Login loginByIdLocatario,
			Statusreserva statusreserva, Date dtinclusao, Date dtalteracao, String observacao, Set<Locacao> locacaos) {
		this.loginByIdEstacionamento = loginByIdEstacionamento;
		this.loginByIdLocador = loginByIdLocador;
		this.loginByIdLocatario = loginByIdLocatario;
		this.statusreserva = statusreserva;
		this.dtinclusao = dtinclusao;
		this.dtalteracao = dtalteracao;
		this.observacao = observacao;
		this.locacaos = locacaos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idReserva", unique = true, nullable = false)
	public Integer getIdReserva() {
		return this.idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEstacionamento")
	public Login getLoginByIdEstacionamento() {
		return this.loginByIdEstacionamento;
	}

	public void setLoginByIdEstacionamento(Login loginByIdEstacionamento) {
		this.loginByIdEstacionamento = loginByIdEstacionamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLocador", nullable = false)
	public Login getLoginByIdLocador() {
		return this.loginByIdLocador;
	}

	public void setLoginByIdLocador(Login loginByIdLocador) {
		this.loginByIdLocador = loginByIdLocador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLocatario", nullable = false)
	public Login getLoginByIdLocatario() {
		return this.loginByIdLocatario;
	}

	public void setLoginByIdLocatario(Login loginByIdLocatario) {
		this.loginByIdLocatario = loginByIdLocatario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status", nullable = false)
	public Statusreserva getStatusreserva() {
		return this.statusreserva;
	}

	public void setStatusreserva(Statusreserva statusreserva) {
		this.statusreserva = statusreserva;
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

	@Column(name = "observacao", length = 100)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva")
	public Set<Locacao> getLocacaos() {
		return this.locacaos;
	}

	public void setLocacaos(Set<Locacao> locacaos) {
		this.locacaos = locacaos;
	}

}
