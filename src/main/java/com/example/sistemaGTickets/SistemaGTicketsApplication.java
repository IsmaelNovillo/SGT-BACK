package com.example.sistemaGTickets;

import com.example.sistemaGTickets.entity.usuarios;
import com.example.sistemaGTickets.repository.usuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Set;

@SpringBootApplication
public class SistemaGTicketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaGTicketsApplication.class, args);
	}

	@Autowired
	usuariosRepository userRepository;
	@Bean
	CommandLineRunner init () {
		return(args -> {
			usuarios user = usuarios.builder()
					.email("asd@asd.com")
					.nombre("martin")
					.password("1234")
					.apellido("jimenez")
					.build();
			usuarios userEntity1 = usuarios.builder()
					.email("asd@asd.com")
					.nombre("ismael")
					.password("1234")
					.apellido("novillo")
					.build();


			userRepository.save(user);
			userRepository.save(userEntity1);



		});

	}
}
