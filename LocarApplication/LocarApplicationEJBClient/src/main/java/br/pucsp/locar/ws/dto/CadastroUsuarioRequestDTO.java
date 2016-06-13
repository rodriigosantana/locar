package br.pucsp.locar.ws.dto;

import java.io.Serializable;
import java.util.List;

import br.pucsp.locar.dto.EnderecoDTO;
import br.pucsp.locar.dto.TelefoneDTO;
import br.pucsp.locar.dto.UsuarioDTO;

public class CadastroUsuarioRequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5798165697208191259L;

	private String login;
	private String senha;
	
	private UsuarioDTO usuarioVO;
	private EnderecoDTO enderecoVO;
	private List<TelefoneDTO> telefoneVO;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public UsuarioDTO getUsuarioVO() {
		return usuarioVO;
	}
	public void setUsuarioVO(UsuarioDTO usuarioVO) {
		this.usuarioVO = usuarioVO;
	}
	public EnderecoDTO getEnderecoVO() {
		return enderecoVO;
	}
	public void setEnderecoVO(EnderecoDTO enderecoVO) {
		this.enderecoVO = enderecoVO;
	}
	public List<TelefoneDTO> getTelefoneVO() {
		return telefoneVO;
	}
	public void setTelefoneVO(List<TelefoneDTO> telefoneVO) {
		this.telefoneVO = telefoneVO;
	}
	
}
