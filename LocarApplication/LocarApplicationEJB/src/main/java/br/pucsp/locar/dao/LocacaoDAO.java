package br.pucsp.locar.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import br.pucsp.locar.util.HibernateUtil;

public class LocacaoDAO extends GenericoDAO{

	public boolean isLocacao(int codigoLocacao){
		
		System.out.println("Inicio do metodo isLocacao - LocacaoDAO");
		
		boolean result = true;
		
		Session session = HibernateUtil.openSession();
		
		try{
			
			Query query = session.createQuery("from Locacao where idLocacao = :idLocacao ");
			query.setParameter("idLocacao", codigoLocacao);
			
			Object object = query.uniqueResult();
			
			if(object == null){
				
				result = false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo isLocacao - Erro: " + e.getMessage());
			
			result = false;
			
			throw e;
			
		} finally {
			
			HibernateUtil.closeSession(session);
		
			System.out.println("Final do metodo isLocacao - LocacaoDAO");
		}
		
		return result;
	}
	
}
