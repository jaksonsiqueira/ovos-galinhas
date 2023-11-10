package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RegistroDeOvosRequest {
	@NotNull
	private Integer quantidadeDeOvos;
	@NotNull
	private LocalDate dataRegistroChocados;

}
