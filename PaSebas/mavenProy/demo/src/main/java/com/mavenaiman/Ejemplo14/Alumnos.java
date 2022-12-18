package com.mavenaiman.Ejemplo14;

import java.util.List;

import javax.xml.bind.annotation.*;

//Nombre del elemento root
@XmlRootElement(name = "alumnos")
//Controlamos la serialización
@XmlAccessorType (XmlAccessType.FIELD)

public class Alumnos {
    /*Nombre del elemento (alumno) y asociación a la lista*/
    @XmlElement(name="alumno")
    private List<Alumno> alumnos = null;

    //GETTERS Y SETTERS
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    
}
