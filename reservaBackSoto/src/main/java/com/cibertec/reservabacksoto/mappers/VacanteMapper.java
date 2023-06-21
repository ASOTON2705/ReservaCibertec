package com.cibertec.reservabacksoto.mappers;

import com.cibertec.reservabacksoto.dtos.VacanteCreateDTO;
import com.cibertec.reservabacksoto.dtos.VacanteDTO;
import com.cibertec.reservabacksoto.dtos.VacanteUpdateDTO;
import com.cibertec.reservabacksoto.model.Alumno;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VacanteMapper {
    VacanteMapper instancia= Mappers.getMapper(VacanteMapper.class);
    VacanteDTO alumnoAAlumnoDTO(Alumno alumno);
    Alumno vacanteDTOAAlumno(VacanteDTO vacanteDTO);
    Alumno vacanteCreateDTOAAlumno(VacanteCreateDTO vacanteCreateDTO);
    Alumno vacanteUpdateDTOAAlumno(VacanteUpdateDTO vacanteUpdateDTO);
    List<VacanteDTO> listaAlumnoAListaVacanteDTO (List<Alumno> listaVacante);
}
