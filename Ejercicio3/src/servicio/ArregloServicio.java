package servicio;

import java.util.Arrays;

/**
 *
 * @author elias
 */
public class ArregloServicio {

    //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public void inicializarA(double[] arreglo) {

        for (int i = 0; i < arreglo.length; i++)
        {
            arreglo[i] = Math.random() * 10;
        }
    }

    // Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostarA(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
        System.out.println("------");
    }

    // Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.     
    public void ordenarA(double[] arreglo) {
        Arrays.sort(arreglo);
        mostarA(arreglo);
        System.out.println("------");
    }

    //Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
    //Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    public void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, arregloB.length / 2);
        Arrays.fill(arregloB, arregloB.length / 2, arregloB.length, 0.5);
    }
}
