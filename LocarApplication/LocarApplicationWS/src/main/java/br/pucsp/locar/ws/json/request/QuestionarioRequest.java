package br.pucsp.locar.ws.json.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class QuestionarioRequest {

	private int codigoPerfil;

	public int getCodigoPerfil() {
		return codigoPerfil;
	}

	public void setCodigoPerfil(int codigoPerfil) {
		this.codigoPerfil = codigoPerfil;
	}
	
}
