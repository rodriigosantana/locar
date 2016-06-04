package br.pucsp.locar.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.pucsp.locar.entity.Questaoavaliacao;
import br.pucsp.locar.util.HibernateUtil;

public class QuestaoAvaliacaoDAO {
	
	public boolean isQuestao(int codQuestao){
		
		System.out.println("Inicio do metodo isQuestao - QuestaoAvaliacaoDAO");
		
		boolean result = true;
		
		Session session = HibernateUtil.openSession();
		
		try{
			
			Query query = session.createQuery("from Questaoavaliacao where idQuestao = :idQuestao ");
			query.setParameter("idQuestao", codQuestao);

			Object object = query.uniqueResult();
			
			if(object == null){
				
				result = false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Não foi possível isQuestao - Erro: " + e.getMessage());
			
		} finally {
			
			HibernateUtil.closeSession(session);
			
		}
		
		System.out.println("Final do metodo isQuestao - QuestaoAvaliacaoDAO");
		
		return result;
		
	}
	
	public List<Questaoavaliacao> listarByCodPerfil(final int codPerfil) {
		
		System.out.println("Inicio do metodo listarByCodPerfil - QuestaoAvaliacaoDAO"); 
		
		Session session = HibernateUtil.openSession();
		
		List<Questaoavaliacao> listaQuestoes = new ArrayList<Questaoavaliacao>();
		
		try {
			
			Query query = session.createQuery("from Questaoavaliacao where codperfil = :codPerfil ");
			query.setParameter("codPerfil", codPerfil);
			
			List listResult = query.list();
			
			if (listResult != null && listResult.size() > 0){
				
				listaQuestoes = (List<Questaoavaliacao>) listResult;
				
			}
			
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Não foi possível listar. Erro:" + e.getMessage());
		} finally {
			HibernateUtil.closeSession(session);
		}
		
		System.out.println("Final do metodo listarByCodPerfil - QuestaoAvaliacaoDAO");
		
		return listaQuestoes;
	}
	
}
