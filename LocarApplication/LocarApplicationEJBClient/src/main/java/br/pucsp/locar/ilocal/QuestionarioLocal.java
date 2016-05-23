package br.pucsp.locar.ilocal;

import javax.ejb.Local;

import br.pucsp.locar.ws.vo.QuestionarioResponseVO;

@Local
public interface QuestionarioLocal {

	public QuestionarioResponseVO consultarQuestionario(final int codQuestao);
	
}
