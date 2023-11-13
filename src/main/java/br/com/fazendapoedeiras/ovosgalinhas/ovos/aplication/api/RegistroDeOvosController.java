package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api;

import java.util.List;
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

	@Override
	public List<RegistroDeOvosGalinhaListResponse> getTodasRegistroDeOvosGalinhaComId(UUID idGalinha) {
		log.info("[inicia]RegistroDeOvosController - getTodasRegistroDeOvosGalinhaComId");
		log.info("[idGalinha]{}", idGalinha);
		List<RegistroDeOvosGalinhaListResponse> registrosDeOvosDaGalinha = registroDeOvosService.buscaRegistrosDeOvosDaGalinhaComId(idGalinha);
		log.info("[finaliza]RegistroDeOvosController - getTodasRegistroDeOvosGalinhaComId");
		return registrosDeOvosDaGalinha;
	}

	@Override
	public RegistroDeOvosDetalhadoResponse getRegistroDeOvosPorId(UUID idGalinha, UUID idRegistroDeOvos) {
		log.info("[inicia]RegistroDeOvosController - getRegistroDeOvosPorId");
		log.info("[idGalinha]{} - [idRegistroDeOvos]{}", idGalinha, idRegistroDeOvos);
		RegistroDeOvosDetalhadoResponse registroDeOvos = registroDeOvosService.buscaRegistroDeOvosDaGalinhaComId(idGalinha, idRegistroDeOvos);
		log.info("[finaliza]RegistroDeOvosController - getRegistroDeOvosPorId");
		return registroDeOvos;
	}

}
