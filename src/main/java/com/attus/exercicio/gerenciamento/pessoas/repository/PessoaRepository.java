package com.attus.exercicio.gerenciamento.pessoas.repository;

import java.util.List;

import com.attus.exercicio.gerenciamento.pessoas.jdbc.JdbcCrudRepositoryI;
import com.attus.exercicio.gerenciamento.pessoas.model.PessoaModel;

public interface PessoaRepository extends JdbcCrudRepositoryI<PessoaModel, Long>{
	PessoaModel findPessoa(String nome);
	List<PessoaModel> findPessoas();
}
