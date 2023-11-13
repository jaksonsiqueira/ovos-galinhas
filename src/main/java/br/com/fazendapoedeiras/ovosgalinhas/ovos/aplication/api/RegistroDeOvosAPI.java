package br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/galinha/{idGalinha}/ovos")
public interface RegistroDeOvosAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	RegistroDeOvosResponse postRegistroDeOvos(@PathVariable UUID idGalinha,
			@Valid @RequestBody RegistroDeOvosRequest registroDeOvosRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<RegistroDeOvosGalinhaListResponse> getTodasRegistroDeOvosGalinhaComId(@PathVariable UUID idGalinha);
	
	@GetMapping(value = "/{idRegistroDeOvos}")
	@ResponseStatus(code = HttpStatus.OK)
	RegistroDeOvosDetalhadoResponse getRegistroDeOvosPorId(@PathVariable UUID idGalinha, 
			@PathVariable UUID idRegistroDeOvos);
	
	@DeleteMapping(value = "/{idRegistroDeOvos}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaRegistroDeOvosPorId(@PathVariable UUID idGalinha, 
			@PathVariable UUID idRegistroDeOvos);
	
	@PatchMapping(value = "/{idRegistroDeOvos}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	RegistroDeOvosResponse patchRegistroDeOvosPorId(@PathVariable UUID idGalinha, 
			@PathVariable UUID idRegistroDeOvos,
			@Valid @RequestBody RegistroDeOvosRequest registroDeOvosRequest);
}

