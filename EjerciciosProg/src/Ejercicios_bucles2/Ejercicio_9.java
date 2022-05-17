package Ejercicios_bucles2;
import java.util.*;
public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    
    boolean MCD=false;
    
    while(true) {
    	System.out.println("Introduce el primer número:");
        int a=entrada.nextInt();
        System.out.println("Introduce el segundo número:");
        int b=entrada.nextInt();
        if(a>b) {
        	int aux=a;
        	a=b;
        	b=aux;
        }
        
        int i=a;
        while(!MCD && i>0) {
        	if(a%i==0 && b%i==0 &&i>0) {
        	System.out.println("El máximo común divisor de a y b es: " + i);
        	MCD=true;
        	}else {
        		i--;
        	}
        	
        }
    	
    		
    	
    	
    	
    	
    }
	}

}
