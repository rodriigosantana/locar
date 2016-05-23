package br.pucsp.locar.ws.json.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CadastroLocarResponse {
	
	private String teste;

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

}
