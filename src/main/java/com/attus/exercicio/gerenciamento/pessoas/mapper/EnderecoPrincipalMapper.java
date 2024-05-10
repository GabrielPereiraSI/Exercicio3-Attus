package com.attus.exercicio.gerenciamento.pessoas.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.attus.exercicio.gerenciamento.pessoas.dto.EnderecoDto;
import com.attus.exercicio.gerenciamento.pessoas.dto.EnderecoPrincipalDto;
import com.attus.exercicio.gerenciamento.pessoas.model.EnderecoPrincipalModel;

@Component
public class EnderecoPrincipalMapper {

	public EnderecoPrincipalModel mapearEntidadeCriar(EnderecoDto enderecoDto, Long idPessoa) {
		EnderecoPrincipalModel endereco = new EnderecoPrincipalModel();
		endereco.setIdPessoa(idPessoa);
		endereco.setLogradouro(enderecoDto.getLogradouro());
		endereco.setNumero(enderecoDto.getNumero());
		endereco.setCep(enderecoDto.getCep());
		endereco.setCidade(enderecoDto.getCidade());
		endereco.setEstado(enderecoDto.getEstado());
		endereco.setInAtivo(true);
		endereco.setDtInclusao(LocalDateTime.now());
		return endereco;
	}

	public EnderecoPrincipalModel mapearEntidadeAtualizar(EnderecoDto enderecoDto, Long idPessoa) {
		EnderecoPrincipalModel endereco = new EnderecoPrincipalModel();
		endereco.setIdPessoa(idPessoa);
		endereco.setLogradouro(enderecoDto.getLogradouro());
		endereco.setNumero(enderecoDto.getNumero());
		endereco.setCep(enderecoDto.getCep());
		endereco.setCidade(enderecoDto.getCidade());
		endereco.setEstado(enderecoDto.getEstado());
		endereco.setInAtivo(true);
		endereco.setDtAlteracao(LocalDateTime.now());
		return endereco;
	}
	
	public EnderecoPrincipalDto mapearToDto(EnderecoPrincipalModel enderecoModel) {
		EnderecoPrincipalDto enderecoDto = new EnderecoPrincipalDto();
	    enderecoDto.setLogradouro(enderecoModel.getLogradouro());
	    enderecoDto.setNumero(enderecoModel.getNumero());
	    enderecoDto.setCep(enderecoModel.getCep());
	    enderecoDto.setCidade(enderecoModel.getCidade());
	    enderecoDto.setEstado(enderecoModel.getEstado());
        return enderecoDto;
	}
}
