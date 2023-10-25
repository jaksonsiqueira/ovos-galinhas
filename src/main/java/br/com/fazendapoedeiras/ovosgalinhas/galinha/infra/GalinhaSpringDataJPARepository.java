package br.com.fazendapoedeiras.ovosgalinhas.galinha.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.domain.Galinha;

public interface GalinhaSpringDataJPARepository extends JpaRepository<Galinha, UUID> {

}
