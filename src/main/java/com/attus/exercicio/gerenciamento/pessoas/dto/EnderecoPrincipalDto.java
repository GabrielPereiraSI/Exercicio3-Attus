package com.attus.exercicio.gerenciamento.pessoas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EnderecoPrincipalDto {
	private String logradouro;
	private String cep;
	private String numero;
	private String cidade;
	private String estado;
}
