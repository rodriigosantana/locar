package br.pucsp.locar.ws.xml;

import javax.jws.WebMethod;

import br.pucsp.locar.ws.util.InjectEJBUtils;
import br.pucsp.locar.ws.vo.ReservaRequestVO;
import br.pucsp.locar.ws.vo.ReservaResponseVO;

public class ReservaLocarWS {

	@WebMethod
	public ReservaResponseVO realizarReserva(ReservaRequestVO request){
		
		ReservaResponseVO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getReservaRemoteEjb().realizarReserva(request);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new ReservaResponseVO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
		
	}
	
}
