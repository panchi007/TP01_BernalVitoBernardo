package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero entre 0 y 10
        System.out.print("Por favor, ingrese un número entero entre 0 y 10: ");
        int numero = scanner.nextInt();

        // Verificar si el número ingresado está dentro del rango [0, 10]
        if (numero < 0 || numero > 10) {
            System.out.println("El número ingresado está fuera del rango permitido.");
        } else {
            // Calcular el factorial utilizando un bucle while
            int factorial = 1;
            int i = 1;
            while (i <= numero) {
                factorial *= i;
                i++;
            }

            // Mostrar el resultado por consola
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        // Cerrar el objeto Scanner
        scanner.close();
		
	}

}
