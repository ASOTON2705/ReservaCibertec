package com.cibertec.reservabacksoto.service;

import com.cibertec.reservabacksoto.dtos.CarreraCreateDTO;
import com.cibertec.reservabacksoto.dtos.CarreraDTO;
import com.cibertec.reservabacksoto.dtos.CarreraUpdateDTO;
import com.cibertec.reservabacksoto.mappers.CarreraMapper;
import com.cibertec.reservabacksoto.model.Carrera;
import com.cibertec.reservabacksoto.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CarreraServiceImpl implements CarreraService{

    @Autowired
    private CarreraRepository carreraRepository;

    @Override
    public List<CarreraDTO> listarCarreras() {
        return CarreraMapper.instancia.listaCarreraAListaCarreraDTO(carreraRepository.findAll());
    }

    @Override
    public CarreraDTO obtenerCarreraPorID(long id) {
        Optional<Carrera> alumno= carreraRepository.findById(id);
        CarreraDTO carreraDTO ;
        if(alumno.isPresent()){
            carreraDTO = CarreraMapper.instancia.carreraACarreraDTO(alumno.get());
        }else {
            carreraDTO=null;
        }
        return carreraDTO;
    }

    @Override
    public CarreraDTO registrarCarrera(CarreraCreateDTO vacanteCreateDTO) {
        Carrera alumno=CarreraMapper.instancia.carreraCreateDTOACarrera(vacanteCreateDTO);
        Carrera respuestaEntity=carreraRepository.save(alumno);
        CarreraDTO respuestaDTO= CarreraMapper.instancia.carreraACarreraDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public CarreraDTO actualizarCarrera(CarreraUpdateDTO carreraUpdateDTO) {
        Carrera alumno=CarreraMapper.instancia.carreraUpdateDTOACarrera(carreraUpdateDTO);
        Carrera respuestaEntity=carreraRepository.save(alumno);
        CarreraDTO respuestaDTO= CarreraMapper.instancia.carreraACarreraDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public CarreraDTO eliminarCarrera(long id) {
        Optional<Carrera> carreraOptional= carreraRepository.findById(id);
        CarreraDTO carreraDTO = new CarreraDTO();
        String resultado ;
        if(carreraOptional.isPresent()){
            carreraDTO=CarreraMapper.instancia.carreraACarreraDTO(carreraOptional.get());
            carreraRepository.delete(carreraOptional.get());
            return carreraDTO;
        }else {
            return carreraDTO;
        }
    }
}
