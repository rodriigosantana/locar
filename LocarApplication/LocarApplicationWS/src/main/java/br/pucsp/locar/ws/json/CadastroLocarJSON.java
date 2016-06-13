package br.pucsp.locar.ws.json;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.pucsp.locar.dto.LoginDTO;
import br.pucsp.locar.ws.dto.CadastroUsuarioRequestDTO;
import br.pucsp.locar.ws.dto.CadastroVeiculoRequestDTO;
import br.pucsp.locar.ws.dto.CadastroVeiculoResponseDTO;
import br.pucsp.locar.ws.dto.DefaultResponseDTO;
import br.pucsp.locar.ws.dto.LoginResponseDTO;
import br.pucsp.locar.ws.util.InjectEJBUtils;

@Path("/CadastroLocarJSON")
public class CadastroLocarJSON {
	
//	private static final Logger LOG = Logger.getLogger(CadastroLocarRequest.class);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/realizarLogin")
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
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/verificarLogin")
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
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/cadastroUsuario")
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
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/cadastrarVeiculo")
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
