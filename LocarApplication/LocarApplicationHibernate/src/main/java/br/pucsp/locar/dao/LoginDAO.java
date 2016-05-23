package br.pucsp.locar.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import br.pucsp.locar.util.HibernateUtil;

public class LoginDAO {

	public boolean isCadastroLogin(String login){
		
		System.out.println("Inicio do metodo verificarCadastroLogin - LoginDAO");
		
		boolean result = true;
		
		Session session = HibernateUtil.openSession();
		
		try{
			
			Query query = session.createQuery("from Login where idLogin = :idLogin ");
			query.setParameter("idLogin", login);

			Object object = query.uniqueResult();
			
			if(object == null){
				
				result = false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Não foi possível isCadastroLogin. Erro:" + e.getMessage());
			
		} finally {
			
			HibernateUtil.closeSession(session);
			
		}
		
		System.out.println("Final do metodo verificarCadastroLogin - LoginDAO");
		
		return result;
		
	}
	
}
