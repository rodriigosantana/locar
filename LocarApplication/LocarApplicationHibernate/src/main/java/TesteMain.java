import java.util.List;
import java.util.Set;

import br.pucsp.locar.dao.TipoVeiculoDAO;
import br.pucsp.locar.entity.Tipoveiculo;

public class TesteMain {

	public static void main(String[] args) {
		TipoVeiculoDAO tipo = new TipoVeiculoDAO();
		
		Tipoveiculo tipoV = new Tipoveiculo();

		tipoV.setDescricao("Teste2");
//		tipoV.setModeloveiculos(new Set());
		
		tipo.salvar(tipoV);
		System.out.println(tipoV.getCodTipoVeiculo());
		
//		List<Tipoveiculo> lista = tipo.listar();
//		
//		if (lista != null && lista.size() > 0)
//		for (Tipoveiculo v: lista){
//			System.out.println("cod v: " + v.getCodTipoVeiculo());
//			System.out.println("desc v: " + v.getDescricao());
//		}
		
		
//		List<Tipoveiculo> lista = tipo.listar2();
//		
//		if (lista != null && lista.size() > 0)
//		for (Tipoveiculo v: lista){
//			System.out.println("cod v: " + v.getCodTipoVeiculo());
//			System.out.println("desc v: " + v.getDescricao());
//		}

	}

}
