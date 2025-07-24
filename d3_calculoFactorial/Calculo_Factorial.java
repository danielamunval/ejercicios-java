package Desafíos.d3_calculoFactorial;

import java.util.Scanner;

// (n! = n × (n - 1) × (n - 2) × ... × 1)

public class Calculo_Factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean validaInput = true;
        String continuar = "No";
        int numeroIngresado = 0;

        System.out.println("*** CÁLCULO DE FACTORIAL ***");

        do {
            do {
                validaInput = true;
                System.out.print("Por favor, ingresa un número que sea mayor a 0: ");

                try {
                    numeroIngresado = teclado.nextInt();
                } catch (Exception e) {
                    validaInput = false;
                    System.out.print("Número inválido, por favor ingresa nuevamente: ");
                    teclado.nextLine();
                }
            } while (validaInput == false);

            if (validaInput == true) {
                int factorial = 1;
                for (int i = 1; i <= numeroIngresado; i++) {
                    factorial = factorial * i;
                }
                System.out.println("El factorial de " + numeroIngresado + " es " + factorial);

                System.out.println("¿Deseas consultar otro número? \nEscribe Si o No");
                continuar = teclado.next().toLowerCase();

                if (continuar.equals("no")) {
                    System.out.println("¡Hasta pronto! :)");
                }
            }

        } while (continuar.equals("si"));

        teclado.close();
    }
}


