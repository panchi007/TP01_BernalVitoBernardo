package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;
import ar.udu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        Pizza[] pizzas = new Pizza[3]; // Crear un array para almacenar los 3 objetos de Pizza

        // Solicitar al usuario que ingrese los datos para cada pizza
        for (int i = 0; i < pizzas.length; i++) {
            Pizza pizza = new Pizza();
            System.out.println("** Pizza " + (i + 1) + " **");
            System.out.print("Diámetro (20, 30, 40): ");
            int diametro = scanner.nextInt();
            pizza.setDiametro(diametro);
            System.out.print("Ingredientes especiales (true/false): ");
            boolean ingredientesEspeciales = scanner.nextBoolean();
            pizza.setIngredientesEspeciales(ingredientesEspeciales);
            scanner.nextLine(); // Consumir la nueva línea pendiente
            pizza.calcularPrecio();
            pizza.calcularArea();
            pizzas[i] = pizza;
        }

        // Mostrar los datos ingresados para cada pizza
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println("\n** Pizza " + (i + 1) + " **");
            System.out.println("Diámetro = " + pizzas[i].getDiametro());
            System.out.println("Ingredientes especiales = " + pizzas[i].isIngredientesEspeciales());
            System.out.println("Precio Pizza = $" + pizzas[i].getPrecio());
            System.out.println("Área de la pizza = " + pizzas[i].getArea());
        }

        scanner.close();
    }
		
	

}
