package br.com.fazendapoedeiras.ovosgalinhas.ovos.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api.RegistroDeOvosRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@Entity
public class RegistroDeOvos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idRegistroDeOvos", updatable = false, unique = true, nullable = false)
	private UUID idRegistroDeOvos;
	@NotNull
	@Column(columnDefinition = "uuid", name = "idGalinha", nullable = false)
	private UUID idGalinha;
	@NotNull
	private Integer quantidadeDeOvos;
	@NotNull
	private LocalDate dataRegistroChocados;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public RegistroDeOvos(UUID idGalinha, RegistroDeOvosRequest registroDeOvosRequest) {
		this.idGalinha = idGalinha;
		this.quantidadeDeOvos = registroDeOvosRequest.getQuantidadeDeOvos();
		this.dataRegistroChocados = registroDeOvosRequest.getDataRegistroChocados();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}
