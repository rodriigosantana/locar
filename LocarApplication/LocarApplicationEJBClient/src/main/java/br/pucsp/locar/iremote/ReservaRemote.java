package br.pucsp.locar.iremote;

import javax.ejb.Remote;

import br.pucsp.locar.ws.vo.QuestionarioResponseVO;
import br.pucsp.locar.ws.vo.ReservaRequestVO;
import br.pucsp.locar.ws.vo.ReservaResponseVO;

@Remote
public interface ReservaRemote {

	public ReservaResponseVO realizarReserva(ReservaRequestVO request);
	
}
