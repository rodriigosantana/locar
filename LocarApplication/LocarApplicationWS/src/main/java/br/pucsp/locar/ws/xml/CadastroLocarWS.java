package br.pucsp.locar.ws.xml;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.pucsp.locar.vo.LoginVO;
import br.pucsp.locar.ws.util.InjectEJBUtils;
import br.pucsp.locar.ws.vo.CadastroUsuarioRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoResponseVO;
import br.pucsp.locar.ws.vo.DefaultResponseVO;
import br.pucsp.locar.ws.vo.LoginResponseVO;

@WebService
public class CadastroLocarWS {

	@WebMethod
	public LoginResponseVO realizarLogin(LoginVO request){
		
		LoginResponseVO response = null;
		
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getCadastroRemoteEjb().realizarLogin(request);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new LoginResponseVO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
	}
	
	@WebMethod
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
	
	@WebMethod
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
	
	@WebMethod
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
