package br.pucsp.locar.ilocal;

import br.pucsp.locar.ws.dto.LocacaoRequestDTO;
import br.pucsp.locar.ws.dto.LocacaoResponseDTO;

public interface LocacaoLocal {

	public LocacaoResponseDTO realizarLocacao(LocacaoRequestDTO request);
	
}
