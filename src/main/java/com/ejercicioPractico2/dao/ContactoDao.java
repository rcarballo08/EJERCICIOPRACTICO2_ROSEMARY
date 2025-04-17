package com.ejercicioPractico2.dao;

import com.ejercicioPractico2.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface ContactoDao extends JpaRepository<Contacto, Long> {
    List<Contacto> findByFechaEnvioBetween(LocalDateTime inicio, LocalDateTime fin);
}
