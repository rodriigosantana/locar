package br.pucsp.locar.ws.json.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import br.pucsp.locar.vo.QuestaoVO;

@XmlRootElement
public class QuestionarioResponse extends DefaultResponse {

	private List<QuestaoVO> questionarioList;

	public List<QuestaoVO> getQuestionarioList() {
		return questionarioList;
	}

	public void setQuestionarioList(List<QuestaoVO> questionarioList) {
		this.questionarioList = questionarioList;
	}
	
}
