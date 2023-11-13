package br.com.fazendapoedeiras.ovosgalinhas.galinha.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.repository.GalinhaRepository;
import br.com.fazendapoedeiras.ovosgalinhas.galinha.domain.Galinha;
import br.com.fazendapoedeiras.ovosgalinhas.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class GalinhaInfraRepository implements GalinhaRepository {
	private final GalinhaSpringDataJPARepository galinhaSpringDataJPARepository;

	@Override
	public Galinha salva(Galinha galinha) {
		log.info("[inicia] GalinhaInfraRepository - salva");
		galinhaSpringDataJPARepository.save(galinha);
		log.info("[finaliza] GalinhaInfraRepository - salva");
		return galinha;
	}

	@Override
	public List<Galinha> buscaTodasGalinhas() {
		log.info("[inicia] GalinhaInfraRepository - buscaTodasGalinhas");
		List<Galinha> todasGalinhas = galinhaSpringDataJPARepository.findAll();
		log.info("[finaliza] GalinhaInfraRepository - buscaTodasGalinhas");
		return todasGalinhas;
	}

	@Override
	public Galinha buscaGalinhaPorId(UUID idGalinha) {
		log.info("[inicia] GalinhaInfraRepository - buscaGalinhaPorId");
		Galinha galinha = galinhaSpringDataJPARepository.findById(idGalinha)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Galinha não encontrada!"));
		log.info("[finaliza] GalinhaInfraRepository - buscaGalinhaPorId");
		return galinha;
	}

	@Override
	public void deletaGalinha(Galinha galinha) {
		log.info("[inicia] GalinhaInfraRepository - deletaGalinha");
		galinhaSpringDataJPARepository.delete(galinha);
		log.info("[finaliza] GalinhaInfraRepository - deletaGalinha");

	}
}
