package com.ejercicioPractico2.service.impl;

import com.ejercicoPractico2.dao.PeliculaDao;
import com.ejercicioPractico2.domain.Pelicula;
import com.ejercicioPractico2.domain.Funcion;
import com.ejercicioPractico2.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    private final PeliculaDao peliculaDao;

    @Autowired
    public PeliculaServiceImpl(PeliculaDao peliculaDao) {
        this.peliculaDao = peliculaDao;
    }

    @Override
    public List<Pelicula> listarTodos() {
        return peliculaDao.findAll();
    }

    @Override
    public Optional<Pelicula> buscarPorId(Long id) {
        return peliculaDao.findById(id);
    }

    @Override
    public List<Pelicula> buscarPorTitulo(String titulo) {
        return peliculaDao.findByTituloContainingIgnoreCase(titulo);
    }

    @Override
    public List<Pelicula> buscarPorTipo(String tipo) {
        return peliculaDao.findByTipo(tipo);
    }

    @Override
    public List<Pelicula> buscarPorFuncion(Funcion funcion) {
        return peliculaDao.findByFunciones(funcion);
    }

    @Override
    public Pelicula guardar(Pelicula pelicula) {
        return peliculaDao.save(pelicula);
    }

    @Override
    public boolean existePorTitulo(String titulo) {
        return peliculaDao.existsByTitulo(titulo);
    }

    @Override
    public void eliminar(Long id) {
        peliculaDao.deleteById(id);
    }

    @Override
    public boolean tieneFunciones(Long id) {
        Optional<Pelicula> pelicula = peliculaDao.findById(id);
        return pelicula.isPresent() && !pelicula.get().getFunciones().isEmpty();
    }

    @Override
    public void actualizarPelicula(Long id, Pelicula pelicula) {
        if (peliculaDao.existsById(id)) {
            pelicula.setId(id);
            peliculaDao.save(pelicula);
        }
    }
}

