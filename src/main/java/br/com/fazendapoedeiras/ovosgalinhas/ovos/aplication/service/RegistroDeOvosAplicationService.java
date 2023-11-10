package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.service;

import java.util.UUID;

import org.springframework.stereotype.Service;


import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api.RegistroDeOvosRequest;
import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api.RegistroDeOvosResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class RegistroDeOvosAplicationService implements RegistroDeOvosService {

	@Override
	public RegistroDeOvosResponse criaRegistroDeOvos(UUID idGalinha, RegistroDeOvosRequest registroDeOvosRequest) {
		log.info("[inicia]RegistroDeOvosAplicationService - criaRegistroDeOvos ");
		log.info("[finaliza]RegistroDeOvosAplicationService - criaRegistroDeOvos ");
		return null;
	}

}
