package Desafíos.d2_calculadoraEdad;

import java.time.LocalDate;
import java.util.Scanner;

public class Calculadora_Edad {
    //Función que permite calcular edad.
    public static int calcularEdad(int anioDeNacimiento) {
        int anioActual = LocalDate.now().getYear(); //permite sincronizar con año actual del PC
        int edad = anioActual - anioDeNacimiento; //cálculo edad
        return edad;
    }

    //Función asignación categoría según edad.
    public static String obtenerCategoria(int edad) {
        if (edad == 0 || edad <= 12) {
            return "Niño, que joven eres! :D";
        } else if (edad == 13 || edad <= 17) {
            return "Adolescente, qué joven eres! :D";
        } else if (edad == 18 || edad <= 25) {
            return "Adulto joven, edad perfecta para seguir aprendiendo java!";
        } else if (edad == 26 || edad <= 59) {
            return "Adulto/a, edad perfecta para comenzar a aprender java, nunca es tarde!";
        } else {
            return "Adulto/a mayor, nunca es tarde para aprender a programar!";
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anioDeNacimiento = 0;
        boolean validaInput = true;
        String continuar = "No";

        System.out.println("***   CALCULADORA DE EDAD   ***");
        System.out.println("\n¡Hola! Bienvenido/a a la Calculadora de Edad.");

        do {

            do {
                validaInput = true;
                System.out.print("Escribe tu año de nacimiento: ");

                try {
                    anioDeNacimiento = teclado.nextInt();
                } catch (Exception e) {
                    validaInput = false;
                    System.out.println("Se ha ingresado un carácter inválido, por favor intenta nuevamente.");
                    teclado.nextLine();
                }
            } while (validaInput == false);

            if (validaInput == true) {
                System.out.println("Tu edad es: " + calcularEdad(anioDeNacimiento) + " años.\n" + "Tu categoría etaria es: " + obtenerCategoria(calcularEdad(anioDeNacimiento)) + "\n");
                System.out.println("¿Deseas consultar otro año de nacimiento?\nEscribe Si o No");
                continuar = teclado.next().toLowerCase();

                if (continuar.equals("no")) {
                    System.out.println("¡Hasta pronto! :)");
                }
            }

        } while (continuar.equals("si"));

        teclado.close();

    }

}
