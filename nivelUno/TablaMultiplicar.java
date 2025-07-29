package Desafíos.nivelUno;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroTabla;

        System.out.println("** Tabla de Multiplicar **");
        System.out.println("Ingresa el número del cual quieres la tabla (1 - 10): ");
        numeroTabla = scanner.nextInt();

        while (numeroTabla >= 10 || numeroTabla < 1) {
            System.out.println("Has ingresado un número incorrecto, intenta nuevamente, ingresando un número entre 1 y 10: ");
            numeroTabla = scanner.nextInt();
        }

        System.out.println("\nTabla del " + numeroTabla + ":");
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            int resultado = numeroTabla * multiplicador;
            System.out.println(numeroTabla + " x " + multiplicador + " = " + resultado);
        }

        scanner.close();
    }

}
