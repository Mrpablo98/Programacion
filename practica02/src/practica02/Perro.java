package practica02;

import java.util.Date;

enum RazaPerro{ PastorAleman, Husky, FoxTerrier, Dalmata, SanBernardo};

public class Perro extends Animal {

	private RazaPerro raza;
	private String microchip;
	
	
	
	
public Perro(String nombre, RazaPerro raza, String fechaNacimiento, double peso, String microchip){
		
		super(nombre,fechaNacimiento, peso);
		this.raza=raza;
		this.microchip=microchip;
		
		
	
		
	}
	
	
	
	
	public RazaPerro getRaza() {
		return raza;
	}
	public String getMicrochip() {
		return microchip;
	}




	@Override
	public String toString() {
		return "Ficha de Perro /n" + "Nombre: " + nombre + "/n Raza: " + raza + "/n Fecha de nacimiento: " + fechaNacimiento + "/n Peso: " + peso + "/n Microchip: " + microchip ;
	}
	
	
	
	
	
	
}
