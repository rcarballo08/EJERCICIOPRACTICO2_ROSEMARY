package com.ejercicioPractico2.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
@Table(name = "funcion")
public class Funcion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_PELICULA", nullable = false)
    private Pelicula pelicula;

    @Column(name = "FECHA", nullable = false)
    private String fecha; // Formato: 'YYYY-MM-DD'

    @Column(name = "HORA", nullable = false)
    private String hora; // Formato: 'HH:mm:ss'

    @Column(name = "SALA", nullable = false)
    private String sala;

    public Funcion() {
    }
}

