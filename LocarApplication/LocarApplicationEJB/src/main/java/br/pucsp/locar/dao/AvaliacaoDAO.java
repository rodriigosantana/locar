package br.pucsp.locar.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.pucsp.locar.entity.Avaliacao;
import br.pucsp.locar.entity.Avaliacaolocacao;
import br.pucsp.locar.entity.AvaliacaolocacaoId;
import br.pucsp.locar.util.HibernateUtil;

public class AvaliacaoDAO extends GenericoDAO {

	public int salvarAvaliacao(List<Avaliacao> listaAvaliacao, AvaliacaolocacaoId avaliacaolocacaoid) 
			throws HibernateException{

		System.out.println("Inicio do metodo salvarAvaliacao - AvaliacaoDAO");

		int result = 0;
		
		Session session = HibernateUtil.openSession();
		Transaction transaction = HibernateUtil.initTransaction(session);
		
		try{
			
			for(Avaliacao avaliacao: listaAvaliacao){
			
				avaliacao.setDtinclusao(new Date());
				
				incluir(avaliacao, session);
				
				avaliacaolocacaoid.setIdAvaliacao(avaliacao.getIdAvaliacao());
				
				Avaliacaolocacao avaliacaolocacao = new Avaliacaolocacao();
				
				avaliacaolocacao.setId(avaliacaolocacaoid);
				
				incluir(avaliacaolocacao, session);
				
				result++;
			
			}
			
			HibernateUtil.commitTransaction(transaction);
		
		} catch(HibernateException e){
			
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo salvarAvaliacao. Realizando Rollback.. - Erro: " + e.getMessage());
			
			HibernateUtil.rollbackTransaction(transaction);
			
			result = 0;
			
			throw e;
			
		} finally {
			
			HibernateUtil.closeSession(session);
		
			System.out.println("Final do metodo salvarAvaliacao - AvaliacaoDAO");
		}
		
		return result;
	}

}
