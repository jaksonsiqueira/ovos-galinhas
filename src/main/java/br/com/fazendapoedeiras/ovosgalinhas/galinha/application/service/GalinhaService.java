package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.service;

import java.util.List;
import java.util.UUID;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api.GalinhaDetalhadaResponse;
import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api.GalinhaListResponse;
import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api.GalinhaRequest;
import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api.GalinhaResponse;

public interface GalinhaService {
	GalinhaResponse criaGalinha(GalinhaRequest galinhaRequest);
	List<GalinhaListResponse> buscaTodasGalinhas();
	GalinhaDetalhadaResponse buscaGalinhaPorId(UUID idGalinha);
	void deletaGalinhaPorId(UUID idGalinha);
	void patchGalinha(UUID idGalinha,GalinhaRequest galinhaRequest);
	
}
