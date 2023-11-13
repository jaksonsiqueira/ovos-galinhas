package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.repository;

import java.util.List;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.domain.Galinha;

public interface GalinhaRepository {
	Galinha salva(Galinha galinha);
	List<Galinha> buscaTodasGalinhas();
}
