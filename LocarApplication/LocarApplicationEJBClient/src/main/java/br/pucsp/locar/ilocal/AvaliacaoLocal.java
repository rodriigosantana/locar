package br.pucsp.locar.ilocal;

import javax.ejb.Local;

import br.pucsp.locar.ws.dto.AvaliacaoRequestDTO;
import br.pucsp.locar.ws.dto.AvaliacaoResponseDTO;

@Local
public interface AvaliacaoLocal {

	public AvaliacaoResponseDTO enviarAvaliacao(AvaliacaoRequestDTO request);
	
}
