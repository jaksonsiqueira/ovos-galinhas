package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

import java.util.UUID;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.domain.Galinha;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GalinhaResponse {
	private UUID idGalinha;
	
	public GalinhaResponse(Galinha galinha) { 
		this.idGalinha = galinha.getIdGalinha();
	}
}
