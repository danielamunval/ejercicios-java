package Desafíos.d5_analisisNotas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Analisis_Notas libreta = new Analisis_Notas();
        String continuar;

        System.out.println(" *** ANÁLISIS DE NOTAS *** ");
        do {
            System.out.print("\nPor favor, ingrese la cantidad de alumnos: ");
            int cantidadDeAlumnos = teclado.nextInt();

            System.out.print("Ingrese la cantidad de notas por alumno: ");
            int cantidadNotas = teclado.nextInt();

            //Ingreso de datos por cada alumno: nombre y notas. Con verificación de datos dentro de rango y números enteros positivos.
            if (cantidadDeAlumnos >= 1 && cantidadNotas >= 1) {
                for (int nombreAlumno = 0; nombreAlumno < cantidadDeAlumnos; nombreAlumno++) {
                    teclado.nextLine();
                    System.out.print("\nNombre del alumno número " + (nombreAlumno + 1) + ": ");
                    String nombre = teclado.nextLine().toLowerCase();

                    ArrayList<Double> notas = new ArrayList<>();
                    for (int notaIngresada = 0; notaIngresada < cantidadNotas; notaIngresada++) {
                        System.out.print("Nota # " + (notaIngresada + 1) + " para " + nombre + ": ");
                        double notaAsignada = teclado.nextDouble();

                        if (notaAsignada < 1.0 || notaAsignada > 7.0) {
                            System.out.println("Por favor, ingresar una nota válida entre 1.0 y 7.0");
                        }

                        notas.add(notaAsignada);
                    }
                    libreta.agregarEstudiante(nombre, notas);
                }

            } else {
                System.out.println("Por favor, ingrese valores válidos.");
            }
            System.out.println("¿Deseas agregar otro estudiante? \nEscribe Si o No");
            continuar = teclado.next().toLowerCase();

        } while (continuar.equals("si"));

        //Se muestra "Menú de opciones"
        do {
            System.out.println("\n***  MENÚ DE OPCIONES  ***");
            System.out.println("1. Mostrar el Promedio de notas por estudiante.");
            System.out.println("2. Mostrar si la nota es Aprobatoria o Reprobatoria por estudiante.");
            System.out.println("3. Comparar nota de estudiante respecto al promedio del curso.");
            System.out.println("0. Salir del menú");
            System.out.print("\nPor favor, ingrese una opción para continuar: ");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    for (String nombre : libreta.obtenerEstudiantes()) {
                        double promedio = libreta.calcularPromedio(nombre);
                        double max = libreta.obtenerMaxima(nombre);
                        double min = libreta.obtenerMinima(nombre);

                        System.out.printf("\nAlumno: %s\nPromedio: %.2f | Máx: %.2f | Mín: %.2f\n", nombre, promedio, max, min);
                    }
                }
                case 2 -> {
                    teclado.nextLine();
                    System.out.print("Ingresa el nombre del estudiante: ");
                    String nombre = teclado.nextLine().toLowerCase();

                    if (!libreta.existeEstudiante(nombre)) {
                        System.out.println("Estudiante no encontrado.");
                        return;
                    }

                    System.out.print("Ingrese la nota a evaluar: ");
                    double nota = teclado.nextDouble();

                    if (libreta.esAprobatoria(nota)) {
                        System.out.println("La nota es APROBATORIA.");
                    } else {
                        System.out.println("La nota es REPROBATORIA.");
                    }
                }
                case 3 -> {
                    teclado.nextLine();
                    System.out.print("Nombre del estudiante: ");
                    String nombre = teclado.nextLine().toLowerCase();

                    if (!libreta.existeEstudiante(nombre)) {
                        System.out.println("Estudiante no encontrado.");
                        return;
                    }

                    System.out.print("Ingrese la nota a comparar: ");
                    double nota = teclado.nextDouble();

                    double promedioCurso = libreta.calcularPromedioCurso();
                    System.out.printf("Promedio del curso: %.2f\n", promedioCurso);

                    if (nota >= promedioCurso) {
                        System.out.println("La nota está SOBRE el promedio del curso.");
                    } else {
                        System.out.println("La nota está BAJO el promedio del curso.");
                    }
                }
                case 0 -> System.out.println("¡Hasta pronto!");

                default -> System.out.println("Opción inválida");
            }

            System.out.println("¿Deseas realizar otra actividad del menú de opciones? \nEscribe Si o No => ");
            continuar = teclado.next().toLowerCase();

            if (continuar.equals("no")) {
                System.out.println("¡Hasta pronto!");
            }

        } while (continuar.equals("si"));

    }

}