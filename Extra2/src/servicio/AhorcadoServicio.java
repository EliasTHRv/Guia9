package servicio;

import entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class AhorcadoServicio {

//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, 
//    pone la longitud de la palabra, como la longitud del vector
//    . Después ingresa la palabra en el vector , letra por letra, quedando cada letra de la palabra en un índice del vector
//    . Y también, guarda la cantidad de jugadas
//    máximas y el valor que ingresó el usuario
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego() {
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("Ingrese la palabra a adivinar:");
        String palAbuscar = leer.next();
        boolean noIntentos;
        boolean pEncontrada;
        char[] palabra = new char[longitud(palAbuscar)];

        for (int i = 0; i < longitud(palAbuscar); i++)
        {
            palabra[i] = palAbuscar.charAt(i);
        }

        ahorcado.setPalabraAbuscar(palabra);
        System.out.println("Ingrese la cantidad de intentos maximos: ");
        ahorcado.setCantidadDeintentos(leer.nextInt());
        do
        {
            System.out.println("Ingrese la letra a buscar: ");
            char letra = leer.next().charAt(0);

            encontradas(letra, ahorcado);
            noIntentos = ahorcado.getCantidadDeintentos() > 0;
            pEncontrada = ahorcado.getLetrasEncontradas() == ahorcado.getPalabraAbuscar().length;
            if (pEncontrada)
            {
                System.out.println("--------");
                System.out.println("GANASTE!!!");
                System.out.println("--------");
                break;
            } else if (!noIntentos)
            {
                System.out.println("--------");
                System.out.println("Te quedaste sin intentos. :'c");
                System.out.println("--------");
                break;

            }

        } while (true);

    }

//Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
//Nota: buscar como se usa el vector.length.
    private int longitud(String palAbuscar) {
        return palAbuscar.length();
    }

//Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte 
//de la palabra o no. También informará si la letra estaba o no.
    private boolean buscar(char letra, Ahorcado ahorcado) {
        boolean letraEncontrada = false;
        char[] palabra = ahorcado.getPalabraAbuscar();
        for (int i = 0; i < ahorcado.getPalabraAbuscar().length; i++)
        {
            if (letra == palabra[i])
            {
                letraEncontrada = true;
                break;
            }
        }
        if (letraEncontrada)
        {
            System.out.println("La letra pertenece a la palabra: ");
        } else
        {
            System.out.println("La letra no pertenece a la palabra: ");
        }
        return letraEncontrada;
    }

//Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido
//encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no 
//estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
    private boolean encontradas(char letra, Ahorcado ahorcado) {
        boolean letraEncontrada = buscar(letra, ahorcado);
        char[] palabra = ahorcado.getPalabraAbuscar();
        if (letraEncontrada)
        {
            for (int i = 0; i < ahorcado.getPalabraAbuscar().length; i++)
            {
                if (letra == palabra[i])
                {
                    letraEncontrada = true;
                    ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                }
            }
        } else
        {
            ahorcado.setCantidadDeintentos(ahorcado.getCantidadDeintentos() - 1);
            intentos(ahorcado);
        }
        int faltalte = ahorcado.getPalabraAbuscar().length - ahorcado.getLetrasEncontradas();
        System.out.println("Faltan encontrar " + faltalte + " letras.");
        return letraEncontrada;
    }
// Método intentos(): para mostrar cuántas oportunidades le queda al jugador.

    private void intentos(Ahorcado ahorcado) {
        System.out.println("Te quedan " + ahorcado.getCantidadDeintentos() + " intentos.");
    }

    // inicia el juego
    public void iniciarJuego() {
        crearJuego();
    }

}
