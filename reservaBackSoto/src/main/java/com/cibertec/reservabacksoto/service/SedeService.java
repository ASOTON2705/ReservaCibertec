package com.cibertec.reservabacksoto.service;

import com.cibertec.reservabacksoto.dtos.SedeCreateDTO;
import com.cibertec.reservabacksoto.dtos.SedeDTO;
import com.cibertec.reservabacksoto.dtos.SedeUpdateDTO;
import java.util.List;

public interface SedeService {
    List<SedeDTO> listarSedes();
    SedeDTO obtenerSedePorID(long id);
    SedeDTO registrarSede(SedeCreateDTO sedeCreateDTO);
    SedeDTO actualizarSede(SedeUpdateDTO sedeUpdateDTO);
    SedeDTO eliminarSede(long id);
}
