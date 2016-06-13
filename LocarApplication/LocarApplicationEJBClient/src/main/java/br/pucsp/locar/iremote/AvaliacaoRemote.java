package br.pucsp.locar.iremote;

import javax.ejb.Remote;

import br.pucsp.locar.ws.dto.AvaliacaoRequestDTO;
import br.pucsp.locar.ws.dto.AvaliacaoResponseDTO;

@Remote
public interface AvaliacaoRemote {

	public AvaliacaoResponseDTO enviarAvaliacao(AvaliacaoRequestDTO request);
	
}
