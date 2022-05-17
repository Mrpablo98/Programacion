package ejercicio2;

public enum Provincia {
Acoruña("A coruña", 1119351, "Santiago de Compostela"),
Lugo("Lugo", 331327, "Lugo"),
Ourense("Ourense", 309293, "Ourense"),
Pontevedra("Pontevedra", 942665, "Pontevedra");
	
	
	private String nombre;
	private int poblacion;
	private String capital;
	
	private Provincia(String nombre, int poblacion, String capital) {
		
		this.nombre=nombre;
		this.poblacion=poblacion;
		this.capital=capital;
	}
}
