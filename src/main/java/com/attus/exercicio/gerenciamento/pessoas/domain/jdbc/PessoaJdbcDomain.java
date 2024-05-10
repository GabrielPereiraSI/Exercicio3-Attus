package com.attus.exercicio.gerenciamento.pessoas.domain.jdbc;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class PessoaJdbcDomain extends JdbcDomain implements Serializable{
	private static final long serialVersionUID = 2621336385166073130L;
	private Boolean inAtivo;
	private String nmUsuario;
	private LocalDateTime dtInclusao;
	private LocalDateTime dtAlteracao;
	
	public Boolean getInAtivo() {
		return inAtivo;
	}
	public void setInAtivo(Boolean inAtivo) {
		this.inAtivo = inAtivo;
	}
	public String getNmUsuario() {
		return nmUsuario;
	}
	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}
	public LocalDateTime getDtInclusao() {
		return dtInclusao;
	}
	public void setDtInclusao(LocalDateTime dtInclusao) {
		this.dtInclusao = dtInclusao;
	}
	public LocalDateTime getDtAlteracao() {
		return dtAlteracao;
	}
	public void setDtAlteracao(LocalDateTime dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}
	
	
}
