package com.ejercicioPractico2.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Data
@Table(name = "usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "CORREO", nullable = false, unique = true)
    private String correo;

    @Column(name = "CONTRASENA", nullable = false)
    private String contrasena;

    @Column(name = "ROL", nullable = false)
    private String rol; // Puede ser 'USUARIO' o 'ADMIN'

    public Usuario() {
    }
}

