package br.com.fazendapoedeiras.ovosgalinhas.ovos.infra;

import org.springframework.stereotype.Repository;

import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.service.RegistroDeOvosRepository;
import br.com.fazendapoedeiras.ovosgalinhas.ovos.domain.RegistroDeOvos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class RegistroDeOvosInfraRepository implements RegistroDeOvosRepository {
	private final RegistroDeOvosSpringDataJPARepository registroDeOvosSpringDataJPARepository;
	
	@Override
	public RegistroDeOvos salvaRegistroDeOvos(RegistroDeOvos registroDeOvos) {
		log.info("[inicia]RegistroDeOvosInfraRepository - salvaRegistroDeOvos");
		registroDeOvosSpringDataJPARepository.save(registroDeOvos);
		log.info("[finaliza]RegistroDeOvosInfraRepository - salvaRegistroDeOvos");
		return registroDeOvos;
	}

}
