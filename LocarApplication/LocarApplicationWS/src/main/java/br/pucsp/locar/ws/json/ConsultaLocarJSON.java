package br.pucsp.locar.ws.json;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.pucsp.locar.ws.util.InjectEJBUtils;
import br.pucsp.locar.ws.vo.ConsultaVeiculoRequestVO;
import br.pucsp.locar.ws.vo.ConsultaVeiculoResponseVO;

@Path("/ConsultaLocarJSON")
public class ConsultaLocarJSON {
	
//	private static final Logger LOG = Logger.getLogger(ConsultaLocarJSON.class);
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/realizarReserva")
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
