package br.pucsp.locar.ws.xml;

import javax.jws.WebMethod;

import br.pucsp.locar.ws.util.InjectEJBUtils;
import br.pucsp.locar.ws.vo.ConsultaVeiculoRequestVO;
import br.pucsp.locar.ws.vo.ConsultaVeiculoResponseVO;

public class ConsultaLocarWS {

	@WebMethod
	public ConsultaVeiculoResponseVO consultarListaVeiculo(ConsultaVeiculoRequestVO request){
		
		ConsultaVeiculoResponseVO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getConsultaRemoteEjb().consultarListaVeiculo(request);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new ConsultaVeiculoResponseVO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}
	
}
