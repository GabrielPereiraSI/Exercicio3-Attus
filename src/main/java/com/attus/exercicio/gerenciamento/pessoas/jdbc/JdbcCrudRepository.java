package com.attus.exercicio.gerenciamento.pessoas.jdbc;

import org.springframework.dao.NonTransientDataAccessException;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.attus.exercicio.gerenciamento.pessoas.domain.jdbc.JdbcDomain;

public abstract class JdbcCrudRepository <T extends JdbcDomain, I extends Number> extends JdbcRepository implements JdbcCrudRepositoryI<T, I>{

	protected abstract Class<T> getTClass();
	protected abstract String criarQuery();
	protected abstract String atualizarQuery();
	
	@SuppressWarnings("unchecked")
	@Override
	public I criar(final T entidade) {
		final KeyHolder kh = new GeneratedKeyHolder();
		npjt.update(criarQuery(), new BeanPropertySqlParameterSource(entidade));
		try {
			return (I) kh.getKey(); 
		}catch (final NonTransientDataAccessException e) {
			return null;
		}
	}
	
	@Override
	public void atualizar(final T entidade) {
		npjt.update(atualizarQuery(), new BeanPropertySqlParameterSource(entidade));
	}
	
}
