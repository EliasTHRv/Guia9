package main;

import entidad.Persona;
import servicio.PersonaServicio;

/**
 *
 * @author elias
 */
public class main_Persona {

    public static void main(String[] args) {

        PersonaServicio n1 = new PersonaServicio();
        Persona per = n1.crearPersona();

        
       
        
        n1.mostrarPersona(per);

    }

}
