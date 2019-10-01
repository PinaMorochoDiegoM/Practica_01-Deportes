package Secundaria;
/**
* Esta clase Articulo crea los objetos, ademas de los metodos de acceso de manera publica 
 * 
 * @author Piña Diego 
 * @version 01/10/2019
 * @see <a href = "https://github.com/PinaMorochoDiegoM/Pratica01PinaDiego/tree/master/src/ec/edu/ups" > GitHub.com – Practica 01 Deportes </a>
 * 
 */
public class Articulo {
    private String deporte;
    private String tipoProteccion;
    private boolean obligacionUso;
    
    
    public void agregarArticulo(){
        //Codigo no requerido para esta practica   
    }
    
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getTipo() {
        return tipoProteccion;
    }

    public void setTipo(String tipo) {
        this.tipoProteccion = tipo;
    }

    public boolean getObligacionUso() {
        return obligacionUso;
    }

    public void setObligacionUso(boolean obligacionUso) {
        this.obligacionUso = obligacionUso;
    }

    @Override
    public String toString() {
        return "Articulo{" + "deporte=" + deporte + ", tipo=" + tipoProteccion + ", obligacionUso=" + obligacionUso + '}';
    }
    
}
