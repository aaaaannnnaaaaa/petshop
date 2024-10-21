package com.anacaroline.cad.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anacaroline.cad.entities.Servico;
import com.anacaroline.cad.repositories.ServicoRepository;

@Service
public class ServicoService {
	
	private final ServicoRepository servicorepository;
	
	@Autowired
	public ServicoService(ServicoRepository servicorepository) {
		this.servicorepository = servicorepository;
	}
	
	//criaçao do produto
	public Servico saveServico(Servico servico) {
		return servicorepository.save(servico);
	}
	
	//buscar produto
	public Servico getServicoById( Long id ) {
		return servicorepository.findById(id).orElse(null);
	}
	
	//procurar todos os produtos
	public List<Servico> getAllServico() {
		return servicorepository.findAll();
	}
	
	//excluir os produtos 
	public void deleteServico(Long id) {
		servicorepository.deleteById(id);
	}	

}

