package com.attus.exercicio.gerenciamento.pessoas.service;

import java.util.List;

import com.attus.exercicio.gerenciamento.pessoas.dto.EnderecoDto;

public interface EnderecoService {

	List<EnderecoDto> findEnderecos(Long idPessoa);
	EnderecoDto findEndereco(Long idPessoa);
	
}
