# Trabajo Práctico N°4 – Programación Orientada a Objetos II

## 📌 Descripción
Este proyecto implementa un sistema simple de gestión de empleados en Java, aplicando los conceptos de Programación Orientada a Objetos (POO):
- Uso de `this`
- Constructores sobrecargados
- Métodos sobrecargados
- Encapsulamiento
- Atributos y métodos estáticos
- Representación de objetos con `toString()`

Se incluye además una clase `App` con el método `main` para probar la clase `Empleado`.

---

## 🏗️ Estructura del proyecto
TP4_Empleados/
├── src/

│ └── poo/

│ ├── Empleado.java # Clase principal con lógica del modelo

│ └── App.java # Clase de prueba (método main)

└── README.md

**
---

## 📚 Clases principales

### `Empleado`
- Atributos:
  - `id`, `nombre`, `puesto`, `salario`
  - `totalEmpleados` y `nextId` (estáticos)
- Constructores:
  - Completo (recibe todos los parámetros)
  - Automático (solo nombre y puesto, asigna id y salario por defecto)
- Métodos sobrecargados:
  - `actualizarSalario(int porcentaje)`
  - `actualizarSalario(double monto)`
- `toString()`: representación legible
- `mostrarTotalEmpleados()`: método estático

### `App`
- Clase de prueba con `main`
- Instancia varios empleados
- Actualiza salarios usando ambos métodos
- Imprime el estado de los objetos y el total de empleados

---

## ▶️ Ejecución
### Con NetBeans
1. Abrir el proyecto en NetBeans.
2. Clic derecho en `App.java` → **Run File**.

### Con consola
```bash
javac poo/Empleado.java poo/App.java
java poo.App
**
Empleado{id=100, nombre='Ana Pérez', puesto='Desarrolladora', salario=125000.0}
Empleado{id=101, nombre='Luis Gómez', puesto='QA', salario=110000.0}
Empleado{id=102, nombre='María Ruiz', puesto='Soporte', salario=117000.0}
Total de empleados: 3

+-------------------+
|     Empleado      |
+-------------------+
| - id: int         |
| - nombre: String  |
| - puesto: String  |
| - salario: double |
|-------------------|
| - totalEmpleados: int (static) |
| - nextId: int (static)         |
+-------------------+
| + Empleado(...)   |
| + actualizarSalario(...)       |
| + toString()                   |
| + mostrarTotalEmpleados()      |
+-------------------+

App -----> Empleado

