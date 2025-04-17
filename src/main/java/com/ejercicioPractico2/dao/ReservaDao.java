package com.ejercicioPractico2.dao;

import com.ejercicioPractico2.domain.Reserva;
import com.ejercicioPractico2.domain.Usuario;
import com.ejercicioPractico2.domain.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface ReservaDao extends JpaRepository<Reserva, Long> {
    List<Reserva> findByUsuario(Usuario usuario);
    List<Reserva> findByPelicula(Pelicula pelicula);
    List<Reserva> findByEstado(Reserva.EstadoReserva estado);
    List<Reserva> findByUsuarioAndEstado(Usuario usuario, Reserva.EstadoReserva estado);
    List<Reserva> findByFechaDevolucionPrevistaBeforeAndEstado(LocalDate fecha, Reserva.EstadoReserva estado);

    public List<Reserva> findByUsuarioId(Long usuarioId);

    public List<Reserva> findByUsuarioIdAndEstado(Long usuarioId, Reserva.EstadoReserva estadoReserva);

    public List<Reserva> findByUsuarioIdAndEstadoIn(Long usuarioId, List<Reserva.EstadoReserva> of);
}
