package Secundaria;
/**
* Esta clase Historial crea los objetos, ademas de los metodos de acceso de manera publica 
 * 
 * @author Piña Diego 
 * @version 01/10/2019
 * @see <a href = "https://github.com/PinaMorochoDiegoM?tab=repositories" > GitHub.com – Practica 01 Deportes </a>
 * 
 */
public class Historial {
    private String nombreJugador; // Variable nombre Jugador de la clase Historial
    private String nacionalidad; // Variable nacionalidad de la clase Historial
    private int edad; // Variable para la edad de la clase Historial
    
    public void modificarEdad(){// Metodo de la clase Historial
        //Codigo no requerido para esta practica
    }// fin Metodo de la clase Historial

    //Inicio y retorno de valores de los getters de la clase Historial
    public String getNombreJugador() {
        return nombreJugador;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public int getEdad() {
        return edad;
    }
    //Fin de los getters
    
    //Inicio y obtencion de valores de los setters de la clase Historial
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //Fin de los setters
    
    @Override
    public String toString() {
        return "Historial{" + "nombreJugador=" + nombreJugador + ", nacionalidad=" + nacionalidad + ", edad=" + edad + '}';
    }
    
    
}
