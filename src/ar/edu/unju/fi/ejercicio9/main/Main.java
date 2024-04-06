package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        Producto[] productos = new Producto[3]; // Crear un array para almacenar los 3 productos
        
        // Solicitar al usuario que ingrese los datos de cada producto
        for (int i = 0; i < productos.length; i++) {
            Producto producto = new Producto();
            System.out.println("Ingrese los datos del producto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            producto.setNombre(scanner.nextLine());
            System.out.print("Código: ");
            producto.setCodigo(scanner.nextLine());
            System.out.print("Precio: ");
            producto.setPrecio(scanner.nextDouble());
            scanner.nextLine(); // Consumir la nueva línea pendiente
            System.out.print("Descuento (0-50): ");
            producto.setDescuento(scanner.nextInt());
            scanner.nextLine(); // Consumir la nueva línea pendiente
            productos[i] = producto;
        }
        
        // Mostrar los datos ingresados para cada producto y el resultado de calcularDescuento()
        for (Producto producto : productos) {
            System.out.println("\nDatos del producto:");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: $" + producto.calcularDescuento());
        }
        
        scanner.close();
    
		
	}

}
