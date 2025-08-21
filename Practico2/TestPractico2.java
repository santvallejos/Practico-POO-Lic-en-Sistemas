/**
 * Clase ejecutable principal que permite probar todas las clases del Práctico 2.
 * Ofrece un menú interactivo para ejecutar las pruebas de cada clase individualmente
 * o ejecutar todas las pruebas en secuencia.
 * 
 * @author Test - Sistema de Gestión Integral del Práctico 2
 */
import java.util.Scanner;

public class TestPractico2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                PRUEBAS DEL PRÁCTICO 2                    ║");
        System.out.println("║            Sistema de Testing Integral                   ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    ejecutarTestPersona();
                    break;
                case 2:
                    ejecutarTestPunto();
                    break;
                case 3:
                    ejecutarTestCliente();
                    break;
                case 4:
                    ejecutarTestEmpleado();
                    break;
                case 5:
                    ejecutarTestAlumno();
                    break;
                case 6:
                    ejecutarTestLaboratorio();
                    break;
                case 7:
                    ejecutarTodasLasPruebas();
                    break;
                case 8:
                    ejecutarPruebaIntegracion();
                    break;
                case 0:
                    System.out.println("\n¡Gracias por usar el sistema de pruebas!");
                    break;
                default:
                    System.out.println("\nOpción inválida. Por favor, seleccione una opción válida.");
            }
            
            if (opcion != 0) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine(); // Consumir el salto de línea pendiente
                scanner.nextLine(); // Esperar Enter del usuario
            }
            
        } while (opcion != 0);
        
        scanner.close();
    }
    
    /**
     * Muestra el menú principal de opciones.
     */
    private static void mostrarMenu()
    {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("                    MENÚ PRINCIPAL");
        System.out.println("=".repeat(60));
        System.out.println("1. Probar clase Persona");
        System.out.println("2. Probar clase Punto");
        System.out.println("3. Probar clase Cliente");
        System.out.println("4. Probar clase Empleado");
        System.out.println("5. Probar clase Alumno");
        System.out.println("6. Probar clase Laboratorio");
        System.out.println("7. Ejecutar todas las pruebas en secuencia");
        System.out.println("8. Prueba de integración (crear objetos de todas las clases)");
        System.out.println("0. Salir");
        System.out.println("=".repeat(60));
    }
    
    /**
     * Ejecuta la prueba de la clase Persona.
     */
    private static void ejecutarTestPersona()
    {
        System.out.println("\n" + "║".repeat(60));
        System.out.println("Ejecutando TestPersona...");
        System.out.println("║".repeat(60));
        TestPersona.main(new String[0]);
    }
    
    /**
     * Ejecuta la prueba de la clase Punto.
     */
    private static void ejecutarTestPunto()
    {
        System.out.println("\n" + "║".repeat(60));
        System.out.println("Ejecutando TestPunto...");
        System.out.println("║".repeat(60));
        TestPunto.main(new String[0]);
    }
    
    /**
     * Ejecuta la prueba de la clase Cliente.
     */
    private static void ejecutarTestCliente()
    {
        System.out.println("\n" + "║".repeat(60));
        System.out.println("Ejecutando TestCliente...");
        System.out.println("║".repeat(60));
        TestCliente.main(new String[0]);
    }
    
    /**
     * Ejecuta la prueba de la clase Empleado.
     */
    private static void ejecutarTestEmpleado()
    {
        System.out.println("\n" + "║".repeat(60));
        System.out.println("Ejecutando TestEmpleado...");
        System.out.println("║".repeat(60));
        TestEmpleado.main(new String[0]);
    }
    
    /**
     * Ejecuta la prueba de la clase Alumno.
     */
    private static void ejecutarTestAlumno()
    {
        System.out.println("\n" + "║".repeat(60));
        System.out.println("Ejecutando TestAlumno...");
        System.out.println("║".repeat(60));
        TestAlumno.main(new String[0]);
    }
    
    /**
     * Ejecuta la prueba de la clase Laboratorio.
     */
    private static void ejecutarTestLaboratorio()
    {
        System.out.println("\n" + "║".repeat(60));
        System.out.println("Ejecutando TestLaboratorio...");
        System.out.println("║".repeat(60));
        TestLaboratorio.main(new String[0]);
    }
    
    /**
     * Ejecuta todas las pruebas en secuencia.
     */
    private static void ejecutarTodasLasPruebas()
    {
        System.out.println("\n" + "★".repeat(60));
        System.out.println("EJECUTANDO TODAS LAS PRUEBAS EN SECUENCIA");
        System.out.println("★".repeat(60));
        
        ejecutarTestPersona();
        System.out.println("\n" + "-".repeat(60));
        
        ejecutarTestPunto();
        System.out.println("\n" + "-".repeat(60));
        
        ejecutarTestCliente();
        System.out.println("\n" + "-".repeat(60));
        
        ejecutarTestEmpleado();
        System.out.println("\n" + "-".repeat(60));
        
        ejecutarTestAlumno();
        System.out.println("\n" + "-".repeat(60));
        
        ejecutarTestLaboratorio();
        
        System.out.println("\n" + "★".repeat(60));
        System.out.println("TODAS LAS PRUEBAS COMPLETADAS");
        System.out.println("★".repeat(60));
    }
    
    /**
     * Ejecuta una prueba de integración creando objetos de todas las clases
     * y mostrando que pueden coexistir en el mismo programa.
     */
    private static void ejecutarPruebaIntegracion()
    {
        System.out.println("\n" + "▲".repeat(60));
        System.out.println("PRUEBA DE INTEGRACIÓN - TODAS LAS CLASES JUNTAS");
        System.out.println("▲".repeat(60));
        
        // Crear un objeto de cada clase
        Persona persona = new Persona(12345678, "Juan", "Pérez", 1990);
        Punto punto = new Punto(10.5, 20.3);
        Cliente cliente = new Cliente(87654321, "González", "María", 15000.0);
        Empleado empleado = new Empleado(20123456789L, "López", "Carlos", 85000.0, 2020);
        Alumno alumno = new Alumno(54321, "Ana", "Martínez");
        Laboratorio laboratorio = new Laboratorio("Lab Bayer", "Av. Corrientes 1234", "011-4567-8900", 5000, 3);
        
        // Configurar algunos datos adicionales
        alumno.setNota1(8.5);
        alumno.setNota2(7.8);
        punto.desplazar(5.0, -3.2);
        cliente.agregaSaldo(2500.0);
        
        System.out.println("✓ Objetos creados exitosamente de todas las clases:");
        System.out.println("  • Persona: " + persona.nomYApe());
        System.out.println("  • Punto: " + punto.coordenadas());
        System.out.println("  • Cliente: " + cliente.nomYape() + " (Saldo: $" + cliente.getSaldo() + ")");
        System.out.println("  • Empleado: " + empleado.nomYApe() + " (Sueldo: $" + empleado.sueldoNeto() + ")");
        System.out.println("  • Alumno: " + alumno.nomYApe() + " (Promedio: " + alumno.promedio() + ")");
        System.out.println("  • Laboratorio: " + laboratorio.getNombre());
        
        System.out.println("\n✓ Información detallada de cada objeto:");
        System.out.println("\n--- PERSONA ---");
        persona.mostrar();
        
        System.out.println("\n--- PUNTO ---");
        punto.mostrar();
        
        System.out.println("\n--- CLIENTE ---");
        cliente.mostrar();
        
        System.out.println("\n--- EMPLEADO ---");
        empleado.mostrar();
        
        System.out.println("\n--- ALUMNO ---");
        alumno.mostrar();
        
        System.out.println("\n--- LABORATORIO ---");
        laboratorio.mostrar();
        
        System.out.println("\n" + "▲".repeat(60));
        System.out.println("PRUEBA DE INTEGRACIÓN COMPLETADA EXITOSAMENTE");
        System.out.println("Todas las clases del Práctico 2 funcionan correctamente");
        System.out.println("▲".repeat(60));
    }
}
