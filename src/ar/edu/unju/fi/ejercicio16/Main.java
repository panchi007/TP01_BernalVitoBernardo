package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Definir y crear un array para almacenar 5 elementos de tipo String
		String[] nombres = new String[5];

		// Pedir al usuario que ingrese nombres de personas y almacenarlos en el array
		// usando un bucle for
		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Ingrese el nombre de la persona para la posición " + i + ": ");
			nombres[i] = scanner.nextLine();
		}

		// Mostrar los valores guardados en el array usando un bucle while
		System.out.println("\nValores guardados en el array:");
		int j = 0;
		while (j < nombres.length) {
			System.out.println("Posición " + j + ": " + nombres[j]);
			j++;
		}

		// Mostrar el tamaño del array usando la propiedad length
		System.out.println("\nTamaño del array: " + nombres.length);

		// Solicitar al usuario que ingrese el índice de un elemento a eliminar del
		// arreglo
		byte indice;
		do {
			System.out.print("\nIngrese el índice de un elemento a eliminar (0-" + (nombres.length - 1) + "): ");
			indice = scanner.nextByte();
		} while (indice < 0 || indice >= nombres.length);

		// Eliminar el elemento del arreglo y realizar desplazamientos si es necesario
		for (int i = (int) indice; i < nombres.length - 1; i++) {
			nombres[i] = nombres[i + 1];
		}
		nombres[nombres.length - 1] = null; // Asignar null al último elemento para eliminarlo

		// Mostrar nuevamente el arreglo actualizado
		System.out.println("\nValores del array después de eliminar el elemento:");
		int k = 0;
		while (k < nombres.length) {
			System.out.println("Posición " + k + ": " + (nombres[k] != null ? nombres[k] : "[Espacio en blanco]"));
			k++;
		}

		scanner.close();

	}

}
