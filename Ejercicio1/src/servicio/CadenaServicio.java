package servicio;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class CadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

//    public Cadena crearCadena(){
//Cadena cad1 = new Cadena();
//        System.out.println("Ingrese una frase ");
//        cad1.setFrase(leer.nextLine());
//
//    return cad1;
//    }
    public void mostrarVocales(Cadena cadena) {
        int cont = 0;
        for (int i = 0; i < cadena.getLongitud(); i++)
        {
            switch (cadena.getFrase().substring(i, i + 1).toLowerCase())
            {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    cont++;
            }

        }
        System.out.println("la cantidad de vocales son: " + cont);
    }

//      Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
//      Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena cadena) {
        String frase = cadena.getFrase();
        String a = "";
        for (int i = cadena.getFrase().length() - 1; i >= 0; i--)
        {
            a += frase.charAt(i);
        }
        System.out.println(a);
    }

    public void vecesRepetido(String frase) {
        System.out.println("Ingrese un caracter a buscar en la frase: ");
        String carBuscar = leer.next();
        int contRepetido = 0;

        for (int i = 0; i < frase.length(); i++)
        {
            if (carBuscar.equalsIgnoreCase(frase.substring(i, i + 1)))
            {
                contRepetido++;
            }
        }
        System.out.println("El caracter " + carBuscar + " esta repedido: " + contRepetido + " veces.");
    }

//    Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con 
// otra nueva frase ingresada por el usuario.
    public void compararLongitud(String frase) {
//        Arrays.equals(arreglo1, arreglo2)
        System.out.println("Ingrese otra frase para comparar: ");
        String frase2 = leer.next();
        if (frase.length() == frase2.length())
        {
            System.out.println("Ambas dos frase tienen la misma longitud");
        } else
        {
            System.out.println("Ambadas dos frases no tienen la misma longitud");
        }

    }

//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase 
//ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(String frase) {
        System.out.println("Ingrese otra frase para unir: ");
        String frase3 = leer.next();

        frase += " " + frase3;

        System.out.println("El resultado de unir ambas frases es: " + frase);

    }

//    Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y 
//            devuelve verdadero si la contiene y falso si no.
    public void contiene(String frase) {
        char letraBuscar = ' ';
        System.out.println("Ingrese una letra a comprobar:");
        letraBuscar = leer.next().charAt(0);

        for (int i = 0; i < frase.length(); i++)
        {
            if (letraBuscar == frase.charAt(i))
            {
                System.out.println("La frase contiene la letra.");
                break;
            } else
            {
                System.out.println("La frase no tiene la letra");

            }
        }

    }

}
