package com.attus.exercicio.gerenciamento.pessoas.repository.impl;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource("classpath:query/endereco-sql.properties")
public class EnderecoRepositoryImpl {

}