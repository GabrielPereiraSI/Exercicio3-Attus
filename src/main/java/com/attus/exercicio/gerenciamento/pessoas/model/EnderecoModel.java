package com.attus.exercicio.gerenciamento.pessoas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor 
public class EnderecoModel {
	private long id;
	private String logradouro;
	private String cep;
	private String numero;
	private String cidade;
	private String estado;
}
