package br.pucsp.locar.fabrica;

import br.pucsp.locar.dao.AvaliacaoDAO;
import br.pucsp.locar.dao.CadastroDAO;
import br.pucsp.locar.dao.LoginDAO;
import br.pucsp.locar.dao.QuestaoAvaliacaoDAO;
import br.pucsp.locar.dao.ReservaDAO;
import br.pucsp.locar.dao.TipoPerfilDAO;
import br.pucsp.locar.dao.VeiculoDAO;

public class DAOFabrica {

	private static QuestaoAvaliacaoDAO questaoAvaliacaoDAO;
	private static AvaliacaoDAO avaliacaoDAO;
	private static TipoPerfilDAO tipoPerfilDAO;
	private static VeiculoDAO veiculoDAO;
	private static LoginDAO loginDAO;
	private static CadastroDAO cadastroDAO;
	private static ReservaDAO reservaDAO;
	
	public static QuestaoAvaliacaoDAO getQuestaoAvaliacaoDAO() {
		
		if(questaoAvaliacaoDAO == null){
			questaoAvaliacaoDAO = new QuestaoAvaliacaoDAO(); 
		}
		
		return questaoAvaliacaoDAO;
		
	}
	
	public static AvaliacaoDAO getAvaliacaoDAO() {
		
		if(avaliacaoDAO == null){
			avaliacaoDAO = new AvaliacaoDAO(); 
		}
		
		return avaliacaoDAO;
		
	}

	public static TipoPerfilDAO getTipoPerfilDAO() {
		
		if(tipoPerfilDAO == null){
			tipoPerfilDAO = new TipoPerfilDAO();
		}
		return tipoPerfilDAO;
	}
	
	public static VeiculoDAO getVeiculoDAO() {
		
		if(veiculoDAO == null){
			veiculoDAO = new VeiculoDAO();
		}
		return veiculoDAO;
	}

	public static LoginDAO getLoginDAO() {
		if(loginDAO == null){
			loginDAO = new LoginDAO();
		}
		return loginDAO;
	}

	public static CadastroDAO getCadastroDAO() {
		if(cadastroDAO == null){
			cadastroDAO = new CadastroDAO();
		}
		return cadastroDAO;
	}
	
	public static ReservaDAO getReservaDAO(){
		if(reservaDAO == null){
			reservaDAO = new ReservaDAO();
		}
		return reservaDAO;
	}
	
}
