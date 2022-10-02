package clase.Ejercicio1Entrega;

public class Complejo {
    //ATRIBUTOS
    private double dPReal;
    private double dPImag;

    //CONSTRCUTOR
    public Complejo(){
        
    }
    //MÉTODOS
    public void asignar(double x, double y){
        this.dPReal = x;
        this.dPImag = y;
    };

    public Complejo sumar(Complejo c1, Complejo c2){
        this.dPReal = c1.getdPReal() + c2.getdPReal();
        this.dPImag = c1.getdPImag() + c2.getdPImag();
        Complejo c3 = new Complejo();
        c3.asignar(dPReal, dPImag);
        return c3;
        }

    public void imprimir(Complejo c1, Complejo c2, Complejo c3){
        System.out.println("El primer complejo es: "+c1+"\nEl segundo número complejo es: "+c2+"\nEl resultado de la suma de ambos números es: "+c3);
    }

    //getters y setters
    public double getdPReal() {
        return dPReal;
    }
    public void setdPReal(double dPReal) {
        this.dPReal = dPReal;
    }
    public double getdPImag() {
        return dPImag;
    }
    public void setdPImag(double dPImag) {
        this.dPImag = dPImag;
    }

    // To String()
    @Override
    public String toString() {
        return "[dPImag=" + dPImag + ", dPReal=" + dPReal + "]";
    }

    

    
}
