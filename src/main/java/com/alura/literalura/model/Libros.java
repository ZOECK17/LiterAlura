package com.alura.literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libros {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Id;
        @Column(unique = true)
        private String titulo;
//        private String autor;
        private String idioma;
        private Integer numeroDeDescargas;

        public Libros(){}

        public Libros(DatosLibros datosLibros) {
                this.titulo = datosLibros.titulo();
//                this.autor = datosLibros.autor();
                this.idioma = datosLibros.idioma();
                this.numeroDeDescargas = datosLibros.numeroDeDescargas();
        }

        @Override
        public String toString() {
                return "titulo='" + titulo + '\'' +
//                        ", autor=" + autor +
                        ", idioma=" + idioma +
                        ", numeroDeDescarga='" + numeroDeDescargas + '\'';

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

//        public String getAutor() {
//                return autor;
//        }
//
//        public void setAutor(String autor) {
//                this.autor = autor;
//        }

        public String getIdioma() {
                return idioma;
        }

        public void setIdioma(String idioma) {
                this.idioma = idioma;
        }

        public Integer getNumeroDeDescargas() {
                return numeroDeDescargas;
        }

        public void setNumeroDeDescargas(Integer numeroDeDescargas) {
                this.numeroDeDescargas = numeroDeDescargas;
        }
}
