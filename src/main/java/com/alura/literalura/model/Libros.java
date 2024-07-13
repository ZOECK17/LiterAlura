package com.alura.literalura.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "libros")
public class Libros {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Id;
        @Column(unique = true)
        private String titulo;
        @Enumerated(EnumType.STRING)
        private Idioma idioma;
        private double numeroDeDescargas;
        @OneToMany(mappedBy = "libros", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        private List<Autor> autor;

        public Libros(){}

        public Libros(DatosLibros datosLibros) {
                this.titulo = datosLibros.titulo();
                this.idioma = Idioma.fromString(datosLibros.idioma().stream()
                        .limit(1)
                        .collect(Collectors.joining()));
                this.numeroDeDescargas = datosLibros.numeroDeDescargas();
        }

        @Override
        public String toString() {
                return "Libros{" +
                        "Id=" + Id +
                        ", titulo='" + titulo + '\'' +
                        ", idioma=" + idioma +
                        ", numeroDeDescargas=" + numeroDeDescargas +
                        ", autor=" + autor +
                        '}';
        }

        public Long getId() {
                return Id;
        }

        public void setId(Long id) {
                Id = id;
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public Idioma getIdioma() {
                return idioma;
        }

        public void setIdioma(Idioma idioma) {
                this.idioma = idioma;
        }

        public double getNumeroDeDescargas() {
                return numeroDeDescargas;
        }

        public void setNumeroDeDescargas(double numeroDeDescargas) {
                this.numeroDeDescargas = numeroDeDescargas;
        }

        public List<Autor> getAutor() {
                return autor;
        }

        public void setAutor(List<Autor> autor) {
                this.autor = autor;
        }
}
