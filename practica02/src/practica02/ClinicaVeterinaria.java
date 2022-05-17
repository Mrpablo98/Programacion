package practica02;

import java.util.ArrayList;

public class ClinicaVeterinaria {

	private ArrayList<Animal> animales;
	
	public ClinicaVeterinaria() {
		
		ArrayList<Animal>animales=new ArrayList<Animal>();
		
	}
	public void InsertaAnimal(Animal animal) {
		animales.add(animal);
	}
	
	public Animal BuscaAnimal(String nombre) {
		
		for(int i=0;i<animales.size();i++) {
			if(nombre==animales.get(i).getNombre()) {
				return animales.get(i);
			}
		}return null;
		
	}
	
	public void ModificaComentarioAnimal(String nombre, String comentario) {
		
		for(int i=0;i<animales.size();i++) {
			if(nombre==animales.get(i).getNombre()) {
				animales.get(i).comentarios=comentario;
			}
			
		}
		
	}
	@Override
	public String toString() {
		return "ClinicaVeterinaria [animales=" + animales + "]";
	}
	
	
}
