package ejercicios_bucles;
import java.util.*;
public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
    int a;
    int b;
    int n=0;
    
    do{
    	System.out.println("Introduce un número");
	a=entrada.nextInt();
	System.out.println("Introduce un número");
	b=entrada.nextInt();
	n=n+(a+b);
	
    	
    }
    
   while(n<100); 
    	
    	
    
	}

}
