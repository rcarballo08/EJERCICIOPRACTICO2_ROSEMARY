package com.ejercicioPractico2.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Set;
import lombok.Data;

@Entity
@Data
@Table(name = "pelicula")
public class Pelicula implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITULO", nullable = false)
    private String titulo;

    @Column(name = "TIPO", nullable = false)
    private String tipo; 

    @OneToMany(mappedBy = "pelicula")
    private Set<Funcion> funciones;

    public Pelicula() {
    }

    public Object getFunciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

