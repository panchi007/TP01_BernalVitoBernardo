package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Construcción de un objeto utilizando el constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Ingrese DNI:");
        String dni1 = scanner.nextLine();
        System.out.println("Ingrese nombre:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento1 = LocalDate.parse(scanner.nextLine());
        persona1.setDni(dni1);
        persona1.setNombre(nombre1);
        persona1.setFechaNacimiento(fechaNacimiento1);
        persona1.mostrarDatos();
        System.out.println();

        // Construcción de un objeto utilizando el constructor parametrizado
        System.out.println("Ingrese DNI:");
        String dni2 = scanner.nextLine();
        System.out.println("Ingrese nombre:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento2 = LocalDate.parse(scanner.nextLine());
        System.out.println("Ingrese provincia:");
        String provincia2 = scanner.nextLine();
        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);
        persona2.mostrarDatos();
        System.out.println();

        // Construcción de un objeto utilizando el constructor que inicialice solo los atributos dni, nombre y fecha de nacimiento
        System.out.println("Ingrese DNI:");
        String dni3 = scanner.nextLine();
        System.out.println("Ingrese nombre:");
        String nombre3 = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento3 = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);
        persona3.mostrarDatos();
        System.out.println();

        // Cerrar el Scanner después de haber terminado de leer todas las entradas del usuario
        scanner.close();
    }
}
