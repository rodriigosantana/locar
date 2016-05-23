package br.pucsp.locar.ws.vo;

import java.io.Serializable;
import java.util.List;

import br.pucsp.locar.vo.AvaliacaoVO;

public class AvaliacaoRequestVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4208219942960755203L;
	
	private int codigoLocacao;
	private String codigoLoginAvaliador;
	
	private List<AvaliacaoVO> listaAvaliacaoVO;
	
	public int getCodigoLocacao() {
		return codigoLocacao;
	}
	public void setCodigoLocacao(int codigoLocacao) {
		this.codigoLocacao = codigoLocacao;
	}
	public String getCodigoLoginAvaliador() {
		return codigoLoginAvaliador;
	}
	public void setCodigoLoginAvaliador(String codigoLoginAvaliador) {
		this.codigoLoginAvaliador = codigoLoginAvaliador;
	}
	public List<AvaliacaoVO> getListaAvaliacaoVO() {
		return listaAvaliacaoVO;
	}
	public void setListaAvaliacaoVO(List<AvaliacaoVO> listaAvaliacaoVO) {
		this.listaAvaliacaoVO = listaAvaliacaoVO;
	}
	
}
