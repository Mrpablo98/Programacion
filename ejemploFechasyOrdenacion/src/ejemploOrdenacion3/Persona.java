package ejemploOrdenacion3;

public class Persona implements Comparable<Persona>{

	private String DNI;
	private String nombre;
	private String apellidos;
	
	public Persona(String dNI, String nombre, String apellidos) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	@Override
	public int compareTo(Persona personaacomparar) {
		String nombre1=this.nombre;
		String nombre2=personaacomparar.getNombre();
		String apellido1=this.apellidos;
		String apellido2=personaacomparar.getApellidos();
		if (nombre1.equals(nombre2)) {
			return apellido1.compareTo(apellido2);
		}
		else {
			return nombre1.compareTo(nombre2);
		}
	}
	
	
}
