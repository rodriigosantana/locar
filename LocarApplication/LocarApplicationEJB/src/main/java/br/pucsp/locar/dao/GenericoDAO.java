package br.pucsp.locar.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.pucsp.locar.connection.HibernateConnection;

public class GenericoDAO {

	public void incluir(Object object, Session session) {
		
		try {
			session.save(object);
		} catch (HibernateException e) {
			System.out.println("Não foi possível inserir - Classe/Entity: "+ object.getClass().getName() +". Erro:" + e.getMessage());
		}
	}
	
	public void atualizar(Object object, Session session) {
		
		try {
			session.update(object);
		} catch (HibernateException e) {
			System.out.println("Não foi possível atualizar - Classe/Entity: "+ object.getClass().getName() +". Erro:" + e.getMessage());
		}
	}
	
	public void deletar(Object object, Session session) {
		
		try {
			session.delete(object);
		} catch (HibernateException e) {
			System.out.println("Não foi possível deletar - Classe/Entity: "+ object.getClass().getName() +". Erro:" + e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> listar(Object object, Session session) {
		
		List<T> listaObject = new ArrayList<T>();
		
		try {
			session = HibernateConnection.getSessionFactory().openSession();
			Criteria filtro = session.createCriteria(Object.class);
			
			listaObject = filtro.list();
			
		} catch (HibernateException e) {
			System.out.println("Não foi possível listar. Erro:" + e.getMessage());
		} 		
		return listaObject;
	}
	
}
