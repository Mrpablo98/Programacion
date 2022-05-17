package Ejercicios_bucles2;
import java.util.*;
public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduce el número");
    int n=entrada.nextInt();
    int i=1; 
    int j=2;
    while(i<n) {
    	i++;
    	j++;
    		
    
    	System.out.println("*");
    	for(int x=2;x<j;x++) {
    		System.out.print("*");
    	}
    	
    	
    }
    	System.out.print("*");
    
	}

}
