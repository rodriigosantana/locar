package br.pucsp.locar.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.pucsp.locar.entity.Reserva;
import br.pucsp.locar.util.HibernateUtil;

public class ReservaDAO extends GenericoDAO {

	public int salvarReserva(Reserva reserva){
		
		System.out.println("Inicio do metodo salvarReserva - ReservaDAO");

		int result = 0;
		
		Session session = HibernateUtil.openSession();
		Transaction transaction = HibernateUtil.initTransaction(session);
		
		try{
			
			reserva.setDtinclusao(new Date());
			
			incluir(reserva, session);
			
			result = reserva.getIdReserva();
			
			HibernateUtil.commitTransaction(transaction);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo salvarReserva. Realizando Rollback.. - Erro: " + e.getMessage());
			
			HibernateUtil.rollbackTransaction(transaction);
			
			result = 0;
			
			throw e;
			
		} finally {
			System.out.println("Final do metodo salvarReserva - ReservaDAO");
		}
		
		return result;
	}
	
}
