package clase.Ejercicio3Entrega;

import java.text.ParseException;

public class ParkingTestAimane {
public static void main(String[] args) throws ParseException {
    /*Creamos los coches */
    Vehiculo v1 = new Vehiculo("1234CCB");
    Vehiculo v2 = new Vehiculo("4567CCD");
    Vehiculo v3 = new Vehiculo("8901CCF");
    Vehiculo v4 = new Vehiculo("2345CCH");
    Vehiculo v5 = new Vehiculo("6789CCK");
    /*Creamos el aparcamiento */
    ParkingVehiculo pv1 = new ParkingVehiculo("Calle preciados 54");
    /*Asignamos fecha de inicio */
    v1.setdFechaInicio("02/10/2022 18:40"); 
    v2.setdFechaInicio("12/10/2022 17:00"); 
    v3.setdFechaInicio("14/10/2022 19:40");
    v4.setdFechaInicio("08/11/2022 10:26");
    v5.setdFechaInicio("17/11/2022 14:40");
    /*Asignamos fecha final */
    v1.setdFechaFin("06/10/2022 12:52");
    v2.setdFechaFin("12/10/2022 20:44");
    v3.setdFechaFin("15/10/2022 09:00");
    v4.setdFechaFin("11/11/2022 11:18");
    v5.setdFechaFin("17/11/2022 22:30");
    /*Aparcamos y sacamos los coches */
    pv1.aparcaCoche(v1); pv1.aparcaCoche(v2); pv1.aparcaCoche(v3); pv1.aparcaCoche(v4); pv1.aparcaCoche(v5);
    pv1.sacaCoche(v1); pv1.sacaCoche(v2); pv1.sacaCoche(v3); pv1.sacaCoche(v4); pv1.sacaCoche(v5);
    /*Hacemos facturas */
    pv1.getFactura(v1); pv1.getFactura(v2); pv1.getFactura(v3); pv1.getFactura(v4); pv1.getFactura(v5);
}

}
