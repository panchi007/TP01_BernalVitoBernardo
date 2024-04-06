package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.model.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        // Solicitar datos para un nuevo empleado
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el legajo del empleado:");
        int legajo = scanner.nextInt();
        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();

        // Crear objeto Empleado utilizando el constructor parametrizado
        Empleado empleado = new Empleado(nombre, legajo, salario);

        // Mostrar datos del empleado
        System.out.println("\nDatos del empleado:");
        empleado.mostrarDatos();

        // Dar aumento al salario
        empleado.darAumento();

        // Mostrar datos del empleado después del aumento
        System.out.println("\nDatos del empleado después del aumento:");
        empleado.mostrarDatos();

        scanner.close();
	
	}

}
