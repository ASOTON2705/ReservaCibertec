package com.cibertec.reservabacksoto.dtos;

import com.cibertec.reservabacksoto.model.Carrera;
import com.cibertec.reservabacksoto.model.Sede;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class VacanteCreateDTO {
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
    private int celular;
    private String email;
    private Date fechaReserva;
    private Carrera carrera;
    private Sede sede;
}
