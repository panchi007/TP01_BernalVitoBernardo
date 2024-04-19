package ar.edu.unju.fi.ejercicion13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        // Crear un array de 8 elementos para almacenar números enteros
        int[] numeros = new int[8];

        // Pedir al usuario que ingrese los valores para el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar por consola el índice y el valor almacenado en esa posición
        System.out.println("\nElementos del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice: " + i + ", Valor: " + numeros[i]);
        }

        scanner.close();
		
	}

}
