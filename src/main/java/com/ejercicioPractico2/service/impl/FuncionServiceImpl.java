package com.ejercicioPractico2.service.impl;

import com.ejercicioPractico2.dao.FuncionDao;
import com.ejercicioPractico2.domain.Funcion;
import com.ejercicioPractico2.service.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionServiceImpl implements FuncionService {

    private final FuncionDao funcionDao;

    @Autowired
    public FuncionServiceImpl(FuncionDao funcionDao) {
        this.funcionDao = funcionDao;
    }

    @Override
    public List<Funcion> listarTodas() {
        return funcionDao.findAll();
    }

    @Override
    public Optional<Funcion> buscarPorId(Long id) {
        return funcionDao.findById(id);
    }

    @Override
    public Optional<Funcion> buscarPorNombre(String nombre) {
        return funcionDao.findByNombre(nombre);
    }

    @Override
    public Funcion guardar(Funcion funcion) {
        return funcionDao.save(funcion);
    }

    @Override
    public boolean existeNombre(String nombre) {
        return funcionDao.existsByNombre(nombre);
    }

    @Override
    public void eliminar(Long id) {
        funcionDao.deleteById(id);
    }
}

