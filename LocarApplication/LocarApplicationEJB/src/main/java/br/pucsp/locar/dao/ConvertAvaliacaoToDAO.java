package br.pucsp.locar.dao;

import java.util.ArrayList;
import java.util.List;

import br.pucsp.locar.entity.Avaliacao;
import br.pucsp.locar.entity.AvaliacaolocacaoId;
import br.pucsp.locar.entity.Questaoavaliacao;
import br.pucsp.locar.vo.AvaliacaoVO;
import br.pucsp.locar.ws.vo.AvaliacaoRequestVO;

public class ConvertAvaliacaoToDAO {

	public static List<Avaliacao> avaliacaoRequestVOToAvaliacao(AvaliacaoRequestVO request){
		
		List<Avaliacao> listaAvalicao = new ArrayList<Avaliacao>();
		
		for (AvaliacaoVO avaliacaoVO : request.getListaAvaliacaoVO()){
		
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
	
	public static AvaliacaolocacaoId avaliacaoRequestVOToAvaliacaolocacaoID(AvaliacaoRequestVO request){
		
		AvaliacaolocacaoId avaliacaolocacaoId = new AvaliacaolocacaoId();
		
		avaliacaolocacaoId.setIdLocacao(request.getCodigoLocacao());
		avaliacaolocacaoId.setIdLogin(request.getCodigoLoginAvaliador());
		
		return avaliacaolocacaoId;
		
	}
	
	
	
}
