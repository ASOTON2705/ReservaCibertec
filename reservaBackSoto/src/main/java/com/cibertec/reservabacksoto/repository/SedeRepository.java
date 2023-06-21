package com.cibertec.reservabacksoto.repository;

import com.cibertec.reservabacksoto.model.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepository extends JpaRepository<Sede,Long> {
}
