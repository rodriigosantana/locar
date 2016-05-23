package br.pucsp.locar.ws.xml;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.pucsp.locar.ilocal.AvaliacaoLocal;
import br.pucsp.locar.ilocal.QuestionarioLocal;
import br.pucsp.locar.ws.vo.AvaliacaoRequestVO;
import br.pucsp.locar.ws.vo.AvaliacaoResponseVO;
import br.pucsp.locar.ws.vo.QuestionarioResponseVO;

@WebService
public class AvaliacaoLocarWS {
	
	@EJB
	private QuestionarioLocal questionario;
	
	@EJB
	private AvaliacaoLocal avaliacao;
	
	@WebMethod
	public QuestionarioResponseVO consultarQuestionario(
			@WebParam(name = "codigoPerfil") int codPerfil){
		
		QuestionarioResponseVO response = new QuestionarioResponseVO();
		
		System.out.println("Inicio do metodo consultarQuestionario - AvaliacaoLocarWS"); 
		
		try{
			
			response = questionario.consultarQuestionario(codPerfil);
			
		} catch (Exception e){
			System.out.println(e.getStackTrace());
			e.printStackTrace();
			
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Erro fatal no processamento!");
		}
		
		System.out.println("Final do metodo consultarQuestionario - AvaliacaoLocarWS"); 
		
		return response;
		
	}
	
	@WebMethod
	public AvaliacaoResponseVO enviarAvaliacao(
			@WebParam(name = "avaliacaoRequestVO") AvaliacaoRequestVO request){
		
		AvaliacaoResponseVO response = new AvaliacaoResponseVO();
		
		System.out.println("Inicio do metodo consultarQuestionario - AvaliacaoLocarWS"); 
		
		try{
			
			response = avaliacao.enviarAvaliacao(request);
			
		} catch (Exception e){
			System.out.println(e.getStackTrace());
			e.printStackTrace();
			
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Erro fatal no processamento!");
		}
		
		System.out.println("Final do metodo consultarQuestionario - AvaliacaoLocarWS"); 
		
		return response;
		
	}
}
