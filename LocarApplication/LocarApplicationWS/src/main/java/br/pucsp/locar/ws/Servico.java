package br.pucsp.locar.ws;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

import br.pucsp.locar.ws.json.AvaliacaoLocarJSON;
import br.pucsp.locar.ws.json.CadastroLocarJSON;
import br.pucsp.locar.ws.json.ConsultaLocarJSON;
import br.pucsp.locar.ws.json.ReservaLocarJSON;

/*ESSA CLASSE VAMOS PRECISAR ADICIONAR NO ARQUIVO DE CONFIGURAÇÃO(web.xml)*/

public class Servico extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public Servico() {
		singletons.add(new CadastroLocarJSON());
		singletons.add(new AvaliacaoLocarJSON());
		singletons.add(new ConsultaLocarJSON());
		singletons.add(new ReservaLocarJSON());
	}

	public Set<Object> getSingletons() {
		return singletons;
	}

	public Set<Class<?>> getEmpty() {
		return empty;
	}

}
