package com.attus.exercicio.gerenciamento.pessoas.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.attus.exercicio.gerenciamento.pessoas.jdbc.JdbcCrudRepository;
import com.attus.exercicio.gerenciamento.pessoas.model.EnderecoModel;
import com.attus.exercicio.gerenciamento.pessoas.repository.EnderecoRepository;

@Repository
@PropertySource("classpath:query/endereco-sql.properties")
public class EnderecoRepositoryImpl extends JdbcCrudRepository<EnderecoModel, Long> implements EnderecoRepository{

	@Value("${SPI.ENDERECO}")
	private String criar;
	
	@Value("${SPU.ENDERECO}")
	private String atualizar;
	
	@Value("${SPS.ENDERECO}")
	private String listar;
	
	@Value("${SPS.ENDERECO_ATIVOS}")
	private String listarAtivos;

	
	@Override
	protected Class<EnderecoModel> getTClass() {
		return EnderecoModel.class;
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
	public EnderecoModel findEndereco(Long idPessoa) {
		final MapSqlParameterSource parametros = new MapSqlParameterSource();
		parametros.addValue("idPessoa", idPessoa);
		return npjt.query(listar, parametros, BeanPropertyRowMapper.newInstance(EnderecoModel.class)).get(0);
	}

	@Override
	public List<EnderecoModel> findEnderecos(Long idPessoa) {
		final MapSqlParameterSource parametros = new MapSqlParameterSource();
		parametros.addValue("idPessoa", idPessoa);
		return npjt.query(listar, parametros, BeanPropertyRowMapper.newInstance(EnderecoModel.class));
	}

}
