package practica02;

import java.util.Date;

	enum EspeciePajaro {Canario, Periquito, Agapornis };

public class Pajaro extends Animal {

	private EspeciePajaro especie;
	private boolean cantor;
	
	
	public Pajaro(String nombre, String fechaNacimiento, double peso, EspeciePajaro especie, boolean cantor ) {
		super(nombre, fechaNacimiento, peso);
		this.especie=especie;
		this.cantor=cantor;
	}


	public EspeciePajaro getEspecie() {
		return especie;
	}


	public boolean isCantor() {
		return cantor;
	}


	@Override
	public String toString() {
		return "Ficha de Pájaro /n" + "Nombre: " + nombre + "/n Especie: " + especie + "/n Fecha de nacimiento: " + fechaNacimiento + "/n Peso: " + peso + "/n Cantor: " + cantor ;
	}

	
	
}

