package br.pucsp.locar.business;

import javax.ejb.Stateless;

import br.pucsp.locar.convert.ConvertCadastroToDAO;
import br.pucsp.locar.convert.ConvertVeiculoToDAO;
import br.pucsp.locar.dto.LoginDTO;
import br.pucsp.locar.fabrica.DAOFabrica;
import br.pucsp.locar.ilocal.CadastroLocal;
import br.pucsp.locar.iremote.CadastroRemote;
import br.pucsp.locar.util.CadastroValidatorUtils;
import br.pucsp.locar.ws.dto.CadastroUsuarioRequestDTO;
import br.pucsp.locar.ws.dto.CadastroVeiculoRequestDTO;
import br.pucsp.locar.ws.dto.CadastroVeiculoResponseDTO;
import br.pucsp.locar.ws.dto.DefaultResponseDTO;
import br.pucsp.locar.ws.dto.LoginResponseDTO;

@Stateless
public class CadastroBusiness implements CadastroLocal, CadastroRemote {

	@Override
	public CadastroVeiculoResponseDTO cadastrarVeiculo(CadastroVeiculoRequestDTO request) {
		
		CadastroVeiculoResponseDTO response = new CadastroVeiculoResponseDTO();
		
		try{
			
			String msg = CadastroValidatorUtils.validarDadosCadastroVeiculo(request);
			
			if (msg.trim().equals("")){
			
				response.setPlaca(DAOFabrica.getVeiculoDAO().cadastrarVeiculo(
						ConvertVeiculoToDAO.cadastroVeiculoRequestVOToVeiculo(request)));
				
				response.setCodigoRetorno(0);
				response.setMensagemRetorno("Processamento realizado com sucesso");
			
			} else {
						
				response.setCodigoRetorno(200);
				response.setMensagemRetorno("Dados informados inválidos - " + msg);
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo cadastrarVeiculo - Erro: " + e.getMessage());
			
			throw e;
			
		}
		
		return response;
	}

	@Override
	public DefaultResponseDTO verificarLogin(CadastroUsuarioRequestDTO request) {
		
		System.out.println("Iniciando o metodo verificarLogin - CadastroBusiness");
		
		DefaultResponseDTO response = new DefaultResponseDTO();
		
		try{
			
			if(request.getLogin().length() <= 15) {
			
				if(DAOFabrica.getLoginDAO().isCadastroLogin(request.getLogin())){
					
					response.setCodigoRetorno(1);
					response.setMensagemRetorno("Login ja utilizado por outro usuario.");
					
				} else {
					
					response.setCodigoRetorno(0);
					response.setMensagemRetorno("Login disponivel para utilizacao.");
					
				}
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo verificarLogin - Erro: " + e.getMessage());
			
			throw e;
			
		}
		
		System.out.println("Finalizando o metodo verificarLogin - CadastroBusiness");
		
		return response;
	}

	@Override
	public DefaultResponseDTO cadastrarUsuario(CadastroUsuarioRequestDTO request) {
		
		System.out.println("Iniciado o metodo cadastrarUsuario - CadastroBusiness");
		
		DefaultResponseDTO response = new DefaultResponseDTO();
		
		try{
			
			String msg = CadastroValidatorUtils.validarDadosCadastroUsuario(request);
			
			if (msg.trim().equals("")) {
			
				if(DAOFabrica.getCadastroDAO().cadastrarUsuario(
						ConvertCadastroToDAO.cadastroLoginRequestVOToLogin(request)
						,ConvertCadastroToDAO.cadastroUsuarioRequestVOToUsuario(request)
						,ConvertCadastroToDAO.cadastroEnderecoRequestVOToEndereco(request.getEnderecoVO())
						,ConvertCadastroToDAO.cadastroTelefoneRequestVOToTelefone(request.getTelefoneVO()))){
					
					response.setCodigoRetorno(0);
					response.setMensagemRetorno("Cadastro de usuario realizado com sucesso");
					
				} else {
					
					response.setCodigoRetorno(100);
					response.setMensagemRetorno("Nao foi possivel realizar o cadastro");
				}
				
			} else {
				
				response.setCodigoRetorno(200);
				response.setMensagemRetorno("Dados informados inválidos - " + msg);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo cadastrarUsuario - Erro: " + e.getMessage());
			
			throw e;
		}
		
		System.out.println("Finalizando o metodo cadastrarUsuario - CadastroBusiness");
		
		return response;
	}

	@Override
	public LoginResponseDTO realizarLogin(LoginDTO login) {

		System.out.println("Iniciado o metodo realizarLogin - CadastroBusiness");
		
		LoginResponseDTO response = new LoginResponseDTO();
		
		try{
			
			response.setCodigoRetorno(0);
			response.setMensagemRetorno("OK");
			response.setMotivo("");
			response.setSuccess(true);
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo realizarLogin - Erro: " + e.getMessage());
			
			throw e;
		} finally {
		
			System.out.println("Finalizando o metodo realizarLogin - CadastroBusiness");
			
		}
		
		return response;
		
	}
	
}
