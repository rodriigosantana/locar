package br.pucsp.locar.ws.json.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DefaultResponse {

	private int codigoRetorno;
	private String mensagemRetorno;
	
	public int getCodigoRetorno() {
		return codigoRetorno;
	}
	public void setCodigoRetorno(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	public String getMensagemRetorno() {
		return mensagemRetorno;
	}
	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
	
}
