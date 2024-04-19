package ar.edu.unju.fi.ejercicion14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que ingrese un número entero en el rango [3, 10]
		int tamanoArray;
		do {
			System.out.print("Ingrese un número entero en el rango [3, 10]: ");
			tamanoArray = scanner.nextInt();
		} while (tamanoArray < 3 || tamanoArray > 10);

		// Crear un array de tipo entero con el tamaño ingresado por el usuario
		int[] array = new int[tamanoArray];

		// Solicitar al usuario que ingrese valores para el array
		int suma = 0;
		for (int i = 0; i < tamanoArray; i++) {
			System.out.print("Ingrese un número entero para la posición " + i + ": ");
			array[i] = scanner.nextInt();
			suma += array[i];
		}

		// Mostrar el valor de cada posición y la suma de todos los valores
		System.out.println("\nValores del array:");
		for (int i = 0; i < tamanoArray; i++) {
			System.out.println("Posición " + i + ": " + array[i]);
		}
		System.out.println("La suma de todos los valores es: " + suma);

		scanner.close();

	}

}
