package clase.Ejercicio3Entrega;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ParkingVehiculo implements Parking {
    /*Declaramos constantes */
    protected static final double dPrecioPorMinuto = 0.0425;
    protected static final int iPlazas = 100;
    /*Declaramos atributos variables */
    private String sDireccionParking;
    private int iPlazasOcupadas;

    /*Creamos el constructor */
    public ParkingVehiculo(String paramDireccionParking) {
        this.sDireccionParking = paramDireccionParking;
    }

    /*Sobreescribo el método hayplaza de la interfaz parking */
    @Override
    public boolean hayPlaza() {
        /*si no están ocupadas todas las plazas entonces hay plaza */
        boolean hayplaza;
        if(iPlazasOcupadas < 100){
            hayplaza = true;
        }
        else{
            hayplaza = false;
        }
        return hayplaza;
    }

    /*Sobreescribo.... */
    @Override
    public void aparcaCoche(Vehiculo v) {
        /*Si hay plaza aparcamos... */
        if (hayPlaza() == true){
        iPlazasOcupadas ++;
        System.out.println("Ha entrado un vehículo con matrícula: "+v.getMatricula()+" En la fecha y hora: "+v.getdFechaInicio());
        }
        else{
            System.out.println("El vehículo con matrícula "+v.getMatricula()+" intentó estacionar pero está lleno");
        }
        System.out.println("Hay en el parking "+iPlazasOcupadas+" coches.");

    }

    /*Sobreescribo.... */
    @Override
    public void sacaCoche(Vehiculo v) {
        /*Sacamos el coche */
        iPlazasOcupadas --;
        System.out.println("Ha salido un vehículo con matrícula: "+v.getMatricula()+" En la fecha y hora: "+v.getdFechaFin()
        +"\nHay en el parking "+iPlazasOcupadas+" coches.");

    }

    /*Sobreescribo.... */
    @Override
    public void getFactura(Vehiculo v) throws ParseException {
        /*Creamos un parseador, recibimos el texto de fechaInicio y de fechaFin y se lo asignamos a dos variables Date */
        SimpleDateFormat ParseadorFechas = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date Entra = ParseadorFechas.parse(v.getdFechaInicio());
        Date Sale = ParseadorFechas.parse(v.getdFechaFin());
        /*Restamos la diferencia de tiempo y nos lo da en milisegundos, entonces usamos timeunit y convert para pasaro a minutos */
        long diferenciaTiempo = Sale.getTime() - Entra.getTime();
        TimeUnit PasamosAMinutos = TimeUnit.MINUTES;
        long DiferenciaMinutos = PasamosAMinutos.convert(diferenciaTiempo, TimeUnit.MILLISECONDS);
        /*Sacamos el precio multiplicando los minutos por el precio por minuto y lo redondeamos a solo 2 decimales */
        double Precio = DiferenciaMinutos*dPrecioPorMinuto;
        double PrecioFinal = Math.round(Precio*100.0)/100.0;
        /*Imprimimos por pantalla */
        System.out.println("El vehículo con matrícula "+v.getMatricula()+" ha entrado el Día: "+Entra+" y ha salido el día: "+Sale
        +"\nEl precio de la factura asciende a: "+PrecioFinal + " Euros");
    }
}
