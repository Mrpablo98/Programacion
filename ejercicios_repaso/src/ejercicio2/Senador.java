package ejercicio2;

import java.time.LocalDate;
public class Senador extends Legislador implements Comparable<Legislador>{

	public Senador(String dni, String nombre, String apellidos, Provincia provincia, PartidoPolitico partido, LocalDate FechaElegido) {
		super(dni, nombre, apellidos, provincia, partido, FechaElegido);
	}


	@Override
	public String getCamaraEnQueTrabaja() {
		// TODO Auto-generated method stub
		return "Senado";
	}
	@Override
	public String toString() {
		return "Senador [" + getDni() + " " +  getNombre() + " " + getApellidos() + " " + getProvincia() + " " + getPartido() + " " + getFechaElegido() + "]" + "\n";
	}


	@Override
	public int compareTo(Legislador legislador) {
		// TODO Auto-generated method stub
		return 0;
	}


}

