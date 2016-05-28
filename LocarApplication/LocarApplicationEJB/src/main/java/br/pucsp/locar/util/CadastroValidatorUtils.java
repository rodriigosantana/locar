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
			msgResult.append("Dados não informados!");
		} else {
			
			if(request.getCapacidadeTanqueCombustivel().equals(0)){
				msgResult.append("Capacidade do Tanque não informada;");
			}
			if(request.getChassi() == null ||
					request.getChassi().trim().equals("")){
				msgResult.append("Chassi não informado;");
			}
			if(request.getCodigoLocador() == null ||
					request.getCodigoLocador().trim().equals("")){
				msgResult.append("Código do Locador não informado;");
			}
			if(request.getModeloVeiculo() == 0){
				msgResult.append("Modelo não informado;");
			}
			if(request.getNumeroPortas() == 0){
				msgResult.append("Número de portas não informado;");
			}
			if(request.getPlaca() == null ||
					request.getPlaca().trim().equals("")){
				msgResult.append("Placa não informada;");
			}
			if(request.getRenavam() == 0){
				msgResult.append("Renavam não informado;");
			}
			
		}
		
		return msgResult.toString();
	}
	
	public static String validarDadosCadastroUsuario(CadastroUsuarioRequestVO request){
		
		StringBuilder msgResult = new StringBuilder();
		
		if (request == null){
			msgResult.append("Dados não informados!");
		} else {
			
			if(request.getLogin() == null){
				msgResult.append("Login não informado;");				
			} else {
				if(request.getLogin().trim().equals("") ||
						request.getLogin().length() != 15){
					msgResult.append("Login inválido;");
				}
			}
			
			if(request.getSenha() == null){
				msgResult.append("Senha não informada;");				
			} else {
				if(request.getSenha().trim().equals("")){
					msgResult.append("Senha inválida;");
				}
			}
			
			UsuarioVO usuario = request.getUsuarioVO();
			
			if(usuario == null){
				msgResult.append("Usuario não informado;");
			} else {
				if(usuario.getCnh() == 0){
					msgResult.append("CNH inválida;");
				}
				if(usuario.getCpf() == 0 || 
						!CpfValidatorUtils.isCpfValido(
								Long.toString(usuario.getCpf())) ){
					msgResult.append("CPF inválido;");
				}
				if(usuario.getDtNasc() == null){
					msgResult.append("Data de nascimento inválida;");
				}
				if(usuario.getEmail() == null || usuario.getEmail().trim().equals("")){
					msgResult.append("Email inválido;");
				}
				if(usuario.getNome() == null ||
						usuario.getNome().trim().equals("")){
					msgResult.append("Nome inválido;");
				}
				if(usuario.getOrgaoemissor() == null ||
						usuario.getOrgaoemissor().trim().equals("")){
					msgResult.append("Orgão Emissor inválido;");
				}
				if(usuario.getRg() == null ||
						usuario.getRg().trim().equals("") ){
					msgResult.append("RG inválido;");
				}
				
			}
			
			EnderecoVO endereco = request.getEnderecoVO();
			
			if (endereco == null) {
				msgResult.append("Endereço não informado;");
			} else {
				
				if(endereco.getBairro() == null ||
						endereco.getBairro().trim().equals("")){
					msgResult.append("Bairro inválido;");
				}
				if(endereco.getCodigoCidade() == 0 ){
					msgResult.append("Cidade inválida;");
				}
				if(endereco.getLogradouro() == null ||
						endereco.getLogradouro().trim().equals("")){
					msgResult.append("Logradouro inválido;");
				}
				if(endereco.getNumero() == 0){
					msgResult.append("Numero inválido;");
				}
				if(endereco.getSigla() == null ||
						endereco.getSigla().trim().equals("")){
					msgResult.append("Sigla inválida;");
				}
				if(endereco.getTipoEndereco() == 0){
					msgResult.append("Tipo de endereço inválido;");
				}
			}
			
			List<TelefoneVO> listaTelefone = request.getTelefoneVO();
			
			if (listaTelefone == null || listaTelefone.isEmpty()){
				msgResult.append("Telefones não informado;");
			} else {

				int contAux = 0;
				
				for(TelefoneVO tel : listaTelefone){
					
					if (tel.getTipoTelefone() == 0){
						msgResult.append("Telefone["+contAux+"]: Tipo de Telefone não informado;");
					}
					if (tel.getDdd() == 0){
						msgResult.append("Telefone["+contAux+"]: DDD não informado;");
					}
					if (tel.getNumero() == 0){
						msgResult.append("Telefone["+contAux+"]: Número não informado;");
					}
					
				}
				
			}
			
		}
		
		return msgResult.toString();
	}
	
}
