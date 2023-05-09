package servicio;

import entidad.Mes;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class MesServicio {


    public static void iniciarJuego(Mes mes) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(mes.getMesSecreto());
        System.out.println("Adivine el mes secreto. " + "\nIntroduzca el nombre del mes: ");
        String mesIntroducido = null;

        do {
            mesIntroducido = leer.next();
            if (mes.getMesSecreto().equalsIgnoreCase(mesIntroducido)) {
                System.out.println("¡Ha acertado!");
            } else {
                System.out.println("No ha acertado. "+ "Intente adivinarlo introduciendo otro mes: ");
            }
        } while (!mes.getMesSecreto().equalsIgnoreCase(mesIntroducido));
    }
    
}
