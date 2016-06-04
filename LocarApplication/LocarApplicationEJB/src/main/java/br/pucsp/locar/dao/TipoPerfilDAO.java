package br.pucsp.locar.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.pucsp.locar.entity.Tipoperfil;
import br.pucsp.locar.util.HibernateUtil;

public class TipoPerfilDAO {

	public Tipoperfil consultarTipoperfil(final int codPerfil) {

		System.out.println("Inicio do metodo consultarTipoperfil - TipoPerfilDAO");

		Session session = HibernateUtil.openSession();

		Tipoperfil tipoPerfil = null;

		try {

			Query query = session.createQuery("from Tipoperfil where codperfil = :codPerfil ");
			query.setParameter("codPerfil", codPerfil);

			Object result = query.uniqueResult();
			
			if(result != null)
			
				tipoPerfil = (Tipoperfil) result;

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Não foi possível consultarTipoperfil. Erro:" + e.getMessage());
		} finally {
			HibernateUtil.closeSession(session);
		}

		System.out.println("Final do metodo consultarTipoperfil - TipoPerfilDAO");

		return tipoPerfil;
	}
}
