package br.pucsp.locar.ilocal;

import javax.ejb.Local;

import br.pucsp.locar.ws.dto.QuestionarioResponseDTO;

@Local
public interface QuestionarioLocal {

	public QuestionarioResponseDTO consultarQuestionario(final int codQuestao);
	
}
