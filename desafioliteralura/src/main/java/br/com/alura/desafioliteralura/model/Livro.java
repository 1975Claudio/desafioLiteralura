package br.com.alura.desafioliteralura.model;

import br.com.alura.desafioliteralura.dto.LivroDto;
import jakarta.persistence.*;

@Entity
@Table (name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String titulo;
    private Integer autor_id;
    private String idioma;
    private Integer numeroDownloads;


    public Livro(LivroDto livro) {
        this.titulo = livro.titulo();
        this.autor_id = livro.id();
        this.idioma = String.join("", livro.idioma());
        this.numeroDownloads = livro.numeroDownloads();
    }

        public Integer getId () {
            return id;
        }

        public void setId (Integer id){
            this.id = id;
        }

        public String getTitulo () {
            return titulo;
        }

        public void setTitulo (String titulo){
            this.titulo = titulo;
        }

        public Integer getAutor_id () {
            return autor_id;
        }

        public void setAutor_id (Integer autor_id){
            this.autor_id = autor_id;
        }

        public Integer getNumeroDownloads () {
            return numeroDownloads;
        }

        public void setNumeroDownloads (Integer numeroDownloads){
            this.numeroDownloads = numeroDownloads;
        }

        public String getIdioma () {
            return idioma;
        }

        public void setIdioma (String idioma){
            this.idioma = idioma;
        }
        @Override
        public String toString () {
            return " titulo='" + titulo + '\'' +
                    ", autor_id=" + autor_id +
                    ", idioma='" + idioma + '\'' +
                    ", numeroDownloads=" + numeroDownloads;
        }
    }

