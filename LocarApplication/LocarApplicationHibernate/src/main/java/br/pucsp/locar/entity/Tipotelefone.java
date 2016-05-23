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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tipotelefone generated by hbm2java
 */
@Entity
@Table(name = "tipotelefone", catalog = "schema_locar")
public class Tipotelefone implements java.io.Serializable {

	private Integer codTipoTel;
	private String descricao;
	private Set<Telefone> telefones = new HashSet<Telefone>(0);

	public Tipotelefone() {
	}

	public Tipotelefone(String descricao) {
		this.descricao = descricao;
	}

	public Tipotelefone(String descricao, Set<Telefone> telefones) {
		this.descricao = descricao;
		this.telefones = telefones;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "codTipoTel", unique = true, nullable = false)
	public Integer getCodTipoTel() {
		return this.codTipoTel;
	}

	public void setCodTipoTel(Integer codTipoTel) {
		this.codTipoTel = codTipoTel;
	}

	@Column(name = "descricao", nullable = false, length = 40)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipotelefone")
	public Set<Telefone> getTelefones() {
		return this.telefones;
	}

	public void setTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}

}