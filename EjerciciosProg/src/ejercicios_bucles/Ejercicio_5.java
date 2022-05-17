package ejercicios_bucles;
import java.util.*;
public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce el número de alumnos");
		int alumnos=entrada.nextInt();
		double nota=0;
		int insuficiente=0;
		int suficiente=0;
		int bien=0;
		int notable=0;
		int sobresaliente=0;
		int i=0;
		while(i<alumnos) {
			i++;
			System.out.println("Introduce la nota del alumno " + i + ":");
			nota=entrada.nextDouble();
		   if(nota<5) {
			insuficiente++;
		   }else if(nota>=5&&nota<6) {
			suficiente++;
		   }else if(nota>=6&&nota<7) {
			bien++;
		   }else if(nota>=7&&nota<9) {
			notable++;
		   }else {
			sobresaliente++;
		}
		   
		}	
		
		System.out.println("Insuficientes: " + insuficiente);
		System.out.println("Suficientes: " + suficiente);
		System.out.println("Bien: " + bien);
		System.out.println("Notables: " + notable);
		System.out.println("Sobresalientes: " + sobresaliente);
	}

}
