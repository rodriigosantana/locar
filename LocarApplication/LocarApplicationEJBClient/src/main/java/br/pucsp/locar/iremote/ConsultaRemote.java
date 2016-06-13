package br.pucsp.locar.iremote;

import javax.ejb.Remote;

import br.pucsp.locar.ws.dto.ConsultaVeiculoRequestDTO;
import br.pucsp.locar.ws.dto.ConsultaVeiculoResponseDTO;

@Remote
public interface ConsultaRemote {

	public ConsultaVeiculoResponseDTO consultarListaVeiculo(ConsultaVeiculoRequestDTO request);
	
}
