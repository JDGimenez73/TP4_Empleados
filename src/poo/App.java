package poo;

public class App {
    public static void main(String[] args) {
        // Crear empleados con ambos constructores
        Empleado e1 = new Empleado(100, "Ana Pérez", "Desarrolladora", 120000);
        Empleado e2 = new Empleado("Luis Gómez", "QA");
        Empleado e3 = new Empleado("María Ruiz", "Soporte");

        // Probar actualizaciones de salario
        e1.actualizarSalario(5000.0);  // suma fija
        e2.actualizarSalario(10);      // porcentaje
        e3.actualizarSalario(15);      // porcentaje
        e3.actualizarSalario(2000.0);  // suma fija

        // Imprimir resultados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
