package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.fazendapoedeiras.ovosgalinhas.ovos.domain.RegistroDeOvos;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RegistroDeOvosDetalhadoResponse {

	private UUID idRegistroDeOvos;
	private Integer quantidadeDeOvos;
	private LocalDate dataRegistroChocados;

	public RegistroDeOvosDetalhadoResponse(RegistroDeOvos registroDeOvos) {
		this.idRegistroDeOvos = registroDeOvos.getIdRegistroDeOvos();
		this.quantidadeDeOvos = registroDeOvos.getQuantidadeDeOvos();
		this.dataRegistroChocados = registroDeOvos.getDataRegistroChocados();
	}

}
