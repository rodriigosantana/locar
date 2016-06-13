package br.pucsp.locar.ws.json;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.pucsp.locar.ws.dto.ReservaRequestDTO;
import br.pucsp.locar.ws.dto.ReservaResponseDTO;
import br.pucsp.locar.ws.util.InjectEJBUtils;

@Path("/ReservaLocarJSON")
public class ReservaLocarJSON {
	
//	private static final Logger LOG = Logger.getLogger(ReservaLocarJSON.class);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/realizarReserva")
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
