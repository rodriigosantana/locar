package br.pucsp.locar.util;

import br.pucsp.locar.dto.AvaliacaoDTO;
import br.pucsp.locar.fabrica.DAOFabrica;
import br.pucsp.locar.ws.dto.AvaliacaoRequestDTO;

public class AvaliacaoValidatorUtils {

	public static String validarAvaliacao(AvaliacaoRequestDTO avaliacao){
		
		String result = "";
		
		if(avaliacao.getCodigoLocacao() <= 0 || 
				!DAOFabrica.getLocacaoDAO().isLocacao(avaliacao.getCodigoLocacao()) ){
			result = "codigoLocacao invalido;";
		}
		
		if(avaliacao.getCodigoLoginAvaliador() == null || 
				!DAOFabrica.getLoginDAO().isCadastroLogin(avaliacao.getCodigoLoginAvaliador()) ){
			result = "codigoLoginAvaliador invalido;";
		}
		
		if(avaliacao.getListaAvaliacaoVO() == null ||
				avaliacao.getListaAvaliacaoVO().size() == 0){
			
			result = "listaAvaliacaoVO invalida;";
			
		} else {
			
			for(AvaliacaoDTO avaliacaoVO : avaliacao.getListaAvaliacaoVO()){
				
				if(avaliacaoVO.getCodigoQuestao() <= 0 ||
						!DAOFabrica.getQuestaoAvaliacaoDAO().isQuestao(avaliacaoVO.getCodigoQuestao()) ){
					result = "codigoQuestao " + avaliacaoVO.getCodigoQuestao() + " invalido;";
				}
				
				if(avaliacaoVO.getNota() == null ||
						avaliacaoVO.getNota().doubleValue() <= 0.0 ||
						avaliacaoVO.getNota().doubleValue() > 5.0 ){
					result = "nota " + avaliacaoVO.getNota() 
							+ " invalido para codigoQuestao" 
							+ avaliacaoVO.getCodigoQuestao() + ";";
				}
				
			}
			
		}
		
		return result;
		
	}
	
}
