package com.ejercicioPractico2.service;

import com.ejercicioPractico2.domain.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listarTodos();
    Optional<Usuario> buscarPorId(Long id);
    Optional<Usuario> buscarPorUsername(String username);
    Usuario guardar(Usuario usuario);
    boolean existeUsername(String username);
    boolean existeEmail(String email);
    void eliminar(Long id);
}

