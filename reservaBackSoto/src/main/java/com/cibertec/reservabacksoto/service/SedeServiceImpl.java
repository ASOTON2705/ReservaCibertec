package com.cibertec.reservabacksoto.service;

import com.cibertec.reservabacksoto.dtos.SedeCreateDTO;
import com.cibertec.reservabacksoto.dtos.SedeDTO;
import com.cibertec.reservabacksoto.dtos.SedeUpdateDTO;
import com.cibertec.reservabacksoto.mappers.SedeMapper;
import com.cibertec.reservabacksoto.model.Sede;
import com.cibertec.reservabacksoto.repository.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SedeServiceImpl implements SedeService{

    @Autowired
    private SedeRepository sedeRepository;

    @Override
    public List<SedeDTO> listarSedes() {
        return SedeMapper.instancia.listaSedeAListaSedeDTO(sedeRepository.findAll());
    }

    @Override
    public SedeDTO obtenerSedePorID(long id) {
        Optional<Sede> alumno= sedeRepository.findById(id);
        SedeDTO sedeDTO ;
        if(alumno.isPresent()){
            sedeDTO = SedeMapper.instancia.sedeASedeDTO(alumno.get());
        }else {
            sedeDTO=null;
        }
        return sedeDTO;
    }

    @Override
    public SedeDTO registrarSede(SedeCreateDTO vacanteCreateDTO) {
        Sede alumno= SedeMapper.instancia.sedeCreateDTOASede(vacanteCreateDTO);
        Sede respuestaEntity=sedeRepository.save(alumno);
        SedeDTO respuestaDTO= SedeMapper.instancia.sedeASedeDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public SedeDTO actualizarSede(SedeUpdateDTO sedeUpdateDTO) {
        Sede alumno= SedeMapper.instancia.sedeUpdateDTOASede(sedeUpdateDTO);
        Sede respuestaEntity=sedeRepository.save(alumno);
        SedeDTO respuestaDTO= SedeMapper.instancia.sedeASedeDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public SedeDTO eliminarSede(long id) {
        Optional<Sede> sedeOptional= sedeRepository.findById(id);
        SedeDTO sedeDTO = new SedeDTO();
        String resultado ;
        if(sedeOptional.isPresent()){
            sedeDTO=SedeMapper.instancia.sedeASedeDTO(sedeOptional.get());
            sedeRepository.delete(sedeOptional.get());
            return sedeDTO;
        }else {
            return sedeDTO;
        }
    }
}
