package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class RegistroOvosController implements RegistroOvosAPI {

	@Override
	public RegistroOvosResponse postRegistroOvos(UUID idGalinha, @Valid RegistroOvosRequest registroOvosRequest) {
		log.info("[inicia] RegistroOvosController - postRegistroOvos");
		log.info("[idGalinha]{}", idGalinha);
		log.info("[finaliza] RegistroOvosController - postRegistroOvos");
		return null;
	}

}
