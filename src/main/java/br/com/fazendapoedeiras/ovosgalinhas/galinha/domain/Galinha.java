package br.com.fazendapoedeiras.ovosgalinhas.galinha.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api.GalinhaRequest;
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
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@Entity
public class Galinha {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idGalinha", updatable = false, unique = true, nullable = false)
	private UUID idGalinha;
	@NotBlank
	private String nomeGalinha;
	@NotNull
	private LocalDate dataDeNascimento;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Galinha(GalinhaRequest galinhaRequest) {
		this.nomeGalinha = galinhaRequest.getNomeGalinha();
		this.dataDeNascimento = galinhaRequest.getDataDeNascimento();
		this.dataHoraDoCadastro = LocalDateTime.now();
		
	}
	
}
