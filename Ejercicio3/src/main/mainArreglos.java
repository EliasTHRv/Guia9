package main;

import servicio.ArregloServicio;

/**
 *
 * @author elias
 */
public class mainArreglos {
    
    public static void main(String[] args) {
        ArregloServicio arreGlos = new ArregloServicio();
        double[] A = new double[50];
        double[] B = new double[20];

        //En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
        arreGlos.inicializarA(A);
        arreGlos.mostarA(A);
        arreGlos.ordenarA(A);
        arreGlos.inicializarB(A, B);
        arreGlos.mostarA(A);
        arreGlos.inicializarA(B);
    }
}
