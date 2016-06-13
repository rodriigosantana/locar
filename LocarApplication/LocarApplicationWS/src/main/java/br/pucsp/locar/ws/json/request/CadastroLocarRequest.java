package br.pucsp.locar.ws.json.request;

import javax.xml.bind.annotation.XmlRootElement;

import br.pucsp.locar.dto.LoginDTO;
import br.pucsp.locar.dto.UsuarioDTO;

@XmlRootElement
public class CadastroLocarRequest {
	
	private LoginDTO loginVO;
	private UsuarioDTO usuarioVO;
	
	public LoginDTO getLoginVO() {
		return loginVO;
	}
	public void setLoginVO(LoginDTO loginVO) {
		this.loginVO = loginVO;
	}
	public UsuarioDTO getUsuarioVO() {
		return usuarioVO;
	}
	public void setUsuarioVO(UsuarioDTO usuarioVO) {
		this.usuarioVO = usuarioVO;
	}
	
}
