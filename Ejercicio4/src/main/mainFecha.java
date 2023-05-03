package main;

import java.util.Date;
import servicio.fechaService;

/**
 *
 * @author elias
 */
public class mainFecha {

    public static void main(String[] args) {
        Date fechaN = new Date();

        fechaService fech1 = new fechaService();
        System.out.println(fech1.diferenciaFechas(fech1.fechaNacimiento(), fech1.fechaActual()));
        
    }
    
}
