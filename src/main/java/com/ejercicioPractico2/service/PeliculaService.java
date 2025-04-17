package com.ejercicioPractico2.service;

import com.ejercicioPractico2.domain.Funcion;
import com.ejercicioPractico2.domain.Pelicula;
import java.util.List;
import java.util.Optional;

public interface PeliculaService {
    List<Pelicula> listarTodos();
    Optional<Pelicula> buscarPorId(Long id);
    List<Pelicula> buscarPorTitulo(String titulo);
    List<Pelicula> buscarPorTipo(String tipo);
    List<Pelicula> buscarPorFuncion(Funcion funcion);
    Pelicula guardar(Pelicula pelicula);
    boolean existePorTitulo(String titulo);
    void eliminar(Long id);
    boolean tieneFunciones(Long id);
    void actualizarPelicula(Long id, Pelicula pelicula);
}

