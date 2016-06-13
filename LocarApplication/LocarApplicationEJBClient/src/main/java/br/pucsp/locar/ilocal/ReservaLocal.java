package br.pucsp.locar.ilocal;

import javax.ejb.Local;

import br.pucsp.locar.ws.dto.ReservaRequestDTO;
import br.pucsp.locar.ws.dto.ReservaResponseDTO;

@Local
public interface ReservaLocal {

	public ReservaResponseDTO realizarReserva(ReservaRequestDTO request);
	
}
