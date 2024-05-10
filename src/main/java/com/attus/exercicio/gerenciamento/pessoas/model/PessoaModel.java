package com.attus.exercicio.gerenciamento.pessoas.model;

import com.attus.exercicio.gerenciamento.pessoas.domain.jdbc.PessoaJdbcDomain;

public class PessoaModel extends PessoaJdbcDomain {
	private static final long serialVersionUID = -2906657458206697596L;
	private Long id;
	private String nome;
	private String dtNascimento;
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
