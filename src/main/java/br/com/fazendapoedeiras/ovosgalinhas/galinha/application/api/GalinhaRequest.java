package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GalinhaRequest {
	@NotBlank
	private String nomeGalinha;
	@NotNull
	private LocalDate dataDeNascimento;
}
