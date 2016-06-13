package br.pucsp.locar.ilocal;

import javax.ejb.Local;

import br.pucsp.locar.ws.dto.ConsultaVeiculoRequestDTO;
import br.pucsp.locar.ws.dto.ConsultaVeiculoResponseDTO;

@Local
public interface ConsultaLocal {

	public ConsultaVeiculoResponseDTO consultarListaVeiculo(ConsultaVeiculoRequestDTO request);
	
}
