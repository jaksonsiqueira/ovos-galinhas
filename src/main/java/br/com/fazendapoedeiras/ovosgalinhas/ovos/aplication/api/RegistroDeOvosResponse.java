package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api;

import java.util.UUID;

import br.com.fazendapoedeiras.ovosgalinhas.ovos.domain.RegistroDeOvos;
//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
//@AllArgsConstructor
public class RegistroDeOvosResponse {
	private UUID idRegistroDeOvos;
	
	public RegistroDeOvosResponse(RegistroDeOvos registroDeOvos) { 
		this.idRegistroDeOvos = registroDeOvos.getIdRegistroDeOvos();
	}
}
