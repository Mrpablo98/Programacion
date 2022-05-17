package Ejercicios_bucles2;
import java.util.*;
public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner entrada=new Scanner(System.in);
	int[] numeros=new int[10];
    for(int i=0; i<10;i++) {
    	System.out.println("Introduce un número");
    	numeros[i]=entrada.nextInt();
    			
    	
    }
    int mayor=numeros[0];
    for(int i=1;i<10;i++) {
    	int num_actual=numeros[i];
    	if(num_actual>mayor) {
    		mayor=num_actual;
    	}
    }
    System.out.println("Mayor: " + mayor);
    
    
    int menor=numeros[0];
    for(int i=1;i<10;i++) {
    	int num_actual=numeros[i];
    	if(num_actual<menor) {
    		menor=num_actual;
    	}
    }
    System.out.println("Menor: " + menor);
	}

}
