package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api.GalinhaDetalhadaResponse;
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
		List<Galinha> galinhas = galinhaRepository.buscaTodasGalinhas();
		log.info("[finaliza] GalinhaApplicationService - buscaTodasGalinhas");
		return GalinhaListResponse.convert(galinhas);
	}
	@Override
	public GalinhaDetalhadaResponse buscaGalinhaPorId(UUID idGalinha) {
		log.info("[inicia] GalinhaApplicationService - buscaGalinhaPorId");
		Galinha galinha = galinhaRepository.buscaGalinhaPorId(idGalinha);
		log.info("[finaliza] GalinhaApplicationService - buscaGalinhaPorId");
		return new GalinhaDetalhadaResponse(galinha);		
	}
	@Override
	public void deletaGalinhaPorId(UUID idGalinha) {
		log.info("[inicia] GalinhaApplicationService - deletaGalinhaPorId");
		Galinha galinha = galinhaRepository.buscaGalinhaPorId(idGalinha);
		galinhaRepository.deletaGalinha(galinha);
		log.info("[finaliza] GalinhaApplicationService - deletaGalinhaPorId");
		
	}
}
