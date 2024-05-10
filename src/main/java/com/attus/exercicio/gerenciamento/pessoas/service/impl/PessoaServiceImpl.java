package com.attus.exercicio.gerenciamento.pessoas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attus.exercicio.gerenciamento.pessoas.dto.PessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.repository.PessoaRepository;
import com.attus.exercicio.gerenciamento.pessoas.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Override
	public List<PessoaDto> findPessoas() {
		return pessoaRepository.findPessoas();
	}

	@Override
	public PessoaDto findPessoa(String nome) {
		return pessoaRepository.findPessoa();
	}

}
