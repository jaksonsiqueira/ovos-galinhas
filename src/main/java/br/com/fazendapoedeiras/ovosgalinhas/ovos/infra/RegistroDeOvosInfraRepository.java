package br.com.fazendapoedeiras.ovosgalinhas.ovos.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.fazendapoedeiras.ovosgalinhas.handler.APIException;
import br.com.fazendapoedeiras.ovosgalinhas.ovos.aplication.repository.RegistroDeOvosRepository;
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

	@Override
	public List<RegistroDeOvos> buscaRegistrosDeOvosDaGalinhaComId(UUID idGalinha) {
		log.info("[inicia]RegistroDeOvosInfraRepository - buscaRegistrosDeOvosDaGalinhaComId");
		var todosRegistroDeOvos = registroDeOvosSpringDataJPARepository.findByIdGalinha(idGalinha);
		log.info("[finaliza]RegistroDeOvosInfraRepository - buscaRegistrosDeOvosDaGalinhaComId");
		return todosRegistroDeOvos;
	}

	@Override
	public RegistroDeOvos buscaRegistroDeOvos(UUID idRegistroDeOvos) {
		log.info("[inicia]RegistroDeOvosInfraRepository - buscaRegistroDeOvos");
		var registroDeOvos = registroDeOvosSpringDataJPARepository.findById(idRegistroDeOvos)
				.orElseThrow(() -> APIException
						.build(HttpStatus.NOT_FOUND, "Nenhum Registro de Ovos foi encontrado pra esssa galinha"));
		log.info("[inicia]RegistroDeOvosInfraRepository - buscaRegistroDeOvos");
		return registroDeOvos;
	}

}
