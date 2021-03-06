package br.pucsp.locar.entity;
// Generated 28/05/2016 00:02:55 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Veiculo generated by hbm2java
 */
@Entity
@Table(name = "veiculo", catalog = "schema_locar", uniqueConstraints = { @UniqueConstraint(columnNames = "chassi"),
		@UniqueConstraint(columnNames = "renavam") })
public class Veiculo implements java.io.Serializable {

	private String placa;
	private Login login;
	private Modeloveiculo modeloveiculo;
	private long renavam;
	private String chassi;
	private int numPortas;
	private BigDecimal capacidadeTanque;
	private Set<Reserva> reservas = new HashSet<Reserva>(0);
	private Set<Disponibilidadeveiculo> disponibilidadeveiculos = new HashSet<Disponibilidadeveiculo>(0);

	public Veiculo() {
	}

	public Veiculo(String placa, Login login, Modeloveiculo modeloveiculo, long renavam, String chassi, int numPortas,
			BigDecimal capacidadeTanque) {
		this.placa = placa;
		this.login = login;
		this.modeloveiculo = modeloveiculo;
		this.renavam = renavam;
		this.chassi = chassi;
		this.numPortas = numPortas;
		this.capacidadeTanque = capacidadeTanque;
	}

	public Veiculo(String placa, Login login, Modeloveiculo modeloveiculo, long renavam, String chassi, int numPortas,
			BigDecimal capacidadeTanque, Set<Reserva> reservas, Set<Disponibilidadeveiculo> disponibilidadeveiculos) {
		this.placa = placa;
		this.login = login;
		this.modeloveiculo = modeloveiculo;
		this.renavam = renavam;
		this.chassi = chassi;
		this.numPortas = numPortas;
		this.capacidadeTanque = capacidadeTanque;
		this.reservas = reservas;
		this.disponibilidadeveiculos = disponibilidadeveiculos;
	}

	@Id

	@Column(name = "placa", unique = true, nullable = false, length = 10)
	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLocador", nullable = false)
	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codModelo", nullable = false)
	public Modeloveiculo getModeloveiculo() {
		return this.modeloveiculo;
	}

	public void setModeloveiculo(Modeloveiculo modeloveiculo) {
		this.modeloveiculo = modeloveiculo;
	}

	@Column(name = "renavam", unique = true, nullable = false, precision = 11, scale = 0)
	public long getRenavam() {
		return this.renavam;
	}

	public void setRenavam(long renavam) {
		this.renavam = renavam;
	}

	@Column(name = "chassi", unique = true, nullable = false, length = 17)
	public String getChassi() {
		return this.chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	@Column(name = "numPortas", nullable = false)
	public int getNumPortas() {
		return this.numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	@Column(name = "capacidadeTanque", nullable = false, precision = 3, scale = 1)
	public BigDecimal getCapacidadeTanque() {
		return this.capacidadeTanque;
	}

	public void setCapacidadeTanque(BigDecimal capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "veiculo")
	public Set<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "veiculo")
	public Set<Disponibilidadeveiculo> getDisponibilidadeveiculos() {
		return this.disponibilidadeveiculos;
	}

	public void setDisponibilidadeveiculos(Set<Disponibilidadeveiculo> disponibilidadeveiculos) {
		this.disponibilidadeveiculos = disponibilidadeveiculos;
	}

}
