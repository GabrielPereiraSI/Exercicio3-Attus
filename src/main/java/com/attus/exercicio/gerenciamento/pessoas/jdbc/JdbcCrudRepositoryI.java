package com.attus.exercicio.gerenciamento.pessoas.jdbc;

import com.attus.exercicio.gerenciamento.pessoas.domain.jdbc.JdbcDomain;

public interface JdbcCrudRepositoryI <T extends JdbcDomain, I extends Number>{
	I criar(final T entidade);
	void atualizar(final T entidade);
}
