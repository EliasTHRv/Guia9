/*
 *Crear una clase PersonaService, en el
 * paquete servicio, con los siguientes métodos:
 */
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class PersonaServicio {

    Persona per1 = new Persona();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
    //Retornar el objeto Persona creado.

    public Persona crearPersona() {

        System.out.println("Ingrese el nombre de la persona:");
        per1.setNombre(leer.next());
        System.out.println("Ingrese el año");
        int anio = leer.nextInt() - 1900;
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = leer.nextInt();
        Date n = new Date(anio, mes, dia);

        per1.setFechaN(n);
        return per1;
    }

    //Método calcularEdad que calcule la edad del usuario utilizando el atributo de
    //fecha de nacimiento y la fecha actual.
    public int calcularEdad(Persona per1) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - per1.getFechaN().getYear();
        return edad;
    }

    //Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona
    //es menor que la edad consultada o false en caso contrario.
    public boolean menorQue(Persona per1) {
        System.out.println("Ingrese una edad para comparar: ");
        int numConsultar = leer.nextInt();
        return calcularEdad(per1) < numConsultar;

    }

    //Método mostrarPersona que muestra la información de la persona deseada.
    public void mostrarPersona(Persona per1) {

        System.out.println("El nombre de las personas es: " + per1.getNombre());
        System.out.println("La fecha de nacimiento es: " + per1.getFechaN().getDate() + "/" + per1.getFechaN().getMonth() + "/" + per1.getFechaN().getYear());
        System.out.println("La edad de la persona es: "+calcularEdad(per1));
        System.out.println(menorQue(per1));
    }

}
