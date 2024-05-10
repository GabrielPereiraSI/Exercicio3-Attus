package com.attus.exercicio.gerenciamento.pessoas.repository;

import com.attus.exercicio.gerenciamento.pessoas.jdbc.JdbcCrudRepositoryI;
import com.attus.exercicio.gerenciamento.pessoas.model.EnderecoPrincipalModel;

public interface EnderecoPrincipalRepository  extends JdbcCrudRepositoryI<EnderecoPrincipalModel, Long>{
	EnderecoPrincipalModel find(Long idPessoa);
}
