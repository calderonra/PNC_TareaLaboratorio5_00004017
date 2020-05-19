package com.uca.capas.demo.Domain;



import javax.persistence.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(schema="public",name="estudiante")
public class Estudiante {
    @Id
    @Column(name="c_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoEstudiante;

    @Column(name="nombre")
    @NotEmpty()
    @Size(message = "El nombre no debe tener mas de 50 de caracteres", max = 50)
    private String Nombre;


    @Column(name="apellido")
    @Size(message = "El apellido no debe tener mas de 50 de caracteres", max = 50)
    @NotEmpty()
    private String Apellido;

    @Column(name = "carne")
    @Size(message = "El carne debe tener exactamente 10 caracteres", max = 10 , min = 10)
    @NotEmpty()
    private String Carne;

    @Column(name = "carrera")
    @Size(message = "La carrera no debe tener mas de 100 de caracteres", max = 100)
    @NotEmpty()
    private String Carrera;

    public Estudiante() {
    }

    public Integer getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(Integer codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCarne() {
        return Carne;
    }

    public void setCarne(String carne) {
        Carne = carne;
    }


    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

}