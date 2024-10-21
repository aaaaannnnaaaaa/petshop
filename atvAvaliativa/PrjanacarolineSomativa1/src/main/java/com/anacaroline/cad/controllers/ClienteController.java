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
import com.anacaroline.cad.services.ClienteService;

@RestController
@RequestMapping("/petshop")
public class ClienteController {
	
	private final ClienteService clienteService;
	
	@Autowired
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	public Cliente creatCliente(@RequestAttribute Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}
	
	@GetMapping
	public List<Cliente> getAllProduct() {
		return ClienteService.getAllCliente();	
	}
	
	@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable Long id) {
		return ClienteService.getClienteById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFornecedor(@PathVariable Long id) {
		ClienteService.deleteCliente(id);
	}
	
	//fazer o endpoint de update
	@PutMapping("/{id}")
	public Cliente updateFornecedor(@PathVariable Long id, @RequestBody Cliente cliente) {
		return ClienteService.updateCliente(id, Cliente);
	}
	

}
