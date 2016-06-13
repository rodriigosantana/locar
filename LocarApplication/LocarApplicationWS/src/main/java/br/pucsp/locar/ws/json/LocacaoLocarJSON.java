package br.pucsp.locar.ws.json;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.pucsp.locar.ws.dto.LocacaoRequestDTO;
import br.pucsp.locar.ws.dto.LocacaoResponseDTO;
import br.pucsp.locar.ws.util.InjectEJBUtils;

@Path("/LocacaoLocarJSON")
public class LocacaoLocarJSON {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/realizarLocacao")
	public LocacaoResponseDTO realizarLocacao(LocacaoRequestDTO request){
		
		LocacaoResponseDTO response = null;
		String msgErro = "";
		
		try{

			response = InjectEJBUtils.getLocacaoRemoteEjb().realizarLocacao(request);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			msgErro = e.getMessage();

		}
		if ( response == null ) {
			response = new LocacaoResponseDTO();
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Houve erro no processamento! - Erro: " + msgErro);
		}
		
		return response;
	}

}
