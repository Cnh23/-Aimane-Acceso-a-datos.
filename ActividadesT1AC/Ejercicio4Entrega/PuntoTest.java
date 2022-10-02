package  clase.Ejercicio4Entrega;

public class PuntoTest {
    public static void main(String[] args) {
        /*Creamos el punto y le pasamos los parámetros */
        Punto p1 = new Punto();
        Punto p2 = new Punto(10, 5);
        /*Imprimimos */
        System.out.println("La distancia entre los puntos es de "+p1.distancia(p1, p2));
    }
}
