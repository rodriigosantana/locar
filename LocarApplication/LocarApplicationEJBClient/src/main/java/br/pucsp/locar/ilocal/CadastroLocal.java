package br.pucsp.locar.ilocal;

import javax.ejb.Local;

import br.pucsp.locar.ws.vo.CadastroUsuarioRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoResponseVO;
import br.pucsp.locar.ws.vo.DefaultResponseVO;

@Local
public interface CadastroLocal {

	public CadastroVeiculoResponseVO cadastrarVeiculo(CadastroVeiculoRequestVO request);
	
	public DefaultResponseVO verificarLogin(CadastroUsuarioRequestVO request);
	
	public DefaultResponseVO cadastrarUsuario(CadastroUsuarioRequestVO request);
	
}
