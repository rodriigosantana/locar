package br.pucsp.locar.iremote;

import javax.ejb.Remote;

import br.pucsp.locar.ws.vo.AvaliacaoRequestVO;
import br.pucsp.locar.ws.vo.AvaliacaoResponseVO;

@Remote
public interface AvaliacaoRemote {

	public AvaliacaoResponseVO enviarAvaliacao(AvaliacaoRequestVO request);
	
}
