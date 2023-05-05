package main;

import entidad.Curso;
import servicio.CursoServicio;

/**
 *
 * @author elias
 */
public class mainCurso {
public static void main(String[] args) {

    CursoServicio cur1 = new CursoServicio();
    Curso curso = cur1.crearCurso();
    
    cur1.calcularGananciaSemanal(curso);
    
    }
    
}
