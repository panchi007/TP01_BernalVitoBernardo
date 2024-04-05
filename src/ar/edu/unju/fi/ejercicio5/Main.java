package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero entre 1 y 9
        System.out.print("Por favor, ingrese un número entero entre 1 y 9: ");
        int numero = scanner.nextInt();

        // Verificar si el número ingresado está dentro del rango [1, 9]
        if (numero < 1 || numero > 9) {
            System.out.println("El número ingresado está fuera del rango permitido.");
        } else {
            // Mostrar la tabla de multiplicar correspondiente al número ingresado
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        // Cerrar el objeto Scanner
        scanner.close();
		
	}

}
