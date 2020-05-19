package com.uca.capas.demo.DAO;

import com.uca.capas.demo.Domain.Estudiante;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface EstudianteDAO {
    public List<Estudiante> findAll() throws DataAccessException;

    public Estudiante findOne(Integer code) throws DataAccessException;

    public void insertEstudiante(Estudiante estudiante) throws DataAccessException;
}