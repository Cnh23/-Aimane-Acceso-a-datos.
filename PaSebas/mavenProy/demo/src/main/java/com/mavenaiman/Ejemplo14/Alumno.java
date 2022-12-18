package com.mavenaiman.Ejemplo14;
import javax.xml.bind.annotation.*;

//Nombre del elemento root
@XmlRootElement(name="alumno")
//Esto es el orden de las propiedades de la clase
@XmlType(propOrder = {"id", "nombre", "apellido", "notamedia"})
//Controlamos la serialización.
@XmlAccessorType (XmlAccessType.FIELD)

public class Alumno {
    //Declaramos los atributos
    private Integer id;
    private String nombre;
    private String apellido;
    private double notamedia;
    //Constructor vacío
    public Alumno(){

    }
    //Constructor
    public Alumno(Integer id, String nombre, String apellido, double notamedia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notamedia = notamedia;
    }
    //GETTERS Y SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNotamedia() {
        return notamedia;
    }

    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }

}
