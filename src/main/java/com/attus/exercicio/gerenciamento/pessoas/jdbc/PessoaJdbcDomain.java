package com.attus.exercicio.gerenciamento.pessoas.jdbc;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @AllArgsConstructor
public abstract class PessoaJdbcDomain  {
	private Boolean inAtivo;
	private String nmUsuario;
	private LocalDateTime dtInclusao;
	private LocalDateTime dtAlteracao;
}
