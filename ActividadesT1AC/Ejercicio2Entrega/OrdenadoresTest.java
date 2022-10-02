package clase.Ejercicio2Entrega;

public class OrdenadoresTest {
    
    public static void main(String[] args) {
        /*Creamos ordenadores con sus parámetros */
        Sobremesas s1 = new Sobremesas("123456", 8, "Intel i9 gen 11", 1900, "MCORB");
        Portatiles p1 = new Portatiles("789012", 16, "Intel i7 gen 11", 800, 2.8);
        /*Imprimimos */
        System.out.println("Caracteristicas "+p1.getsCodigo()+ ":");
        p1.getCarateristicas();
        System.out.println("Caracteristicas "+s1.getsCodigo()+ ":");
        s1.getCarateristicas();
    }
}
