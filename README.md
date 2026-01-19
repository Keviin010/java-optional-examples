# Java Optional Examples

Este repositorio contiene ejemplos prácticos del uso de la clase `Optional` en Java, enfocados en escribir código más seguro, legible y libre de `NullPointerException`.

El objetivo es comprender cuándo y cómo usar Optional correctamente, siguiendo buenas prácticas de Java moderno.

---

## ¿Qué es Optional?

`Optional<T>` es una clase introducida en Java 8 que representa un valor que puede estar presente o ausente.  
Ayuda a evitar errores comunes relacionados con valores `null` y promueve un estilo de programación más expresivo.

---

## Contenido

En este repositorio encontrarás ejemplos de:

- Creación de Optional  
  - `Optional.of()`  
  - `Optional.ofNullable()`  
  - `Optional.empty()`
- Métodos más utilizados  
  - `isPresent()`  
  - `ifPresent()`  
  - `orElse()`  
  - `orElseGet()`  
  - `orElseThrow()`
- Uso de `map()` y `flatMap()`
- Buenas prácticas
- Casos de uso comunes
- Errores frecuentes al usar Optional

---

## Tecnologías

- Java 8 o superior
- Programación Orientada a Objetos
- Java Standard Library

---

## Buenas prácticas aplicadas

- Evitar retornos `null`
- Código más legible y mantenible
- Uso de Optional principalmente como valor de retorno
- Enfoque en código limpio y seguro

---

## Nota importante

Optional no reemplaza completamente a `null`.  
Su uso recomendado es principalmente en:
- Valores de retorno
- Representar ausencia de valor de forma explícita

No se recomienda usar Optional en:
- Atributos de clases
- Parámetros de métodos

---

## Autor

Kevin Royo  


---

Si este repositorio te resulta útil, puedes dejar una estrella.
