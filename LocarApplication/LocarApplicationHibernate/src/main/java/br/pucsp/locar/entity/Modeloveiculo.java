package br.pucsp.locar.entity;
// Generated 15/05/2016 13:10:26 by Hibernate Tools 4.3.1.Final

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

/**
 * Modeloveiculo generated by hbm2java
 */
@Entity
@Table(name = "modeloveiculo", catalog = "schema_locar")
public class Modeloveiculo implements java.io.Serializable {

	private Integer codModelo;
	private Montadoraveiculo montadoraveiculo;
	private Tipoveiculo tipoveiculo;
	private String descricao;
	private Set<Veiculo> veiculos = new HashSet<Veiculo>(0);

	public Modeloveiculo() {
	}

	public Modeloveiculo(Montadoraveiculo montadoraveiculo, Tipoveiculo tipoveiculo, String descricao) {
		this.montadoraveiculo = montadoraveiculo;
		this.tipoveiculo = tipoveiculo;
		this.descricao = descricao;
	}

	public Modeloveiculo(Montadoraveiculo montadoraveiculo, Tipoveiculo tipoveiculo, String descricao,
			Set<Veiculo> veiculos) {
		this.montadoraveiculo = montadoraveiculo;
		this.tipoveiculo = tipoveiculo;
		this.descricao = descricao;
		this.veiculos = veiculos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "codModelo", unique = true, nullable = false)
	public Integer getCodModelo() {
		return this.codModelo;
	}

	public void setCodModelo(Integer codModelo) {
		this.codModelo = codModelo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codMontadora", nullable = false)
	public Montadoraveiculo getMontadoraveiculo() {
		return this.montadoraveiculo;
	}

	public void setMontadoraveiculo(Montadoraveiculo montadoraveiculo) {
		this.montadoraveiculo = montadoraveiculo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codTipoVeiculo", nullable = false)
	public Tipoveiculo getTipoveiculo() {
		return this.tipoveiculo;
	}

	public void setTipoveiculo(Tipoveiculo tipoveiculo) {
		this.tipoveiculo = tipoveiculo;
	}

	@Column(name = "descricao", nullable = false, length = 30)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modeloveiculo")
	public Set<Veiculo> getVeiculos() {
		return this.veiculos;
	}

	public void setVeiculos(Set<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

}
