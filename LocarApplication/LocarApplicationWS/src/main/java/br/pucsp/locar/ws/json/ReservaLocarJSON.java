package br.pucsp.locar.ws.json;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.pucsp.locar.ws.util.InjectEJBUtils;
import br.pucsp.locar.ws.vo.ReservaRequestVO;
import br.pucsp.locar.ws.vo.ReservaResponseVO;

@Path("/ReservaLocarJSON")
public class ReservaLocarJSON {
	
//	private static final Logger LOG = Logger.getLogger(ReservaLocarJSON.class);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/realizarReserva")
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
