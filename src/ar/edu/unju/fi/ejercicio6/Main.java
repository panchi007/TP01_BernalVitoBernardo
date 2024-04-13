package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


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

  
        scanner.close();
    }
}
