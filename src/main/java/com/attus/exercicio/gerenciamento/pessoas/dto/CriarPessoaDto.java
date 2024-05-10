package com.attus.exercicio.gerenciamento.pessoas.dto;

import java.util.List;

public class CriarPessoaDto {
	private Long id;
	private String nome;
	private String dtNascimento;
	private List<EnderecoDto> lsEndereco;
	private EnderecoPrincipalDto enderecoPrincipal;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public List<EnderecoDto> getLsEndereco() {
		return lsEndereco;
	}
	public void setLsEndereco(List<EnderecoDto> lsEndereco) {
		this.lsEndereco = lsEndereco;
	}
	public EnderecoPrincipalDto getEnderecoPrincipal() {
		return enderecoPrincipal;
	}
	public void setEnderecoPrincipal(EnderecoPrincipalDto enderecoPrincipal) {
		this.enderecoPrincipal = enderecoPrincipal;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
