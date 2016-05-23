package br.pucsp.locar.ws.json.request;

import javax.xml.bind.annotation.XmlRootElement;

import br.pucsp.locar.vo.LoginVO;
import br.pucsp.locar.vo.UsuarioVO;

@XmlRootElement
public class CadastroLocarRequest {
	
	private LoginVO loginVO;
	private UsuarioVO usuarioVO;
	
	public LoginVO getLoginVO() {
		return loginVO;
	}
	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}
	public UsuarioVO getUsuarioVO() {
		return usuarioVO;
	}
	public void setUsuarioVO(UsuarioVO usuarioVO) {
		this.usuarioVO = usuarioVO;
	}
	
}
