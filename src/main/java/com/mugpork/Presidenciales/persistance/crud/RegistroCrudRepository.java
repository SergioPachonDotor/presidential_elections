package com.mugpork.Presidenciales.persistance.crud;

import org.springframework.data.repository.CrudRepository;
import com.mugpork.Presidenciales.persistance.entity.BaseDeDatos;
import java.util.List;
import java.util.Optional;

public interface RegistroCrudRepository extends CrudRepository<BaseDeDatos, Integer>{
    
    List<BaseDeDatos> findByIdCiudadanoOrderByNombreAsc(int idCiudadano);

    Optional<List<BaseDeDatos>> findByEstadoVotacionEquals(int estadoVotacion);
}
