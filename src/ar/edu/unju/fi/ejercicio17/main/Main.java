package ar.edu.unju.fi.ejercicio17.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.time.LocalDate;
import ar.edu.unju.fi.ejercicio17.model.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Jugador> jugadores = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		do {

			try {

				System.out.println("----- Menú de opciones -----");
				System.out.println("1 - Alta de jugador");
				System.out.println("2 - Mostrar los datos del jugador");
				System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
				System.out.println("4 - Modificar los datos de un jugador");
				System.out.println("5 - Eliminar un jugador");
				System.out.println("6 - Mostrar la cantidad total de jugadores");
				System.out.println("7 - Mostrar la cantidad de jugadores de una nacionalidad");
				System.out.println("8 - Salir");
				System.out.print("Ingrese una opción: ");
				opcion = scanner.nextInt();

				switch (opcion) {
				case 1:
					altaJugador(jugadores, scanner);
					break;
				case 2:
					mostrarDatosJugador(jugadores, scanner);
					break;
				case 3:
					mostrarJugadoresOrdenados(jugadores);
					break;
				case 4:
					modificarDatosJugador(jugadores, scanner);
					break;
				case 5:
					eliminarJugador(jugadores, scanner);
					break;
				case 6:
					mostrarCantidadTotalJugadores(jugadores);
					break;
				case 7:
					mostrarCantidadJugadoresNacionalidad(jugadores, scanner);
					break;
				case 8:
					System.out.println("¡Hasta luego!");
					break;
				default:
					System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
					break;
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				scanner.nextLine(); // Limpiar el buffer del scanner
			}
		} while (opcion != 8);

		scanner.close();
	}

	public static void altaJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
		System.out.println("----- Alta de jugador -----");
		System.out.print("Ingrese el nombre: ");
		String nombre = scanner.next();
		System.out.print("Ingrese el apellido: ");
		String apellido = scanner.next();
		System.out.print("Ingrese la fecha de nacimiento (en formato yyyy-MM-dd): ");
		String fechaNacimientoStr = scanner.next();
		LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr); // Convertir la cadena a LocalDate
		System.out.print("Ingrese la nacionalidad: ");
		String nacionalidad = scanner.next();
		System.out.print("Ingrese la estatura: ");
		double estatura = scanner.nextDouble();
		System.out.print("Ingrese el peso: ");
		double peso = scanner.nextDouble();
		System.out.print("Ingrese la posición (delantero, medio, defensa, arquero): ");
		String posicion = scanner.next();

		Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
		jugadores.add(jugador);

		System.out.println("---Jugador agregado correctamente.---");
	}

	public static void mostrarDatosJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
		System.out.println("----- Mostrar datos del jugador -----");
		System.out.print("Ingrese el nombre: ");
		String nombre = scanner.next();
		System.out.print("Ingrese el apellido: ");
		String apellido = scanner.next();

		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
				System.out.println(jugador);
				return;
			}
		}

		System.out.println("No se encontró un jugador con ese nombre y apellido.");
	}

	public static void mostrarJugadoresOrdenados(ArrayList<Jugador> jugadores) {
		System.out.println("----- Mostrar jugadores ordenados por apellido -----");
		Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareTo(j2.getApellido()));

		for (Jugador jugador : jugadores) {
			System.out.println(jugador);
		}
	}

	public static void modificarDatosJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
		System.out.println("----- Modificar datos de un jugador -----");
		System.out.print("Ingrese el nombre: ");
		String nombre = scanner.next();
		System.out.print("Ingrese el apellido: ");
		String apellido = scanner.next();

		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
				System.out.print("Ingrese la nueva nacionalidad: ");
				String nuevaNacionalidad = scanner.next();
				jugador.setNacionalidad(nuevaNacionalidad);
				System.out.println("Datos del jugador actualizados correctamente.");
				return;
			}
		}

		System.out.println("No se encontró un jugador con ese nombre y apellido.");
	}

	public static void eliminarJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
		System.out.println("----- Eliminar un jugador -----");
		System.out.print("Ingrese el nombre: ");
		String nombre = scanner.next();
		System.out.print("Ingrese el apellido: ");
		String apellido = scanner.next();

		Iterator<Jugador> iterator = jugadores.iterator();
		while (iterator.hasNext()) {
			Jugador jugador = iterator.next();
			if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
				iterator.remove();
				System.out.println("Jugador eliminado correctamente.");
				return;
			}
		}

		System.out.println("No se encontró un jugador con ese nombre y apellido.");
	}

	public static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
		System.out.println("----- Cantidad total de jugadores -----");
		System.out.println("Cantidad total de jugadores: " + jugadores.size());
	}

	public static void mostrarCantidadJugadoresNacionalidad(ArrayList<Jugador> jugadores, Scanner scanner) {
		System.out.println("----- Cantidad de jugadores por nacionalidad -----");
		System.out.print("Ingrese la nacionalidad: ");
		String nacionalidad = scanner.next();

		int cantidad = 0;
		for (Jugador jugador : jugadores) {
			if (jugador.getNacionalidad().equals(nacionalidad)) {
				cantidad++;
			}
		}

		System.out.println("Cantidad de jugadores de la nacionalidad " + nacionalidad + ": " + cantidad);
	}
}
