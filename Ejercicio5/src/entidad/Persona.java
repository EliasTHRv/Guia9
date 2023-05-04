package entidad;


import java.util.Date;


/**
 * Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento
 * (Tipo Date), constructor vacío, constructor parametrizado, get y set. 
 */
/**
 *
 * @author elias
 */
public class Persona {
private String nombre;
private Date fechaN;

    public Persona() {
    }

    public Persona(String nombre, Date fechaN) {
        this.nombre = nombre;
        this.fechaN = fechaN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }
    


}
