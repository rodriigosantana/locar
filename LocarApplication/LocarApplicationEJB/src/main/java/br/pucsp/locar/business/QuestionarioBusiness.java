package br.pucsp.locar.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import br.pucsp.locar.dto.QuestaoDTO;
import br.pucsp.locar.entity.Questaoavaliacao;
import br.pucsp.locar.fabrica.DAOFabrica;
import br.pucsp.locar.ilocal.QuestionarioLocal;
import br.pucsp.locar.iremote.QuestionarioRemote;
import br.pucsp.locar.ws.dto.QuestionarioResponseDTO;

@Stateless(name = "QuestionarioBusiness", mappedName = "br.pucsp.locar.business.QuestionarioBusiness")
public class QuestionarioBusiness implements QuestionarioLocal, QuestionarioRemote {

	@Override
	public QuestionarioResponseDTO consultarQuestionario(int codPerfil) {

		System.out.println("Inicio do metodo consultarQuestionario - QuestionarioBusiness"); 
		
		QuestionarioResponseDTO response = new QuestionarioResponseDTO();

		try{
			
			List<Questaoavaliacao> listQuestoes = DAOFabrica.getQuestaoAvaliacaoDAO().listarByCodPerfil(codPerfil);
			
			if(listQuestoes.size() > 0){
				
				List<QuestaoDTO> questionario = new ArrayList<QuestaoDTO>();
			
				for (Questaoavaliacao questao: listQuestoes){
					
					QuestaoDTO questaoVO = new QuestaoDTO();
					
					questaoVO.setCodigoQuestao(questao.getIdQuestao());
					questaoVO.setQuestao(questao.getQuestao());
					
					questionario.add(questaoVO);
					
				}
				
				response.setQuestionario(questionario);
					
			}
			
			response.setCodigoRetorno(0);
			response.setMensagemRetorno("Processamento realizado com sucesso!");
			
		} catch (Exception e){
		
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo consultarQuestionario - Erro: " + e.getMessage());
			
			throw e;
			
		}
		
		System.out.println("Inicio do metodo consultarQuestionario - QuestionarioBusiness"); 

		return response;

	}

}
