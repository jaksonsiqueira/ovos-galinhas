package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.service.GalinhaService;
import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api.RegistroDeOvosRequest;
import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api.RegistroDeOvosResponse;
import br.com.fazendapoedeiras.ovosgalinhas.ovos.domain.RegistroDeOvos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class RegistroDeOvosAplicationService implements RegistroDeOvosService {
	private final GalinhaService galinhaService;
	private final RegistroDeOvosRepository registroDeOvosRepository;
	
	@Override
	public RegistroDeOvosResponse criaRegistroDeOvos(UUID idGalinha, RegistroDeOvosRequest registroDeOvosRequest) {
		log.info("[inicia]RegistroDeOvosAplicationService - criaRegistroDeOvos ");
		galinhaService.buscaGalinhaPorId(idGalinha);
		RegistroDeOvos registroDeOvos = registroDeOvosRepository.salvaRegistroDeOvos(new RegistroDeOvos(idGalinha, registroDeOvosRequest));
		log.info("[finaliza]RegistroDeOvosAplicationService - criaRegistroDeOvos ");
		return new RegistroDeOvosResponse(registroDeOvos);
	}

}