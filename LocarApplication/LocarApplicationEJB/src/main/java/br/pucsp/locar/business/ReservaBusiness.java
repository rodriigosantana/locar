package br.pucsp.locar.business;

import br.pucsp.locar.convert.ConvertReservaToDAO;
import br.pucsp.locar.fabrica.DAOFabrica;
import br.pucsp.locar.ilocal.ReservaLocal;
import br.pucsp.locar.iremote.ReservaRemote;
import br.pucsp.locar.util.ReservaValidatorUtils;
import br.pucsp.locar.ws.vo.ReservaRequestVO;
import br.pucsp.locar.ws.vo.ReservaResponseVO;

public class ReservaBusiness implements ReservaLocal, ReservaRemote{

	@Override
	public ReservaResponseVO realizarReserva(ReservaRequestVO request) {
		
		System.out.println("Inicio do metodo realizarReserva - ReservaBusiness"); 
		
		ReservaResponseVO response = new ReservaResponseVO();
		
		try{
		
			String msg = ReservaValidatorUtils.validarDadosReserva(request);
			
			if (msg.trim().equals("")){
				
				int idReserva = DAOFabrica.getReservaDAO().salvarReserva(
						ConvertReservaToDAO.reservaRequestVOToReserva(request));
				
				if(idReserva > 0){
					response.setCodigoRetorno(0);
					response.setMensagemRetorno("Reserva realizada com sucesso!");
					response.setNumeroReserva(idReserva);
				} else {
					response.setCodigoRetorno(1);
					response.setMensagemRetorno("Houve problemas ao realizar reserva");
					response.setNumeroReserva(0);
				}
				
			} else {
				response.setCodigoRetorno(200);
				response.setMensagemRetorno("Dados informados inválidos - " + msg);
				response.setNumeroReserva(0);
			}
			
			
		} catch (Exception e){
			
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo realizarReserva - Erro: " + e.getMessage());
			
			throw e;
			
		} finally {
			
			System.out.println("Final do metodo realizarReserva - ReservaBusiness"); 
			
		}
		
		return response;

	}
}
