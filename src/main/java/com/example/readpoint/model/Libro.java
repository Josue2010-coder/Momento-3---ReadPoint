package com.example.readpoint.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "titulo", length = 100, nullable = false)
    private String titulo;

    @Column(name = "autor", length = 100, nullable = false)
    private String autor;

    @Column(name = "isbn", length = 30, unique = true)
    private String isbn;

    @Column(name = "editorial", length = 100)
    private String editorial;

    @Column(name = "anio_publicacion")
    private int anioPublicacion;

    @Column(name = "categoria", length = 50)
    private String categoria;

    @Column(name = "ejemplares_totales")
    private int ejemplaresTotales;

    @Column(name = "ejemplares_disponibles")
    private int ejemplaresDisponibles;

    public Libro() {
    }

    public Libro(int id, String titulo, String autor, String isbn,
                 String editorial, int anioPublicacion, String categoria,
                 int ejemplaresTotales, int ejemplaresDisponibles) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.categoria = categoria;
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public void setEjemplaresTotales(int ejemplaresTotales) {
        this.ejemplaresTotales = ejemplaresTotales;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public boolean estaDisponible() {
        return ejemplaresDisponibles > 0;
    }

    public void mostrarLibro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Editorial: " + editorial);
        System.out.println("Año: " + anioPublicacion);
        System.out.println("Categoría: " + categoria);
        System.out.println("Ejemplares totales: " + ejemplaresTotales);
        System.out.println("Ejemplares disponibles: " + ejemplaresDisponibles);
    }
}