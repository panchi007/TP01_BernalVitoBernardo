package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;

	public Persona(String nombre, int dia, int mes, int año) {
		this.nombre = nombre;
		this.fechaNacimiento = new GregorianCalendar(año, mes - 1, dia); // mes - 1 porque en Calendar enero es 0
	}

	public int calcularEdad() {
		Calendar fechaActual = Calendar.getInstance();
		int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
		if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
			edad--;
		}
		return edad;
	}

	public String obtenerSignoZodiaco() {
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Sumamos 1 porque enero es 0
		String signo = "";
		if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
			signo = "Aries";
		} else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
			signo = "Tauro";
		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 21)) {
			signo = "Géminis";
		} else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
			signo = "Cáncer";
		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
			signo = "Leo";
		} else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23)) {
			signo = "Virgo";
		} else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 23)) {
			signo = "Libra";
		} else if ((mes == 10 && dia >= 24) || (mes == 11 && dia <= 22)) {
			signo = "Escorpio";
		} else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)) {
			signo = "Sagitario";
		} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
			signo = "Capricornio";
		} else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
			signo = "Acuario";
		} else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
			signo = "Piscis";
		}
		return signo;
	}

	public String obtenerEstacion() {
		int mes = fechaNacimiento.get(Calendar.MONTH) + 1; // Sumamos 1 porque enero es 0
		String estacion = "";
		switch (mes) {
		case 1:
		case 2:
			estacion = "Verano";
			break;
		case 3:
			if (fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 20) {
				estacion = "Verano";
			} else {
				estacion = "Otoño";
			}
			break;
		case 4:
		case 5:
			estacion = "Otoño";
			break;
		case 6:
			if (fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21) {
				estacion = "Otoño";
			} else {
				estacion = "Invierno";
			}
			break;
		case 7:
		case 8:
			estacion = "Invierno";
			break;
		case 9:
			if (fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 22) {
				estacion = "Invierno";
			} else {
				estacion = "Primavera";
			}
			break;
		case 10:
		case 11:
			estacion = "Primavera";
			break;
		case 12:
			if (fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21) {
				estacion = "Primavera";
			} else {
				estacion = "Verano";
			}
			break;
		}
		return estacion;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\n" + "Fecha de nacimiento: " + fechaNacimiento.get(Calendar.DAY_OF_MONTH) + "/"
				+ (fechaNacimiento.get(Calendar.MONTH) + 1) + "/" + fechaNacimiento.get(Calendar.YEAR) + "\n" + "Edad: "
				+ calcularEdad() + " años" + "\n" + "Signo del zodiaco: " + obtenerSignoZodiaco() + "\n" + "Estación: "
				+ obtenerEstacion();
	}
}