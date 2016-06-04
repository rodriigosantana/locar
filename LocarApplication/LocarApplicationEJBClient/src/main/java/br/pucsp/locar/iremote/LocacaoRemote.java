package br.pucsp.locar.iremote;

import br.pucsp.locar.ws.vo.LocacaoRequestVO;
import br.pucsp.locar.ws.vo.LocacaoResponseVO;

public interface LocacaoRemote {

	public LocacaoResponseVO realizarLocacao(LocacaoRequestVO request);
	
}
