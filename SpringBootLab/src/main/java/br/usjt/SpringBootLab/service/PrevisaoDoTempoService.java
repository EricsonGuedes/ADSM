package br.usjt.SpringBootLab.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import br.usjt.SpringBootLab.model.PrevisaoDoTempo;
import br.usjt.SpringBootLab.repository.PrevisaoDoTempoRepository;

public class PrevisaoDoTempoService {
	@Autowired
	private PrevisaoDoTempoRepository previsaoDoTempoRepo;
	
	public void salvar (PrevisaoDoTempo previsao) {
		previsaoDoTempoRepo.save(previsao);
	}
	
	public List <PrevisaoDoTempo> listarTodos(){
		return previsaoDoTempoRepo.findAll();
	}

}
