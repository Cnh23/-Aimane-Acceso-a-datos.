package clase.Ejercicio2Entrega;

public class Ordenadores {
    /* Atributos */
    private String sCodigo;
    private int iRam;
    private String sCpu;
    private double dPrecio;

    /* Constructor */  
    public Ordenadores() {
        this.sCodigo = null;
        this.iRam = 0;
        this.sCpu = null;
        this.dPrecio = 0.0;
    }
    /* Constructor con parámetros */ 
    public Ordenadores(String paramsCodigo, int paramiRam, String paramsCpu, double paramdPrecio) {
        this.sCodigo = paramsCodigo;
        this.iRam = paramiRam;
        this.sCpu = paramsCpu;
        this.dPrecio = paramdPrecio;
    }
    /* Getters y Setters*/
    public String getsCodigo() {
        return sCodigo;
    }

    public int getiRam() {
        return iRam;
    }

    public String getsCpu() {
        return sCpu;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public void setsCodigo(String paramsCodigo) {
        this.sCodigo = paramsCodigo;
    }

    public void setiRam(int paramiRam) {
        this.iRam = paramiRam;
    }

    public void setsCpu(String paramsCpu) {
        this.sCpu = paramsCpu;
    }

    public void setdPrecio(double paramdPrecio) {
        this.dPrecio = paramdPrecio;
    }

    /* Método con propiedades*/
    public void getCarateristicas(){
        System.out.println("Codigo: "+getsCodigo());
        System.out.println("RAM: "+getiRam());
        System.out.println("CPU: "+getsCpu());
        System.out.println("Precio: "+getdPrecio());
    }
    /* Método toString() */
    @Override
    public String toString() {
        return "Ordenadores [sCodigo=" + sCodigo + ", iRam=" + iRam + ", sCpu=" + sCpu + ", dPrecio=" + dPrecio + "]";
    }
}
