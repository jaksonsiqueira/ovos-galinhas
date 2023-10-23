package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

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
}
