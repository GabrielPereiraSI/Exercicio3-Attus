package com.attus.exercicio.gerenciamento.pessoas.repository;

import java.util.List;

import com.attus.exercicio.gerenciamento.pessoas.jdbc.JdbcCrudRepositoryI;
import com.attus.exercicio.gerenciamento.pessoas.model.EnderecoModel;

public interface EnderecoRepository extends JdbcCrudRepositoryI<EnderecoModel, Long>{
	EnderecoModel findEndereco(Long idPessoa);
	List<EnderecoModel> findEnderecos(Long idPessoa);
}
