package com.cibertec.reservabacksoto.service;

import com.cibertec.reservabacksoto.dtos.CarreraCreateDTO;
import com.cibertec.reservabacksoto.dtos.CarreraDTO;
import com.cibertec.reservabacksoto.dtos.CarreraUpdateDTO;

import java.util.List;

public interface CarreraService {
    List<CarreraDTO> listarCarreras();
    CarreraDTO obtenerCarreraPorID(long id);
    CarreraDTO registrarCarrera(CarreraCreateDTO carreraCreateDTO);
    CarreraDTO actualizarCarrera(CarreraUpdateDTO carreraUpdateDTO);
    CarreraDTO eliminarCarrera(long id);
}
