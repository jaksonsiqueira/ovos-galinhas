package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.service.GalinhaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class GalinhaController implements GalinhaAPI {
	private final GalinhaService galinhaService;

	@Override
	public GalinhaResponse postGalinha(GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaController - postGalinha");
		GalinhaResponse galinhaCriada = galinhaService.criaGalinha(galinhaRequest);
		log.info("[finaliza] GalinhaController - postGalinha");
		return galinhaCriada;
		}

	@Override
	public List<GalinhaListResponse> getTodasGalinhas() {
		log.info("[inicia] GalinhaController - getTodasGalinhas");
		List<GalinhaListResponse> galinhas = galinhaService.buscaTodasGalinhas();
		log.info("[finaliza] GalinhaController - getTodasGalinhas");
		return galinhas;
	}

	@Override
	public GalinhaDetalhadaResponse getGalinhaPorId(UUID idGalinha) {
		log.info("[inicia] GalinhaController - getGalinhaPorId");
		log.info("[idGalinha]{}", idGalinha);
		GalinhaDetalhadaResponse galinhaDetalhada = galinhaService.buscaGalinhaPorId(idGalinha);
		log.info("[finaliza] GalinhaController - getGalinhaPorId");
		return galinhaDetalhada;
	}

	@Override
	public void deletaGalinhaPorId(UUID idGalinha) {
		log.info("[inicia] GalinhaController - deletaGalinhaPorId");
		log.info("[idGalinha]{}", idGalinha);
		galinhaService.deletaGalinhaPorId(idGalinha);
		log.info("[finaliza] GalinhaController - deletaGalinhaPorId");
		
	}

	@Override
	public void patchGalinha(UUID idGalinha, @Valid GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaController - patchGalinha");
		log.info("[idGalinha]{}", idGalinha);
		galinhaService.patchGalinha(idGalinha, galinhaRequest);
		log.info("[finaliza] GalinhaController - patchGalinha");
	}
}
