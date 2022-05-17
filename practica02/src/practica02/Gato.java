package practica02;

import java.util.Date;

	enum RazaGato{Comun, Siames, Persa, Angora, ScottishFold};

public class Gato extends Animal {

	private RazaGato raza;
	private String microchip;
	
	public Gato(String nombre, RazaGato raza, String fechaNacimiento, double peso, String microchip) {
		super(nombre, fechaNacimiento, peso);
		this.raza=raza;
		this.microchip=microchip;
	}

	public RazaGato getRaza() {
		return raza;
	}

	public String getMicrochip() {
		return microchip;
	}

	@Override
	public String toString() {
		return "Ficha de Gato /n" + "Nombre: " + nombre + "/n Raza: " + raza + "/n Fecha de nacimiento: " + fechaNacimiento + "/n Peso: " + peso + "/n Microchip: " + microchip ;
	}
	
	

}
