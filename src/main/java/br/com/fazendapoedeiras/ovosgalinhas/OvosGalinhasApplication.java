package br.com.fazendapoedeiras.ovosgalinhas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class OvosGalinhasApplication {
	
	@GetMapping
	public String getHomeTest() {
		return "Ovos Galinhas - API Home";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(OvosGalinhasApplication.class, args);
	}

}
