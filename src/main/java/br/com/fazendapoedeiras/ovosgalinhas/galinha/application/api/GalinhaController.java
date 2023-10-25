package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.service.GalinhaService;
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
}
