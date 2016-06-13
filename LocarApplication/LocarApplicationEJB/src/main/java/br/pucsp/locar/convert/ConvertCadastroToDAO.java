package br.pucsp.locar.convert;

import java.util.ArrayList;
import java.util.List;

import br.pucsp.locar.dto.EnderecoDTO;
import br.pucsp.locar.dto.TelefoneDTO;
import br.pucsp.locar.entity.Endereco;
import br.pucsp.locar.entity.Login;
import br.pucsp.locar.entity.Telefone;
import br.pucsp.locar.entity.Tipotelefone;
import br.pucsp.locar.entity.Usuario;
import br.pucsp.locar.ws.dto.CadastroUsuarioRequestDTO;

public class ConvertCadastroToDAO {

	public static Usuario cadastroUsuarioRequestVOToUsuario(CadastroUsuarioRequestDTO request){
		
		Usuario usuario = new Usuario();
		
		usuario.setCnh(request.getUsuarioVO().getCnh());
		usuario.setCpf(request.getUsuarioVO().getCpf());
		usuario.setDtNasc(request.getUsuarioVO().getDtNasc());
		usuario.setEmail(request.getUsuarioVO().getEmail());
		usuario.setNome(request.getUsuarioVO().getNome());
		usuario.setOrgaoemissor(request.getUsuarioVO().getOrgaoemissor());
		usuario.setRg(request.getUsuarioVO().getRg());
		
		return usuario;
	}
	
	public static Endereco cadastroEnderecoRequestVOToEndereco(EnderecoDTO enderecoVO){
		
		Endereco endereco = new Endereco();
		
		endereco.setBairro(enderecoVO.getBairro());
		endereco.setLogradouro(enderecoVO.getLogradouro());
		endereco.setNumero(enderecoVO.getNumero());
		
		return endereco;
	}
	
	public static Login cadastroLoginRequestVOToLogin(CadastroUsuarioRequestDTO request){
		
		Login login = new Login();
		
		login.setIdLogin(request.getLogin());
		login.setSenha(request.getSenha());
		
		return login;
	}
	
	public static List<Telefone> cadastroTelefoneRequestVOToTelefone(List<TelefoneDTO> listaTelefoneVO){
		
		List<Telefone> listaTelefone = new ArrayList<Telefone>();
		
		for (TelefoneDTO telefoneVO : listaTelefoneVO){
			
			Telefone tel = new Telefone();
			
			tel.setDdd(telefoneVO.getDdd());
			tel.setNumero(telefoneVO.getNumero());
			
			Tipotelefone tipoTel = new Tipotelefone();
			tipoTel.setCodTipoTel(telefoneVO.getTipoTelefone());
			
			tel.setTipotelefone(tipoTel);
			
			listaTelefone.add(tel);
		}
		
		return listaTelefone;
	}
	
}
