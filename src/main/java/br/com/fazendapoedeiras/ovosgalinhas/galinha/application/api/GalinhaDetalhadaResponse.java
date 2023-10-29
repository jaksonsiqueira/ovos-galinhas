package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.domain.Galinha;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GalinhaDetalhadaResponse {
	private UUID idGalinha;
	private String nomeGalinha;
	private LocalDate dataDeNascimento;
	
	private LocalDateTime dataHoraDoCadastro;
	
	public GalinhaDetalhadaResponse(Galinha galinha) {
		this.idGalinha = galinha.getIdGalinha();
		this.nomeGalinha = galinha.getNomeGalinha();
		this.dataDeNascimento = galinha.getDataDeNascimento();
		this.dataHoraDoCadastro = galinha.getDataHoraDoCadastro();
		
	}
}
