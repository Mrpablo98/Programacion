package practica02;

import java.util.Date;

abstract public class Animal {
	
	protected String nombre;
	protected String fechaNacimiento;
	protected double peso;
	protected String comentarios;
	
	
	
	
	public Animal(String nombre2, String fechaNacimiento2, double peso2) {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public  String toString() {
		return "Animal [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", peso=" + peso + ", comentarios="
				+ comentarios + "]";
	}
	
	

}
