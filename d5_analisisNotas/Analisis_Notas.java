package Desafíos.d5_analisisNotas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Analisis_Notas {

    HashMap<String, ArrayList<Double>> notasEstudiantes = new HashMap<>();
    public static final double notaAprobacion = 4.0;

    public void agregarEstudiante(String nombre, ArrayList<Double> notas) {
        notasEstudiantes.put(nombre, notas);
    }

    public Set<String> obtenerEstudiantes() {
        return notasEstudiantes.keySet();
    }

    public double calcularPromedio(String nombre) {
        ArrayList<Double> notas = notasEstudiantes.get(nombre);
        if (notas == null || notas.isEmpty()) return 0;
        double suma = 0;
        for (double nota : notas) suma += nota;
        return suma / notas.size();
    }

    public double obtenerMaxima(String nombre) {
        return Collections.max(notasEstudiantes.get(nombre));
    }

    public double obtenerMinima(String nombre) {
        return Collections.min(notasEstudiantes.get(nombre));
    }

    public boolean esAprobatoria(double nota) {
        return nota >= notaAprobacion;
    }

    public double calcularPromedioCurso() {
        double sumaTotal = 0;
        int totalNotas = 0;
        for (ArrayList<Double> notas : notasEstudiantes.values()) {
            for (double nota : notas) {
                sumaTotal += nota;
                totalNotas++;
            }
        }
        return totalNotas == 0 ? 0 : sumaTotal / totalNotas;
    }

    public boolean existeEstudiante(String nombre) {
        return notasEstudiantes.containsKey(nombre);
    }
}


