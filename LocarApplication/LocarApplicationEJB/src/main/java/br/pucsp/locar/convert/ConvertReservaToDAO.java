package br.pucsp.locar.convert;

import java.text.SimpleDateFormat;

import br.pucsp.locar.entity.Login;
import br.pucsp.locar.entity.Reserva;
import br.pucsp.locar.entity.Veiculo;
import br.pucsp.locar.ws.dto.ReservaRequestDTO;

public class ConvertReservaToDAO {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	public static Reserva reservaRequestVOToReserva(ReservaRequestDTO request){
		
		Reserva reserva = new Reserva();
		
		try{
		
			reserva.setDtdevolucao(
					sdf.parse(request.getDataDevolucao()));
			reserva.setDtretirada(
					sdf.parse(request.getDataRetirada()));
			reserva.setObservacao(request.getObservacao());
			
			Login login = new Login();
			login.setIdLogin(request.getCodigoEstacionamento());
			reserva.setLoginByIdEstacionamento(login);
			
			login = new Login();
			login.setIdLogin(request.getCodigoLocatario());
			reserva.setLoginByIdLocatario(login);
			
			Veiculo veiculo = new Veiculo();
			veiculo.setPlaca(request.getPlaca());
			reserva.setVeiculo(veiculo);
		
		} catch (Exception e){
			System.out.println("Houve erro no método reservaRequestVOToReserva - Erro: " + e.getMessage());
			System.out.println("Houve erro no método reservaRequestVOToReserva - Erro: " + e);
		}
		
		return reserva;
		
	}
	
}
