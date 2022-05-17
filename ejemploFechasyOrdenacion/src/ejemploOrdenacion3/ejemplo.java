package ejemploOrdenacion3;

import java.util.ArrayList;
import java.util.Collections;

public class ejemplo {

	public static void main(String[] args) {
		ArrayList<Persona> personas=new ArrayList<Persona>();
		
		personas.add(new Persona("11111111A", "Jose", "Perez Garcia"));
		personas.add(new Persona("33333333c", "Jose", "Garcia Perez"));
		personas.add(new Persona("22222222B", "Alberto", "Perez Garcia"));
		personas.add(new Persona("44444444D", "Alberto", "Garcia Perez"));
		
		System.out.println("PERSONAS SIN ORDENAR:");
		for (int i = 0; i < personas.size(); i++) System.out.println(personas.get(i));
		
		// Ordenar en base al nombre; y en caso de tener el mismo nombre ordenar por apellido
		Collections.sort(personas);
		
		System.out.println("PERSONAS ORDENADAS:");
		for (int i = 0; i < personas.size(); i++) System.out.println(personas.get(i));

	}

}
