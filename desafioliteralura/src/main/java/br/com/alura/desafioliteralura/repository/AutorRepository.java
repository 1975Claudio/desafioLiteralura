package br.com.alura.desafioliteralura.repository;

import br.com.alura.desafioliteralura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
    List<Autor> findByanoFalecimentoLessThan(Integer anoFalecimento);
}
