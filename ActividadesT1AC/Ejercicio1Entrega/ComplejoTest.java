package clase.Ejercicio1Entrega;


public class ComplejoTest {
    public static void main(String[]args){
        //Método constructor y creación de objetos
        Complejo c1 = new Complejo();
        Complejo c2 = new Complejo();
        Complejo c3 = new Complejo();

        //Asignar
        c1.asignar(4, 4);
        c2.asignar(5, 3);
        //Realizamos la suma
        c3.sumar(c1, c2);

        //Imprimimos por pantalla
        c3.imprimir(c1,c2,c3);


    }
}
