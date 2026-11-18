package com.example.readpoint.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha_reserva", nullable = false)
    private LocalDate fechaReserva;

    @Column(name = "fecha_devolucion")
    private LocalDate fechaDevolucion;

    @Column(name = "estado", length = 30)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_estudiante", nullable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_libro", nullable = false)
    private Libro libro;

    public Reserva() {
    }

    public Reserva(int id, LocalDate fechaReserva,
                   LocalDate fechaDevolucion, String estado,
                   Estudiante estudiante, Libro libro) {
        this.id = id;
        this.fechaReserva = fechaReserva;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
        this.estudiante = estudiante;
        this.libro = libro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public long calcularDias() {
        if (fechaReserva == null || fechaDevolucion == null) {
            return 0;
        }

        return ChronoUnit.DAYS.between(fechaReserva, fechaDevolucion);
    }

    public boolean estaActiva() {
        return estado != null && estado.equalsIgnoreCase("Activa");
    }

    public void mostrarReserva() {
        System.out.println("Estudiante: " + estudiante.nombreCompleto());
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Fecha de reserva: " + fechaReserva);
        System.out.println("Fecha de devolución: " + fechaDevolucion);
        System.out.println("Días de reserva: " + calcularDias());
        System.out.println("Estado: " + estado);
    }
}