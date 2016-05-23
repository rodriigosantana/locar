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
 * Locacao generated by hbm2java
 */
@Entity
@Table(name = "locacao", catalog = "schema_locar")
public class Locacao implements java.io.Serializable {

	private Integer idLocacao;
	private Reserva reserva;
	private Date dtinicio;
	private Date dtfinal;
	private Set<Avaliacaolocacao> avaliacaolocacaos = new HashSet<Avaliacaolocacao>(0);

	public Locacao() {
	}

	public Locacao(Reserva reserva, Date dtinicio) {
		this.reserva = reserva;
		this.dtinicio = dtinicio;
	}

	public Locacao(Reserva reserva, Date dtinicio, Date dtfinal, Set<Avaliacaolocacao> avaliacaolocacaos) {
		this.reserva = reserva;
		this.dtinicio = dtinicio;
		this.dtfinal = dtfinal;
		this.avaliacaolocacaos = avaliacaolocacaos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idLocacao", unique = true, nullable = false)
	public Integer getIdLocacao() {
		return this.idLocacao;
	}

	public void setIdLocacao(Integer idLocacao) {
		this.idLocacao = idLocacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idReserva", nullable = false)
	public Reserva getReserva() {
		return this.reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtinicio", nullable = false, length = 19)
	public Date getDtinicio() {
		return this.dtinicio;
	}

	public void setDtinicio(Date dtinicio) {
		this.dtinicio = dtinicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtfinal", length = 19)
	public Date getDtfinal() {
		return this.dtfinal;
	}

	public void setDtfinal(Date dtfinal) {
		this.dtfinal = dtfinal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locacao")
	public Set<Avaliacaolocacao> getAvaliacaolocacaos() {
		return this.avaliacaolocacaos;
	}

	public void setAvaliacaolocacaos(Set<Avaliacaolocacao> avaliacaolocacaos) {
		this.avaliacaolocacaos = avaliacaolocacaos;
	}

}
