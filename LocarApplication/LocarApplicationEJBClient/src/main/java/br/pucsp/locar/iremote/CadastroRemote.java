package br.pucsp.locar.iremote;

import javax.ejb.Remote;

import br.pucsp.locar.vo.LoginVO;
import br.pucsp.locar.ws.vo.CadastroUsuarioRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoResponseVO;
import br.pucsp.locar.ws.vo.DefaultResponseVO;
import br.pucsp.locar.ws.vo.LoginResponseVO;

@Remote
public interface CadastroRemote {

	public CadastroVeiculoResponseVO cadastrarVeiculo(CadastroVeiculoRequestVO request);
	
	public LoginResponseVO realizarLogin(LoginVO login);
	
	public DefaultResponseVO verificarLogin(CadastroUsuarioRequestVO request);
	
	public DefaultResponseVO cadastrarUsuario(CadastroUsuarioRequestVO request);
	
}
