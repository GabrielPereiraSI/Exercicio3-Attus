package com.attus.exercicio.gerenciamento.pessoas.resource.escrita;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoas/endereco")
public class EnderecoEscritaResource {

	@PostMapping("/cadastrar")
	public void cadastrarEndereco() {
		
	}
	
	@PutMapping("/editar")
	public void editarEndereco() {
		
	}
	
	@PostMapping("/principal/cadastrar")
	public void cadastrarEnderecoPrincipal() {
		
	}
}
