package com.entrenamiento.estacionamiento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entrenamiento.estacionamiento.model.Estacionamiento;

@Repository
public interface EstacionamientoRepository extends JpaRepository<Estacionamiento, Long>{

}
