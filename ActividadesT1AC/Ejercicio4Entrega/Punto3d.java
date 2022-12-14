package clase.Ejercicio4Entrega;

public class Punto3d extends Punto {
    /* Atributos */
    private int z;

    /* Constructores */
    public Punto3d() {
        this.z = 0;
    }
    
    public Punto3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    /* Getters */
    public int getZ() {
        return z;
    }
    /* Setters */
    public void setZ(int z) {
        this.z = z;
    }
    /* Metodos */
    public double distanciaPuntos(Punto3d p1, Punto3d p2) {
        double distanciaPuntos;
        int x = p2.getiX() - p1.getiX();
        int y = p2.getiY() - p1.getiY();
        int z = p2.getZ() - p1.getZ();
        distanciaPuntos = Math.sqrt(x + y + z);
        return distanciaPuntos;
    }

    @Override
    public String toString() {
        return "Punto3d [z=" + z + "]";
    }
}
