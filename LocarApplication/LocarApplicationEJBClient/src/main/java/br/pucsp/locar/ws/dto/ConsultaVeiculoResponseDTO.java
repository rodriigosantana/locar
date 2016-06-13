package br.pucsp.locar.ws.dto;

import java.io.Serializable;
import java.util.List;

import br.pucsp.locar.dto.VeiculoDTO;

public class ConsultaVeiculoResponseDTO extends DefaultResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7695268805173881649L;

	private List<VeiculoDTO> listaVeiculo;

	public List<VeiculoDTO> getListaVeiculo() {
		return listaVeiculo;
	}

	public void setListaVeiculo(List<VeiculoDTO> listaVeiculo) {
		this.listaVeiculo = listaVeiculo;
	}
	
}
