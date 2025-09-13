# 🧐 Desafío Técnico: Sistema de Registro de Empleados con Herencia y Polimorfismo

## Descripción

Implementa un sistema de gestión de empleados en una empresa utilizando **colecciones de Java** y aplicando los principios de **herencia y polimorfismo**. El sistema debe almacenar empleados de distintos tipos, calcular sus salarios mensuales de forma polimórfica, y gestionar la información usando estructuras como `Array`, `List`, `Set` y `Map`.

> Este desafío está diseñado para practicar tus habilidades en el uso de colecciones, diseño orientado a objetos, herencia, polimorfismo y buenas prácticas en Java.

---

## 👨‍💼 Requisitos

### 1. Jerarquía de Clases

Crea una superclase `Empleado` con:

* `String nombre`
* `int id`
* Método `double calcularSalario()` (no abstracto, solo sobrescrito por cada subclase)

Implementa al menos tres subclases:

* `EmpleadoTiempoCompleto` (atributo adicional: `double salarioMensual`)
* `EmpleadoPorHora` (atributos: `int horasTrabajadas`, `double pagoPorHora`)
* `EmpleadoFreelance` (atributos: `List<Double> pagosPorProyecto`)

### 2. Registro de Empleados

* Usa un **Array** para almacenar los nombres de 6 empleados.
* Transforma el array en una **List<Empleado>** donde cada objeto corresponde a una subclase distinta (al menos dos de cada tipo).
* Asigna un `id` incremental automático (1, 2, 3...).

### 3. Control de Duplicados

* Usa un **Set<String>** para verificar si hay nombres duplicados en el array original.

### 4. Asociación de Datos Complementarios

* Usa un **Map\<Integer, String>** para mapear el ID de cada empleado a su tipo de contrato (`"Tiempo Completo"`, `"Por Hora"`, `"Freelance"`).

### 5. Informes y Análisis

* Muestra la lista de empleados con su nombre, tipo, ID y salario calculado mediante polimorfismo.
* Usa **Streams** para obtener:

  * Promedio general de salarios
  * Empleado con el salario más alto
  * Lista de empleados con salario inferior a un umbral (ej: < 500000)

---

## 💾 Ejemplo de Salida Esperada

```
Nombre duplicado detectado: Laura

ID: 1 - Laura - Tiempo Completo - $900000.0
ID: 2 - Pedro - Por Hora - $312000.0
ID: 3 - Laura - Freelance - $450000.0
ID: 4 - Ana - Tiempo Completo - $1200000.0
ID: 5 - Diego - Por Hora - $450000.0
ID: 6 - Sofía - Freelance - $700000.0

📊 Análisis:
Promedio salarial: $683333.33
Empleado con mayor salario: Ana ($1200000.0)
Empleados con salario inferior a $500000:
- Pedro ($312000.0)
- Laura ($450000.0)
- Diego ($450000.0)
```

---

## ✅ Bonus (Opcional)

* Permite agregar nuevos empleados por consola usando `Scanner`.
* Ordena la lista de empleados por salario descendente.

---

## 📌 Tips

* Usa `instanceof` para verificar el tipo de empleado si es necesario.
* Apóyate en el polimorfismo: el mismo método `calcularSalario()` debe comportarse distinto según la subclase.
* Usa `Map.entrySet()` y `Stream` para consultar estructuras clave-valor.

---

## 📝 ¿Qué se evalúa?

* Comprensión de herencia y polimorfismo
* Uso de colecciones (`Array`, `List`, `Set`, `Map`)
* Modularidad, claridad del diseño y buenas prácticas
* Aplicación de Streams para análisis
* Capacidad para modelar entidades del mundo real en código

---

¡Demuestra que dominas Java con herencia y polimorfismo! 🚀
