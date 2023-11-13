package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.service;

import java.util.List;
import java.util.UUID;

import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api.RegistroDeOvosDetalhadoResponse;
import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api.RegistroDeOvosGalinhaListResponse;
import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api.RegistroDeOvosRequest;
import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api.RegistroDeOvosResponse;

public interface RegistroDeOvosService {

	RegistroDeOvosResponse criaRegistroDeOvos(UUID idGalinha, RegistroDeOvosRequest registroDeOvosRequest);
	List<RegistroDeOvosGalinhaListResponse> buscaRegistrosDeOvosDaGalinhaComId(UUID idGalinha);
	RegistroDeOvosDetalhadoResponse buscaRegistroDeOvosDaGalinhaComId(UUID idGalinha, UUID idRegistroDeOvos);
	void deletaRegistroDeOvosPorId(UUID idGalinha, UUID idRegistroDeOvos);
	void patchRegistroDeOvos(UUID idGalinha, UUID idRegistroDeOvos, RegistroDeOvosRequest registroDeOvosRequest);
	

}
