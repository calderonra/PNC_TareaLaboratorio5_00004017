package com.uca.capas.demo.Domain;


import javax.persistence.*;


@Entity
@Table(schema="public",name="estudiante")
public class Estudiante {
    @Id
    @Column(name="c_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoEstudiante;

    @Column(name="nombre")
    private String Nombre;


    @Column(name="apellido")
    private String Apellido;

    @Column(name = "carne")
    private String Carne;

    @Column(name = "carrera")
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