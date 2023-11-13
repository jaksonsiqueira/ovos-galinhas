package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RegistroDeOvosDetalhadoResponse {
	private UUID idRegistroDeOvos;
	private UUID idGalinha;
	private Integer quantidadeDeOvos;
	private LocalDate dataRegistroChocados;
}
