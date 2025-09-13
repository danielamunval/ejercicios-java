# Desafío Técnico: Tablas de Multiplicar con Rango Personalizado 🧮

## Descripción

Crea un programa en Java que permita al usuario generar las **tablas de multiplicar desde 1 hasta un número base** que él mismo elija.  
Además, podrá definir **hasta qué número multiplicar** cada tabla (por ejemplo, hasta el 10, 12 o más).

> Este ejercicio es ideal para practicar bucles anidados, validaciones personalizadas, condiciones, y entrada de datos dinámica.

---

## Requisitos

1. Solicitar al usuario el **número máximo de tabla** (ej: hasta la tabla del 7).
   - Si es mayor a 10, mostrar mensaje de advertencia amistosa.
2. Solicitar al usuario el **límite de multiplicación** (ej: hasta el 12).
   - Si está vacío, usar por defecto el 10.
   - Si es mayor a 15, advertir y recomendar 12.
3. Imprimir las tablas desde la del **1 hasta la N**, y desde `x1` hasta `xM`.

---

## Ejemplo de Ejecución

```
¿Hasta qué tabla quieres imprimir? 7  
¡Wow! Ya son muchas tablas 😅. Recomendamos máximo 10.

¿Hasta qué número multiplicar cada tabla? (Por defecto 10): 12

Tabla del 1
1 x 1 = 1
1 x 2 = 2
...
1 x 12 = 12
--------------------------
Tabla del 2
2 x 1 = 2
...
Tabla del 7
7 x 1 = 7
...
7 x 12 = 84
```

---

## Puntos Extra 🔥

- ✅ Validar que los valores ingresados sean números positivos.
- ✅ Permitir que el usuario deje en blanco el segundo input (se asume 10).
- ✅ Mostrar advertencias con emojis si se exceden los rangos recomendados.
- ✅ Separar la lógica de impresión en un método `imprimirTabla(int base, int hasta)`.

---

## Bonus Avanzado 🚀

- Formatear la salida en columnas con padding para que las tablas queden alineadas.
- Permitir ejecutar nuevamente el programa tras terminar (¿Deseas volver a generar tablas?).
- Mostrar todas las tablas en un solo bloque con encabezados y separadores estéticos.

---

## ¿Qué se evalúa?

- Uso de bucles anidados.
- Validación de entrada del usuario.
- Claridad y limpieza en la salida por consola.
- Modularización con métodos.

---

¡Multiplica tu práctica con estilo! ✨🧠