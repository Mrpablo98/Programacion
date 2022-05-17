package practica02;

import java.util.Date;

enum EspecieReptil{Tortuga, Iguana, DragonDeComodo}

public class Reptil extends Animal {
	
	private EspecieReptil especie;
	private boolean venenoso;
	public Reptil(String nombre, String fechaNacimiento, double peso  ,EspecieReptil especie, boolean venenoso) {
		super(nombre, fechaNacimiento, peso);
		this.especie = especie;
		this.venenoso = venenoso;
	}
	public EspecieReptil getEspecie() {
		return especie;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	@Override
	public String toString() {
		return "Ficha de Reptil /n" + "Nombre: " + nombre + "/n Especie: " + especie + "/n Fecha de nacimiento: " + fechaNacimiento + "/n Peso: " + peso + "/n Venenoso: " + venenoso ;
	}
	
	

}
