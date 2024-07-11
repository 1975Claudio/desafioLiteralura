package br.com.alura.desafioliteralura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LivroDto (Integer id, @JsonAlias ("title") String titulo, @JsonAlias("authors") List<AutorDto> autores, @JsonAlias ("languages") String [] idioma,
                        @JsonAlias ("download_count") Integer numeroDownloads){
}
