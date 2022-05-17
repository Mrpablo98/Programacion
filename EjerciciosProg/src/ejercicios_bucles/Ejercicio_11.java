package ejercicios_bucles;
import java.util.*;
public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    int a=0;
    int resultado=0;
    
    for(int i=1;i<12;i++) {
    	System.out.println("Introduce el números");
       a=entrada.nextInt();
       resultado=resultado+a;
        
    } 
       System.out.println("La suma es: " + resultado);      
	}
	
}
