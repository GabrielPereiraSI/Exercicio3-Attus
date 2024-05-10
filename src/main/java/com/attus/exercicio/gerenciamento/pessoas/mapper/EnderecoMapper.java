package com.attus.exercicio.gerenciamento.pessoas.mapper;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.attus.exercicio.gerenciamento.pessoas.dto.EnderecoDto;
import com.attus.exercicio.gerenciamento.pessoas.model.EnderecoModel;

@Component
public class EnderecoMapper {

	public EnderecoModel mapearEntidadeCriar(EnderecoDto enderecoDto, Long idPessoa) {
		EnderecoModel endereco = new EnderecoModel();
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

	public EnderecoModel mapearEntidadeAtualizar(EnderecoDto enderecoDto, Long idPessoa) {
		EnderecoModel endereco = new EnderecoModel();
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
	
	public EnderecoDto mapearToDto(EnderecoModel enderecoModel) {
		EnderecoDto enderecoDto = new EnderecoDto();
	    enderecoDto.setLogradouro(enderecoModel.getLogradouro());
	    enderecoDto.setNumero(enderecoModel.getNumero());
	    enderecoDto.setCep(enderecoModel.getCep());
	    enderecoDto.setCidade(enderecoModel.getCidade());
	    enderecoDto.setEstado(enderecoModel.getEstado());
        return enderecoDto;
	}
	
	public List<EnderecoDto> mapearListToDto(List<EnderecoModel> lsEndereco) {
		return lsEndereco.stream().map(this:: mapearToDto).collect(Collectors.toList());
	}
}
