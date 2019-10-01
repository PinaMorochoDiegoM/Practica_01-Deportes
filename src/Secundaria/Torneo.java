package Secundaria;
/**
* Esta clase Historial crea los objetos, ademas de los metodos de acceso de manera publica 
 * 
 * @author Piña Diego 
 * @version 01/10/2019
 * @see <a href = "https://github.com/PinaMorochoDiegoM?tab=repositories" > GitHub.com – Practica 01 Deportes </a>
 * 
 */
public class Torneo {
    private String tipo;
    private String premio;
    private boolean propaganda;
    
    public void jugarClasificatoria(){
        //Codigo no requerido para esta practica
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public boolean getPropaganda() {
        return propaganda;
    }

    public void setPropaganda(boolean propaganda) {
        this.propaganda = propaganda;
    }

    @Override
    public String toString() {
        return "Torneo{" + "tipo=" + tipo + ", premio=" + premio + ", propaganda=" + propaganda + '}';
    }
    
    
}
