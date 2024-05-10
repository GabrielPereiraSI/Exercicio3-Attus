package com.attus.exercicio.gerenciamento.pessoas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attus.exercicio.gerenciamento.pessoas.dto.EnderecoDto;
import com.attus.exercicio.gerenciamento.pessoas.mapper.EnderecoMapper;
import com.attus.exercicio.gerenciamento.pessoas.repository.EnderecoRepository;
import com.attus.exercicio.gerenciamento.pessoas.service.EnderecoService;

@Service
public class EnderecoServiceImpl implements EnderecoService {

	@Autowired
	private EnderecoRepository repository;
	
	@Autowired
	private EnderecoMapper mapper;
	
	@Override
	public List<EnderecoDto> findEnderecos(Long idPessoa) {
		return  mapper.mapearListToDto(repository.findEnderecos(idPessoa));
	}

	@Override
	public EnderecoDto findEndereco(Long idPessoa) {
		return mapper.mapearToDto(repository.findEndereco(idPessoa));
	}


}
