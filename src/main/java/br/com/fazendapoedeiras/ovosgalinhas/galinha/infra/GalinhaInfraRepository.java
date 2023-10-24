package br.com.fazendapoedeiras.ovosgalinhas.galinha.infra;

import org.springframework.stereotype.Repository;

import br.com.fazendapoedeiras.ovosgalinhas.galinha.application.repository.GalinhaRepository;
import br.com.fazendapoedeiras.ovosgalinhas.galinha.domain.Galinha;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class GalinhaInfraRepository implements GalinhaRepository {

	@Override
	public Galinha salva(Galinha galinha) {
		log.info("[inicia] GalinhaInfraRepository - salva");
		log.info("[finaliza] GalinhaInfraRepository - salva");
		return galinha;
	}

}
