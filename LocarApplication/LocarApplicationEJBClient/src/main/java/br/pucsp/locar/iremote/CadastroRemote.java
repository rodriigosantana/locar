package br.pucsp.locar.iremote;

import javax.ejb.Remote;

import br.pucsp.locar.ws.vo.CadastroUsuarioRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoResponseVO;
import br.pucsp.locar.ws.vo.DefaultResponseVO;

@Remote
public interface CadastroRemote {

	public CadastroVeiculoResponseVO cadastrarVeiculo(CadastroVeiculoRequestVO request);
	
	public DefaultResponseVO verificarLogin(CadastroUsuarioRequestVO request);
	
	public DefaultResponseVO cadastrarUsuario(CadastroUsuarioRequestVO request);
	
}
