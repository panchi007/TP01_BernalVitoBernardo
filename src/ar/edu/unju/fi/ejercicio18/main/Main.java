package ar.edu.unju.fi.ejercicio18.main;

import java.util.*;

import ar.edu.unju.fi.ejercicio18.model.*;

public class Main {
	private static final Scanner scanner = new Scanner(System.in);
	private static final List<Pais> paises = Arrays.asList(new Pais("AR", "Argentina"), new Pais("BR", "Brasil"),
			new Pais("UR", "Uruguay"));
	private static final List<DestinoTuristico> destinos = new ArrayList<>();

	public static void main(String[] args) {
		int opcion;
		do {
			mostrarMenu();
			opcion = obtenerOpcion();
			switch (opcion) {
			case 1:
				altaDestinoTuristico();
				break;
			case 2:
				mostrarDestinosTuristicos();
				break;
			case 3:
				modificarPaisDestino();
				break;
			case 4:
				limpiarDestinos();
				break;
			case 5:
				eliminarDestino();
				break;
			case 6:
				mostrarDestinosOrdenados();
				break;
			case 7:
				mostrarTodosLosPaises();
				break;
			case 8:
				mostrarDestinosPorPais();
				break;
			case 9:
				System.out.println("FIN DEL PROGRAMA  ! ! !");
				break;
			default:
				System.out.println("ERROR DE OPCION");
			}
		} while (opcion != 9);
	}

	private static void mostrarMenu() {
		System.out.println("\n 1- Alta Destino Turistico -");
		System.out.println(" 2- Mostrar todos los Destinos turisticos -");
		System.out.println(" 3- Modificar el pais de un destino turistico -");
		System.out.println(" 4- Limpiar Arraylist de destino turisticos -");
		System.out.println(" 5- Eliminar un destino turistico -");
		System.out.println(" 6- Mostrar Destinos Turisticos Ordenados -");
		System.out.println(" 7- Mostrar todos los Paises -");
		System.out.println(" 8- Destinos turisticos de un Pais ");
		System.out.println(" 9- Salir ...");
		System.out.println(" \n Ingrese opcion !");
	}

	private static int obtenerOpcion() {
		return scanner.nextInt();
	}

	private static void altaDestinoTuristico() {
		scanner.nextLine(); // Limpiar buffer
		System.out.println("---- ALTA DESTINO TURISTICO ---- :");
		String codigo = obtenerString("Ingrese codigo del destino turistico:");
		String nombre = obtenerString("Ingrese nombre del destino turistico:");
		float precio = obtenerFloat("Ingrese precio:");
		Pais pais = obtenerPais("Ingrese codigo del pais (AR para Argentina, BR para Brasil, UR Uruguay):");
		int dias = obtenerInt("Ingrese cantidad de dias:");
		destinos.add(new DestinoTuristico(codigo, nombre, precio, pais, dias));
		System.out.println("Destino agregado con éxito !");
	}

	private static void mostrarDestinosTuristicos() {
		System.out.println("---- DESTINOS TURISTICOS ----");
		for (DestinoTuristico destino : destinos) {
			System.out.println(" DESTINO TURISTICO : " + destino.getNombre());
		}
	}

	private static void modificarPaisDestino() {
		System.out.println("MODIFICAR EL PAIS DE UN DESTINO TURISTICO");
		String codigo = obtenerString("Ingrese codigo del destino turistico:");
		DestinoTuristico destino = buscarDestinoPorCodigo(codigo);
		if (destino != null) {
			Pais nuevoPais = obtenerPais("Ingrese nuevo codigo del pais (AR para Argentina, BR para Brasil, UR Uruguay):");
			destino.setPais(nuevoPais);
			System.out.println("INFORMACION MODIFICADA CON ÉXITO !");
		} else {
			System.out.println("No se encontró el destino turístico.");
		}
	}

	private static void limpiarDestinos() {
		System.out.println("LIMPIAR EL ARRAY DE DESTINOS TURISTICOS :");
		destinos.clear();
	}

	private static void eliminarDestino() {
		System.out.println("ELIMINAR UN DESTINO TURISTICO");
		String codigo = obtenerString("Ingrese codigo del destino turistico:");
		DestinoTuristico destino = buscarDestinoPorCodigo(codigo);
		if (destino != null) {
			destinos.remove(destino);
			System.out.println("SE ELIMINÓ EXITOSAMENTE");
		} else {
			System.out.println("No se encontró el destino turístico.");
		}
	}

	private static void mostrarDestinosOrdenados() {
		System.out.println("DESTINOS TURISTICOS ORDENADOS POR NOMBRE ");
		destinos.stream().sorted(Comparator.comparing(DestinoTuristico::getNombre))
				.forEach(destino -> System.out.println("Destino Turistico : " + destino.getNombre()));
	}

	private static void mostrarTodosLosPaises() {
		System.out.println("TODOS LOS PAISES ");
		for (Pais pais : paises) {
			System.out.println("PAIS : " + pais.getNombre() + " CODIGO : " + pais.getCodigo());
		}
	}

	private static void mostrarDestinosPorPais() {
		System.out.println("DESTINOS TURISTICOS DE UN PAIS ");
		String codigo = obtenerString("Ingrese codigo del pais:");
		for (DestinoTuristico destino : destinos) {
			if (codigo.equals(destino.getPais().getCodigo())) {
				System.out.println("Pais : " + destino.getPais().getNombre() + " Destino : " + destino.getNombre());
			}
		}
	}

	private static String obtenerString(String mensaje) {
		System.out.println(mensaje);
		return scanner.nextLine();
	}

	private static float obtenerFloat(String mensaje) {
		float valor = 0;
		boolean validado = false;
		do {
			System.out.println(mensaje);
			try {
				valor = scanner.nextFloat();
				validado = true;
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un valor válido.");
				scanner.nextLine(); // Limpiar buffer
			}
		} while (!validado);
		scanner.nextLine(); // Limpiar buffer
		return valor;
	}

	private static int obtenerInt(String mensaje) {
		int valor = 0;
		boolean validado = false;
		do {
			System.out.println(mensaje);
			try {
				valor = scanner.nextInt();
				validado = true;
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un valor válido.");
				scanner.nextLine(); // Limpiar buffer
			}
		} while (!validado);
		scanner.nextLine(); // Limpiar buffer
		return valor;
	}

	private static Pais obtenerPais(String mensaje) {
		Pais pais = null;
		boolean encontrado = false;
		do {
			String codigo = obtenerString(mensaje);
			for (Pais p : paises) {
				if (p.getCodigo().equalsIgnoreCase(codigo)) {
					pais = p;
					encontrado = true;
					break;
				}
			}
			if (!encontrado) {
				System.out.println("Código de país no válido. Intente nuevamente.");
			}
		} while (!encontrado);
		return pais;
	}

	private static DestinoTuristico buscarDestinoPorCodigo(String codigo) {
		for (DestinoTuristico destino : destinos) {
			if (codigo.equals(destino.getCodigo())) {
				return destino;
			}
		}
		return null;
	}
}
