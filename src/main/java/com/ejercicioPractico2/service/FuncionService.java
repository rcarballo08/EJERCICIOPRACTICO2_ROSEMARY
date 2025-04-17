package com.ejercicioPractico2.service;

import com.ejercicioPractico2.domain.Funcion;
import java.util.List;
import java.util.Optional;

public interface FuncionService {
    List<Funcion> listarTodas();
    Optional<Funcion> buscarPorId(Long id);
    Optional<Funcion> buscarPorNombre(String nombre);
    Funcion guardar(Funcion funcion);
    boolean existeNombre(String nombre);
    void eliminar(Long id);
}
