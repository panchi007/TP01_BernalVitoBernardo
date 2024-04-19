package ar.edu.unju.fi.ejercicion15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese un número entero en el rango [5, 10]
		int tamanoArray;
		do {
			System.out.print("Ingrese un número entero en el rango [5, 10]: ");
			tamanoArray = scanner.nextInt();
		} while (tamanoArray < 5 || tamanoArray > 10);

		// Crear un array de tipo String con el tamaño ingresado por el usuario
		String[] nombres = new String[tamanoArray];

		// Solicitar al usuario que ingrese nombres de personas para el array
		for (int i = 0; i < tamanoArray; i++) {
			System.out.print("Ingrese el nombre de la persona para la posición " + i + ": ");
			scanner.nextLine(); // Consumir la nueva línea pendiente
			nombres[i] = scanner.nextLine();
		}

		// Mostrar el valor de cada posición empezando desde el primer índice
		System.out.println("\nContenido del array (comenzando desde el primer índice):");
		for (int i = 0; i < tamanoArray; i++) {
			System.out.println("Posición " + i + ": " + nombres[i]);
		}

		// Mostrar el contenido del array empezando desde la última posición
		System.out.println("\nContenido del array (comenzando desde la última posición):");
		for (int i = tamanoArray - 1; i >= 0; i--) {
			System.out.println("Posición " + i + ": " + nombres[i]);
		}

		scanner.close();

	}

}
