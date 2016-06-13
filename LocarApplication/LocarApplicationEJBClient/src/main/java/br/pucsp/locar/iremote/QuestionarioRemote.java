package br.pucsp.locar.iremote;

import javax.ejb.Remote;

import br.pucsp.locar.ws.dto.QuestionarioResponseDTO;

@Remote
public interface QuestionarioRemote {

	public QuestionarioResponseDTO consultarQuestionario(final int codQuestao);
	
}
