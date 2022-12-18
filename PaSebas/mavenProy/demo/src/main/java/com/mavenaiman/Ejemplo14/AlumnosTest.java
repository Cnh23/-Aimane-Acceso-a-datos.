package com.mavenaiman.Ejemplo14;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class AlumnosTest {
    //Creamos una clase Alumnos llamada alumnosClase
    static Alumnos alumnosClase = new Alumnos();
    final static String RUTA_FICHERO = "C:\\Users\\aiman\\Desktop\\Acceso a datos\\Ficheros\\";

    public static void main(String[] args) {
        //A la clase creada le pasamos con el set una lista <Alumno>
        alumnosClase.setAlumnos(new ArrayList<Alumno>());
        //Introducimos los dato
        Alumno alum1 = new Alumno ( 1,  "Erwin",  "Fernández",  7);
        Alumno alum2 = new Alumno(2,"Guillermo", "González", 8);
        alumnosClase.getAlumnos().add(alum1);
        alumnosClase.getAlumnos().add(alum2);

        //Convertir objeto a archivo xml con marshalling
        marshallingAlumnos();
    }
    private static void marshallingAlumnos(){
        //1 Contexto
        JAXBContext contexto;

        try {
            contexto = JAXBContext.newInstance(Alumnos.class);
            Marshaller jaxbMarshaller = contexto.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    
            jaxbMarshaller.marshal(alumnosClase, new File(RUTA_FICHERO, "AlumnosOut.xml" ));
            System.out.println("Fichero generado correctamente");
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }

}
