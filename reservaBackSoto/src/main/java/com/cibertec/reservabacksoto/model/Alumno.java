package com.cibertec.reservabacksoto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tb_alumno")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codAlumno")
    private long id;

    @Column(name="nombres", length = 100, nullable = false)
    private String nombres;

    @Column(name="apePaterno", length = 100, nullable = false)
    private String apePaterno;

    @Column(name="apeMaterno", length = 100, nullable = false)
    private String apeMaterno;

    @Column(name="celular", nullable = false)
    private int celular;

    @Column(name="email", length = 100, nullable = false)
    private String email;

    @Column(name="fechaReserva",  nullable = false)
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaReserva;

    @ManyToOne()
    @JoinColumn(name="codCarrera")
    private Carrera carrera;

    @ManyToOne()
    @JoinColumn(name="codSede")
    private Sede sede;
}
