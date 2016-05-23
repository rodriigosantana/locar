package br.pucsp.locar.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.pucsp.locar.entity.Endereco;
import br.pucsp.locar.entity.Login;
import br.pucsp.locar.entity.Telefone;
import br.pucsp.locar.entity.Usuario;
import br.pucsp.locar.util.HibernateUtil;

public class CadastroDAO extends GenericoDAO {

	public boolean cadastrarUsuario(Login login
								   ,Usuario usuario
								   ,Endereco endereco
								   ,List<Telefone> listaTelefone)
			throws HibernateException{
		
		System.out.println("Inicio do metodo cadastrarUsuario - CadastroDAO");
		
		boolean result = false;
		
		Session session = HibernateUtil.openSession();
		Transaction transaction = HibernateUtil.initTransaction(session);
		
		try{
			
			login.setDtinclusao(new Date());
			
			incluir(login, session);
			
			for (Telefone tel : listaTelefone){
				tel.setLogin(login);
				incluir(tel, session);
			}
			
			incluir(endereco, session);
			
			usuario.setDtinclusao(new Date());
			usuario.setEndereco(endereco);
			usuario.setLogin(login);
			
			incluir(usuario, session);
			
			HibernateUtil.commitTransaction(transaction);
			
			result = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println("Houve erro no metodo cadastrarUsuario. Realizando Rollback.. - Erro: " + e.getMessage());
			
			HibernateUtil.rollbackTransaction(transaction);
			
			throw e;
		} finally {
			HibernateUtil.closeSession(session);
			
			System.out.println("Final do metodo cadastrarUsuario - CadastroDAO");
		}
		
		return result;
		
	}
	
}
