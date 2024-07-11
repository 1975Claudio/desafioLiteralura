package br.com.alura.desafioliteralura;

import br.com.alura.desafioliteralura.repository.AutorRepository;
import br.com.alura.desafioliteralura.repository.LivroRepository;
import br.com.alura.desafioliteralura.view.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioliteraluraApplication implements CommandLineRunner {
	@Autowired
	private LivroRepository repository;
	@Autowired
	private AutorRepository autorRepository;

	public static void main(String[] args) {

		SpringApplication.run(DesafioliteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserInterface screenMenu = new UserInterface (repository, autorRepository);
}

}