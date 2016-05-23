package br.pucsp.locar.ws.util;

import java.util.Hashtable;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.pucsp.locar.iremote.AvaliacaoRemote;
import br.pucsp.locar.iremote.CadastroRemote;
import br.pucsp.locar.iremote.QuestionarioRemote;

public class InjectEJBUtils {

	@EJB
	private static AvaliacaoRemote avaliacaoRemote;
	@EJB
	private static CadastroRemote cadastroRemote;
	@EJB
	private static QuestionarioRemote questionarioRemote;

	public static AvaliacaoRemote getAvaliacaoRemoteEjb() {
		try {
			final  Hashtable jndiProperties =  new  Hashtable (); 
			jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			
			Context ctx = new InitialContext(jndiProperties);
			
			String lookupName = "java:jboss/exported/LocarApplicationEAR-0.0.1-SNAPSHOT/LocarApplicationEJB/AvaliacaoBusiness!br.pucsp.locar.iremote.AvaliacaoRemote";
			avaliacaoRemote = (AvaliacaoRemote) InitialContext.doLookup(lookupName);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return avaliacaoRemote;
	}
	
	public static CadastroRemote getCadastroRemoteEjb() {
		try {
			final  Hashtable jndiProperties =  new  Hashtable (); 
			jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			
			Context ctx = new InitialContext(jndiProperties);
			
			String lookupName = "java:jboss/exported/LocarApplicationEAR-0.0.1-SNAPSHOT/LocarApplicationEJB/CadastroBusiness!br.pucsp.locar.iremote.CadastroRemote";
			cadastroRemote = (CadastroRemote) InitialContext.doLookup(lookupName);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return cadastroRemote;
	}
	
	public static QuestionarioRemote getQuestionarioRemoteEjb() {
		try {
			
			final  Hashtable jndiProperties =  new  Hashtable (); 
			jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			
			Context ctx = new InitialContext(jndiProperties);
			
			String lookupName = "java:jboss/exported/LocarApplicationEAR-0.0.1-SNAPSHOT/LocarApplicationEJB/QuestionarioBusiness!br.pucsp.locar.iremote.QuestionarioRemote";
			questionarioRemote = (QuestionarioRemote) ctx.lookup(lookupName);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return questionarioRemote;
	}

}
