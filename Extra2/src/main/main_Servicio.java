package main;

import java.util.Scanner;
import servicio.AhorcadoServicio;

/**
 *
 * @author elias
 */
public class main_Servicio {

    public static void main(String[] args) {
        AhorcadoServicio j2 = new AhorcadoServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char salida = 'a';
        do
        {
            System.out.println("Opcion 1 : Iniciar juego:");
            System.out.println("Opcion 2 : Salir:");
            int opcion = leer.nextInt();

            switch (opcion)
            {
                case 1:
                    j2.iniciarJuego();
                case 2:
                    System.out.println("Confirmar para salir. S");
                    salida = leer.next().charAt(0);
                    if (salida == 's')
                    {
                        System.out.println("Gracias por jugar.");
                    }
                    break;
            }

        } while (salida != 's');

    }

}
