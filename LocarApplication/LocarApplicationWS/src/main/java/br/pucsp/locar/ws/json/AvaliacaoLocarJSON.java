package br.pucsp.locar.ws.json;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.pucsp.locar.ws.dto.AvaliacaoRequestDTO;
import br.pucsp.locar.ws.dto.AvaliacaoResponseDTO;
import br.pucsp.locar.ws.dto.QuestionarioResponseDTO;
import br.pucsp.locar.ws.json.request.QuestionarioRequest;
import br.pucsp.locar.ws.util.InjectEJBUtils;

@Path("/AvaliacaoLocarJSON")
public class AvaliacaoLocarJSON {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/consultarQuestionario")
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
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/enviarAvaliacao")
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
