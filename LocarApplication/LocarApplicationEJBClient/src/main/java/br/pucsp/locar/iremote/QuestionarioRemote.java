package br.pucsp.locar.iremote;

import javax.ejb.Remote;

import br.pucsp.locar.ws.vo.QuestionarioResponseVO;

@Remote
public interface QuestionarioRemote {

	public QuestionarioResponseVO consultarQuestionario(final int codQuestao);
	
}
