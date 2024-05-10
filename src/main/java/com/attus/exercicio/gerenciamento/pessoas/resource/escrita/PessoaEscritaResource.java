package com.attus.exercicio.gerenciamento.pessoas.resource.escrita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attus.exercicio.gerenciamento.pessoas.dto.AtualizarPessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.dto.CriarPessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.service.PessoaService;


@RestController
@RequestMapping("/pessoa")
public class PessoaEscritaResource {

	@Autowired
	private  PessoaService service;
	
	@PostMapping("/cadastrar")
	public void criarPessoa(@RequestBody CriarPessoaDto  pessoaDto) {
		service.criar(pessoaDto);
	}
	
	@PutMapping("/editar")
	public void editarPessoa(@RequestBody AtualizarPessoaDto pessoaDto) {
		service.atualizar(pessoaDto);
	}
}
