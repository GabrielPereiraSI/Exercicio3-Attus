package com.attus.exercicio.gerenciamento.pessoas.resource.leitura;

import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.attus.exercicio.gerenciamento.pessoas.dto.PessoaDto;
import com.attus.exercicio.gerenciamento.pessoas.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaLeituraResource {

	@Autowired
	private PessoaService service;
	
	
	@GetMapping("/buscar")
	public PessoaDto consultarPessoa(
			@RequestHeader final HttpHeaders headers,
			@RequestParam("Nome") String nome) {
		return service.findPessoa(nome);
	}
	
	@GetMapping("/buscar/todas")
	public List<PessoaDto> consultarPessoas(@RequestHeader final HttpHeaders headers) {
		return service.findPessoas();
	}
}
