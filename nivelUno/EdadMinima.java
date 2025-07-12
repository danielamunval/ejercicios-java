package Desafíos.nivelUno;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class EdadMinima {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("***  VERIFICADOR DE EDAD  ***");
        System.out.print("\nIngresa tu edad: "); //solicitud de edad
        int edad = teclado.nextInt();

        if (edad >= 18) { //verificación de condición
            System.out.println("Puedes votar.");
        } else {
            System.out.println("No puedes votar aún.");
        }

    }

}
