package com.attus.exercicio.gerenciamento.pessoas.model;

import com.attus.exercicio.gerenciamento.pessoas.domain.jdbc.PessoaJdbcDomain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor 
public class EnderecoModel extends PessoaJdbcDomain{
	private static final long serialVersionUID = 3707009340171968145L;
	private String logradouro;
	private String cep;
	private String numero;
	private String cidade;
	private String estado;
	private Long idPessoa;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}
	
	
}
