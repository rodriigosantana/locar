package br.pucsp.locar.business;

import javax.ejb.Stateless;

import br.pucsp.locar.dao.ConvertAvaliacaoToDAO;
import br.pucsp.locar.fabrica.DAOFabrica;
import br.pucsp.locar.ilocal.AvaliacaoLocal;
import br.pucsp.locar.iremote.AvaliacaoRemote;
import br.pucsp.locar.ws.vo.AvaliacaoRequestVO;
import br.pucsp.locar.ws.vo.AvaliacaoResponseVO;

@Stateless
public class AvaliacaoBusiness implements AvaliacaoLocal, AvaliacaoRemote {

	@Override
	public AvaliacaoResponseVO enviarAvaliacao(AvaliacaoRequestVO request) {

		System.out.println("Inicio do metodo enviarAvaliacao - AvaliacaoBusiness"); 
		
		AvaliacaoResponseVO response = new AvaliacaoResponseVO();
		
		try{
			
			response.setTotalInclusoes(DAOFabrica.getAvaliacaoDAO()
					.salvarAvaliacao(ConvertAvaliacaoToDAO.avaliacaoRequestVOToAvaliacao(request)
							, ConvertAvaliacaoToDAO.avaliacaoRequestVOToAvaliacaolocacaoID(request)));
			
			response.setCodigoRetorno(0);
			response.setMensagemRetorno("Processamento realizado com sucesso");
			
		}catch(Exception e){
			System.out.println("Houve erro no metodo enviarAvaliacao. Erro: " + e.getMessage());
			e.printStackTrace();
			
			throw e;
		}
		
		System.out.println("Final do metodo enviarAvaliacao - AvaliacaoBusiness");
		
		return response;
		
	}

}
