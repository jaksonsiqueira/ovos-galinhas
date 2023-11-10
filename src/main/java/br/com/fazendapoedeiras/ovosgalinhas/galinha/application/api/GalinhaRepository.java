package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

import java.util.List;
import java.util.UUID;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.domain.Galinha;

public interface GalinhaRepository {
	Galinha salva(Galinha galinha);
	List<Galinha> buscaTodasGalinhas();
	Galinha buscaGalinhaPorId(UUID idGalinha);
	void deletaGalinha(Galinha galinha);
}
