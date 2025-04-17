package com.ejercicioPractico2.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Entity
@Data
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USUARIO_ID", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "FUNCION_ID", nullable = false)
    private Funcion funcion;

    @Column(name = "FECHA_RESERVA", nullable = false)
    private LocalDate fechaReserva = LocalDate.now();

    @Column(name = "CANTIDAD", nullable = false)
    private Integer cantidad;

    @Enumerated(EnumType.STRING)
    @Column(name = "ESTADO")
    private EstadoReserva estado = EstadoReserva.RESERVADO;

    public Reserva() {
        this.fechaReserva = LocalDate.now();
        this.estado = EstadoReserva.RESERVADO;
    }

    public enum EstadoReserva {
        RESERVADO, CANCELADO, CONFIRMADO
    }
}


