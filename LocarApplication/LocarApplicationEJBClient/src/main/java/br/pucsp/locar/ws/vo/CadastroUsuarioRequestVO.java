package br.pucsp.locar.ws.vo;

import java.io.Serializable;
import java.util.List;

import br.pucsp.locar.vo.EnderecoVO;
import br.pucsp.locar.vo.TelefoneVO;
import br.pucsp.locar.vo.UsuarioVO;

public class CadastroUsuarioRequestVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5798165697208191259L;

	private String login;
	private String senha;
	
	private UsuarioVO usuarioVO;
	private EnderecoVO enderecoVO;
	private List<TelefoneVO> telefoneVO;
	
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
	public UsuarioVO getUsuarioVO() {
		return usuarioVO;
	}
	public void setUsuarioVO(UsuarioVO usuarioVO) {
		this.usuarioVO = usuarioVO;
	}
	public EnderecoVO getEnderecoVO() {
		return enderecoVO;
	}
	public void setEnderecoVO(EnderecoVO enderecoVO) {
		this.enderecoVO = enderecoVO;
	}
	public List<TelefoneVO> getTelefoneVO() {
		return telefoneVO;
	}
	public void setTelefoneVO(List<TelefoneVO> telefoneVO) {
		this.telefoneVO = telefoneVO;
	}
	
}
