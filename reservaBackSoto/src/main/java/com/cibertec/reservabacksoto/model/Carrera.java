package com.cibertec.reservabacksoto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="tb_carrera")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="codCarrera")
    private Long id;

    @Column(name="desCarrera",length = 200, nullable = false)
    private String descripcion;
}
