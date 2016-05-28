package br.pucsp.locar.ilocal;

import javax.ejb.Local;

import br.pucsp.locar.ws.vo.ReservaRequestVO;
import br.pucsp.locar.ws.vo.ReservaResponseVO;

@Local
public interface ReservaLocal {

	public ReservaResponseVO realizarReserva(ReservaRequestVO request);
	
}
