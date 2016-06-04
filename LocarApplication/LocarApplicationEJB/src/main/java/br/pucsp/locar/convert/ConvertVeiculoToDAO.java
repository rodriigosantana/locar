package br.pucsp.locar.convert;

import br.pucsp.locar.entity.Login;
import br.pucsp.locar.entity.Modeloveiculo;
import br.pucsp.locar.entity.Veiculo;
import br.pucsp.locar.ws.vo.CadastroVeiculoRequestVO;

public class ConvertVeiculoToDAO {

	public static Veiculo cadastroVeiculoRequestVOToVeiculo(CadastroVeiculoRequestVO request){
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setCapacidadeTanque(request.getCapacidadeTanqueCombustivel());
		veiculo.setChassi(request.getChassi());
		
		Login login = new Login();
		login.setIdLogin(request.getCodigoLocador());
		
		veiculo.setLogin(login);
		
		Modeloveiculo modelo = new Modeloveiculo();
		modelo.setCodModelo(request.getModeloVeiculo());
		veiculo.setModeloveiculo(modelo);
		
		veiculo.setNumPortas(request.getNumeroPortas());
		veiculo.setPlaca(request.getPlaca());
		veiculo.setRenavam(request.getRenavam());
		
		return veiculo;
		
	}
	
}
