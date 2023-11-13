package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.domain.Galinha;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GalinhaListResponse {
	private UUID idGalinha;
	private String nomeGalinha;
	private LocalDate dataDeNascimento;
	
	public static List<GalinhaListResponse> convert(List<Galinha> galinhas) {
		return galinhas.stream()
				.map(GalinhaListResponse::new)
				.collect(Collectors.toList());
	}

	public GalinhaListResponse(Galinha galinha) {
		this.idGalinha = galinha.getIdGalinha();
		this.nomeGalinha = galinha.getNomeGalinha();
		this.dataDeNascimento = galinha.getDataDeNascimento();
	}

}
