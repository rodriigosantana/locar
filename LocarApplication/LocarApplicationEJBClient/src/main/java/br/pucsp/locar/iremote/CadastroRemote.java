package br.pucsp.locar.iremote;

import javax.ejb.Remote;

import br.pucsp.locar.dto.LoginDTO;
import br.pucsp.locar.ws.dto.CadastroUsuarioRequestDTO;
import br.pucsp.locar.ws.dto.CadastroVeiculoRequestDTO;
import br.pucsp.locar.ws.dto.CadastroVeiculoResponseDTO;
import br.pucsp.locar.ws.dto.DefaultResponseDTO;
import br.pucsp.locar.ws.dto.LoginResponseDTO;

@Remote
public interface CadastroRemote {

	public CadastroVeiculoResponseDTO cadastrarVeiculo(CadastroVeiculoRequestDTO request);
	
	public LoginResponseDTO realizarLogin(LoginDTO login);
	
	public DefaultResponseDTO verificarLogin(CadastroUsuarioRequestDTO request);
	
	public DefaultResponseDTO cadastrarUsuario(CadastroUsuarioRequestDTO request);
	
}
