package br.pucsp.locar.ws.json;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.pucsp.locar.ws.util.InjectEJBUtils;
import br.pucsp.locar.ws.vo.CadastroUsuarioRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoResponseVO;
import br.pucsp.locar.ws.vo.DefaultResponseVO;

@Path("/CadastroLocarJSON")
public class CadastroLocarJSON {
	
//	private static final Logger LOG = Logger.getLogger(CadastroLocarRequest.class);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/verificarLogin")
	public DefaultResponseVO verificarLogin(CadastroUsuarioRequestVO request){
		
		DefaultResponseVO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getCadastroRemoteEjb().verificarLogin(request);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new DefaultResponseVO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/cadastroUsuario")
	public DefaultResponseVO cadastroUsuario(CadastroUsuarioRequestVO request){
		
		DefaultResponseVO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getCadastroRemoteEjb().cadastrarUsuario(request);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new DefaultResponseVO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/cadastrarVeiculo")
	public CadastroVeiculoResponseVO cadastrarVeiculo(CadastroVeiculoRequestVO request){
		
		CadastroVeiculoResponseVO response = null;
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
			response = new CadastroVeiculoResponseVO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}

}
