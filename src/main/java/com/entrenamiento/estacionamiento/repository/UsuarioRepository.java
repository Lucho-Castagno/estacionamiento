package com.entrenamiento.estacionamiento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entrenamiento.estacionamiento.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
