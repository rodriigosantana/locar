package br.pucsp.locar.ilocal;

import br.pucsp.locar.ws.vo.LocacaoRequestVO;
import br.pucsp.locar.ws.vo.LocacaoResponseVO;

public interface LocacaoLocal {

	public LocacaoResponseVO realizarLocacao(LocacaoRequestVO request);
	
}
