package ejercicio2;
import java.time.LocalDate;
public class Diputado extends Legislador implements Comparable<Legislador> {

	public Diputado(String dni, String nombre, String apellidos, Provincia provincia, PartidoPolitico partido, LocalDate FechaElegido) {
		super(dni, nombre, apellidos, provincia, partido, FechaElegido);
	}

	@Override
	public String getCamaraEnQueTrabaja() {
		// TODO Auto-generated method stub
		return "Congreso de los diputados";
	}

	
	@Override
	public String toString() {
		return "Diputado [" + getDni() + " " + getNombre() + " " + getApellidos() + " " + getProvincia() + " " + getPartido() + " " + getFechaElegido() + "]" + "\n";
	}

	@Override
	public int compareTo(Legislador arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
