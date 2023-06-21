package com.cibertec.reservabacksoto.controller;

import com.cibertec.reservabacksoto.dtos.CarreraCreateDTO;
import com.cibertec.reservabacksoto.dtos.CarreraDTO;
import com.cibertec.reservabacksoto.dtos.CarreraUpdateDTO;
import com.cibertec.reservabacksoto.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CarreraController {

    @Autowired
    private CarreraService carreraService;

    @GetMapping("carreras")
    public ResponseEntity<List<CarreraDTO>> listarCarreras(){
        return   new ResponseEntity<>(carreraService.listarCarreras(), HttpStatus.OK);
    }

    @GetMapping("/carreras/{carreraId}")
    public ResponseEntity<CarreraDTO> obtenerCarreraPorId(@PathVariable("carreraId") long carreraId){
        return  new ResponseEntity<> ( carreraService.obtenerCarreraPorID(carreraId),HttpStatus.OK);
    }

    @PostMapping("carreras")
    public ResponseEntity<CarreraDTO> registrarCarrera(@RequestBody CarreraCreateDTO carreraCreateDTO){
        return  new ResponseEntity <>( carreraService.registrarCarrera(carreraCreateDTO) ,HttpStatus.OK) ;
    }

    @PutMapping("carreras")
    public ResponseEntity<CarreraDTO> actualizarCarrera(@RequestBody CarreraUpdateDTO carreraUpdateDTO){
        return new ResponseEntity<>(carreraService.actualizarCarrera(carreraUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/carreras/{carreraId}")
    public ResponseEntity<CarreraDTO> eliminarCarrera(@PathVariable("carreraId") long carreraId) {
        return new ResponseEntity<>( carreraService.eliminarCarrera(carreraId),HttpStatus.OK);
    }
}
