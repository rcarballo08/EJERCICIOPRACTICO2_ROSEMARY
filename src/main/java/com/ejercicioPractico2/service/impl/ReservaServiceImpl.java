package com.ejercicioPractico2.service.impl;

import com.ejercicioPractico2.dao.ReservaDao;
import com.ejercicioPractico2.domain.Reserva;
import com.ejercicioPractico2.domain.Funcion;
import com.ejercicioPractico2.domain.Usuario;
import com.ejercicioPractico2.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaServiceImpl implements ReservaService {

    private final ReservaDao reservaDao;

    @Autowired
    public ReservaServiceImpl(ReservaDao reservaDao) {
        this.reservaDao = reservaDao;
    }

    @Override
    public List<Reserva> listarTodas() {
        return reservaDao.findAll();
    }

    @Override
    public Optional<Reserva> buscarPorId(Long id) {
        return reservaDao.findById(id);
    }

    @Override
    public List<Reserva> buscarPorUsuario(Long usuarioId) {
        return reservaDao.findByUsuarioId(usuarioId);
    }

    @Override
    public List<Reserva> buscarPorEstado(Reserva.EstadoReserva estado) {
        return reservaDao.findByEstado(estado);
    }

    @Override
    public List<Reserva> buscarReservasPendientes(Long usuarioId) {
        return reservaDao.findByUsuarioIdAndEstado(usuarioId, Reserva.EstadoReserva.RESERVADO);
    }

    @Override
    public List<Reserva> buscarReservasConfirmadas(Long usuarioId) {
        return reservaDao.findByUsuarioIdAndEstadoIn(usuarioId, List.of(Reserva.EstadoReserva.CONFIRMADO, Reserva.EstadoReserva.CANCELADO));
    }

    @Override
    public Reserva realizarReserva(Long funcionId, Long usuarioId, Integer cantidad) {
        Reserva reserva = new Reserva();
        reserva.setCantidad(cantidad);
        reserva.setEstado(Reserva.EstadoReserva.RESERVADO);
        reserva.setUsuario(usuario); 
        reserva.setFuncion(funcion);

        return reservaDao.save(reserva);
    }

    @Override
    public Reserva confirmarReserva(Long reservaId) {
        Optional<Reserva> reserva = reservaDao.findById(reservaId);
        if (reserva.isPresent()) {
            Reserva res = reserva.get();
            res.setEstado(Reserva.EstadoReserva.CONFIRMADO);
            return reservaDao.save(res);
        }
        return null;
    }

    @Override
    public Reserva cancelarReserva(Long reservaId) {
        Optional<Reserva> reserva = reservaDao.findById(reservaId);
        if (reserva.isPresent()) {
            Reserva res = reserva.get();
            res.setEstado(Reserva.EstadoReserva.CANCELADO);
            return reservaDao.save(res);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        reservaDao.deleteById(id);
    }
}

