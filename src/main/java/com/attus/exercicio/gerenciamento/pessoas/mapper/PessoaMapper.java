package com.attus.exercicio.gerenciamento.pessoas.mapper;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.attus.exercicio.gerenciamento.pessoas.dto.AtualizarPessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.dto.CriarPessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.dto.PessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.model.PessoaModel;

@Component
public class PessoaMapper {
	
	public PessoaModel mapearEntidadeCriar(CriarPessoaDto pessoaDto) {
		PessoaModel pessoa = new PessoaModel();
		pessoa.setNome(pessoaDto.getNome());
		pessoa.setDtNascimento(pessoaDto.getDtNascimento());
		pessoa.setInAtivo(true);
		pessoa.setDtInclusao(LocalDateTime.now());
		return pessoa;
	}

	public PessoaModel mapearEntidadeAtualizar(AtualizarPessoaDto pessoaDto) {
		PessoaModel pessoa = new PessoaModel();
		pessoa.setId(pessoaDto.getId());
		pessoa.setNome(pessoaDto.getNome());
		pessoa.setDtNascimento(pessoaDto.getDtNascimento());
		pessoa.setInAtivo(true);
		pessoa.setDtAlteracao(LocalDateTime.now());
		return pessoa;
	}
	
	public PessoaDto mapearToDto(PessoaModel pessoa) {
		PessoaDto pessoaDto = new PessoaDto();
		pessoaDto.setNome(pessoa.getNome());
		pessoaDto.setDtNascimento(pessoa.getDtNascimento());
		pessoaDto.setId(pessoa.getId());
		return pessoaDto;
	}
	
	public List<PessoaDto> mapearListToDto(List<PessoaModel> pessoas) {
		return pessoas.stream().map(this::mapearToDto).collect(Collectors.toList());
	}

}
