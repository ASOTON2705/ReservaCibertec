package com.cibertec.reservabacksoto.service;

import com.cibertec.reservabacksoto.dtos.VacanteCreateDTO;
import com.cibertec.reservabacksoto.dtos.VacanteDTO;
import com.cibertec.reservabacksoto.dtos.VacanteUpdateDTO;
import com.cibertec.reservabacksoto.mappers.VacanteMapper;
import com.cibertec.reservabacksoto.model.Alumno;
import com.cibertec.reservabacksoto.repository.VacanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VacanteServiceImpl implements VacanteService {

    @Autowired
    private VacanteRepository vacanteRepository;

    @Override
    public List<VacanteDTO> listarAlumnos() {
        return VacanteMapper.instancia.listaAlumnoAListaVacanteDTO(vacanteRepository.findAll());
    }

    @Override
    public VacanteDTO obtenerAlumnoPorID(long id) {
        Optional<Alumno> alumno= vacanteRepository.findById(id);
        VacanteDTO vacanteDTO;
        if(alumno.isPresent()){
            vacanteDTO = VacanteMapper.instancia.alumnoAAlumnoDTO(alumno.get());
        }else {
            vacanteDTO =null;
        }
        return vacanteDTO;
    }

    @Override
    public VacanteDTO registrarVacante(VacanteCreateDTO vacanteCreateDTO) {
        Alumno alumno= VacanteMapper.instancia.vacanteCreateDTOAAlumno(vacanteCreateDTO);
        Alumno respuestaEntity= vacanteRepository.save(alumno);
        VacanteDTO respuestaDTO= VacanteMapper.instancia.alumnoAAlumnoDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public VacanteDTO actualizarVacante(VacanteUpdateDTO vacanteUpdateDTO) {
        Alumno alumno= VacanteMapper.instancia.vacanteUpdateDTOAAlumno(vacanteUpdateDTO);
        Alumno respuestaEntity= vacanteRepository.save(alumno);
        VacanteDTO respuestaDTO= VacanteMapper.instancia.alumnoAAlumnoDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public VacanteDTO eliminarVacante(long id) {
        Optional<Alumno> alumnoOptional= vacanteRepository.findById(id);
        VacanteDTO vacanteDTO = new VacanteDTO();
        String resultado;
        if(alumnoOptional.isPresent()){
            vacanteDTO = VacanteMapper.instancia.alumnoAAlumnoDTO(alumnoOptional.get());
            vacanteRepository.delete(alumnoOptional.get());
            return vacanteDTO;
        }else {
            resultado="No se pudo eliminar la vacante";
        }
        return vacanteDTO;
    }
}
