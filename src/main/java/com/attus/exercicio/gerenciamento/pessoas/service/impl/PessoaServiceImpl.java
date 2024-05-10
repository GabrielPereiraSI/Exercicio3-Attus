package com.attus.exercicio.gerenciamento.pessoas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attus.exercicio.gerenciamento.pessoas.dto.AtualizarPessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.dto.CriarPessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.dto.PessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.mapper.EnderecoMapper;
import com.attus.exercicio.gerenciamento.pessoas.mapper.EnderecoPrincipalMapper;
import com.attus.exercicio.gerenciamento.pessoas.mapper.PessoaMapper;
import com.attus.exercicio.gerenciamento.pessoas.repository.EnderecoPrincipalRepository;
import com.attus.exercicio.gerenciamento.pessoas.repository.EnderecoRepository;
import com.attus.exercicio.gerenciamento.pessoas.repository.PessoaRepository;
import com.attus.exercicio.gerenciamento.pessoas.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	private PessoaMapper mapperPessoa;
	
	@Autowired
	private  EnderecoMapper mapperEndereco;
	
	@Autowired
	private  EnderecoPrincipalMapper mapperEnderecoPrincipal;
	
	@Autowired
	private PessoaRepository repositoryPessoa;
	
	@Autowired
	private EnderecoRepository repositoryEndereco;
	
	@Autowired
	private EnderecoPrincipalRepository repositoryEndPrincipal;
	
	@Override
	public List<PessoaDto> findPessoas() {
		return mapperPessoa.mapearListToDto(repositoryPessoa.findPessoas());
	}

	@Override
	public PessoaDto findPessoa(String nome) {
		return mapperPessoa.mapearToDto(repositoryPessoa.findPessoa(nome));
	}

	@Override
	public void criar(CriarPessoaDto pessoa) {
		Long idPessoa = repositoryPessoa.criar(mapperPessoa.mapearEntidadeCriar(pessoa));
		pessoa.getLsEndereco().forEach(endereco ->  repositoryEndereco.criar(mapperEndereco.mapearEntidadeCriar(endereco,  idPessoa)));
		pessoa.getLsEndereco().forEach(enderecoPrincipal ->  repositoryEndPrincipal.criar(mapperEnderecoPrincipal.mapearEntidadeCriar(enderecoPrincipal,  idPessoa)));
	}
	
	@Override
	public void atualizar(AtualizarPessoaDto pessoa) {
		repositoryPessoa.atualizar(mapperPessoa.mapearEntidadeAtualizar(pessoa));
	}

}
