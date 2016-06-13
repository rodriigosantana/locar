package br.pucsp.locar.dto;

import java.io.Serializable;

public class QuestaoDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9159417069273255867L;
	
	
	private int codigoQuestao;
	private String questao;
	
	public int getCodigoQuestao() {
		return codigoQuestao;
	}
	public void setCodigoQuestao(int codigoQuestao) {
		this.codigoQuestao = codigoQuestao;
	}
	public String getQuestao() {
		return questao;
	}
	public void setQuestao(String questao) {
		this.questao = questao;
	}
	
	
}
