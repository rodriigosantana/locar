package br.pucsp.locar.fabrica;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.rpc.ServiceException;

import br.com.detran.DetranWSServiceLocator;
import br.com.detran.DetranWSServiceSoapBindingStub;
import br.com.receitafederal.ReceitaFederalServiceLocator;
import br.com.receitafederal.ReceitaFederalServiceSoapBindingStub;
import br.com.seguradora.SeguradoraServiceLocator;
import br.com.seguradora.SeguradoraServiceSoapBindingStub;
import br.com.serasa.SerasaWSServiceLocator;
import br.com.serasa.SerasaWSServiceSoapBindingStub;

public class ClientWSFactory {

	private static DetranWSServiceSoapBindingStub detranWSServiceSoapBindingStub;
	private static ReceitaFederalServiceSoapBindingStub receitaFederalServiceSoapBindingStub;
	private static SeguradoraServiceSoapBindingStub seguradoraServiceSoapBindingStub;
	private static SerasaWSServiceSoapBindingStub serasaWSServiceSoapBindingStub;
	
	public static DetranWSServiceSoapBindingStub getDetranWSServiceSoapBindingStub(){
		if (detranWSServiceSoapBindingStub == null){
			try {
				DetranWSServiceLocator locator = new DetranWSServiceLocator();
				URL url;
			
				url = new URL("http://Note-PC:8088/mockDetranWSServiceSoapBinding");
			
				detranWSServiceSoapBindingStub = (DetranWSServiceSoapBindingStub)locator.getDetranWSPort(url);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return detranWSServiceSoapBindingStub;
	}
	
	public static ReceitaFederalServiceSoapBindingStub getReceitaFederalServiceSoapBindingStub(){
		if (receitaFederalServiceSoapBindingStub == null){
			try {
				ReceitaFederalServiceLocator locator = new ReceitaFederalServiceLocator();
				URL url;
			
				url = new URL("http://Note-PC:8088/mockReceitaFederalServiceSoapBinding");
			
				receitaFederalServiceSoapBindingStub = (ReceitaFederalServiceSoapBindingStub)locator.getReceitaFederalPort(url);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return receitaFederalServiceSoapBindingStub;
	}
	
	public static SeguradoraServiceSoapBindingStub getSeguradoraServiceSoapBindingStub(){
		if (seguradoraServiceSoapBindingStub == null){
			try {
				SeguradoraServiceLocator locator = new SeguradoraServiceLocator();
				URL url;
			
				url = new URL("http://Note-PC:8088/mockSeguradoraServiceSoapBinding");
			
				seguradoraServiceSoapBindingStub = (SeguradoraServiceSoapBindingStub)locator.getSeguradoraPort(url);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return seguradoraServiceSoapBindingStub;
	}
	
	public static SerasaWSServiceSoapBindingStub getSerasaWSServiceSoapBindingStub(){
		if (serasaWSServiceSoapBindingStub == null){
			try {
				SerasaWSServiceLocator locator = new SerasaWSServiceLocator();
				URL url;
			
				url = new URL("http://Note-PC:8088/mockSerasaWSServiceSoapBinding");
			
				serasaWSServiceSoapBindingStub = (SerasaWSServiceSoapBindingStub)locator.getSerasaWSPort(url);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		return serasaWSServiceSoapBindingStub;
	}
}
