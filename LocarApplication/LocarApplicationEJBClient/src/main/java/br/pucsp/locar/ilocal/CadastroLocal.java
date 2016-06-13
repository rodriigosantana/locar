package br.pucsp.locar.ilocal;

import javax.ejb.Local;

import br.pucsp.locar.dto.LoginDTO;
import br.pucsp.locar.ws.dto.CadastroUsuarioRequestDTO;
import br.pucsp.locar.ws.dto.CadastroVeiculoRequestDTO;
import br.pucsp.locar.ws.dto.CadastroVeiculoResponseDTO;
import br.pucsp.locar.ws.dto.DefaultResponseDTO;
import br.pucsp.locar.ws.dto.LoginResponseDTO;

@Local
public interface CadastroLocal {

	public CadastroVeiculoResponseDTO cadastrarVeiculo(CadastroVeiculoRequestDTO request);
	
	public LoginResponseDTO realizarLogin(LoginDTO login);
	
	public DefaultResponseDTO verificarLogin(CadastroUsuarioRequestDTO request);
	
	public DefaultResponseDTO cadastrarUsuario(CadastroUsuarioRequestDTO request);
	
}
