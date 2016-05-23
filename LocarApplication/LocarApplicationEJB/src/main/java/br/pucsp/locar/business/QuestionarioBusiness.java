package br.pucsp.locar.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import br.pucsp.locar.entity.Questaoavaliacao;
import br.pucsp.locar.fabrica.DAOFabrica;
import br.pucsp.locar.ilocal.QuestionarioLocal;
import br.pucsp.locar.iremote.QuestionarioRemote;
import br.pucsp.locar.vo.QuestaoVO;
import br.pucsp.locar.ws.vo.QuestionarioResponseVO;

@Stateless(name = "QuestionarioBusiness", mappedName = "br.pucsp.locar.business.QuestionarioBusiness")
public class QuestionarioBusiness implements QuestionarioLocal, QuestionarioRemote {

	@Override
	public QuestionarioResponseVO consultarQuestionario(int codPerfil) {

		System.out.println("Inicio do metodo consultarQuestionario - QuestionarioBusiness"); 
		
		QuestionarioResponseVO response = new QuestionarioResponseVO();

		try{
			
			List<Questaoavaliacao> listQuestoes = DAOFabrica.getQuestaoAvaliacaoDAO().listarByCodPerfil(codPerfil);
			
			if(listQuestoes.size() > 0){
				
				List<QuestaoVO> questionario = new ArrayList<QuestaoVO>();
			
				for (Questaoavaliacao questao: listQuestoes){
					
					QuestaoVO questaoVO = new QuestaoVO();
					
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
