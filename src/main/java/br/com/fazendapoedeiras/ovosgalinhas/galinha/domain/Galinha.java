package br.com.fazendapoedeiras.ovosgalinhas.galinha.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Galinha {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idGalinha", updatable = false, unique = true, nullable = false)
	private UUID idGalinha;
	@NotBlank
	private String nomeGalinha;
	@NotNull
	private LocalDate dataDeNascimento;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Galinha(@NotBlank String nomeGalinha, @NotNull LocalDate dataDeNascimento) {
		this.nomeGalinha = nomeGalinha;
		this.dataDeNascimento = dataDeNascimento;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	
}
