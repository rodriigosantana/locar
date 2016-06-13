package br.pucsp.locar.convert;

import java.util.ArrayList;
import java.util.List;

import br.pucsp.locar.dto.AvaliacaoDTO;
import br.pucsp.locar.entity.Avaliacao;
import br.pucsp.locar.entity.AvaliacaolocacaoId;
import br.pucsp.locar.entity.Questaoavaliacao;
import br.pucsp.locar.ws.dto.AvaliacaoRequestDTO;

public class ConvertAvaliacaoToDAO {

	public static List<Avaliacao> avaliacaoRequestVOToAvaliacao(AvaliacaoRequestDTO request){
		
		List<Avaliacao> listaAvalicao = new ArrayList<Avaliacao>();
		
		for (AvaliacaoDTO avaliacaoVO : request.getListaAvaliacaoVO()){
		
			Avaliacao avaliacao = new Avaliacao();
			
			avaliacao.setComentario(avaliacaoVO.getDescricao());
			avaliacao.setNota(avaliacaoVO.getNota());
			
			Questaoavaliacao questaoAvaliacao = new Questaoavaliacao();
			questaoAvaliacao.setIdQuestao(avaliacaoVO.getCodigoQuestao());
			
			avaliacao.setQuestaoavaliacao(questaoAvaliacao);
			
			listaAvalicao.add(avaliacao);
		
		}
		
		return listaAvalicao;
		
	}
	
	public static AvaliacaolocacaoId avaliacaoRequestVOToAvaliacaolocacaoID(AvaliacaoRequestDTO request){
		
		AvaliacaolocacaoId avaliacaolocacaoId = new AvaliacaolocacaoId();
		
		avaliacaolocacaoId.setIdLocacao(request.getCodigoLocacao());
		avaliacaolocacaoId.setIdLogin(request.getCodigoLoginAvaliador());
		
		return avaliacaolocacaoId;
		
	}
	
	
	
}
