package com.alura.literalura;

import com.alura.literalura.pincipal.Principal;
import com.alura.literalura.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private LibrosRepository reposity;
	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(reposity);
		principal.muestraElMenu();
	}

}