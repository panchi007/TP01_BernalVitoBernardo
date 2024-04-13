package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        
        // Solicitar al usuario que ingrese los datos del producto
        Producto producto = new Producto();
        System.out.println("Ingrese los datos del producto:");
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
        
        // Mostrar los datos ingresados para el producto y el resultado de calcularDescuento()
        System.out.println("\nDatos del producto:");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Descuento: " + producto.getDescuento() + "%");
        System.out.println("Precio con descuento: $" + producto.calcularDescuento());
        
        scanner.close();
    }

}
