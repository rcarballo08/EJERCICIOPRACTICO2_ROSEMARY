package com.ejercicioPractico2.service;

import com.ejercicioPractico2.domain.Contacto;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ContactoService {
    List<Contacto> listarTodos();
    Optional<Contacto> buscarPorId(Long id);
    Contacto guardar(Contacto contacto);
    List<Contacto> buscarPorPeriodo(LocalDateTime inicio, LocalDateTime fin);
    void eliminar(Long id);
}
