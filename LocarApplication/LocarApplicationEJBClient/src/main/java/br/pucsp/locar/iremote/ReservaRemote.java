package br.pucsp.locar.iremote;

import javax.ejb.Remote;

import br.pucsp.locar.ws.dto.QuestionarioResponseDTO;
import br.pucsp.locar.ws.dto.ReservaRequestDTO;
import br.pucsp.locar.ws.dto.ReservaResponseDTO;

@Remote
public interface ReservaRemote {

	public ReservaResponseDTO realizarReserva(ReservaRequestDTO request);
	
}
