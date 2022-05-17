package ejercicio1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int menu;
		Libreria libreria=new Libreria();
		boolean salir=false;
		String autor;
		String titulo;
		int n_paginas;
		String pregunta;
		tema tema=null;
		estado estado=null;
		formato formato=null;
		
		while(salir==false) {
			
			System.out.println("Escoge la accion a realizar:");
			System.out.println("\n 1. Añadir un libro");
			System.out.println("\n 2. Eliminar un libro");
			System.out.println("\n 3. Mostrar un libro");
			System.out.println("\n 4. Salir");
			
			menu=entrada.nextInt();entrada.nextLine();
			
			switch (menu) {
			
				case 1:
					System.out.println("Introduce el titulo del libro");
					titulo=entrada.nextLine();
					System.out.println("Introduce el autor: ");
					autor=entrada.nextLine();
					System.out.println("Introduce el numero de paginas:");
					n_paginas=entrada.nextInt();
					System.out.println("Indica su tema: (Aventuras, Biografia, Ciencia, Economia, Historia, Inform�tica)");
					pregunta=entrada.next();
					if(pregunta.equalsIgnoreCase("Aventuras")) {
						tema=ejercicio1.tema.Aventuras;
					}else if(pregunta.equalsIgnoreCase("Biografia")) {
						tema=ejercicio1.tema.Biografia;
					}else if(pregunta.equalsIgnoreCase("Ciencia")) {
						tema=ejercicio1.tema.Ciencia;
					}else if(pregunta.equalsIgnoreCase("Economia")) {
						tema=ejercicio1.tema.Economia;
					}else if(pregunta.equalsIgnoreCase("Historia")) {
						tema=ejercicio1.tema.Historia;
					}else if(pregunta.equalsIgnoreCase("Inform�tica")) {
						tema=ejercicio1.tema.Informatica;
					}
					System.out.println("Indica su formato: (Carton�, Rustico, Tapa_dura)");
					pregunta=entrada.next();
					if(pregunta.equalsIgnoreCase("Carton�")) {
						formato=ejercicio1.formato.Cartone;
					}else if(pregunta.equalsIgnoreCase("Rustico")) {
						formato=ejercicio1.formato.Rustico;
					}else if(pregunta.equalsIgnoreCase("Tapa_dura")) {
						formato=ejercicio1.formato.Tapa_dura;
					}
					System.out.println("Indica su estado: (Novedad, Reedicion)");
					pregunta=entrada.next();
					if(pregunta.equalsIgnoreCase("Novedad")) {
						estado=ejercicio1.estado.Novedad;
					}else if(pregunta.equalsIgnoreCase("Reedicion")) {
						estado=ejercicio1.estado.Reedicion;
					}
					Libro libro=new Libro(autor, titulo, n_paginas, tema, formato, estado);
					libreria.AnhadirLibro(libro);
					break;
						
					
				case 2:
					System.out.println("Introduce el t�tulo del libro a eliminar: ");
					titulo=entrada.nextLine();
					System.out.println("Seguro que quieres eliminar los datos del libro? s/n");
					pregunta=entrada.next();
					if(pregunta.equalsIgnoreCase("s")) {
					libreria.EliminarLibro(titulo);
					System.out.println("El libro ha sido borrado");
					}else {
						System.out.println("Los datos no se han borrado");
					}
					break;
					
					
				case 3:
					System.out.println("Introduce el titulo del libro a mostrar: ");
					titulo=entrada.nextLine();
					libreria.MostrarLibro(titulo);
					break;
					
				case 4:
					System.out.println("Programa finalizado");
					salir=true;
					break;
			}
		}
entrada.close();
	}

}
