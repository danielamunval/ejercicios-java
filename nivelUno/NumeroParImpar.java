package Desafíos.nivelUno;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** VERIFICADOR PAR - IMPAR ***");
        System.out.print("\nIngresa un número entero positivo: ");
        int numeroEntero = teclado.nextInt();

        if (numeroEntero <= 0) { //verificación de número ingresado por el usuario
            System.out.println("Valor no ingresado, por favor intente nuevamente.");
            return;
        }

        int resultadoModulo = (numeroEntero % 2);

        if (resultadoModulo == 0) { //verificación de solicitud del ejercicio
            System.out.println("El número ingresado es par :)");
        } else {
            System.out.println("El número ingresado no es par");
        }

    }
}
