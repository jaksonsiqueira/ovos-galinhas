package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api.GalinhaListResponse;
import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api.GalinhaRequest;
import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api.GalinhaResponse;
import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.repository.GalinhaRepository;
import br.com.fazendapoedeiras.ovosgalinhas.galinha.domain.Galinha;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class GalinhaApplicationService implements GalinhaService {
	private final GalinhaRepository galinhaRepository;
	@Override
	public GalinhaResponse criaGalinha(GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaApplicationService - criaGalinha");
		Galinha galinha = galinhaRepository.salva(new Galinha(galinhaRequest));
		log.info("[finaliza] GalinhaApplicationService - criaGalinha");
		return new GalinhaResponse(galinha);
	}
	@Override
	public List<GalinhaListResponse> buscaTodasGalinhas() {
		log.info("[inicia] GalinhaApplicationService - buscaTodasGalinhas");
		log.info("[finaliza] GalinhaApplicationService - buscaTodasGalinhas");
		return null;
	}
}
