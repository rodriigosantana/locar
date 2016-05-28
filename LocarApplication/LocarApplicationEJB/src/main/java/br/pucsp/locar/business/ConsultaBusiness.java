package br.pucsp.locar.business;

import java.util.ArrayList;
import java.util.List;

import br.pucsp.locar.entity.Veiculo;
import br.pucsp.locar.fabrica.DAOFabrica;
import br.pucsp.locar.ilocal.ConsultaLocal;
import br.pucsp.locar.iremote.ConsultaRemote;
import br.pucsp.locar.vo.VeiculoVO;
import br.pucsp.locar.ws.vo.ConsultaVeiculoRequestVO;
import br.pucsp.locar.ws.vo.ConsultaVeiculoResponseVO;

public class ConsultaBusiness implements ConsultaLocal, ConsultaRemote{

	@Override
	public ConsultaVeiculoResponseVO consultarListaVeiculo(ConsultaVeiculoRequestVO request) {
		
		System.out.println("Inicio do metodo consultarListaVeiculo - ConsultaBusiness"); 
		
		ConsultaVeiculoResponseVO response = new ConsultaVeiculoResponseVO();
		
		List<VeiculoVO> veiculos = new ArrayList<VeiculoVO>();
		
		try{
			
			if(request != null && !request.getCodigoLocador().trim().equals("")){
				
				List<Veiculo> listaVeiculo = 
						DAOFabrica.getVeiculoDAO().listarVeiculos(
								request.getCodigoLocador());
				
				if(listaVeiculo.size() > 0){
					
					for(Veiculo veiculo: listaVeiculo){
						
						VeiculoVO veiculoVO = new VeiculoVO();
						
						veiculoVO.setCapacidadeTanque(veiculo.getCapacidadeTanque());
						veiculoVO.setChassi(veiculo.getChassi());
						veiculoVO.setNumPortas(veiculo.getNumPortas());
						veiculoVO.setPlaca(veiculo.getPlaca());
						veiculoVO.setRenavam(veiculo.getRenavam());
						
						veiculos.add(veiculoVO);
					}
					
					response.setListaVeiculo(veiculos);
					
				} 
				
				response.setCodigoRetorno(0);
				response.setMensagemRetorno("Processamento realizado com sucesso!");
				
			} else {
				response.setCodigoRetorno(200);
				response.setMensagemRetorno("Placa informada inválida!");
			}
			
		}catch(Exception e){
			System.out.println("Houve erro no metodo consultarListaVeiculo. Erro: " + e.getMessage());
			e.printStackTrace();
			
			throw e;
		}
		
		System.out.println("Final do metodo consultarListaVeiculo - ConsultaBusiness");
		
		return response;
	}

}
