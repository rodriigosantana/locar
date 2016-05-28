package br.pucsp.locar.business;

import javax.ejb.Stateless;

import br.pucsp.locar.dao.ConvertCadastroToDAO;
import br.pucsp.locar.dao.ConvertVeiculoToDAO;
import br.pucsp.locar.fabrica.DAOFabrica;
import br.pucsp.locar.ilocal.CadastroLocal;
import br.pucsp.locar.iremote.CadastroRemote;
import br.pucsp.locar.util.CadastroValidatorUtils;
import br.pucsp.locar.ws.vo.CadastroUsuarioRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoResponseVO;
import br.pucsp.locar.ws.vo.DefaultResponseVO;

@Stateless
public class CadastroBusiness implements CadastroLocal, CadastroRemote {

	@Override
	public CadastroVeiculoResponseVO cadastrarVeiculo(CadastroVeiculoRequestVO request) {
		
		CadastroVeiculoResponseVO response = new CadastroVeiculoResponseVO();
		
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
	public DefaultResponseVO verificarLogin(CadastroUsuarioRequestVO request) {
		
		System.out.println("Iniciando o metodo verificarLogin - CadastroBusiness");
		
		DefaultResponseVO response = new DefaultResponseVO();
		
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
	public DefaultResponseVO cadastrarUsuario(CadastroUsuarioRequestVO request) {
		
		System.out.println("Iniciado o metodo cadastrarUsuario - CadastroBusiness");
		
		DefaultResponseVO response = new DefaultResponseVO();
		
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
	
}
