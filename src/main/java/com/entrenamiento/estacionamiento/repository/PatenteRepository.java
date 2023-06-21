package com.entrenamiento.estacionamiento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entrenamiento.estacionamiento.model.Patente;

@Repository
public interface PatenteRepository extends JpaRepository<Patente, Long> {

}
