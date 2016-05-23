
package br.pucsp.locar.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class AvaliacaoVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4350453394945630524L;

	private int codigoQuestao;
	
	private BigDecimal nota;
	private String descricao;
	
	public int getCodigoQuestao() {
		return codigoQuestao;
	}
	public void setCodigoQuestao(int codigoQuestao) {
		this.codigoQuestao = codigoQuestao;
	}
	public BigDecimal getNota() {
		return nota;
	}
	public void setNota(BigDecimal nota) {
		this.nota = nota;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
