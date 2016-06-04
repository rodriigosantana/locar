package br.pucsp.locar.ilocal;

import javax.ejb.Local;

import br.pucsp.locar.vo.LoginVO;
import br.pucsp.locar.ws.vo.CadastroUsuarioRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoResponseVO;
import br.pucsp.locar.ws.vo.DefaultResponseVO;
import br.pucsp.locar.ws.vo.LoginResponseVO;

@Local
public interface CadastroLocal {

	public CadastroVeiculoResponseVO cadastrarVeiculo(CadastroVeiculoRequestVO request);
	
	public LoginResponseVO realizarLogin(LoginVO login);
	
	public DefaultResponseVO verificarLogin(CadastroUsuarioRequestVO request);
	
	public DefaultResponseVO cadastrarUsuario(CadastroUsuarioRequestVO request);
	
}
