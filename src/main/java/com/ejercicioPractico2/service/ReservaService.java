package com.ejercicioPractico2.service;

import com.ejercicioPractico2.domain.Reserva;
import java.util.List;
import java.util.Optional;

public interface ReservaService {
    List<Reserva> listarTodas();
    Optional<Reserva> buscarPorId(Long id);
    List<Reserva> buscarPorUsuario(Long usuarioId);
    List<Reserva> buscarPorEstado(Reserva.EstadoReserva estado);
    List<Reserva> buscarReservasPendientes(Long usuarioId);
    List<Reserva> buscarReservasConfirmadas(Long usuarioId);
    Reserva realizarReserva(Long funcionId, Long usuarioId, Integer cantidad);
    Reserva confirmarReserva(Long reservaId);
    Reserva cancelarReserva(Long reservaId);
    void eliminar(Long id);
}

