package Secundaria;
/**
* Esta clase Fisico crea los objetos, ademas de los metodos de acceso de manera publica 
 * 
 * @author Piña Diego 
 * @version 01/10/2019
 * @see <a href = "https://github.com/PinaMorochoDiegoM/Pratica01PinaDiego/tree/master/src/ec/edu/ups" > GitHub.com – Practica 01 Deportes </a>
 * 
 */
public class Fisico {
    private double peso;
    private double altura;
    private String alergias;
    
    public void modificarPeso(){
        //Codigo no requerido para esta practica
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    @Override
    public String toString() {
        return "Fisico{" + "peso=" + peso + ", altura=" + altura + ", alergias=" + alergias + '}';
    }
    
}
