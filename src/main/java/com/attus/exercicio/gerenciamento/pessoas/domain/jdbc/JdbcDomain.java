package com.attus.exercicio.gerenciamento.pessoas.domain.jdbc;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class JdbcDomain implements Serializable{
	private static final long serialVersionUID = 8334897960494372585L;
	protected LocalDateTime dtInclusao;
	protected LocalDateTime dtAlteracao;
}
