package ejercicio1;
import java.util.*;

public class Libreria {

	private ArrayList<Libro> libreria=new ArrayList<Libro>();
	Scanner entrada=new Scanner(System.in);
	String pregunta;
	public Libreria() {
		
		ArrayList<Libro> libreria=new ArrayList<Libro>();
	}
	
	public void AnhadirLibro(Libro libro) {
		
		if(libreria.size()<50) {
		this.libreria.add(libro);
		}else {
			System.out.println("La base de datos no admite m�s de 50 libros");
		}
	}
	public void EliminarLibro(String titulo) {
		if(libreria.size()==0) {
			System.out.println("La base de datos esta vacia, no se pueden borrar datos");
		}else {
			for(int i=0;i<libreria.size();i++) {
				if(titulo.equalsIgnoreCase(libreria.get(i).getTitulo())) {
					libreria.remove(i);
				}
			}
		}
		
	}
	public void MostrarLibro(String titulo) {
		for(int i=0; i<libreria.size();i++) {
			if(titulo.equalsIgnoreCase(libreria.get(i).getTitulo())) {
				System.out.println(libreria.get(i));
			}else {
				System.out.println("No se ha podido encontrar el libro, vuelva a intentarlo");
			}
			
		}
	}
	
}
