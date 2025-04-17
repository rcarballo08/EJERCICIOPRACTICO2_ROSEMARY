package com.ejercicioPractico2.dao;

import com.ejercicoPractico2.domain.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FuncionDao extends JpaRepository<Funcion, Long> {
    Optional<Funcion> findByNombre(String nombre);
    boolean existsByNombre(String nombre);
}
