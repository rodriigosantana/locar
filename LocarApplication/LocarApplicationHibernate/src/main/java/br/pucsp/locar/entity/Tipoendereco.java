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
 * Tipoendereco generated by hbm2java
 */
@Entity
@Table(name = "tipoendereco", catalog = "schema_locar")
public class Tipoendereco implements java.io.Serializable {

	private Integer codTipoEnd;
	private String descricao;
	private Set<Endereco> enderecos = new HashSet<Endereco>(0);

	public Tipoendereco() {
	}

	public Tipoendereco(String descricao) {
		this.descricao = descricao;
	}

	public Tipoendereco(String descricao, Set<Endereco> enderecos) {
		this.descricao = descricao;
		this.enderecos = enderecos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "codTipoEnd", unique = true, nullable = false)
	public Integer getCodTipoEnd() {
		return this.codTipoEnd;
	}

	public void setCodTipoEnd(Integer codTipoEnd) {
		this.codTipoEnd = codTipoEnd;
	}

	@Column(name = "descricao", nullable = false, length = 40)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoendereco")
	public Set<Endereco> getEnderecos() {
		return this.enderecos;
	}

	public void setEnderecos(Set<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

}
