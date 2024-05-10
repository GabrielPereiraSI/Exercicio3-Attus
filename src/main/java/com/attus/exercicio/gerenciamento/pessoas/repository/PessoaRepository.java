package com.attus.exercicio.gerenciamento.pessoas.repository;

import java.util.List;

import com.attus.exercicio.gerenciamento.pessoas.dto.PessoaDto;

public interface PessoaRepository {
	PessoaDto findPessoa();
	List<PessoaDto> findPessoas();
}
