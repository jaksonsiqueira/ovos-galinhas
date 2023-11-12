package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.service;

import java.util.List;
import java.util.UUID;

import br.com.fazendapoedeiras.ovosgalinhas.ovos.domain.RegistroDeOvos;

public interface RegistroDeOvosRepository {

	RegistroDeOvos salvaRegistroDeOvos(RegistroDeOvos registroDeOvos);
	List<RegistroDeOvos> buscaRegistrosDeOvosDaGalinhaComId(UUID idGalinha);

}
