package br.com.fazendapoedeiras.ovosgalinhas.galinha.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/galinha")
public interface GalinhaAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	GalinhaResponse postGalinha(@Valid @RequestBody GalinhaRequest galinhaRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<GalinhaListResponse> getTodasGalinhas();
	
	@GetMapping(value = "/{idGalinha}")
	@ResponseStatus(code = HttpStatus.OK)
	GalinhaDetalhadaResponse getGalinhaPorId(@PathVariable UUID idGalinha);

}
