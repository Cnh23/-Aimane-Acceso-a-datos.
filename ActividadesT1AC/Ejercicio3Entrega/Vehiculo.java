package clase.Ejercicio3Entrega;


public class Vehiculo {
    /*Atriubutos */
    private String matricula;
    private String dFechaInicio;
    private String dFechaFin;
    /*Constructor */
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    /*SETTERS Y GETTERS */
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getdFechaInicio() {
        return dFechaInicio;
    }

    public void setdFechaInicio(String dFechaInicio) {
        this.dFechaInicio = dFechaInicio;
    }

    public String getdFechaFin() {
        return dFechaFin;
    }

    public void setdFechaFin(String dFechaFin) {
        this.dFechaFin = dFechaFin;
    }  
    /*toString() */
    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", dFechaInicio=" + dFechaInicio + ", dFechaFin=" + dFechaFin + "]";
    }
    
}
