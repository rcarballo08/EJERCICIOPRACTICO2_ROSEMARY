package com.ejercicioPractico2.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
@Table(name = "funciones")
public class Funcion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pelicula", nullable = false)
    private Pelicula pelicula;

    @Column(name = "fecha", nullable = false)
    private String fecha; // Formato: 'YYYY-MM-DD'

    @Column(name = "hora", nullable = false)
    private String hora; // Formato: 'HH:mm:ss'

    @Column(name = "sala", nullable = false)
    private String sala;

    public Funcion() {
    }
}

