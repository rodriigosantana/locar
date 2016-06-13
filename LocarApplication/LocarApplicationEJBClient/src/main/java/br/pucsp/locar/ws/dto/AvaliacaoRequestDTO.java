package br.pucsp.locar.ws.dto;

import java.io.Serializable;
import java.util.List;

import br.pucsp.locar.dto.AvaliacaoDTO;

public class AvaliacaoRequestDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4208219942960755203L;
	
	private int codigoLocacao;
	private String codigoLoginAvaliador;
	
	private List<AvaliacaoDTO> listaAvaliacaoVO;
	
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
	public List<AvaliacaoDTO> getListaAvaliacaoVO() {
		return listaAvaliacaoVO;
	}
	public void setListaAvaliacaoVO(List<AvaliacaoDTO> listaAvaliacaoVO) {
		this.listaAvaliacaoVO = listaAvaliacaoVO;
	}
	
}
