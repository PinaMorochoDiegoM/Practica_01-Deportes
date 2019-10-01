package Secundaria;
/**
* Esta clase Cancha crea los objetos, ademas de los metodos de acceso de manera publica 
 * 
 * @author Piña Diego 
 * @version 01/10/2019
 * @see <a href = "https://github.com/PinaMorochoDiegoM/Pratica01PinaDiego/tree/master/src/ec/edu/ups" > GitHub.com – Practica 01 Deportes </a>
 * 
 */
public class Cancha {
    private String diametro;
    private int numeroArcos;
    private int numeroJugadores;
    
    public void jugarFutbol(){
        //Codigo no requerido para esta practica
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public int getNumeroArcos() {
        return numeroArcos;
    }

    public void setNumeroArcos(int numeroArcos) {
        this.numeroArcos = numeroArcos;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    @Override
    public String toString() {
        return "Cancha{" + "diametro=" + diametro + ", numeroArcos=" + numeroArcos + ", numeroJugadores=" + numeroJugadores + '}';
    }
    
}
