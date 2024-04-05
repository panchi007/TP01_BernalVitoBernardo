package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Por favor, ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número ingresado es par o impar
        if (numero % 2 != 0) {
            // Si el número es impar, mostrar el doble del número
            System.out.println("El número ingresado es impar. El doble del número es: " + (numero * 2));
        } else {
            // Si el número es par, mostrar el triple del número
            System.out.println("El número ingresado es par. El triple del número es: " + (numero * 3));
        }

        // Cerrar el objeto Scanner
        scanner.close();
		
	}

}
