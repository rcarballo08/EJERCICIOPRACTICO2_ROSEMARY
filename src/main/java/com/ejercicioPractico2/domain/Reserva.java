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
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_funcion", nullable = false)
    private Funcion funcion;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

//    public Reserva() {
//        this.fechaReserva = LocalDate.now();
//        this.estado = EstadoReserva.RESERVADO;
//    }

    public void setCantidad(Integer cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEstado(EstadoReserva estadoReserva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public enum EstadoReserva {
        RESERVADO, CANCELADO, CONFIRMADO
    }
}


