package br.pucsp.locar.ws.xml;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.pucsp.locar.ws.json.request.QuestionarioRequest;
import br.pucsp.locar.ws.util.InjectEJBUtils;
import br.pucsp.locar.ws.vo.AvaliacaoRequestVO;
import br.pucsp.locar.ws.vo.AvaliacaoResponseVO;
import br.pucsp.locar.ws.vo.QuestionarioResponseVO;

@WebService
public class AvaliacaoLocarWS {
	

	@WebMethod
	public QuestionarioResponseVO consultarQuestionario(QuestionarioRequest request){

		//		LOG.info("-- Inicio do metodo QuestionarioJSON --");

		QuestionarioResponseVO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getQuestionarioRemoteEjb().consultarQuestionario(request.getCodigoPerfil());
			response.setCodigoRetorno(0);
			response.setMensagemRetorno("Processamento realizado com sucesso!");

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new QuestionarioResponseVO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}

		//		LOG.info("-- Final do metodo QuestionarioJSON --");

		return response;
	}
	
	@WebMethod
	public AvaliacaoResponseVO enviarAvaliacao(AvaliacaoRequestVO request){
		
		AvaliacaoResponseVO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getAvaliacaoRemoteEjb().enviarAvaliacao(request);
			response.setCodigoRetorno(0);
			response.setMensagemRetorno("Processamento realizado com sucesso!");

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		
		if ( response == null ) {
			response = new AvaliacaoResponseVO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}
}
