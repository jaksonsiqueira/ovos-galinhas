package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

import java.util.UUID;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GalinhaListResponse {
	private UUID idGalinha;
	private String nomeGalinha;

}
