package br.pucsp.locar.ws.json.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import br.pucsp.locar.dto.QuestaoDTO;

@XmlRootElement
public class QuestionarioResponse extends DefaultResponse {

	private List<QuestaoDTO> questionarioList;

	public List<QuestaoDTO> getQuestionarioList() {
		return questionarioList;
	}

	public void setQuestionarioList(List<QuestaoDTO> questionarioList) {
		this.questionarioList = questionarioList;
	}
	
}
