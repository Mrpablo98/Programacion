package Ejercicios_bucles2;
import java.util.*;
public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner entrada=new Scanner(System.in);
		
		
		int x=(int)(Math.random()*100);
		
		int intentos=0;
		
		System.out.println("Introduce el número ");
		
		int c=entrada.nextInt();
		
		while(x!=c){
			
			if(c<x){
				
				System.out.println("Incorrecto! Un poco más alto");
				
				System.out.println("Prueba otra vez ");
				
				c=entrada.nextInt();
				
				intentos++;
				
					
					
				}
				
			else{
				
				System.out.println("Incorrecto! un poco más bajo");
				
				System.out.println("Prueba otra vez");
				
				c=entrada.nextInt();
				
				intentos++;
			}
			
		}
		
		
		
			System.out.println("Muy bien mákina! solo has tardado " + intentos + " intentos en acertar el número");
		
		
		entrada.close();

	}

}
