package Desafíos.d1_conversorBidireccional;

import java.util.Scanner;

public class Conversor_bidireccional {
    public static void main(String[] args) {
        //Declaración variable inicial e instancia Scanner.
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int celsiusAFahrenheit = 0;
        int fahrenheitACelsius = 0;

        System.out.println("*** CONVERSOR DE TEMPERATURA ***");
        System.out.println("¡Hola! Bienvenido/a" + "\n" + "Este programa permite conocer equivalencias de temperatura entre grados Celsius y Fahrenheit" + "\n");
        System.out.println("Por favor, ingresa una de las opciones a transformar:" + "\n" + "1. Grados Celsius a Fahrenheit." + "\n" + "2. Grados Fahrenheit a Celsius");

        //Bucle validación opción ingresada.
        opcion = teclado.nextInt();
        while (opcion != 1 && opcion != 2) {
            System.out.println("\n" + "La opción indicada no corresponde, por favor intenta nuevamente" + "\n");
            System.out.println("Por favor, ingresa una de las opciones a transformar:" + "\n" + "1. Grados Celsius a Fahrenheit." + "\n" + "2. Grados Fahrenheit a Celsius");
            opcion = teclado.nextInt();
        }

        if (opcion == 1) {
            System.out.println("Ingresa la temperatura en Grados Celsius a convertir:");
            celsiusAFahrenheit = teclado.nextInt();

            System.out.println("\n" + celsiusAFahrenheit + " grados Celsius equivalen a: " + ((celsiusAFahrenheit * 9 / 5) + 32) + " grados Fahrenheit.");
        }
        if (opcion == 2) {
            System.out.println("Ingresa la temperatura en Grados Fahrenheit a convertir:");
            fahrenheitACelsius = teclado.nextInt();

            System.out.println("\n" + fahrenheitACelsius + " grados Fahrenheit equivalen a: " + ((fahrenheitACelsius - 32) * 5 / 9) + " grados Celsius.");
        }


    }
}
