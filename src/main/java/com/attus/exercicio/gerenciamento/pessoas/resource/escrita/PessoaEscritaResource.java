package com.attus.exercicio.gerenciamento.pessoas.resource.escrita;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pessoas")
public class PessoaEscritaResource {

	@PostMapping("/cadastrar")
	public void criarPessoa() {
		
	}
	
	@PutMapping("/editar")
	public void editarPessoa() {
		
	}
}
