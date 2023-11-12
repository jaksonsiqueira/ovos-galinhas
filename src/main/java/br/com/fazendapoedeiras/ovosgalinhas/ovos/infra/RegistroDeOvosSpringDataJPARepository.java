package br.com.fazendapoedeiras.ovosgalinhas.ovos.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fazendapoedeiras.ovosgalinhas.ovos.domain.RegistroDeOvos;

public interface RegistroDeOvosSpringDataJPARepository extends JpaRepository<RegistroDeOvos, UUID>{
	List<RegistroDeOvos> findByIdGalinha(UUID idGalinha);

}
