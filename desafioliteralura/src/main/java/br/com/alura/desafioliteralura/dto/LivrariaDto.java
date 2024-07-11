package br.com.alura.desafioliteralura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
gitimport java.util.List;

@JsonIgnoreProperties (ignoreUnknown = true)
public record LivrariaDto(@JsonAlias("results") List<LivroDto> livros) {
}
