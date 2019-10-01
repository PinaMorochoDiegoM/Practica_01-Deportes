package Principal;
import Secundaria.Articulo;
import Secundaria.Cancha;
import Secundaria.Fisico;
import Secundaria.Historial;
import Secundaria.Torneo;
import java.util.Scanner;
/**
* Esta clase Inicio trae los objetos de setters y getters para componer la clase principal, ademas del metodo del toString 
 * 
 * @author Piña Diego 
 * @version 01/10/2019
 * @see <a href = "https://github.com/PinaMorochoDiegoM?tab=repositories" > GitHub.com – Practica 01 Deportes </a>
 * 
 */
public class Inicio {
    public static void main(String[] args) {//Inicio del main
        Scanner l=new Scanner(System.in);
        int n=0;
        do{
        System.out.println(" *******   MENU DE OPCIONES   *******");
        System.out.println(" 1. Crear un objeto de tipo Articulo");
        System.out.println(" 2. Crear un objeto de tipo Cancha");
        System.out.println(" 3. Crear un objeto de tipo Fisico");
        System.out.println(" 4. Crear un objeto de tipo Historial");
        System.out.println(" 5. Crear un objeto de tipo Torneo");
        System.out.println(" 6. Salir");
        System.out.print("Escoja opcion ");
        n=l.nextInt();
        switch(n){
            case 1:
                /**
                * Intanciamos la clase Articulo como a
                * Establecemos los datos de las variables de la clase Articulo
                * Obtenemos los datos mediante getters de las variables de la clase Articulo establecidos en los setters
                */
                Articulo a = new Articulo();
                System.out.println("Escriba tipo de deporte");
                String pe=l.next();
                a.setDeporte(pe);
                System.out.println("Se necesita proteccion en el deporte True/False");
                boolean ob=l.nextBoolean();
                
                a.setObligacionUso(ob);
                System.out.println("Tipo de proteccion");
                String prot=l.next();
                a.setTipo(prot);
                System.out.println("Clase: Articulo");
                System.out.println("Objeto:");
                System.out.println("\tTipo Deporte: " + a.getDeporte());
                System.out.println("\tObligacion de uso de Proteccion: " +a.getObligacionUso());
                System.out.println("\tTipo de Proteccion: " +a.getTipo());
                //Valores a partir del metodo toString 
                System.out.println("\ntoString(): \n" +a.toString());
                System.out.println("");
                break;
            case 2:
                /**
                * Intanciamos la clase Cancha como c
                * Establecemos los datos de las variables de la clase Cancha
                * Obtenemos los datos mediante getters de las variables de la clase Cancha establecidos en los setters
                */
                Cancha c=new Cancha();
                System.out.println("Diametro cancha");
                String di=l.next();
                c.setDiametro(di);
                System.out.println("Numero de arcos");
                int ac=l.nextInt();
                c.setNumeroArcos(ac);
                System.out.println("Numero Jugadores");
                int jug=l.nextInt();
                c.setNumeroJugadores(jug);
                System.out.println("Clase: Cancha");
                System.out.println("Objeto:");
                System.out.println("\tDiametro Cancha: " + c.getDiametro());
                System.out.println("\tNumero Arcos: " +c.getNumeroArcos());
                System.out.println("\tNumero Jugadores: " +c.getNumeroJugadores());
                //Valores a partir del metodo toString 
                System.out.println("\ntoString(): \n" +c.toString());
                System.out.println("");
                break;
            case 3:
                /**
                * Intanciamos la clase Fisico como f
                * Establecemos los datos de las variables de la clase Fisico
                * Obtenemos los datos mediante getters de las variables de la clase Fisico establecidos en los setters
                */
                Fisico f= new Fisico();
                System.out.println("Ingrese peso en libras");
                double pes=l.nextDouble();
                f.setPeso(pes);
                System.out.println("Ingrese altura en metros"); 
                double alt=l.nextDouble();
                f.setAltura(alt);
                System.out.println("Ingrese tipo de alergias");
                String alerg=l.next();
                f.setAlergias(alerg);
                System.out.println("Clase: Fisico");
                System.out.println("Objeto:");
                System.out.println("\tPeso en libras: " +f.getPeso());
                System.out.println("\tAltura en metros: " +f.getAltura());
                System.out.println("\tTipo Alergias: " +f.getAlergias());
                //Valores a partir del metodo toString 
                System.out.println("\ntoString(): \n" +f.toString());
                System.out.println("");
                break;
            case 4:
                /**
                * Intanciamos la clase Historial como h
                * Establecemos los datos de las variables de la clase Historial
                * Obtenemos los datos mediante getters de las variables de la clase Historial establecidos en los setters
                */
                Historial h=new Historial();
                System.out.println("Ingrese edad");
                int edad=l.nextInt();
                h.setEdad(edad);
                System.out.println("Ingrese nacionaidad");
                String nac=l.next();
                h.setNacionalidad(nac);
                System.out.println("Ingrese nombres completos");
                String nc=l.next();
                h.setNombreJugador(nc);
                System.out.println("Clase: Historial");
                System.out.println("Objeto:");
                System.out.println("\tEdad: " +h.getEdad());
                System.out.println("\tNacionalidad: " +h.getNacionalidad());
                System.out.println("\tNombre Jugador: " +h.getNombreJugador());
                //Valores a partir del metodo toString 
                System.out.println("\ntoString(): \n" +h.toString());
                System.out.println("");
                break;
            case 5:
                /**
                * Intanciamos la clase Torneo como t
                * Establecemos los datos de las variables de la clase Torneo
                * Obtenemos los datos mediante getters de las variables de la clase Torneo establecidos en los setters
                */
                Torneo t=new Torneo();
                System.out.println("Ingrese el premio");
                String pre=l.next();
                t.setPremio(pre);
                System.out.println("Ingrese si tiene propagandas true/false");
                boolean prop=l.nextBoolean();
                t.setPropaganda(prop);
                System.out.println("Ingrese tipo de Torneo");
                String tipot=l.next();
                t.setTipo(tipot);
                System.out.println("Clase: Torneo");
                System.out.println("Objeto:");
                System.out.println("\tPremio: " +t.getPremio());
                System.out.println("\tPropagandas: " +t.getPropaganda());
                System.out.println("\tTipo Torneo: " +t.getTipo());
                //Valores a partir del metodo toString 
                System.out.println("\ntoString(): \n" +t.toString());
                System.out.println("");                
                break;
                
        }
        }while (n<6);
    }//Fin del main
    
}
