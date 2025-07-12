package Desafíos.nivelUno;

import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Instancia Scanner para interacción del usuario por la consola.

        System.out.println("****  CALCULADORA DE DESCUENTOS  ****");
        System.out.print("\nIngresa el precio del producto: ");
        double precioOriginalProducto = teclado.nextDouble(); //se asigna a la variable "precioOriginalProducto" el valor que escriba el usuario.

        System.out.print("Ingresa el porcentaje de descuento: ");
        double porcentajeDescuento = teclado.nextDouble(); //se asigna a la variable "porcentajeDescuento" el valor que escriba el usuario.

        //Cálculo de descuento y precio final con dos decimales.
        double precioFinalConDescuento = precioOriginalProducto - (precioOriginalProducto * porcentajeDescuento / 100);

        System.out.printf("El precio final con el descuento aplicado (%.2f%%) es: %.2f%n", porcentajeDescuento, precioFinalConDescuento);

    }

}
