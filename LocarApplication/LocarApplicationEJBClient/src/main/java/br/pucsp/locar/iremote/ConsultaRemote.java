package br.pucsp.locar.iremote;

import javax.ejb.Remote;

import br.pucsp.locar.ws.vo.ConsultaVeiculoRequestVO;
import br.pucsp.locar.ws.vo.ConsultaVeiculoResponseVO;

@Remote
public interface ConsultaRemote {

	public ConsultaVeiculoResponseVO consultarListaVeiculo(ConsultaVeiculoRequestVO request);
	
}
