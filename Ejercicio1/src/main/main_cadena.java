package main;

import entidad.Cadena;
import java.util.Scanner;
import servicio.CadenaServicio;

/**
 *
 * @author elias
 */
public class main_cadena {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CadenaServicio cad1 = new CadenaServicio();
        
        System.out.println("Ingrese una frase");      
        Cadena cadena = new Cadena(leer.nextLine());
        
        cad1.mostrarVocales(cadena);
        cad1.invertirFrase(cadena);
        cad1.vecesRepetido(cadena.getFrase());
        cad1.compararLongitud(cadena.getFrase());
        cad1.unirFrases(cadena.getFrase());
        cad1.contiene(cadena.getFrase());
      
    }
    
}
