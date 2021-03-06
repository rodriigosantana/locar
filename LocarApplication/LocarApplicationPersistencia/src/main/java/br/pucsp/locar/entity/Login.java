package br.pucsp.locar.entity;
// Generated 28/05/2016 00:02:55 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Login generated by hbm2java
 */
@Entity
@Table(name = "login", catalog = "schema_locar")
public class Login implements java.io.Serializable {

	private String idLogin;
	private String senha;
	private Date dtinclusao;
	private Date dtalteracao;
	private Set<Avaliacaolocacao> avaliacaolocacaos = new HashSet<Avaliacaolocacao>(0);
	private Set<Pagamento> pagamentos = new HashSet<Pagamento>(0);
	private Usuario usuario;
	private Set<Loginperfil> loginperfils = new HashSet<Loginperfil>(0);
	private Set<Veiculo> veiculos = new HashSet<Veiculo>(0);
	private Set<Reserva> reservasForIdEstacionamento = new HashSet<Reserva>(0);
	private Estacionamento estacionamento;
	private Set<Reserva> reservasForIdLocatario = new HashSet<Reserva>(0);
	private Set<Telefone> telefones = new HashSet<Telefone>(0);

	public Login() {
	}

	public Login(String idLogin, String senha, Date dtinclusao) {
		this.idLogin = idLogin;
		this.senha = senha;
		this.dtinclusao = dtinclusao;
	}

	public Login(String idLogin, String senha, Date dtinclusao, Date dtalteracao,
			Set<Avaliacaolocacao> avaliacaolocacaos, Set<Pagamento> pagamentos, Usuario usuario,
			Set<Loginperfil> loginperfils, Set<Veiculo> veiculos, Set<Reserva> reservasForIdEstacionamento,
			Estacionamento estacionamento, Set<Reserva> reservasForIdLocatario, Set<Telefone> telefones) {
		this.idLogin = idLogin;
		this.senha = senha;
		this.dtinclusao = dtinclusao;
		this.dtalteracao = dtalteracao;
		this.avaliacaolocacaos = avaliacaolocacaos;
		this.pagamentos = pagamentos;
		this.usuario = usuario;
		this.loginperfils = loginperfils;
		this.veiculos = veiculos;
		this.reservasForIdEstacionamento = reservasForIdEstacionamento;
		this.estacionamento = estacionamento;
		this.reservasForIdLocatario = reservasForIdLocatario;
		this.telefones = telefones;
	}

	@Id

	@Column(name = "idLogin", unique = true, nullable = false, length = 15)
	public String getIdLogin() {
		return this.idLogin;
	}

	public void setIdLogin(String idLogin) {
		this.idLogin = idLogin;
	}

	@Column(name = "senha", nullable = false, length = 150)
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<Avaliacaolocacao> getAvaliacaolocacaos() {
		return this.avaliacaolocacaos;
	}

	public void setAvaliacaolocacaos(Set<Avaliacaolocacao> avaliacaolocacaos) {
		this.avaliacaolocacaos = avaliacaolocacaos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<Pagamento> getPagamentos() {
		return this.pagamentos;
	}

	public void setPagamentos(Set<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "login")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<Loginperfil> getLoginperfils() {
		return this.loginperfils;
	}

	public void setLoginperfils(Set<Loginperfil> loginperfils) {
		this.loginperfils = loginperfils;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<Veiculo> getVeiculos() {
		return this.veiculos;
	}

	public void setVeiculos(Set<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "loginByIdEstacionamento")
	public Set<Reserva> getReservasForIdEstacionamento() {
		return this.reservasForIdEstacionamento;
	}

	public void setReservasForIdEstacionamento(Set<Reserva> reservasForIdEstacionamento) {
		this.reservasForIdEstacionamento = reservasForIdEstacionamento;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "login")
	public Estacionamento getEstacionamento() {
		return this.estacionamento;
	}

	public void setEstacionamento(Estacionamento estacionamento) {
		this.estacionamento = estacionamento;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "loginByIdLocatario")
	public Set<Reserva> getReservasForIdLocatario() {
		return this.reservasForIdLocatario;
	}

	public void setReservasForIdLocatario(Set<Reserva> reservasForIdLocatario) {
		this.reservasForIdLocatario = reservasForIdLocatario;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<Telefone> getTelefones() {
		return this.telefones;
	}

	public void setTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}

}
