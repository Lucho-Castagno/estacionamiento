package com.entrenamiento.estacionamiento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entrenamiento.estacionamiento.model.CtaCorriente;

@Repository
public interface CtaCorrienteRepository extends JpaRepository<CtaCorriente, Long>{

}
