package br.pucsp.locar.ws.vo;

import java.io.Serializable;
import java.util.List;

import br.pucsp.locar.vo.QuestaoVO;

public class QuestionarioResponseVO extends DefaultResponseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 746682925905572388L;
	
	
	private List<QuestaoVO> questionario;

	public List<QuestaoVO> getQuestionario() {
		return questionario;
	}

	public void setQuestionario(List<QuestaoVO> questionario) {
		this.questionario = questionario;
	}
	
}
