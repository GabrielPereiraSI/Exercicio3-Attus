package com.attus.exercicio.gerenciamento.pessoas.service;

import java.util.List;

import com.attus.exercicio.gerenciamento.pessoas.dto.AtualizarPessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.dto.CriarPessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.dto.PessoaDto;

public interface PessoaService {
	List<PessoaDto> findPessoas();
	PessoaDto findPessoa(String nome);
	void criar(CriarPessoaDto pessoa);
	void atualizar(AtualizarPessoaDto pessoa);
}
