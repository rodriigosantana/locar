package br.pucsp.locar.ilocal;

import javax.ejb.Local;

import br.pucsp.locar.ws.vo.ConsultaVeiculoRequestVO;
import br.pucsp.locar.ws.vo.ConsultaVeiculoResponseVO;

@Local
public interface ConsultaLocal {

	public ConsultaVeiculoResponseVO consultarListaVeiculo(ConsultaVeiculoRequestVO request);
	
}
