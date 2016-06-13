package br.pucsp.locar.ws.xml;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.pucsp.locar.dto.LoginDTO;
import br.pucsp.locar.ws.dto.CadastroUsuarioRequestDTO;
import br.pucsp.locar.ws.dto.CadastroVeiculoRequestDTO;
import br.pucsp.locar.ws.dto.CadastroVeiculoResponseDTO;
import br.pucsp.locar.ws.dto.DefaultResponseDTO;
import br.pucsp.locar.ws.dto.LoginResponseDTO;
import br.pucsp.locar.ws.util.InjectEJBUtils;

@WebService
public class CadastroLocarWS {

	@WebMethod
	public LoginResponseDTO realizarLogin(LoginDTO request){
		
		LoginResponseDTO response = null;
		
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getCadastroRemoteEjb().realizarLogin(request);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new LoginResponseDTO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
	}
	
	@WebMethod
	public DefaultResponseDTO verificarLogin(CadastroUsuarioRequestDTO request){
		
		DefaultResponseDTO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getCadastroRemoteEjb().verificarLogin(request);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new DefaultResponseDTO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}
	
	@WebMethod
	public DefaultResponseDTO cadastroUsuario(CadastroUsuarioRequestDTO request){
		
		DefaultResponseDTO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getCadastroRemoteEjb().cadastrarUsuario(request);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new DefaultResponseDTO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}
	
	@WebMethod
	public CadastroVeiculoResponseDTO cadastrarVeiculo(CadastroVeiculoRequestDTO request){
		
		CadastroVeiculoResponseDTO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getCadastroRemoteEjb().cadastrarVeiculo(request);
			response.setCodigoRetorno(0);
			response.setMensagemRetorno("Processamento realizado com sucesso!");

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new CadastroVeiculoResponseDTO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}
	
}
