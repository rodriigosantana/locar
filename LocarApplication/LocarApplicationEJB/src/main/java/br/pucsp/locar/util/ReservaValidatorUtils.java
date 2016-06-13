package br.pucsp.locar.util;

import java.text.SimpleDateFormat;

import br.pucsp.locar.ws.dto.ReservaRequestDTO;

public class ReservaValidatorUtils {

	public static String validarDadosReserva(ReservaRequestDTO request){
		
		StringBuilder msgResult = new StringBuilder();
		
		if(request == null){
			msgResult.append("Dados não informados!");
		} else {
			
			if(request.getCodigoEstacionamento() == null ||
					request.getCodigoEstacionamento().trim().equals("")){
				msgResult.append("Código do Estacionamento não informado;");
			}
			if(request.getCodigoLocatario() == null ||
					request.getCodigoEstacionamento().trim().equals("")){
				msgResult.append("Código do Locatário não informado;");
			}
			if(request.getDataDevolucao() == null){
				msgResult.append("Data de devolução não informada;");
			} else {
				try{
					new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(request.getDataDevolucao());
				} catch (Exception e) {
					msgResult.append("Data de devolução inválida;");
				}
			}
			
			if(request.getDataRetirada() == null){
				msgResult.append("Data de retirada não informada;");
			} else {
				try{
					new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(request.getDataRetirada());
				} catch (Exception e) {
					msgResult.append("Data de retirada inválida;");
				}
			}
			if(request.getPlaca() == null ||
					request.getPlaca().trim().equals("")){
				msgResult.append("Placa não informada;");
			}
			
		}
		
		return msgResult.toString();
		
	}
	
}
