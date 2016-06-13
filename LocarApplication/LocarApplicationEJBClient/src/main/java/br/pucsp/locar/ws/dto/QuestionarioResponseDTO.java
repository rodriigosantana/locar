package br.pucsp.locar.ws.dto;

import java.io.Serializable;
import java.util.List;

import br.pucsp.locar.dto.QuestaoDTO;

public class QuestionarioResponseDTO extends DefaultResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 746682925905572388L;
	
	
	private List<QuestaoDTO> questionario;

	public List<QuestaoDTO> getQuestionario() {
		return questionario;
	}

	public void setQuestionario(List<QuestaoDTO> questionario) {
		this.questionario = questionario;
	}
	
}
