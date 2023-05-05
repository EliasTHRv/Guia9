package servicio;

import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class CursoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

//Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
//Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, 
//solicitando en cada repetición que se ingrese el nombre de cada alumno.
    private String[] cargarAlumnos(int longitudVector) {
        String[] alumnos = new String[longitudVector];
        for (int i = 0; i < alumnos.length; i++)
        {
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            alumnos[i] = leer.next();
        }
        return alumnos;
    }
//    //Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le
//  asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método 
//          cargarAlumnos() para asignarle valor al atributo alumnos

    public Curso crearCurso() {
        Curso curso1 = new Curso();
        System.out.println("Ingresa el nombre del curso");
        curso1.setNombreCurso(leer.next());
        System.out.println("Ingres la cantidad de horas por día de cursado");
        curso1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingresa la cantidad de días que se va a dictar el cursado");
        curso1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese si es turno mañana o tarde");
        curso1.setTurno(leer.next());
        System.out.println("Ingresa el valor de la hora del cursado");
        curso1.setPrecioPorHora(leer.nextDouble());

        curso1.setAlumnos(cargarAlumnos(curso1.getAlumnos().length));
        return curso1;
    }

//   Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por 
//   curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos 
//           y la cantidad de días a la semana que se repite el encuentro.
    public void calcularGananciaSemanal(Curso curso) {

        System.out.println("La ganancia semanal es: $ " +  (curso.getCantidadDiasPorSemana()
                * curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length));

        
    }

}
