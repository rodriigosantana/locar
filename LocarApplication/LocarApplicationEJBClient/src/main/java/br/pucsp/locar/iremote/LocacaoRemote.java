package br.pucsp.locar.iremote;

import br.pucsp.locar.ws.dto.LocacaoRequestDTO;
import br.pucsp.locar.ws.dto.LocacaoResponseDTO;

public interface LocacaoRemote {

	public LocacaoResponseDTO realizarLocacao(LocacaoRequestDTO request);
	
}
