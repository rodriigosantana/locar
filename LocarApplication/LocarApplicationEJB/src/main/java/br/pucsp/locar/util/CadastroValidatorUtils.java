package br.pucsp.locar.util;

import java.util.List;

import br.pucsp.locar.vo.EnderecoVO;
import br.pucsp.locar.vo.TelefoneVO;
import br.pucsp.locar.vo.UsuarioVO;
import br.pucsp.locar.ws.vo.CadastroUsuarioRequestVO;
import br.pucsp.locar.ws.vo.CadastroVeiculoRequestVO;

public class CadastroValidatorUtils {

	public static String validarDadosCadastroVeiculo(CadastroVeiculoRequestVO request){
		
		StringBuilder msgResult = new StringBuilder();
		
		if(request == null){
			msgResult.append("Dados n�o informados!");
		} else {
			
			if(request.getCapacidadeTanqueCombustivel().equals(0)){
				msgResult.append("Capacidade do Tanque n�o informada;");
			}
			if(request.getChassi() == null ||
					request.getChassi().trim().equals("")){
				msgResult.append("Chassi n�o informado;");
			}
			if(request.getCodigoLocador() == null ||
					request.getCodigoLocador().trim().equals("")){
				msgResult.append("C�digo do Locador n�o informado;");
			}
			if(request.getModeloVeiculo() == 0){
				msgResult.append("Modelo n�o informado;");
			}
			if(request.getNumeroPortas() == 0){
				msgResult.append("N�mero de portas n�o informado;");
			}
			if(request.getPlaca() == null ||
					request.getPlaca().trim().equals("")){
				msgResult.append("Placa n�o informada;");
			}
			if(request.getRenavam() == 0){
				msgResult.append("Renavam n�o informado;");
			}
			
		}
		
		return msgResult.toString();
	}
	
	public static String validarDadosCadastroUsuario(CadastroUsuarioRequestVO request){
		
		StringBuilder msgResult = new StringBuilder();
		
		if (request == null){
			msgResult.append("Dados n�o informados!");
		} else {
			
			if(request.getLogin() == null){
				msgResult.append("Login n�o informado;");				
			} else {
				if(request.getLogin().trim().equals("") ||
						request.getLogin().length() != 15){
					msgResult.append("Login inv�lido;");
				}
			}
			
			if(request.getSenha() == null){
				msgResult.append("Senha n�o informada;");				
			} else {
				if(request.getSenha().trim().equals("")){
					msgResult.append("Senha inv�lida;");
				}
			}
			
			UsuarioVO usuario = request.getUsuarioVO();
			
			if(usuario == null){
				msgResult.append("Usuario n�o informado;");
			} else {
				if(usuario.getCnh() == 0){
					msgResult.append("CNH inv�lida;");
				}
				if(usuario.getCpf() == 0 || 
						!CpfValidatorUtils.isCpfValido(
								Long.toString(usuario.getCpf())) ){
					msgResult.append("CPF inv�lido;");
				}
				if(usuario.getDtNasc() == null){
					msgResult.append("Data de nascimento inv�lida;");
				}
				if(usuario.getEmail() == null || usuario.getEmail().trim().equals("")){
					msgResult.append("Email inv�lido;");
				}
				if(usuario.getNome() == null ||
						usuario.getNome().trim().equals("")){
					msgResult.append("Nome inv�lido;");
				}
				if(usuario.getOrgaoemissor() == null ||
						usuario.getOrgaoemissor().trim().equals("")){
					msgResult.append("Org�o Emissor inv�lido;");
				}
				if(usuario.getRg() == null ||
						usuario.getRg().trim().equals("") ){
					msgResult.append("RG inv�lido;");
				}
				
			}
			
			EnderecoVO endereco = request.getEnderecoVO();
			
			if (endereco == null) {
				msgResult.append("Endere�o n�o informado;");
			} else {
				
				if(endereco.getBairro() == null ||
						endereco.getBairro().trim().equals("")){
					msgResult.append("Bairro inv�lido;");
				}
				if(endereco.getCodigoCidade() == 0 ){
					msgResult.append("Cidade inv�lida;");
				}
				if(endereco.getLogradouro() == null ||
						endereco.getLogradouro().trim().equals("")){
					msgResult.append("Logradouro inv�lido;");
				}
				if(endereco.getNumero() == 0){
					msgResult.append("Numero inv�lido;");
				}
				if(endereco.getSigla() == null ||
						endereco.getSigla().trim().equals("")){
					msgResult.append("Sigla inv�lida;");
				}
				if(endereco.getTipoEndereco() == 0){
					msgResult.append("Tipo de endere�o inv�lido;");
				}
			}
			
			List<TelefoneVO> listaTelefone = request.getTelefoneVO();
			
			if (listaTelefone == null || listaTelefone.isEmpty()){
				msgResult.append("Telefones n�o informado;");
			} else {

				int contAux = 0;
				
				for(TelefoneVO tel : listaTelefone){
					
					if (tel.getTipoTelefone() == 0){
						msgResult.append("Telefone["+contAux+"]: Tipo de Telefone n�o informado;");
					}
					if (tel.getDdd() == 0){
						msgResult.append("Telefone["+contAux+"]: DDD n�o informado;");
					}
					if (tel.getNumero() == 0){
						msgResult.append("Telefone["+contAux+"]: N�mero n�o informado;");
					}
					
				}
				
			}
			
		}
		
		return msgResult.toString();
	}
	
}
