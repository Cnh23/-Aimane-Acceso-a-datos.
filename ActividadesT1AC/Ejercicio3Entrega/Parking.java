package clase.Ejercicio3Entrega;

import java.text.ParseException;

interface Parking {
    /*Declaramos los metodos de la interfaz */
    boolean hayPlaza();
    void aparcaCoche(Vehiculo v);
    void sacaCoche(Vehiculo v);
    void getFactura(Vehiculo v) throws ParseException;
}
