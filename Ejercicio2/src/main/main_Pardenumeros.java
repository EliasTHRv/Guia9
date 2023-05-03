package main;

import entidad.ParDeNumeros;
import servicio.ParDeNumerosServicio;

/**
 *
 * @author elias
 */
public class main_Pardenumeros {
    public static void main(String[] args) {
        ParDeNumeros numeros = new ParDeNumeros();
        ParDeNumerosServicio n1 = new ParDeNumerosServicio();
        
        n1.mostrarValores(numeros);
        n1.devolverMayor(numeros);
        n1.calcularPotencia(numeros);
        n1.calcularRaiz(numeros);
    }
    
}
