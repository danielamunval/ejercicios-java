package calculadora_IMC;

import java.util.Scanner;

public class calculadora_IMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("***   CALCULADORA IMC   ***");
        System.out.print("Ingresa tu peso en kg: ");
        double peso = teclado.nextDouble();

        System.out.print("Ingresa tu estatura en metros (ejemplo: 1.50): ");
        double estatura = teclado.nextDouble();

        double indiceMasaCorporal = peso / (estatura * estatura);

        if (indiceMasaCorporal < 18.5) {
            System.out.println("\nTu Indice de Masa Corporal es: " + indiceMasaCorporal + " , lo que indica Bajo Peso");
        } else if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal <= 24.9) {
            System.out.println("\nTu Indice de Masa Corporal es: " + indiceMasaCorporal + " , lo que indica Peso Normal");
        } else if (indiceMasaCorporal >= 25.0 && indiceMasaCorporal <= 29.9) {
            System.out.println("\nTu Indice de Masa Corporal es: " + indiceMasaCorporal + " , lo que indica Sobrepeso");
        } else {
            System.out.println("\nTu Indice de Masa Corporal es: " + indiceMasaCorporal + " , lo que indica Obesidad");
        }


        teclado.close();
    }


}
