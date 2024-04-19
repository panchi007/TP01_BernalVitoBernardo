package ar.edu.unju.fi.ejercicio12.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el día de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int año = scanner.nextInt();

        // Crear objeto Persona con los datos ingresados
        Persona persona = new Persona(nombre, dia, mes, año);

        // Mostrar los datos de la persona y el resultado de cada método
        System.out.println("\nDatos de la persona:");
        System.out.println(persona.toString());

        scanner.close();

	}

}
