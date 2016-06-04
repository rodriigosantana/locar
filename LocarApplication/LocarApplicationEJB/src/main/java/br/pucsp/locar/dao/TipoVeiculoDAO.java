package br.pucsp.locar.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.pucsp.locar.entity.Tipoveiculo;
import br.pucsp.locar.util.HibernateUtil;

public class TipoVeiculoDAO {

	public void salvar(Tipoveiculo tipoveiculo) {
		
		Session session = HibernateUtil.openSession();
		Transaction transaction;
		
		try {
			transaction = HibernateUtil.initTransaction(session);
			session.save(tipoveiculo);
			HibernateUtil.commitTransaction(transaction);
		} catch (HibernateException e) {
			System.out.println("Não foi possível inserir. Erro:" + e.getMessage());
		} finally {
			HibernateUtil.closeSession(session);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Tipoveiculo> listar() {
		
		Session session = HibernateUtil.openSession();
		
		List<Tipoveiculo> listaTipoVeiculos = new ArrayList<Tipoveiculo>();
		
		try {
			Criteria filtro = session.createCriteria(Tipoveiculo.class);
			
			@SuppressWarnings("rawtypes")
			List listaReturn = filtro.list();
			
			if (listaReturn != null && listaReturn.size() > 0)
				listaTipoVeiculos = (ArrayList<Tipoveiculo>) listaReturn;
			
		} catch (HibernateException e) {
			System.out.println("Não foi possível listar. Erro:" + e.getMessage());
		} finally {
			HibernateUtil.closeSession(session);
		}
		
		return listaTipoVeiculos;
	}
	
	@SuppressWarnings("unchecked")
	public List<Tipoveiculo> listar2() {
		
		Session session = HibernateUtil.openSession();
		
		List<Tipoveiculo> listaTipoVeiculos = new ArrayList<Tipoveiculo>();
		
		GenericoDAO genericDAO = new GenericoDAO();
		
		try {
			listaTipoVeiculos = genericDAO.listar(Tipoveiculo.class, session);
			
		} catch (HibernateException e) {
			System.out.println("Não foi possível listar. Erro:" + e.getMessage());
		} finally {
			HibernateUtil.closeSession(session);
		}
		
		return listaTipoVeiculos;
	}

}
