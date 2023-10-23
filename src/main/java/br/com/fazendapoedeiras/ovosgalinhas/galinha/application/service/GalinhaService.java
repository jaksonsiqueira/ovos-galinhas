package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.service;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api.GalinhaRequest;
import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api.GalinhaResponse;

public interface GalinhaService {
	GalinhaResponse criaGalinha(GalinhaRequest galinhaRequest);
}
