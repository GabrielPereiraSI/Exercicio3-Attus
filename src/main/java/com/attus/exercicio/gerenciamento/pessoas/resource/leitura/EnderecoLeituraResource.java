package com.attus.exercicio.gerenciamento.pessoas.resource.leitura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.attus.exercicio.gerenciamento.pessoas.dto.EnderecoDto;
import com.attus.exercicio.gerenciamento.pessoas.dto.EnderecoPrincipalDto;
import com.attus.exercicio.gerenciamento.pessoas.service.EnderecoPrincipalService;
import com.attus.exercicio.gerenciamento.pessoas.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoLeituraResource {

	@Autowired
	private EnderecoService enderecoService;
	
	@Autowired
	private EnderecoPrincipalService enderecoPrincipalService;
	
	@GetMapping("/consultar")
	public EnderecoDto consultarEndereco(@RequestParam final Long idPessoa) {
		return enderecoService.findEndereco(idPessoa);
	}
	
	@GetMapping("/consultar/todos")
	public List<EnderecoDto> consultarEnderecos(@RequestParam final Long idPessoa) {
		return enderecoService.findEnderecos(idPessoa);
	}
	
	@GetMapping("/consultar/endereco/principal")
	public EnderecoPrincipalDto consultarEnderecoPrincipal(@RequestParam final Long idPessoa) {
		return enderecoPrincipalService.findEnderecoPrincipal(idPessoa);
	}
}
