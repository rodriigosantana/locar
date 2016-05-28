package br.pucsp.locar.ws.vo;

import java.io.Serializable;
import java.util.List;

import br.pucsp.locar.vo.VeiculoVO;

public class ConsultaVeiculoResponseVO extends DefaultResponseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7695268805173881649L;

	private List<VeiculoVO> listaVeiculo;

	public List<VeiculoVO> getListaVeiculo() {
		return listaVeiculo;
	}

	public void setListaVeiculo(List<VeiculoVO> listaVeiculo) {
		this.listaVeiculo = listaVeiculo;
	}
	
}
