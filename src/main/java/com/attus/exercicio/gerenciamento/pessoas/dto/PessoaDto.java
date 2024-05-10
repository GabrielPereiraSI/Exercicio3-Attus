package com.attus.exercicio.gerenciamento.pessoas.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PessoaDto {
	private String nome;
	private String dtNascimento;
	private List<EnderecoDto> lsEndereco;
	private EnderecoPrincipalDto enderecoPrincipal;
}
