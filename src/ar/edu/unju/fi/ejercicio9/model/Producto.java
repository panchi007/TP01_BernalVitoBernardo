package ar.edu.unju.fi.ejercicio9.model;

public class Producto {

	 private String nombre;
	    private String codigo;
	    private double precio;
	    private int descuento;

	    public Producto() {
	        // Constructor por defecto
	    }

	    // Getters y setters
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(String codigo) {
	        this.codigo = codigo;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    public int getDescuento() {
	        return descuento;
	    }

	    public void setDescuento(int descuento) {
	        this.descuento = descuento;
	    }

	    // Método para calcular el descuento
	    public double calcularDescuento() {
	        double precioConDescuento = precio;
	        if (descuento > 0 && descuento <= 50) {
	            precioConDescuento = precio - (precio * descuento / 100);
	        }
	        return precioConDescuento;
	    }
	
}
