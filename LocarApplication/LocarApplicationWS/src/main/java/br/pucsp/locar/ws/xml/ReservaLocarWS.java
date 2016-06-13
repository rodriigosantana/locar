package br.pucsp.locar.ws.xml;

import javax.jws.WebMethod;

import br.pucsp.locar.ws.dto.ReservaRequestDTO;
import br.pucsp.locar.ws.dto.ReservaResponseDTO;
import br.pucsp.locar.ws.util.InjectEJBUtils;

public class ReservaLocarWS {

	@WebMethod
	public ReservaResponseDTO realizarReserva(ReservaRequestDTO request){
		
		ReservaResponseDTO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getReservaRemoteEjb().realizarReserva(request);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new ReservaResponseDTO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}
	
}
