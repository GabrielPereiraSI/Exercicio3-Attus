package com.attus.exercicio.gerenciamento.pessoas.repository.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.attus.exercicio.gerenciamento.pessoas.jdbc.JdbcCrudRepository;
import com.attus.exercicio.gerenciamento.pessoas.model.EnderecoPrincipalModel;
import com.attus.exercicio.gerenciamento.pessoas.repository.EnderecoPrincipalRepository;

@Repository
@PropertySource("classpath:query/endereco-principal-sql.properties")
public class EnderecoPrincipalRepositoryImpl extends JdbcCrudRepository<EnderecoPrincipalModel, Long> implements EnderecoPrincipalRepository{

	@Value("${SPI.ENDERECO}")
	private String criar;
	
	@Value("${SPU.ENDERECO}")
	private String atualizar;
	
	@Value("${SPS.ENDERECO}")
	private String listar;

	@Override
	protected Class<EnderecoPrincipalModel> getTClass() {
		return EnderecoPrincipalModel.class;
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
	public EnderecoPrincipalModel find(Long idPessoa) {
		final MapSqlParameterSource parametros = new MapSqlParameterSource();
		parametros.addValue("idPessoa", idPessoa);
		return npjt.query(listar, parametros, BeanPropertyRowMapper.newInstance(EnderecoPrincipalModel.class)).get(0);
	}

}
