package com.attus.exercicio.gerenciamento.pessoas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attus.exercicio.gerenciamente.pessoas.mapper.PessoaMapper;
import com.attus.exercicio.gerenciamento.pessoas.dto.PessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.model.EnderecoModel;
import com.attus.exercicio.gerenciamento.pessoas.model.EnderecoPrincipalModel;
import com.attus.exercicio.gerenciamento.pessoas.model.PessoaModel;
import com.attus.exercicio.gerenciamento.pessoas.repository.EnderecoPrincipalRepository;
import com.attus.exercicio.gerenciamento.pessoas.repository.EnderecoRepository;
import com.attus.exercicio.gerenciamento.pessoas.repository.PessoaRepository;
import com.attus.exercicio.gerenciamento.pessoas.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private EnderecoPrincipalRepository enderecoPrincipalRepository;
	
	@Override
	public List<PessoaDto> findPessoas() {
		PessoaModel pessoa =  pessoaRepository.findPessoa();
		EnderecoModel endereco = enderecoRepository.findEnderecos();
		EnderecoPrincipalModel enderecoPrincipal =  enderecoPrincipalRepository.findEnderecoPrincipal();
		return null;
	}

	@Override
	public PessoaDto findPessoa(String nome) {
		PessoaModel pessoa =  pessoaRepository.findPessoa();
		EnderecoModel endereco = enderecoRepository.findEnderecos();
		EnderecoPrincipalModel enderecoPrincipal =  enderecoPrincipalRepository.findEnderecoPrincipal();
		return PessoaMapper.convertToPessoaDto();
	}

}
