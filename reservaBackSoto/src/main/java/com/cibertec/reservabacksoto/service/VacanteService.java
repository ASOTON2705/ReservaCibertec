package com.cibertec.reservabacksoto.service;

import com.cibertec.reservabacksoto.dtos.VacanteCreateDTO;
import com.cibertec.reservabacksoto.dtos.VacanteDTO;
import com.cibertec.reservabacksoto.dtos.VacanteUpdateDTO;

import java.util.List;

public interface VacanteService {
    List<VacanteDTO> listarAlumnos();
    VacanteDTO obtenerAlumnoPorID(long id);
    VacanteDTO registrarVacante(VacanteCreateDTO vacanteCreateDTO);
    VacanteDTO actualizarVacante(VacanteUpdateDTO vacanteUpdateDTO);
    VacanteDTO eliminarVacante(long id);
}
