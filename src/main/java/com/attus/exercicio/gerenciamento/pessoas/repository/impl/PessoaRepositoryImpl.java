package com.attus.exercicio.gerenciamento.pessoas.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.attus.exercicio.gerenciamento.pessoas.jdbc.JdbcCrudRepository;
import com.attus.exercicio.gerenciamento.pessoas.model.PessoaModel;
import com.attus.exercicio.gerenciamento.pessoas.repository.PessoaRepository;

@Repository
@PropertySource("classpath:query/pessoa-sql.properties")
public class PessoaRepositoryImpl extends JdbcCrudRepository<PessoaModel, Long> implements PessoaRepository {
	
	@Value("${SPI.PESSOA}")
	private String criar;
	
	@Value("${SPU.PESSOA}")
	private String atualizar;
	
	@Value("${SPS.PESSOA}")
	private String listar;

	@Override
	protected Class<PessoaModel> getTClass() {
		return PessoaModel.class;
	}
	
	@Override
	protected String criarQuery() {
		return criar;
	}
	
	@Override
	protected String atualizarQuery() {
		return atualizar;
	}

	@Override
	public PessoaModel findPessoa(String nome) {
		final MapSqlParameterSource parametros = new MapSqlParameterSource();
		parametros.addValue("nome", nome);
		return npjt.query(listar, parametros, BeanPropertyRowMapper.newInstance(PessoaModel.class)).get(0);
	}

	@Override
	public List<PessoaModel> findPessoas() {
		return null;
	}
}
