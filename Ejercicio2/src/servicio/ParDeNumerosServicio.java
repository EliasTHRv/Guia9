package servicio;

import entidad.ParDeNumeros;

/**
 *
 * @author elias
 */
public class ParDeNumerosServicio {
//    Método mostrarValores que muestra cuáles son los dos números guardados.

    public void mostrarValores(ParDeNumeros numeros) {
        System.out.println("El numero 1 es: " + numeros.getNum1());
        System.out.println("El numero 2 es: " + numeros.getNum2());
    }

//    Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(ParDeNumeros numeros) {

        if (numeros.getNum1() < numeros.getNum2())
        {
            return numeros.getNum2();
        } else
        {
            return numeros.getNum1();
        }
    }

    public double devolverMenor(ParDeNumeros numeros) {
        if (numeros.getNum1() > numeros.getNum2())
        {
            return numeros.getNum2();
        } else
        {
            return numeros.getNum1();
        }
    }
//    Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
//    Previamente se deben redondear ambos valores.
//   OTRA FORMA PARA BUSCAR EL MENOR.
//        if (devolverMayor(numeros) == numeros.getNum1()){
//            menor = Math.round((numeros.getNum2() * 100) / 100);
//        } else {
//            menor = Math.round((numeros.getNum1() * 100) / 100); }

    public void calcularPotencia(ParDeNumeros numeros) {
        double mayor = Math.round((devolverMayor(numeros) * 100) / 100);
        double menor = Math.round((devolverMenor(numeros) * 100) / 100);

        System.out.println("El menor redondeado es: " + menor);
        System.out.println("El mayor redondeado es: " + mayor);

        System.out.println("La potencia es: ");
        System.out.println(Math.pow(mayor, menor));
    }
// Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz 
// cuadrada se debe obtener el valor absoluto del número.

    public void calcularRaiz(ParDeNumeros numeros) {
        System.out.println("La raiz es : ");
        System.out.println(Math.sqrt(devolverMenor(numeros)));

    }

}
