# 🧐 Desafío Técnico: Gestión de Estudiantes y Notas con Java Collections

## Descripción

Diseña un programa en Java que permita **gestionar estudiantes y sus calificaciones**, aplicando estructuras de datos modernas como **arrays, listas, sets, mapas y streams**.

El programa permitirá registrar estudiantes, asignar notas, calcular promedios, y detectar duplicados, todo dentro de un entorno dinámico y optimizado con `Streams`.

> Este desafío evalúa tus conocimientos en colecciones de Java, operaciones funcionales, manipulación de datos, y diseño modular con buenas prácticas.

---

## 🎩 Requisitos

1. Define una clase `Estudiante` con los siguientes atributos:

   * `String nombre`
   * `int id` (único)
   * `List<Integer> notas`

2. En el programa principal:

   ### a) Registro de Estudiantes

   * Crea un **Array** de tamaño fijo (ej: 5) que contenga nombres de estudiantes predeterminados.
   * Transforma ese array en una **List**, asignando un ID incremental (1, 2, 3...).
   * Cada estudiante debe comenzar con una lista vacía de notas.

   ### b) Evitar Duplicados

   * Usa un **Set** para almacenar nombres únicos. Detecta e imprime si hay algún nombre duplicado en el array original.

   ### c) Asignar Notas

   * Usa un **Map\<Integer, List**\*\*>\*\* para asociar el ID del estudiante con sus notas.
   * Simula el ingreso de 3 notas aleatorias (entre 1 y 7) para cada estudiante y guárdalas tanto en el objeto `Estudiante` como en el `Map`.

   ### d) Mostrar Información

   * Imprime todos los estudiantes, sus ID y sus notas.

   ### e) Análisis con Stream

   * Muestra el promedio de notas de cada estudiante utilizando `Stream`.
   * Muestra qué estudiantes tienen promedio mayor o igual a 6.
   * Muestra cuántos estudiantes reprobaron (promedio < 4).

---

## 💾 Ejemplo de Salida Esperada

```
Detectado nombre duplicado: Juan

📋 Estudiantes:
ID: 1 - Nombre: Juan - Notas: [5, 6, 4]
ID: 2 - Nombre: Ana - Notas: [7, 6, 6]
ID: 3 - Nombre: Juan - Notas: [3, 5, 2]
ID: 4 - Nombre: Pedro - Notas: [6, 6, 6]
ID: 5 - Nombre: María - Notas: [4, 3, 5]

📊 Promedios:
Juan (ID: 1) → 5.0
Ana (ID: 2) → 6.3 ✅
Juan (ID: 3) → 3.3 ❌
Pedro (ID: 4) → 6.0 ✅
María (ID: 5) → 4.0

✅ Estudiantes aprobados con promedio ≥ 6:
- Ana (ID: 2)
- Pedro (ID: 4)

❌ Estudiantes reprobados:
- Juan (ID: 3)
```

---

## ✅ Bonus: Extiende tu solución

* Usa `Scanner` para permitir que el usuario ingrese los nombres y notas en lugar de usar valores predeterminados.
* Ordena la lista de estudiantes por promedio (descendente).
* Muestra el estudiante con **mayor promedio** y con **menor promedio**.

---

## 📌 Tips y Recomendaciones

* Usa `Arrays.asList(...)` para convertir un array a lista.
* Usa `Set.add(...)` para detectar duplicados (cuando `add` devuelve `false`).
* Usa `Map.put(...)` para asociar notas a IDs.
* Usa `.stream().mapToInt(...).average()` para obtener promedios.
* Apóyate en `Comparator.comparingDouble(...)` para ordenamientos.

---

## 📝 ¿Qué se evalúa?

* Dominio de colecciones (`Array`, `List`, `Set`, `Map`)
* Uso de `Streams` para cálculos y filtros
* Legibilidad del código
* Modularización y reutilización
* Validación y control de errores
* Buenas prácticas de codificación

---

¡A demostrar tu poder de Java! 🚀
