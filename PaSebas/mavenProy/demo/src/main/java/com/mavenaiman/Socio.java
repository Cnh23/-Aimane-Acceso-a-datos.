package com.mavenaiman;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "socio")
@XmlType(propOrder = {"nombreSocio", "direccion", "fechaAlta"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Socio {
    @XmlAttribute(required = true)
    private Integer id;
    @XmlElement(name = "nombre")
    private String nombresocio;
    
}
