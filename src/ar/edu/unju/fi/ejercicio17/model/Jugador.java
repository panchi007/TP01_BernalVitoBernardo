package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private String posicion;

	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, double estatura,
			double peso, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		int edad = fechaActual.getYear() - fechaNacimiento.getYear();
		if (fechaActual.getMonthValue() < fechaNacimiento.getMonthValue()
				|| (fechaActual.getMonthValue() == fechaNacimiento.getMonthValue()
						&& fechaActual.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
			edad--;
		}
		return edad;
	}

	// Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
}