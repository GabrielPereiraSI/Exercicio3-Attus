package com.attus.exercicio.gerenciamento.pessoas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attus.exercicio.gerenciamento.pessoas.dto.EnderecoPrincipalDto;
import com.attus.exercicio.gerenciamento.pessoas.mapper.EnderecoPrincipalMapper;
import com.attus.exercicio.gerenciamento.pessoas.repository.EnderecoPrincipalRepository;
import com.attus.exercicio.gerenciamento.pessoas.service.EnderecoPrincipalService;

@Service
public class EnderecoPrincipalServiceImpl implements EnderecoPrincipalService{

	@Autowired
	private EnderecoPrincipalRepository repository;
	
	@Autowired
	private EnderecoPrincipalMapper mapper;
	
	@Override
	public EnderecoPrincipalDto findEnderecoPrincipal(Long idPessoa) {
		return mapper.mapearToDto(repository.find(idPessoa));
	}


}
