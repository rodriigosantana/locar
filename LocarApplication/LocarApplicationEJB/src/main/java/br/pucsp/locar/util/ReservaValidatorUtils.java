package br.pucsp.locar.util;

import java.text.SimpleDateFormat;

import br.pucsp.locar.ws.dto.ReservaRequestDTO;

public class ReservaValidatorUtils {

	public static String validarDadosReserva(ReservaRequestDTO request){
		
		StringBuilder msgResult = new StringBuilder();
		
		if(request == null){
			msgResult.append("Dados n�o informados!");
		} else {
			
			if(request.getCodigoEstacionamento() == null ||
					request.getCodigoEstacionamento().trim().equals("")){
				msgResult.append("C�digo do Estacionamento n�o informado;");
			}
			if(request.getCodigoLocatario() == null ||
					request.getCodigoEstacionamento().trim().equals("")){
				msgResult.append("C�digo do Locat�rio n�o informado;");
			}
			if(request.getDataDevolucao() == null){
				msgResult.append("Data de devolu��o n�o informada;");
			} else {
				try{
					new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(request.getDataDevolucao());
				} catch (Exception e) {
					msgResult.append("Data de devolu��o inv�lida;");
				}
			}
			
			if(request.getDataRetirada() == null){
				msgResult.append("Data de retirada n�o informada;");
			} else {
				try{
					new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(request.getDataRetirada());
				} catch (Exception e) {
					msgResult.append("Data de retirada inv�lida;");
				}
			}
			if(request.getPlaca() == null ||
					request.getPlaca().trim().equals("")){
				msgResult.append("Placa n�o informada;");
			}
			
		}
		
		return msgResult.toString();
		
	}
	
}
