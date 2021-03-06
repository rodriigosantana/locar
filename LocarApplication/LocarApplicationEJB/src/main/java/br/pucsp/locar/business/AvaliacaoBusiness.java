package br.pucsp.locar.business;

import javax.ejb.Stateless;

import br.pucsp.locar.convert.ConvertAvaliacaoToDAO;
import br.pucsp.locar.fabrica.ClientWSFactory;
import br.pucsp.locar.fabrica.DAOFabrica;
import br.pucsp.locar.ilocal.AvaliacaoLocal;
import br.pucsp.locar.iremote.AvaliacaoRemote;
import br.pucsp.locar.util.AvaliacaoValidatorUtils;
import br.pucsp.locar.ws.dto.AvaliacaoRequestDTO;
import br.pucsp.locar.ws.dto.AvaliacaoResponseDTO;

@Stateless
public class AvaliacaoBusiness implements AvaliacaoLocal, AvaliacaoRemote {

	@Override
	public AvaliacaoResponseDTO enviarAvaliacao(AvaliacaoRequestDTO request) {

		System.out.println("Inicio do metodo enviarAvaliacao - AvaliacaoBusiness"); 
		
		AvaliacaoResponseDTO response = new AvaliacaoResponseDTO();
		
		String msgValidacao = "";
		
		try{
			
			msgValidacao = AvaliacaoValidatorUtils.validarAvaliacao(request);
			
			if(msgValidacao.equals("")){
			
				response.setTotalInclusoes(DAOFabrica.getAvaliacaoDAO()
						.salvarAvaliacao(ConvertAvaliacaoToDAO.avaliacaoRequestVOToAvaliacao(request)
								, ConvertAvaliacaoToDAO.avaliacaoRequestVOToAvaliacaolocacaoID(request)));
				
				response.setCodigoRetorno(0);
				response.setMensagemRetorno("Processamento realizado com sucesso");
			
			} else {
				
				response.setCodigoRetorno(200);
				response.setMensagemRetorno("Dados informados inválidos - " + msgValidacao);
				
			}
			
		}catch(Exception e){
			System.out.println("Houve erro no metodo enviarAvaliacao. Erro: " + e.getMessage());
			e.printStackTrace();
			
		}
		
		System.out.println("Final do metodo enviarAvaliacao - AvaliacaoBusiness");
		
		return response;
		
	}

}
