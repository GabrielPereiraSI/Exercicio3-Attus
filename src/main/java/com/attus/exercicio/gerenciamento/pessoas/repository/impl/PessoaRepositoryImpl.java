package com.attus.exercicio.gerenciamento.pessoas.repository.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource("classpath:query/pessoa-sql.properties")
public class PessoaRepositoryImpl {
	
	@Value("${SPI.PESSOA}")
	private String criar;
	
	@Value("${SPU.PESSOA}")
	private String atualizar;
	
	@Value("${SPS.PESSOA}")
	private String listar;
}
