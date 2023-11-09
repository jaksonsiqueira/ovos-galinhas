package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RegistroOvosRequest {	
	@NotNull
	private LocalDate dataDosOvosChocados;
	@NotNull
	@Min(value = 0)
	private Integer quantidadeDeOvos;

}
