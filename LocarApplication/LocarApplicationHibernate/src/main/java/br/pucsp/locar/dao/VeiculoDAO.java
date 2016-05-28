package br.pucsp.locar.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.pucsp.locar.entity.Login;
import br.pucsp.locar.entity.Veiculo;
import br.pucsp.locar.util.HibernateUtil;

public class VeiculoDAO extends GenericoDAO {

	public List<Veiculo> listarVeiculos(String idLocador)
			throws HibernateException{
		
		System.out.println("Inicio do metodo listarVeiculos - VeiculoDAO");
		
		List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
		
		Session session = HibernateUtil.openSession();
		
		try{
		
			Login login = new Login();
			login.setIdLogin(idLocador);
			
			Veiculo veiculo = new Veiculo();
			veiculo.setLogin(login);
			
			List listaResult = listar(veiculo, session);
			
			if (listaResult != null && listaResult.size() > 0){
				listaVeiculo = (List<Veiculo>) listaResult;
			}
			
		} catch(HibernateException e){
			
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo listarVeiculos - Erro: " + e.getMessage());
			
			throw e;
			
		} finally {
			
			HibernateUtil.closeSession(session);
		
			System.out.println("Final do metodo cadastrarVeiculo - VeiculoDAO");
		}
		
		return listaVeiculo;
	}
	
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
