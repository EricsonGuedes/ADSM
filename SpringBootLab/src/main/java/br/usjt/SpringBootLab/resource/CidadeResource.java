package br.usjt.SpringBootLab.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.usjt.SpringBootLab.model.Cidade;
import br.usjt.SpringBootLab.repository.CidadeRepository;

@RestController
@RequestMapping ("/cidades")
public class CidadeResource {
	@Autowired
	private CidadeRepository cidadeRepo;

	@GetMapping ("/lista")
	public List <Cidade> todosAsCidades (){
		return cidadeRepo.findAll();
	}

	@PostMapping ("/salvar")
	@ResponseStatus (HttpStatus.CREATED)
	public void salvar ( @RequestBody Cidade cidade, HttpServletResponse response) {
		Cidade c = cidadeRepo.save(cidade);
		URI uri = ServletUriComponentsBuilder.

				fromCurrentServletMapping().path("/{id}").
				buildAndExpand(c.getId()).
				toUri();

		response.setHeader("Location", uri.toASCIIString());
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Cidade> atualizar(@RequestBody Cidade cidade){
		Cidade c = cidadeRepo.findById(cidade.getId()).get();
		c.setCidade(cidade.getCidade());
		c.setLatitude(cidade.getLatitude());
		c.setLongitude(cidade.getLongitude());
		c = cidadeRepo.save(c);
		return ResponseEntity.status(HttpStatus.OK).body(c);
	}

	@DeleteMapping("/{id}")
	public void excluirPeloId(@PathVariable Long id) {
		Cidade c = cidadeRepo.getOne(id);
		cidadeRepo.delete(c);
	}


	//Procurar pela latitude e longitude
	@GetMapping("/{latitude}" + "/{longitude}")
	public Cidade buscarPelaLatitudeLongitude(@PathVariable(value="latitude") String latitude, @PathVariable(value="longitude")String longitude) {
		return cidadeRepo.findByLatitudeAndLongitude(Double.parseDouble(latitude), Double.parseDouble(longitude));
	}

	//Procurar pela inicial da cidade
	@GetMapping("/{cidade}")
	public List<Cidade> findByLetterName(@PathVariable(value="cidade") String cidade){
		return cidadeRepo.findByCidadeStartingWith(cidade);
	}

}

