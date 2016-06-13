package br.pucsp.locar.ws.xml;

import javax.jws.WebMethod;

import br.pucsp.locar.ws.dto.ConsultaVeiculoRequestDTO;
import br.pucsp.locar.ws.dto.ConsultaVeiculoResponseDTO;
import br.pucsp.locar.ws.util.InjectEJBUtils;

public class ConsultaLocarWS {

	@WebMethod
	public ConsultaVeiculoResponseDTO consultarListaVeiculo(ConsultaVeiculoRequestDTO request){
		
		ConsultaVeiculoResponseDTO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getConsultaRemoteEjb().consultarListaVeiculo(request);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new ConsultaVeiculoResponseDTO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}
	
}
