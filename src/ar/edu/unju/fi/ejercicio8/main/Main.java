package ar.edu.unju.fi.ejercicio8.main;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el valor de n
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        
        // Construir un objeto de la clase CalculadoraEspecial
        CalculadoraEspecial calculadora = new CalculadoraEspecial(n);
        
        // Calcular y mostrar la sumatoria
        double sumatoria = calculadora.calcularSumatoria();
        System.out.println("La sumatoria es: " + sumatoria);
        
        // Calcular y mostrar la productoria
        double productoria = calculadora.calcularProductoria();
        System.out.println("La productoria es: " + productoria);
        
        scanner.close();
    }

}
