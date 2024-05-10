package com.attus.exercicio.gerenciamento.pessoas.model;

import java.util.List;

import com.attus.exercicio.gerenciamento.pessoas.dto.EnderecoDto;
import com.attus.exercicio.gerenciamento.pessoas.dto.EnderecoPrincipalDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class PessoaModel {
	private Long id;
	private String nome;
	private String dtNascimento;
	private List<EnderecoDto> lsEndereco;
	private EnderecoPrincipalDto enderecoPrincipal;
}
