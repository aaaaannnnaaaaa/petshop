package com.anacaroline.cad.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anacaroline.cad.entities.Cliente;
import com.anacaroline.cad.entities.Servico;
import com.anacaroline.cad.services.ClienteService;
import com.anacaroline.cad.services.ServicoService;

@RestController
@RequestMapping("/servico")
public class ServicoController {
	
	private final ServicoService servicoService;
	
	@Autowired
	public ServicoController(ServicoService servicoService) {
		this.servicoService = servicoService;
	}
	
	@PostMapping
	public Servico creatServico(@RequestAttribute Servico servico) {
		return servicoService.saveServico(servico);
	}
	
	@GetMapping
	public List<Servico> getAllProduct() {
		return ServicoService.getAllServico();	
	}
	
	@GetMapping("/{id}")
	public Servico getServico(@PathVariable Long id) {
		return ServicoService.getServicoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFornecedor(@PathVariable Long id) {
		ServicoService.deleteServico(id);
	}
	
	//fazer o endpoint de update
	@PutMapping("/{id}")
	public Servico updateServico(@PathVariable Long id, @RequestBody Servico servico) {
		return ServicoService.updateServico(id, Servico);
	}
	

}
