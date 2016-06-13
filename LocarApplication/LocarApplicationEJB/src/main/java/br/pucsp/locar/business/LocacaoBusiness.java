package br.pucsp.locar.business;

import br.pucsp.locar.ilocal.LocacaoLocal;
import br.pucsp.locar.iremote.LocacaoRemote;
import br.pucsp.locar.ws.dto.LocacaoRequestDTO;
import br.pucsp.locar.ws.dto.LocacaoResponseDTO;

public class LocacaoBusiness implements LocacaoLocal, LocacaoRemote{

	public LocacaoResponseDTO realizarLocacao(LocacaoRequestDTO request) {
		
		LocacaoResponseDTO response = new LocacaoResponseDTO();
		
		
		
		
		return response;
	}
}
