package com.ejercicioPractico2.dao;

import com.practica.domain.Pelicula;
import com.practica.domain.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface PeliculaDao extends JpaRepository<Pelicula, Long> {
    List<Pelicula> findByFuncion(Funcion funcion);
    List<Pelicula> findByTituloContainingIgnoreCase(String titulo);
    List<Pelicula> findByTipo(String tipo);
    Optional<Pelicula> findByTitulo(String titulo);
    boolean existsByTitulo(String titulo);
}

