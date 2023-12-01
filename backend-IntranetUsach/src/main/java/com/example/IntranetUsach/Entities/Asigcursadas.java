package com.example.IntranetUsach.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asigcursadas {
    @Id
    private Long id_asigcursadas;
    @ManyToOne
    @JoinColumn(name = "rut")
    private Estudiante estudiante;//llave foranea
    @ManyToOne
    @JoinColumn(name = "cod_asignatura")
    private Asignatura asignatura;//llave foranea
    private int veces_cursada;
    private String estado;

}
