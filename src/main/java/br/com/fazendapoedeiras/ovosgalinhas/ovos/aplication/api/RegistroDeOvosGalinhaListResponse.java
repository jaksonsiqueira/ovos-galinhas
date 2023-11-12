package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.fazendapoedeiras.ovosgalinhas.ovos.domain.RegistroDeOvos;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RegistroDeOvosGalinhaListResponse {
	private UUID idRegistroDeOvos;
	private Integer quantidadeDeOvos;
	private LocalDate dataRegistroChocados;

	public static List<RegistroDeOvosGalinhaListResponse> convert(List<RegistroDeOvos> registroDeOvos) {
		return registroDeOvos.stream()
				.map(RegistroDeOvosGalinhaListResponse::new)
				.collect(Collectors.toList());
	}
	
	public RegistroDeOvosGalinhaListResponse(RegistroDeOvos registroDeOvos) { 
		this.idRegistroDeOvos = registroDeOvos.getIdRegistroDeOvos();
		this.quantidadeDeOvos = registroDeOvos.getQuantidadeDeOvos();
		this.dataRegistroChocados = registroDeOvos.getDataRegistroChocados();
	}

}
