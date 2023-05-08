package main;

import entidad.Mes;
import servicio.MesServicio;

/**
 *
 * @author elias
 */
public class mainMes {
    public static void main(String[] args) {
        Mes juego = new Mes();
        MesServicio.iniciarJuego(juego);
    }

}
