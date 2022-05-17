package ejercicios_bucles;
import java.util.*;
public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un número");
        int n=entrada.nextInt();
        int resultado=0;
        int resultado1=0;
        int i=1;
        for(i=1;i<=n;i++)
        	
        	if(i%2==0) {
        		
        		System.out.println("Números pares: " + i);
        		resultado=resultado+i;
        		
        	
        	
        	
        }else {
        	System.out.println("Números impares: " + i);
        	
        	resultado1=resultado1+i;
        }
        
        System.out.println("La suma de los pares es: " + resultado);
        System.out.println("La suma de los impares es: " + resultado1);
	}

}
