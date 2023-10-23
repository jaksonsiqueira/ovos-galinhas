package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class GalinhaController implements GalinhaAPI {

	@Override
	public GalinhaResponse postGalinha(GalinhaRequest galinhaRequest) {
		log.info("[inicia] GalinhaController - postGalinha");
		log.info("[finaliza] GalinhaController - postGalinha");
		return null;
	}

}
