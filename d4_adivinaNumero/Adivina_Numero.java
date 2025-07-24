package Desafíos.d4_adivinaNumero;

import java.util.Random;
import java.util.Scanner;

public class Adivina_Numero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; //generador de número aleatorio entre 1 y 100
        int intentos = 7; // intentos iniciales del usuario.

        System.out.println("***  ¡Bienvenido/a a 'Adivina el Número'!  ***\n");
        System.out.println("Las reglas son simples: \n1.El objetivo del juego es adivinar el número en que estoy pensando actualmente. \n2.El número siempre estará entre 1 y 100, sin excepción, siempre será un número entero, no un decimal. \n3.Debes ingresar el número que tienes en mente en la consola. \n4.Si adivinas antes de 7 intentos ¡eres el ganador!");

        System.out.println("\n¡He escogido el número secreto!");
        System.out.println("Tienes " + intentos + " intentos disponibles. ¡Tu puedes! \uD83D\uDE04");


        while (intentos >= 1) {
            System.out.println("\nAdivina el número (entre 1 y 100): ");
            int numeroElegido = teclado.nextInt();

            if (numeroElegido < 1 || numeroElegido > 100) { //condición para evitar que números ingresados están fuera de rango.
                System.out.println("¡OJO! El número ingresado no es válido ⚠️ \nPor favor, ingresa un número entre 1 y 100.");
                continue; // devuelve al inicio del bucle y no descuenta intentos.
            }

            if (numeroElegido == numeroSecreto) { // ganador!
                System.out.println("¡Felicidades! \uD83C\uDF89 Has acertado y has adivinado en el número secreto en " + (8 - intentos) + " intentos. \n¡Eres el ganador! \uD83E\uDD73 ");
                break;
            } else if (numeroElegido > numeroSecreto) {
                System.out.println("El número secreto es menor del que ingresaste ahora.");
            } else if (numeroElegido < numeroSecreto) {
                System.out.println("El número secreto es mayor del que ingresaste ahora.");
            }

            intentos--; //contador inverso de intentos hasta 0
            System.out.println("Te quedan " + intentos + " intentos disponibles.");
        }

        if (intentos == 0) {
            System.out.println("\nTe has quedado sin intentos! \uD83D\uDE2D \nEl número secreto es " + numeroSecreto);
        }

        teclado.close();
    }
}

