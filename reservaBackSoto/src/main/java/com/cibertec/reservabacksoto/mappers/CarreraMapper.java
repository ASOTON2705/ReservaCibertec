package com.cibertec.reservabacksoto.mappers;

import com.cibertec.reservabacksoto.dtos.CarreraCreateDTO;
import com.cibertec.reservabacksoto.dtos.CarreraDTO;
import com.cibertec.reservabacksoto.dtos.CarreraUpdateDTO;
import com.cibertec.reservabacksoto.model.Carrera;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface CarreraMapper {
    CarreraMapper instancia= Mappers.getMapper(CarreraMapper.class);
    CarreraDTO carreraACarreraDTO(Carrera carrera);
    Carrera carreraDTOACarrera(CarreraDTO carreraDTO);
    Carrera carreraCreateDTOACarrera(CarreraCreateDTO carreraCreateDTO);
    Carrera carreraUpdateDTOACarrera(CarreraUpdateDTO carreraUpdateDTO);
    List<CarreraDTO> listaCarreraAListaCarreraDTO (List<Carrera> listaCarrera);
}
