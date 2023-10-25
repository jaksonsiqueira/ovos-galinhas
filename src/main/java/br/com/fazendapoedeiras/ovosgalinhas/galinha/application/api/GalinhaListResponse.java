package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

import java.util.List;
import java.util.UUID;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.domain.Galinha;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GalinhaListResponse {
	private UUID idGalinha;
	private String nomeGalinha;
	public static List<GalinhaListResponse> convert(List<Galinha> galinhas) {
		// TODO Auto-generated method stub
		return null;
	}

}
