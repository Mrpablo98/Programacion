package Ejercicio2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		DateTimeFormatter formateador=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce la fecha de nacimiento de la persona 1:");
		String fecha=entrada.nextLine();
		LocalDate fNacimiento=LocalDate.parse(fecha, formateador);
		System.out.println("Introduce el nombre de la persona 1:");
		String nombre=entrada.nextLine();
		System.out.println("Introduce el DNI de la persona 1:");
		String DNI=entrada.nextLine();
		
		Persona persona1=new Persona(DNI, nombre, fNacimiento);
		
		
		System.out.println("Introduce la fecha de nacimiento de la persona 2:");
		fecha=entrada.nextLine();
		fNacimiento=LocalDate.parse(fecha, formateador);
		System.out.println("Introduce el nombre de la persona 2:");
		nombre=entrada.nextLine();
		System.out.println("Introduce el DNI de la persona 2:");
		DNI=entrada.nextLine();
		
		Persona persona2=new Persona(DNI, nombre, fNacimiento);
		
		if(persona1.Edad()>18){
		
			System.out.println("La persona 1 es mayor de edad");
			
		}else {
			
			System.out.println("La persona 1 es menor de edad");
		}
		
		if(persona2.Edad()>18){
			
			System.out.println("La persona 2 es mayor de edad");
			
		}else {
			
			System.out.println("La persona 2 es menor de edad");
		}
		
		
		
		if(persona1.Edad()>65) {
			
			System.out.println("La persona 1 está jubilada");
			
		}else {
			
			System.out.println("La persona 1 no está jubilada");
			
		}
		
		if(persona2.Edad()>65) {
			
			System.out.println("La persona 2 está jubilada");
			
		}else {
			
			System.out.println("La persona 2 no está jubilada");
			
		}
		
		System.out.println("La persona 1 lleva vividos " + persona1.DiasVividos() + " dias desde su nacimiento");
		
		System.out.println("La persona 2 lleva vividos " + persona2.DiasVividos() + " dias desde su nacimiento");
		
		if(persona1.Signo().equals(persona2.Signo())) {
			
			System.out.println("Las dos personas tienen el mismo signo: "  + persona1.Signo());
			
		}else {
			
			System.out.println("La persona 1 es: " + persona1.Signo() + "\n");
			System.out.println("La persona 2 es: " + persona2.Signo());
		}
		
		if(persona1.DiasCumple()<persona2.DiasCumple()) {
			
			
			System.out.println("La persona 1 tiene el cumpleanhos mas cercano");
		}else {
			
			System.out.println("La persona 2 tiene el cumpleanhos mas cercano");
			
		}
		
	}

}
