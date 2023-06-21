package com.cibertec.reservabacksoto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="tb_sede")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="codSede")
    private Long id;

    @Column(name="desSede",length = 200, nullable = false)
    private String descripcion;
}
