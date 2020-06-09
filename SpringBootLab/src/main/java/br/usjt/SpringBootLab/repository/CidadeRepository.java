package br.usjt.SpringBootLab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.SpringBootLab.model.Cidade;

public interface CidadeRepository extends JpaRepository <Cidade, Long>{

	Cidade findByLatitudeAndLongitude(double d, double e);

	List<Cidade> findByCidadeStartingWith(String cidade);

}



