package br.pucsp.locar.ws.xml;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.pucsp.locar.ws.dto.AvaliacaoRequestDTO;
import br.pucsp.locar.ws.dto.AvaliacaoResponseDTO;
import br.pucsp.locar.ws.dto.QuestionarioResponseDTO;
import br.pucsp.locar.ws.json.request.QuestionarioRequest;
import br.pucsp.locar.ws.util.InjectEJBUtils;

@WebService
public class AvaliacaoLocarWS {
	

	@WebMethod
	public QuestionarioResponseDTO consultarQuestionario(QuestionarioRequest request){

		//		LOG.info("-- Inicio do metodo QuestionarioJSON --");

		QuestionarioResponseDTO response = null;
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
			response = new QuestionarioResponseDTO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}

		//		LOG.info("-- Final do metodo QuestionarioJSON --");

		return response;
	}
	
	@WebMethod
	public AvaliacaoResponseDTO enviarAvaliacao(AvaliacaoRequestDTO request){
		
		AvaliacaoResponseDTO response = null;
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
			response = new AvaliacaoResponseDTO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}
}
