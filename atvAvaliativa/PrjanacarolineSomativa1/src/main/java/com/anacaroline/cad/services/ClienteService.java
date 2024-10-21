package com.anacaroline.cad.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anacaroline.cad.entities.Cliente;
import com.anacaroline.cad.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	private final ClienteRepository clienterepository;
	
	@Autowired
	public ClienteService(ClienteRepository clienterepository) {
		this.clienterepository = clienterepository;
	}
	
	//criaçao do produto
	public Cliente saveCliente(Cliente cliente) {
		return clienterepository.save(cliente);
	}
	
	//buscar produto
	public Cliente getClienteById( Long id ) {
		return clienterepository.findById(id).orElse(null);
	}
	
	//procurar todos os produtos
	public List<Cliente> getAllCliente() {
		return clienterepository.findAll();
	}
	
	//excluir os produtos 
	public void deleteCliente(Long id) {
		clienterepository.deleteById(id);
	}	

}

