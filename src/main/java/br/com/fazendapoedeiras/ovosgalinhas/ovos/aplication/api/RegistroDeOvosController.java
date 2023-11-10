package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.service.RegistroDeOvosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class RegistroDeOvosController implements RegistroDeOvosAPI {
	private final RegistroDeOvosService registroDeOvosService;
	
	@Override
	public RegistroDeOvosResponse postRegistroDeOvos(UUID idGalinha, RegistroDeOvosRequest registroDeOvosRequest) {
		log.info("[inicia]RegistroDeOvosController - postRegistroDeOvos");
		log.info("[idGalinha]{}", idGalinha);
		RegistroDeOvosResponse registroDeOvos = registroDeOvosService.criaRegistroDeOvos(idGalinha,registroDeOvosRequest);
		log.info("[finaliza]RegistroDeOvosController - postRegistroDeOvos");
		return registroDeOvos;
	}

}
