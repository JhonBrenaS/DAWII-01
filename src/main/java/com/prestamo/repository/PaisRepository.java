package com.prestamo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prestamo.entity.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer>{

}
