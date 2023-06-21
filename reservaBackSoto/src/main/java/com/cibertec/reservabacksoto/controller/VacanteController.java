package com.cibertec.reservabacksoto.controller;

import com.cibertec.reservabacksoto.dtos.VacanteCreateDTO;
import com.cibertec.reservabacksoto.dtos.VacanteDTO;
import com.cibertec.reservabacksoto.dtos.VacanteUpdateDTO;
import com.cibertec.reservabacksoto.service.VacanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class VacanteController {

    @Autowired
    private VacanteService vacanteService;

    @GetMapping("vacantes")
    public ResponseEntity<List<VacanteDTO>> listarAlumnos(){
        return   new ResponseEntity<>(vacanteService.listarAlumnos(), HttpStatus.OK);
    }

    @GetMapping("/vacantes/{alumnoId}")
    public ResponseEntity<VacanteDTO> obtenerAlumnoPorId(@PathVariable("alumnoId") long alumnoId){
        return  new ResponseEntity<> ( vacanteService.obtenerAlumnoPorID(alumnoId),HttpStatus.OK);
    }

    @PostMapping("vacantes")
    public ResponseEntity<VacanteDTO> registrarVacante(@RequestBody VacanteCreateDTO vacanteCreateDTO){
        return  new ResponseEntity <>( vacanteService.registrarVacante(vacanteCreateDTO) ,HttpStatus.OK) ;
    }

    @PutMapping("vacantes")
    public ResponseEntity<VacanteDTO> actualizarVacante(@RequestBody VacanteUpdateDTO vacanteUpdateDTO){
        return new ResponseEntity<>(vacanteService.actualizarVacante(vacanteUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/vacantes/{alumnoId}")
    public ResponseEntity<VacanteDTO> eliminarVacante(@PathVariable("alumnoId") long alumnoId) {
        return new ResponseEntity<>( vacanteService.eliminarVacante(alumnoId),HttpStatus.OK);
    }
}
