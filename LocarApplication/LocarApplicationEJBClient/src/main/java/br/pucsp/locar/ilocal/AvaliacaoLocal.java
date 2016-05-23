package br.pucsp.locar.ilocal;

import javax.ejb.Local;

import br.pucsp.locar.ws.vo.AvaliacaoRequestVO;
import br.pucsp.locar.ws.vo.AvaliacaoResponseVO;

@Local
public interface AvaliacaoLocal {

	public AvaliacaoResponseVO enviarAvaliacao(AvaliacaoRequestVO request);
	
}
