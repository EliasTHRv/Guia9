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
//        ParDeNumerosServicio n1 = new ParDeNumerosServicio();
        
          ParDeNumerosServicio.calculos(numeros);

//        ParDeNumerosServicio.mostrarValores(numeros);
//        ParDeNumerosServicio.devolverMayor(numeros);
//        ParDeNumerosServicio.calcularPotencia(numeros);
//        ParDeNumerosServicio.calcularRaiz(numeros);
    }
    
}
