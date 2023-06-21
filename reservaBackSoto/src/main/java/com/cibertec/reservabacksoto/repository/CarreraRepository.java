package com.cibertec.reservabacksoto.repository;

import com.cibertec.reservabacksoto.model.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera,Long> {
}
