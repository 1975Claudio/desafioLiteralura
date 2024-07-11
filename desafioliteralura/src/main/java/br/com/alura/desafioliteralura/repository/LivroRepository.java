package br.com.alura.desafioliteralura.repository;

import br.com.alura.desafioliteralura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LivroRepository  extends JpaRepository<Livro, Integer> {
    List<Livro> findByIdiomaContainingIgnoreCase(String idioma);
    Optional<Livro> findByTituloEqualsIgnoreCase(String titulo);
}
