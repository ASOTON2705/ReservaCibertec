package com.cibertec.reservabacksoto.repository;

import com.cibertec.reservabacksoto.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacanteRepository extends JpaRepository<Alumno,Long> {
}
