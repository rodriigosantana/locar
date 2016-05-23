package br.pucsp.locar.ws.xml;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.pucsp.locar.ilocal.CadastroLocal;
import br.pucsp.locar.ws.vo.CadastroVeiculoRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoResponseVO;

@WebService
public class CadastroVeiculoLocarWS {

	@EJB
	private CadastroLocal cadastro;
	
	@WebMethod
	public CadastroVeiculoResponseVO cadastrarVeiculo(
			@WebParam(name = "cadastroVeiculoRequestVO") CadastroVeiculoRequestVO request){
		
		System.out.println("Inicio do metodo cadastrarVeiculo - CadastroVeiculoLocarWS"); 
		
		CadastroVeiculoResponseVO response = new CadastroVeiculoResponseVO();
		
		try{
			
			response = cadastro.cadastrarVeiculo(request);
			
		} catch (Exception e){
			
			e.printStackTrace();
			
			System.out.println("Erro fatal no metodo cadastrarVeiculo - Erro: " + e.getMessage());
			
			response.setCodigoRetorno(99);
			response.setMensagemRetorno("Erro fatal no processamento!");
		}
		
		System.out.println("Final do metodo cadastrarVeiculo - CadastroVeiculoLocarWS"); 
		
		return response;
	}
	
}
