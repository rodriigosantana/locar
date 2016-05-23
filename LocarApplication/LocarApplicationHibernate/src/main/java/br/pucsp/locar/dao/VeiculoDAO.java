package br.pucsp.locar.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.pucsp.locar.entity.Veiculo;
import br.pucsp.locar.util.HibernateUtil;

public class VeiculoDAO extends GenericoDAO {

	public String cadastrarVeiculo(Veiculo veiculo)
			throws HibernateException{

		System.out.println("Inicio do metodo cadastrarVeiculo - VeiculoDAO");

		String result = "";
		
		Session session = HibernateUtil.openSession();
		Transaction transaction = HibernateUtil.initTransaction(session);
		
		try{
			
			incluir(veiculo, session);
			
			result = veiculo.getPlaca();
			
			HibernateUtil.commitTransaction(transaction);
			
		} catch(HibernateException e){
			
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo cadastrarVeiculo. Realizando Rollback.. - Erro: " + e.getMessage());
			
			HibernateUtil.rollbackTransaction(transaction);
			
			throw e;
			
		} finally {
			
			HibernateUtil.closeSession(session);
		
			System.out.println("Final do metodo cadastrarVeiculo - VeiculoDAO");
		}
		
		return result;
		
		
		
	}
	
}
