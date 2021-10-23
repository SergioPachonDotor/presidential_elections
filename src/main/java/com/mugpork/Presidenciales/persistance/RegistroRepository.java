package com.mugpork.Presidenciales.persistance;

import com.mugpork.Presidenciales.persistance.crud.RegistroCrudRepository;
import com.mugpork.Presidenciales.persistance.entity.BaseDeDatos;

import java.util.List;
import java.util.Optional;

public class RegistroRepository {

    private RegistroCrudRepository registroCrudRepository;

    public List <BaseDeDatos> getAll(){
        return (List<BaseDeDatos>) registroCrudRepository.findAll();
    }

    public List<BaseDeDatos> getByCC(int idCiudadano){
        return registroCrudRepository.findByIdCiudadanoOrderByNombreAsc(idCiudadano);
    }

    public Optional<List<BaseDeDatos>> getYaVotaron(int estadoVotacion){
        return registroCrudRepository.findByEstadoVotacionEquals(estadoVotacion);
    }
}
