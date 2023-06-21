package com.cibertec.reservabacksoto.controller;

import com.cibertec.reservabacksoto.dtos.CarreraDTO;
import com.cibertec.reservabacksoto.dtos.SedeCreateDTO;
import com.cibertec.reservabacksoto.dtos.SedeDTO;
import com.cibertec.reservabacksoto.dtos.SedeUpdateDTO;
import com.cibertec.reservabacksoto.service.CarreraService;
import com.cibertec.reservabacksoto.service.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SedeController {

    @Autowired
    private SedeService sedeService;

    @GetMapping("sedes")
    public ResponseEntity<List<SedeDTO>> listarSedes(){
        return   new ResponseEntity<>(sedeService.listarSedes(), HttpStatus.OK);
    }

    @GetMapping("/sedes/{sedeId}")
    public ResponseEntity<SedeDTO> obtenerSedePorId(@PathVariable("sedeId") long sedeId){
        return  new ResponseEntity<> ( sedeService.obtenerSedePorID(sedeId),HttpStatus.OK);
    }

    @PostMapping("sedes")
    public ResponseEntity<SedeDTO> registrarSede(@RequestBody SedeCreateDTO sedeCreateDTO){
        return  new ResponseEntity <>( sedeService.registrarSede(sedeCreateDTO) ,HttpStatus.OK) ;
    }

    @PutMapping("sedes")
    public ResponseEntity<SedeDTO> actualizarSede(@RequestBody SedeUpdateDTO sedeUpdateDTO){
        return new ResponseEntity<>(sedeService.actualizarSede(sedeUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/sedes/{sedeId}")
    public ResponseEntity<SedeDTO> eliminarSede(@PathVariable("sedeId") long sedeId) {
        return new ResponseEntity<>( sedeService.eliminarSede(sedeId),HttpStatus.OK);
    }
}
